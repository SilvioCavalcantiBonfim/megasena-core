package dao.impl;

import java.util.ServiceLoader;

import dao.InputDAO;
import exception.InvalidInputTypeException;
import fallback.DefaultOutput;
import spi.Input;

public class InputDAOImpl implements InputDAO {
  
  public final Input input;

  public InputDAOImpl(){
    input = ServiceLoader.load(Input.class).findFirst().orElse(new DefaultOutput());
  }

  @Override
  public int nextInt() throws InvalidInputTypeException{
    return input.nextInt();
  }

  @Override
  public void close(){
    input.close();
  }

  @Override
  public void clearBuffer() {
    input.clearBuffer();
  }
}
