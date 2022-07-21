package model;

import java.util.ArrayList;

public class Colecao {

  private String nome;
  private ArrayList albuns = new ArrayList();

  public Colecao(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public ArrayList getAlbuns() {
    return albuns;
  }

  public void adicionarAlbum(Album a) {
    this.albuns.add(a);
  }

  @Override
  public String toString() {
    return this.nome + " " + this.albuns;
  }
}
