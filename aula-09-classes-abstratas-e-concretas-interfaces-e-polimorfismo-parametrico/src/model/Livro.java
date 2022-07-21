package model;
// a Obra poderá ser instanciada apenas pelas subclasses
// que a completam! Elas são as classes concretas.
// Class concreta é toda classe que pode ser instanciada
// e gerar objetos. Logo, é uma classe completa.
public class Livro extends Obra {

  private int paginas;

  public Livro(String titulo, String autor, int ano, int paginas) {
    super(titulo, autor, ano);
    this.paginas = paginas;
  }

  public int getPaginas() {
    return paginas;
  }

}
