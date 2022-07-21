package model;

public class ContaConjunta extends Conta {

  private final String segundoTitular;

  /**
   * Abre uma conta conjuta.
   * @param agencia a agência da conta.
   * @param numero o número da conta.
   * @param primeiroTitular o primeiro titular.
   * @param segundoTitular o segundo titular.
   */
  public ContaConjunta(int agencia, int numero, String primeiroTitular, String segundoTitular) {
    super(agencia, numero, primeiroTitular);
    this.segundoTitular = segundoTitular;
    this.historico.add("Conta aberta com o " + segundoTitular + " como segundo titular");
  }

  public String getSegundoTitular() {
    return segundoTitular;
  }

}
