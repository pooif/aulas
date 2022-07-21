package model;

// interface é como uma classe abstrata, só que tudo é abstrato
// é uma abstração total, define o quê, mas não o como
public interface Pix {

  // contrato da interface:

  // os métodos são sempre públicos por padrão,
  // não é necessário declarar public

  public String getPixId();

  /**
   * Subtrai o dinheiro da conta.
   *
   * @param valor a pagar.
   * @throws SaldoInsuficienteException se não houver saldo.
   */
  void pagar(int valor);

  /**
   * Adiciona o valor.
   *
   * @param valor a receber.
   */
  void receber(int valor);

}
