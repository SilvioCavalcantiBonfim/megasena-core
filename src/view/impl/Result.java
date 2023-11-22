package view.impl;

enum Result {

  RESULT_5("\n💰 Você ganhou premio de 10 mil reais.\n"),
  RESULT_6("\n💰💰 Você ganhou premio de 50 mil reais.\n"),
  RESULT_7("\n💰💰💰 Você ganhou premio de 200 mil reais.\n"),
  LOSE("\n💸 Infelizmente você perdeu.😭\n");

  private final String message;
  private Result(String msg){ 
    this.message = msg;
  }

  @Override
  public String toString() {
    return message;
  }
}
