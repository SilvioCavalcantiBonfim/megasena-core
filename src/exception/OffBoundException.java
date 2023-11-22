package exception;

public class OffBoundException extends RuntimeException {
  public OffBoundException(){
    super(Error.OFFBOUND.toString());
  }
}
