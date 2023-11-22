package dao;

import dao.impl.InputDAOImpl;
import exception.InvalidInputTypeException;
import spi.Input;

public interface InputDAO extends Input {

  int nextInt() throws InvalidInputTypeException;

  void clearBuffer();

  void close();

  static InputDAO builder(){
    return new InputDAOImpl();
  }
}