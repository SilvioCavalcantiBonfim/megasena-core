package dao;

import dao.impl.OutputImpl;

public interface OutputDAO {

  void print(String msg);

  static OutputDAO builder(){
    return new OutputImpl();
  }

}