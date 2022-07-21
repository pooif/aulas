package util;

// Dado genérico pela subtipagem

public class DadoObjetos extends Dado {

  private Object[] objetos;

  public DadoObjetos(Object... objetos) {
    super(objetos.length);
    this.objetos = objetos;
  }

  public Object getObjeto() {
    return this.objetos[this.getValor() - 1];
  }

}
