package model;

public class TitularEspecial extends Titular {

  private String titulo;

  public TitularEspecial(String nome, String sobrenome, String titulo) {
    super(nome, sobrenome);
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

}
