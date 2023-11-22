package view;

import java.util.Set;

import view.impl.MegaSenaViewImpl;

public interface MegaSenaView {

  void WelcomeMessage();

  int readCurrentNumber();

  void displayDrawn(Set<Integer> drawn);

  void displayChose(Set<Integer> chose);

  void displayResult(short result);

  void displayError(Exception e);

  void close();

  static MegaSenaView builder(){
    return new MegaSenaViewImpl();
  }
}
