package model;

import util.Duracao;

public class Musica {
  private final String titulo;
  private final Artista artista;
  private final Duracao duracao;

  public Musica(String titulo, Duracao duracao, Artista artista) {
    this.titulo = titulo;
    this.duracao = duracao;
    this.artista = artista;
  }

  public Artista getArtista() {
    return artista;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public Duracao getDuracao() {
    return duracao;
  }

  @Override
  public String toString() {
    return this.getTitulo() + " " + this.getDuracao();
  }
}
