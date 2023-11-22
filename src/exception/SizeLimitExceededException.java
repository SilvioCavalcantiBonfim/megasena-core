package exception;

public class SizeLimitExceededException extends RuntimeException {
  public SizeLimitExceededException(){
    super(Error.SIZELIMITEXCEEDED.toString());
  }
}
