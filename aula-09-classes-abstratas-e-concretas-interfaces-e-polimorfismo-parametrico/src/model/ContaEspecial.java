package model;

public class ContaEspecial extends Conta implements Pix {

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

  @Override
  public String getTipoConta() {
    return "Conta Especial";
  }

  @Override // sobrescrevendo o comportamento de Conta
  public int getSaldoDisponivelSaque() {
    return super.getSaldoDisponivelSaque() + this.getLimite();
  }

  @Override
  public String getPixId() {
    return getAgencia() + "-" + getNumero();
  }

  @Override
  public void pagar(int valor) {
    if (this.getSaldoDisponivelSaque() >= valor) {
      this.sacar(valor);
    } else {
      throw new SaldoInsuficienteException();
    }
  }

  @Override
  public void receber(int valor) {
    this.depositar(valor);
  }
}
