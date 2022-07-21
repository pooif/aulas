package util;

public class Dado {

  private final int faces;
  private int valor;

  public Dado(int faces) {
    if (faces < 2) {
      throw new IllegalArgumentException("Deve haver pelo menos duas faces");
    }
    this.faces = faces;
  }

  public void rolar() {
    this.valor = (int) (Math.random() * this.faces + 1);
  }

  public int getValor() {
    return this.valor;
  }

}
