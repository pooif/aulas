package model;

// classe Obra é incompleta, não tem todas as informações (ex; tipo de obra)
// classes incompletas, seja em estado e/ou comportamento
// são classes abstratas (abstrações)
public abstract class Obra { // abstract obriga que a classe seja estendida
  // o "new" é proibido, a classe não pode ser instanciada, ou seja,
  // não gera objetos

  private String titulo;
  private String autor;
  private int ano;

  public Obra(String titulo, String autor, int ano) {
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAno() {
    return ano;
  }

}
