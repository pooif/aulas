class ArCondicionado {

  String fabricante;
  final int btus;
  int temp = 21;

  ArCondicionado(String fabricante, int btus) {
    // salva-guardas de validação // guard-clauses
    if (fabricante == null) {
      throw new NullPointerException("fabricante nulo");
    }
    // fabricante não é nulo!
    if (fabricante.isBlank()) {
      throw new IllegalArgumentException("fabricante vazio");
    }
    if (btus < 7500 || btus > 30000) {
      throw new IllegalArgumentException("btus fora do intervalo 7500-30000");
    }

    // fabricante terá pelo menos um caractere
    // btus estará entre 7500 e 30000


    this.fabricante = fabricante;
    this.btus = btus;
  }

  void aumentarTemperatura() {
    if (this.temp == 30) throw new IllegalStateException("Ar está no máximo / 30°");

    this.temp += 1;
  }
}
