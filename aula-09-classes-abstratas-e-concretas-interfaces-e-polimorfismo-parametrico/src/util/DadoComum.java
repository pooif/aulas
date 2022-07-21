package util;

public class DadoComum extends DadoGenerico<Integer> {

  public DadoComum() {
    super(1, 2, 3, 4, 5, 6);
  }

  public int getNumero() {
    return super.getObjeto();
  }

}
