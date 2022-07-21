package model;

public class CartaoCredito extends Conta {


  @Override
  public void depositar(int valor) {
    throw new UnsupportedOperationException("Não é permitido depósito");
  }
}
