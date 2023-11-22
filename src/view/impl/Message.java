package view.impl;

//   __  __                    ____                   \n
//  |  \/  | ___  __ _  __ _  / ___|  ___ _ __   __ _ \n
//  | |\/| |/ _ \/ _` |/ _` | \___ \ / _ \ '_ \ / _` |\n
//  | |  | |  __/ (_| | (_| |  ___) |  __/ | | | (_| |\n
//  |_|  |_|\___|\__, |\__,_| |____/ \___|_| |_|\__,_|\n
//               |___/                                

enum Message {
  WELCOME("\n\n\n➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖\r\n"+//
      "  __  __                    ____                   " + //
      "\r\n" + //
      " |  \\/  | ___  __ _  __ _  / ___|  ___ _ __   __ _ " + //
      "\r\n" + //
      " | |\\/| |/ _ \\/ _` |/ _` | \\___ \\ / _ \\ '_ \\ / _` |" + //
      "\r\n" + //
      " | |  | |  __/ (_| | (_| |  ___) |  __/ | | | (_| |" + //
      "\r\n" + //
      " |_|  |_|\\___|\\__, |\\__,_| |____/ \\___|_| |_|\\__,_|" + //
      "\r\n" + //
      "              |___/                                \r\n      💸 Bem-vindo ao jogo da Mega Sena!💸\r\n"+ //
      "➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖\n"),
  INPUTCHOSE("🎫 Por favor, escolha um número que esteja entre 0 e 100: "),
  DRAWN("#️⃣  Os números sorteados foram "),
  CHOSE("#️⃣  Os números escolhidos foram ");

  private final String message;
  private Message(String msg){
    this.message = msg;
  }

  @Override
  public String toString() {
    return message;
  }
}
