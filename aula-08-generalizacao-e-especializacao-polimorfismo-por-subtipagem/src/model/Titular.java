package model;

public class Titular {

  private String nome;
  private String sobrenome;

  public Titular(String nome, String sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  // final nos métodos impede a sobrescrita dos mesmos!
  public final String getNomeCompleto() {
    return this.sobrenome + ", " + this.nome;
  }

}
