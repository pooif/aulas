package model;

public class PayPal implements Pix {

  public int saldo = 0;

  @Override
  public String getPixId() {
    return "paypal-349234";
  }

  @Override
  public void pagar(int valor) {
    saldo -= valor;
  }

  @Override
  public void receber(int valor) {
    saldo += valor;
  }
}
