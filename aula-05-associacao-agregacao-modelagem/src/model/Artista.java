package model;

public class Artista {

  private final String nome;

  public Artista(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return this.nome;
  }
}
