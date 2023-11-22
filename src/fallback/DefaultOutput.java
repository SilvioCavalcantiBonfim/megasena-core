package fallback;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.InvalidInputTypeException;
import spi.Input;

public class DefaultOutput implements Input {
  
  public final Scanner sc;

  public DefaultOutput(){
    sc = new Scanner(System.in);
  }

  @Override
  public int nextInt() throws InvalidInputTypeException{
    try {
      return sc.nextInt();
    } catch (InputMismatchException e) {
      throw new InvalidInputTypeException();
    }
  }

  @Override
  public void close(){
    sc.close();
  }

  @Override
  public void clearBuffer() {
    sc.nextLine();
  }
}
