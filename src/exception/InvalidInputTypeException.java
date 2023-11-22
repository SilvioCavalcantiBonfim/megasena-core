package exception;

public class InvalidInputTypeException extends RuntimeException {
  public InvalidInputTypeException(){
    super(Error.INVALIDINPUTTYPE.toString());
  }
}
