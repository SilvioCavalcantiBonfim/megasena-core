package spi;

import java.util.Set;

public interface ParticipantNumberReadFinish {
  void onParticipantNumberReadFinish(Set<Integer> number);
}