package util;

// Dado genérico pela parametrização do tipo (Generics)

// chevron variável de tipo, ex: <T>, <E>, <C>
// DadoGenerico<Personagem> dado; // T == Personagem
public class DadoGenerico<T> {

  private T[] objetos;
  private T objeto;

  public DadoGenerico(T... objetos) {
    if (objetos.length < 2) {
      throw new IllegalArgumentException("Deve haver pelo menos duas faces");
    }
    this.objetos = objetos;
  }

  public void rolar() {
    this.objeto = this.objetos[(int) (Math.random() * this.objetos.length)];
  }

  public T getObjeto() {
    return this.objeto;
  }

}
