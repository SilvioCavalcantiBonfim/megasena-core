package controller.impl;

import controller.MegaSenaController;
import hook.ControllerLifecycleHooks;
import model.Drawn;
import model.MegaSena;
import view.MegaSenaView;

public class MegaSenaControllerImpl implements MegaSenaController {

  private final short MAX_RANGE = 100;
  private final short MIN_RANGE = 0;
  private final short TOTAL = 7;

  private final MegaSena megaSena;
  private final MegaSenaView megaSenaView;
  private final Drawn drawn;
  private final ControllerLifecycleHooks hook;

  public MegaSenaControllerImpl() {
    megaSena = MegaSena.builder(MIN_RANGE, MAX_RANGE, TOTAL);
    megaSenaView = MegaSenaView.builder();
    drawn = Drawn.builder(MIN_RANGE, MAX_RANGE);
    hook = ControllerLifecycleHooks.builder();
  }

  @Override
  public void run() {

    starter();

    getParticipantNumber();

    getDrawn();

    getResult();

    finish();
  }

  private void starter() {
    hook.onApplicationStart();
    megaSenaView.WelcomeMessage();
  }

  private void getParticipantNumber() {
    while (!megaSena.isCompleteFill()) {
      try {
        int readParticipantNumber = megaSenaView.readCurrentNumber();
        megaSena.addInChose(readParticipantNumber);
        hook.onParticipantNumberRead(readParticipantNumber);
      } catch (Exception e) {
        megaSenaView.displayError(e);
        hook.onError(e.getMessage());
      }
    }
    hook.onParticipantNumberReadFinish(megaSena.getChosen());
  }

  private void getDrawn() {
    for (int c : drawn.nextDrawn(TOTAL)) {
      megaSena.addInDrawn(c);
      hook.onDrawnNumbersAddition(c);
    }

    hook.onDrawnNumbersFinish(megaSena.getDrawn());
  }

  private void getResult() {
    short result = megaSena.result();

    hook.onResult(result);

    megaSenaView.displayResult(result);

    megaSenaView.displayDrawn(megaSena.getChosen());
    megaSenaView.displayChose(megaSena.getDrawn());
  }

  private void finish() {
    hook.onApplicationClose();
    megaSenaView.close();
  }
}
