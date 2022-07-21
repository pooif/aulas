package model;

public class Passagem {

  private Passageiro passageiro;
  private final Viagem viagem;
  private final Assento assento;

  public Passagem(Viagem viagem, Assento assento) {
    this.viagem = viagem;
    this.assento = assento;
  }

  public void comprar(Passageiro passageiro) {
    if (this.isComprada()) throw new IllegalStateException();
    this.passageiro = passageiro;
    this.passageiro.adquiriu(this);
  }

  public void cancelar() {
    this.passageiro.cancelou(this);
    this.passageiro = null;
  }

  public boolean isDisponivel() {
    return this.passageiro == null;
  }

  public boolean isComprada() {
    return this.passageiro != null;
  }

  public Assento getAssento() {
    return assento;
  }

  public Viagem getViagem() {
    return viagem;
  }

  @Override
  public String toString() {
    return "Passagem para a viagem "
      + this.getViagem()
      + " no assento " + this.getAssento();
  }

}
