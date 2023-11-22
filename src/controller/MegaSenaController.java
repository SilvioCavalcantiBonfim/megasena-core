package controller;

import controller.impl.MegaSenaControllerImpl;

public interface MegaSenaController {

  void run();

  static MegaSenaController builder(){
    return new MegaSenaControllerImpl();
  }
}