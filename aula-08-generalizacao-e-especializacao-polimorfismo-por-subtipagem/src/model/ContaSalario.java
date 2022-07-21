package model;

public class ContaSalario extends Conta {

  public ContaSalario(int agencia, int numero, String titular) {
    super(agencia, numero, titular);
  }

  @Override
  public void sacar(int valor) {
    if (this.getSaldoDisponivelSaque() < valor + 1) {
      throw new SaldoInsuficienteException();
    }
    super.sacar(valor); // valor
    super.sacar(1); // taxa
  }

}
