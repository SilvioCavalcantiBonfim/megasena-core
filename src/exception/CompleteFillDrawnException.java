package exception;

public class CompleteFillDrawnException extends RuntimeException {
  public CompleteFillDrawnException(){
    super(Error.COMPLETEFILLSELECTED.toString());
  }
}
