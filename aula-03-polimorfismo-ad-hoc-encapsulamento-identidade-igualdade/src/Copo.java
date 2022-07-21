class Copo implements Comparable<Copo> {
  // atributos // características / formam o estado quando têm valores
  final int capacidade; // estado constante

  // private: somente objetos da mesma classe podem ter acesso
  // visível apenas para a própria classe
  private int quantidade = 0; // estado variável ou instantâneo

  // definir um construtor é definir uma obrigação
  Copo(int capacidade) {
    if (capacidade <= 0) throw new IllegalArgumentException("capacidade deve ser positiva");
    this.capacidade = capacidade;
  }

  Copo() {
    this.capacidade = 300;
  }

  // método consulta
  int quantidade() { // acesso indireto ao estado
    return this.quantidade;
  }

  // método
  int getQuantidade() {
    return this.quantidade;
  }

  void encher() {
    this.quantidade = this.capacidade;
  }

  // sobrecarga do método encher
  void encher(int quantidade) {
    if (this.quantidade + quantidade < this.capacidade) {
      this.quantidade += quantidade;
    }
  }

  // sobrecarga do método encher
  void encher(double percentual) {
    int quantidade = (int) (percentual * this.capacidade);
    this.encher(quantidade);
    // if (this.quantidade + quantidade < this.capacidade) {
    //   this.quantidade += quantidade;
    // }
  }

  void esvaziar() {
    this.quantidade = 0;
  }

@Override
public boolean equals(Object o) {
  return o instanceof Copo ?
    this.capacidade == ((Copo)o).capacidade &&
    this.quantidade == ((Copo)o).quantidade
    : false;
}

  @Override
  public int compareTo(Copo o) {
    return this.quantidade - o.quantidade;
  }

}
