package model;

public class Box {

  private final int numero;

  public Box(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  @Override
  public int hashCode() {
    return this.numero;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Box) {
      return ((Box)o).numero == this.numero;
    }
    return false;
  }

  @Override
  public String toString() {
    return String.valueOf(numero);
  }

}
