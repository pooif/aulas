package model;

public class ContaCorrente extends Conta {

  public ContaCorrente(int agencia, int numero, String titular) {
    super(agencia, numero, titular);
  }

  @Override
  public String getTipoConta() {
    return "Conta Corrente";
  }
}
