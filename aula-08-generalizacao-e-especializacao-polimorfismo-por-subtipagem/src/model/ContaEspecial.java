package model;

public class ContaEspecial extends Conta {

  private int limite;

  public ContaEspecial(int agencia, int numero, String titular) {
    this(agencia, numero, titular, 1000);
  }

  public ContaEspecial(int agencia, int numero, String titular, int limite) {
    super(agencia, numero, titular);
    this.limite = limite;
  }

  public int getLimite() {
    return limite;
  }

  @Override // sobrescrevendo o comportamento de Conta
  public int getSaldoDisponivelSaque() {
    return super.getSaldoDisponivelSaque() + this.getLimite();
  }

}
