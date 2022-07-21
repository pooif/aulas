package model;

public class Cidade {

  private final String nome;

  public Cidade(String nome) { this.nome = nome; }

  public String getNome() {
    return nome;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Cidade) {
      return ((Cidade)o).nome.equals(this.nome);
    }
    return false;
  }

  @Override
  public String toString() {
    return this.getNome();
  }

}
