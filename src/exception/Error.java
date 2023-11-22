package exception;

public enum Error {

  ILLEGALNUMBER("⚠️  O número já foi escolhido.⚠️\n"),
  OFFBOUND("⚠️  O número não está no intervalo válido.⚠️\n"),
  COMPLETEFILLCHOSEN("⚠️  Nem todos os números foram sorteados ainda.⚠️\n"),
  COMPLETEFILLSELECTED("⚠️  Nem todos os números escolhidos foram informados.⚠️\n"),
  INVALIDINPUTTYPE("⚠️  O valor informado não está no formato correto.⚠️\n"),
  SIZELIMITEXCEEDED("⚠️  Todos os números já foram escolhidos.⚠️\n");

  private final String message;
  
  private Error(String msg){
    this.message = msg;
  }

  @Override
  public String toString() {
    return message;
  }
}
