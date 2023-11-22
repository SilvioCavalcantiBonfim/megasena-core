package fallback;

import spi.Output;

public class DefaultInput implements Output{

  @Override
  public void print(String msg) {
    System.out.print(msg);
  }
  
}
