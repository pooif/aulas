public class Lampada {
  // atributos // OS VALORES ARMAZENADOS NOS ATRIBUTOS DEFINEM O **ESTADO** DO OBJETO
  private final int tensao; // Volts // final quer dizer que representa estado CONSTANTE!
  private final int potencia; // Watts
  private boolean ligada = false; // true/false

  public int getPotencia() {
    return potencia;
  }

  public int getTensao() {
    return tensao;
  }

  // INICIALIZAÇÃO
  // construtor
  public Lampada(int tensao, int potencia) {
    // potência deste objeto = potencia parâmetro
    this.potencia = potencia;
    this.tensao = tensao;
  }

  public Lampada(int tensao) { // new Lampada(200) -> new Lampada(200, 20)
    this(tensao, 20);
  }

  public Lampada() {
    this(127, 20);
  }

  // COMPORTAMENTO
  // métodos / verbo / operações/comandos
  public void ligar() { // void = vazio
    this.setLigada(true);
  }

  public void desligar() {
    this.setLigada(false);
  }

  private void setLigada(boolean l) {
    this.ligada = l;
  }

  public boolean isLigada() {
    return this.ligada;
  }

  // // consultas / perguntas
  // boolean estaLigada() {
  //   return this.ligada;
  // }

  // boolean estaDesligada() {
  //   return ! this.ligada;
  // }
}
