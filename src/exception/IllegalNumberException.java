package exception;

public class IllegalNumberException extends RuntimeException {
  public IllegalNumberException(){
    super(Error.ILLEGALNUMBER.toString());
  }
}
