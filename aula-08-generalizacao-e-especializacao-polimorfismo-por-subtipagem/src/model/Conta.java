package model;

import java.util.ArrayList;

public class Conta { // Conta Genérica // Conta Padrão // Conta Base

  private final int agencia;
  private final int numero;
  private final String titular;

  protected final ArrayList<String> historico = new ArrayList<>();

  private final int limiteSaques;
  private int saques;

  private int saldo;

  /**
   * Cria uma conta.
   *
   * @param agencia         agência da conta.
   * @param numero          número da conta.
   * @param titular         titular da conta.
   */
  public Conta(int agencia, int numero, String titular) {

    this.agencia = agencia;
    this.numero = numero;
    this.titular = titular;

    this.limiteSaques = 10;
    this.saques = 0;
    this.saldo = 0;

    historico.add(String.format(
        "Conta aberta na agência %d número %d em nome de %s", agencia, numero, titular
    ));
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public String getTitular() {
    return titular;
  }

  public int getSaldo() {
    return saldo;
  }

  public int getSaldoDisponivelSaque() {
    return this.saldo;
  }

  public int getSaquesRemanescentes() {
    return this.limiteSaques - this.saques;
  }

  public ArrayList<String> getHistorico() {
    return new ArrayList<String>(historico);
  }

  /**
   * Deposita um valor na conta.
   *
   * @param valor o valor a ser depositado.
   * @throws DepositoInvalidoException se valor for zero ou negativo.
   */
  public void depositar(int valor) {
    if (valor < 0) {
      throw new DepositoInvalidoException("Depósito precisa de um valor positivo");
    }
    this.creditar("depósito", valor);
  }

  // protected acessível às subclasses
  protected void creditar(String motivo, int valor) {
    this.saldo += valor;
    historico.add("Crédito no valor de %d na forma de %s e novo saldo de %d"
        .formatted(valor, motivo, this.saldo)
    );
  }

  /**
   * Saca um valor da conta.
   *
   * @param valor valor a ser sacado.
   * @throws IllegalStateException se saldo for insuficiente.
   */
  public void sacar(int valor) {
    System.out.println("saldo para saque " + this.getSaldoDisponivelSaque());
    if (valor > this.getSaldoDisponivelSaque()) {
      throw new SaldoInsuficienteException();
    }
    this.saldo -= valor;
    historico.add("Saque no valor de %d e novo saldo de %d".formatted(valor, this.saldo));
    if (++this.saques == this.limiteSaques) {
      this.saques = 0;
      this.saldo -= 1;
      historico.add(
          "Pacote de %d saques ultrapassado, cobrado R$ 1,00 e novo saldo de %d"
          .formatted(this.limiteSaques, this.saldo)
      );
    }
  }
}
