package model;

// Poupança é uma subclasse de Conta
// Poupança é um subtipo de Conta
// Poupança é uma Conta
// Poupança estende a Conta (herda tudo (visível) de Conta e adiciona atributos e comportamentos)
// Conta é a superclasse de Poupança
// Conta é o supertipo de Poupança

public class Poupanca extends Conta {

  // as subclasses são responsáveis por instanciar as superclasses
  // devem invocar super(argumentos) para construir seu supertipo

  /**
   * Abre uma conta poupança.
   * @param agencia agência da conta.
   * @param numero número da conta.
   * @param titular titular da conta.
   * @param depositoInicial depósito mínimo exigido de R$ 500
   * @throws DepositoInvalidoException se o mínimo não for depositado.
   */
  public Poupanca(int agencia, int numero, String titular, int depositoInicial) {
    super(agencia, numero, titular);
    if (depositoInicial < 500) {
      throw new DepositoInvalidoException("Depósito mínimo de R$ 500 para abrir a poupança");
    }
    this.depositar(depositoInicial);
  }

  public void aplicarRendimentos() {
    int rendimento = (int) (this.getSaldo() * 0.01); // rende 1%
    this.creditar("rendimento", rendimento);
  }

}
