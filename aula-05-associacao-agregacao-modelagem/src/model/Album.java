package model;

import java.util.*;
import util.Duracao;

public class Album {
  private final String titulo;
  // private final ArrayList musicas;
  // private final HashSet musicas;
  private final Musica[] musicas;

  // Musica... significa música varargs, a, b, c, d
  public Album(String titulo, Musica... musicas) {
    this.titulo = titulo;
    this.musicas = musicas;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public Duracao getDuracao() {
    Duracao total = new Duracao(0, 0, 0);
    for (Musica m : this.musicas) {
      total.somar(m.getDuracao());
    }
    return total;
  }

  public Musica[] getMusicas() {
    return this.musicas;
  }

  @Override
  public String toString() {
    return "Album " + this.getTitulo() + "\n"
      + Arrays.toString(this.musicas);
  }
}
