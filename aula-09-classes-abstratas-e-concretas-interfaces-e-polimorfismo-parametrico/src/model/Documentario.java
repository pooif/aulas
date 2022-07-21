package model;

// Documentario é uma classe concreta
public class Documentario extends Obra {

  private int minutos;

  public Documentario(String titulo, String autor, int ano, int minutos) {
    super(titulo, autor, ano);
    this.minutos = minutos;
  }

  public int getMinutos() {
    return minutos;
  }

}
