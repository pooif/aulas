package game;

public class Elfo extends Personagem implements Heroi {

  public Elfo(String nome) {
    super(nome, 100);
  }

  @Override
  public void ataca(Personagem p) {
    super.ataca(p);
    if (p instanceof Vilao) {
      p.sofreDano(this, 80);
    }
  }
}
