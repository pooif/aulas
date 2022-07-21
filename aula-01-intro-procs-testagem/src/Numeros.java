class Numeros {
  // com static: é um procedimento
  // sem static: é um método

  static int maior(int x, int y) {
    int maior;
    if (x > y) {
      maior = x;
    } else {
      maior = y;
    }
    return maior;
  }

  static int mmc(int x, int y) {

    int maior = maior(x, y);
    int mmc = maior;
    while (mmc % x != 0 || mmc % y != 0) {
      mmc += maior;
    }

    return mmc;
  }

}
