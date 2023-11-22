package model;

import java.util.Set;

import model.impl.MegaSenaImpl;

public interface MegaSena {

  void addInChose(int value);

  void addInDrawn(int value);

  short result();

  Set<Integer> getDrawn();

  Set<Integer> getChosen();

  boolean isCompleteFill();

  static MegaSena builder(int min, int max, int total){
    return new MegaSenaImpl(min, max, total);
  }

}