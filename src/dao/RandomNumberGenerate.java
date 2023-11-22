package dao;

import dao.impl.RandomNumberGenerateImpl;

public interface RandomNumberGenerate {

  int nextInt(int bound);

  static RandomNumberGenerate builder() {
    return new RandomNumberGenerateImpl();
  }

}