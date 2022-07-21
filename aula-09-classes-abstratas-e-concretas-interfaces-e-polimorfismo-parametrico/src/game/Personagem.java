package game;

public abstract class Personagem {

  private String nome;
  protected int vida;

  public Personagem(String nome, int vida) {
    if (nome == null || nome.isBlank()) {
      throw new IllegalArgumentException("O nome é obrigatório");
    }
    if (vida < 1) {
      throw new IllegalArgumentException("Vida deve ser positiva");
    }
    this.nome = nome;
    this.vida = vida;
  }

  public String getNome() {
    return nome;
  }

  public int getVida() {
    return vida;
  }

  // conheço a interface do Personagem
  // assinatura de método ataca(Personagem p): void
  // mas não se sabe os detalhes de **como** será o ataque
  public void ataca(Personagem outro) {
    if (this instanceof Heroi && outro instanceof Vilao) {
      outro.sofreDano(this, 20);
    }
    if (this instanceof Vilao && outro instanceof Heroi) {
      outro.sofreDano(this, 10);
    }
  }

  protected void sofreDano(Personagem atacante, int dano) {
    if (atacante == this) {
      return;
    }
    if (this.vida > 0) {
      this.vida -= Math.min(dano, vida);
    }
  }

  @Override
  public String toString() {
    return String.format("%s %s vida %d",
      this.getClass().getSimpleName(),
      this.getNome(),
      this.getVida()
    );
  }
}
