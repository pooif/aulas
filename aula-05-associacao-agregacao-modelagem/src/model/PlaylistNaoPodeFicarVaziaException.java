package model;

public class PlaylistNaoPodeFicarVaziaException extends RuntimeException {

  public PlaylistNaoPodeFicarVaziaException() {
    super("Playlist não pode ficar vazia");
  }

}
