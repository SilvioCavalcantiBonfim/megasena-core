package view.impl;

import java.util.Set;

import dao.InputDAO;
import dao.OutputDAO;
import exception.InvalidInputTypeException;
import view.MegaSenaView;

public class MegaSenaViewImpl implements MegaSenaView {
  
  private final OutputDAO output;
  private final InputDAO input;

  public MegaSenaViewImpl() {
    output = OutputDAO.builder();
    input = InputDAO.builder();
  }

  @Override
  public void WelcomeMessage() {
    output.print(Message.WELCOME.toString());
  }

  @Override
  public int readCurrentNumber() {
    while (true) {
      try {
        output.print(Message.INPUTCHOSE.toString());
        return input.nextInt();
      } catch (InvalidInputTypeException e) {
        input.clearBuffer();
        output.print(e.getMessage());
      }
    }
  }

  @Override
  public void displayResult(short result) {
    Result msg = switch(result){
      case 5 -> Result.RESULT_5;
      case 6 -> Result.RESULT_6;
      case 7 -> Result.RESULT_7;
      default -> Result.LOSE;
    };
    output.print(msg.toString());
  }

  @Override
  public void displayDrawn(Set<Integer> drawn) {
    output.print(Message.DRAWN+formatSetToString(drawn.toString())+".\n");
  }

  @Override
  public void displayChose(Set<Integer> chose) {
    output.print(Message.CHOSE+formatSetToString(chose.toString())+".\n");
  }  

  private String formatSetToString(String text){
    return text.replaceAll("\\[|\\]", "")
    .replaceFirst("(.*),", "$1 e");
  }

  @Override
  public void displayError(Exception e) {
    output.print(e.getMessage());
  }

  @Override
  public void close() {
    input.close();
  }
}
