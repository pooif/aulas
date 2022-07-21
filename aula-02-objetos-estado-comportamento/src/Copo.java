class Copo {
  // atributos // características / formam o estado quando têm valores
  final int capacidade; // estado constante
  int quantidade = 0; // estado variável ou instantâneo

  Copo(int capacidade) {
    this.capacidade = capacidade;
  }

  void encher() {
    this.quantidade = this.capacidade;
  }

  void esvaziar() {
    this.quantidade = 0;
  }
}
