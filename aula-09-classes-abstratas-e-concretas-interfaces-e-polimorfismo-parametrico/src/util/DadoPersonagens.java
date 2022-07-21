package util;

import game.Personagem;

public class DadoPersonagens extends Dado {

  private Personagem[] personagens;

  public DadoPersonagens(Personagem... personagens) {
    super(personagens.length);
    this.personagens = personagens;
  }

  public Personagem getPersonagem() {
    return this.personagens[this.getValor() - 1];
  }

}
