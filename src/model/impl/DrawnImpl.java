package model.impl;

import java.util.LinkedList;
import java.util.List;

import dao.RandomNumberGenerate;
import model.Drawn;

public final class DrawnImpl implements Drawn {

  private List<Integer> randomSelection;
  private final int minDrawn;
  private final int maxDrawn;
  private final RandomNumberGenerate rng;

  public DrawnImpl(int minDrawn, int maxDrawn) {
    this.minDrawn = minDrawn;
    this.maxDrawn = maxDrawn;
    randomSelection = new LinkedList<>();
    this.rng = RandomNumberGenerate.builder();
    initAllNumber();
  }

  private void initAllNumber() {
    randomSelection.clear();
    for (int i = minDrawn; i < maxDrawn; i++) {
      randomSelection.add(i);
    }
  }

  @Override
  public int[] nextDrawn(int total) {
    int[] drawn = new int[total];
    for (int i = 0; i < total; i++) {
      int drawnIndex = rng.nextInt(randomSelection.size());
      drawn[i] = randomSelection.get(drawnIndex);
      randomSelection.remove(drawnIndex);
    }
    for (int i : drawn) {
      randomSelection.add(i);
    }
    return drawn;
  }
}
