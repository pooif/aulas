package model;

public class ContaConjunta {
  private final int numero;
  private double saldo = 0;

  private final Cliente cliente1;
  private final Cliente cliente2;

  public ContaConjunta(int numero, Cliente cli1, Cliente cli2) {
    if (cli1 == null) {
      throw new NullPointerException("cli1 nao pode ser nulo");
    }
    if (cli2 == null) {
      throw new NullPointerException("cli2 nao pode ser nulo");
    }
    if (cli1.equals(cli2)) {
      throw new IllegalArgumentException("nao podem ser o mesmo");
    }
    this.cliente1 = cli1;
    this.cliente2 = cli2;
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public Cliente[] getClientes() {
    return new Cliente[]{cliente1, cliente2};
  }

  public double getSaldo() {
    return saldo;
  }

}
