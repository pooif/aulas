class Lampada {
  // atributos // OS VALORES ARMAZENADOS NOS ATRIBUTOS DEFINEM O **ESTADO** DO OBJETO
  final int tensao; // Volts // final quer dizer que representa estado CONSTANTE!
  final int potencia; // Watts
  boolean ligada = false; // true/false

  // INICIALIZAÇÃO
  // construtor
  Lampada(int tensao, int potencia) {
    // potência deste objeto = potencia parâmetro
    this.potencia = potencia;
    this.tensao = tensao;
  }

  // COMPORTAMENTO
  // métodos / verbo / operações/comandos
  void ligar() { // void = vazio
    this.ligada = true;
  }

  void desligar() {
    this.ligada = false;
  }

  // consultas / perguntas
  boolean estaLigada() {
    return this.ligada;
  }

  boolean estaDesligada() {
    return ! this.ligada;
  }
}
