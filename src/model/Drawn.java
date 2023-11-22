package model;

import model.impl.DrawnImpl;

public interface Drawn {

  int[] nextDrawn(int total);

  static Drawn builder(int min, int max){
    return new DrawnImpl(min, max);
  }
}