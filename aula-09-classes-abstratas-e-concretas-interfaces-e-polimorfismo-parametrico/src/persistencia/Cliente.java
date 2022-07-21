package persistencia;

public class Cliente implements Persistivel {

  private final String nome;
  private int id;

  public Cliente(int id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  public Cliente(String nome) {
		this.nome = nome;
  }

  @Override
  public int getId() {
    return this.id;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return this.getNome();
  }

}
