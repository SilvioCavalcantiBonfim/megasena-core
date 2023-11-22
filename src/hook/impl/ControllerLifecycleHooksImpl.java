package hook.impl;

import java.util.ServiceLoader;
import java.util.Set;

import hook.ControllerLifecycleHooks;
import spi.*;

public class ControllerLifecycleHooksImpl implements ControllerLifecycleHooks {

  @Override
  public void onApplicationStart() {
    ServiceLoader.load(ApplicationStart.class).forEach(e -> e.onApplicationStart());
  }

  @Override
  public void onParticipantNumberRead(int number) {
    ServiceLoader.load(ParticipantNumberRead.class).forEach(e -> e.onParticipantNumberRead(number));
  }

  @Override
  public void onDrawnNumbersAddition(int number) {
    ServiceLoader.load(DrawnNumbersAddition.class).forEach(e -> e.onDrawnNumbersAddition(number));
  }

  @Override
  public void onError(String msg) {
    ServiceLoader.load(ThrowException.class).forEach(e -> e.onError(msg));
  }

  @Override
  public void onResult(int result) {
    ServiceLoader.load(Result.class).forEach(e -> e.onResult(result));
  }

  @Override
  public void onApplicationClose() {
    ServiceLoader.load(ApplicationClose.class).forEach(e -> e.onApplicationClose());
  }

  @Override
  public void onParticipantNumberReadFinish(Set<Integer> number) {
    ServiceLoader.load(ParticipantNumberReadFinish.class).forEach(e -> e.onParticipantNumberReadFinish(number));
  }

  @Override
  public void onDrawnNumbersFinish(Set<Integer> number) {
    ServiceLoader.load(DrawnNumbersAdditionFinish.class).forEach(e -> e.onDrawnNumbersFinish(number));
  }
}
