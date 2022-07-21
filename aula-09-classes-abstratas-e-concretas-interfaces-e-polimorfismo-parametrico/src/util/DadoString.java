package util;

public class DadoString extends DadoGenerico<String> {

  public DadoString(String... strings) {
    super(strings);
  }

  public String getString() {
    return super.getObjeto();
  }

}
