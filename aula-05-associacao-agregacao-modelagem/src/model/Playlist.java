package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import model.Musica;
import util.Duracao;

public class Playlist {

  private String nome;
  private final LocalDateTime dataHoraCriacao;
  private ArrayList musicas = new ArrayList();

  public Playlist(String nome, Musica musica) {
    this.nome = nome;
    this.dataHoraCriacao = LocalDateTime.now();
    this.musicas.add(musica);
  }

  public void renomear(String novoNome) {
    this.nome = novoNome;
  }

  public String getNome() {
    return nome;
  }

  public LocalDateTime getDataHoraCriacao() {
    return dataHoraCriacao;
  }

  public void adicionarMusica(Musica musica) {
    this.musicas.add(musica);
  }

  public void removerMusica(Musica musica) {
    if (this.musicas.size() == 1) {
      throw new PlaylistNaoPodeFicarVaziaException();
    }
    this.musicas.remove(musica);
  }

  public void reordenar(Musica musica, int posicao) {
    this.removerMusica(musica);
    this.musicas.add(posicao, musica);
  }

  public ArrayList getMusicas() {
    return this.musicas;
  }

  public Duracao getDuracao() {
    Duracao total = new Duracao(0, 0, 0);
    for (Object o : this.musicas) {
      Musica m = (Musica) o;
      total.somar(m.getDuracao());
    }
    return total;
  }

  @Override
  public String toString() {
    return this.getNome() + " " + this.getDataHoraCriacao() + "\n"
      + this.musicas;
  }
}
