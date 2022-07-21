class Textos {
  // teste
  // 01234
  static String inverter(String t) {
    String resp = "";

    for (int i = t.length() - 1; i >= 0; i--) {
      resp += t.charAt(i);
    }

    return resp;
  }
  // teste
  // 01234
  static boolean ehPalindromo(String texto) {
    texto = texto.toLowerCase();
    String inverso = inverter(texto);
    return texto.equals(inverso);
  }

}
