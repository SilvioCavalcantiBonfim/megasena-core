package hook;

import java.util.Set;

import hook.impl.ControllerLifecycleHooksImpl;

public interface ControllerLifecycleHooks{
  void onApplicationStart();
  void onParticipantNumberRead(int number);
  void onDrawnNumbersAddition(int number);
  void onError(String msg);
  void onResult(int result);
  void onApplicationClose();
  void onParticipantNumberReadFinish(Set<Integer> number);
  void onDrawnNumbersFinish(Set<Integer> number);
  static ControllerLifecycleHooks builder() {
    return new ControllerLifecycleHooksImpl();
  }
}
