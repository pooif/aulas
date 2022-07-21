package game;

// Herança simples/única
public class Mago extends Personagem implements Heroi, Vilao {

  public Mago(String nome, int vida) {
    super(nome, vida);
  }

}
