package model;

public class TCC extends Obra {

  private String orientador;

  public TCC(String titulo, String autor, int ano, String orientador) {
    super(titulo, autor, ano);
    this.orientador = orientador;
  }

  public String getOrientador() {
    return orientador;
  }

}
