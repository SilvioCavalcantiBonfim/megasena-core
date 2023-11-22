package exception;

public class CompleteFillChosenException extends RuntimeException {
  public CompleteFillChosenException(){
    super(Error.COMPLETEFILLCHOSEN.toString());
  }
}
