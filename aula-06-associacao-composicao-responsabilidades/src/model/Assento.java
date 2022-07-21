package model;

public class Assento {

  private final int numero;
  private final boolean executivo;
  private final boolean janela;

  public Assento(int numero, boolean executivo, boolean janela) {
    this.numero = numero;
    this.executivo = executivo;
    this.janela = janela;
  }

  public int getNumero() {
    return numero;
  }

  public boolean isExecutivo() {
    return executivo;
  }

  public boolean isJanela() {
    return janela;
  }

  public boolean isCorredor() {
    return !this.janela;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Assento) {
      return ((Assento)o).numero == this.numero;
    }
    return false;
  }

  @Override
  public String toString() {
    return "Assento nro " + this.numero + " janela: " + janela + " executivo: " + executivo;
  }

}
