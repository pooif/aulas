class FoneOuvido {

  String fabricante;
  PosicaoOrelha posicao; // intra-auricular, auricular, supra, circumaural
  boolean bluetooth;

  FoneOuvido(String fabricante, PosicaoOrelha posicao, boolean bluetooth) {
    this.fabricante = fabricante;
    this.posicao = posicao;
    this.bluetooth = bluetooth;
  }

}
