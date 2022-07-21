package model;

// final na classe proibe que ela seja estendida
// não pode ser subtipada
public final class CaixaEletronico {

  private Conta conta;

  // a ENTRADA parâmetros e variávels aceitam tipos covariantes
  public void login(String token, String senha, Conta conta) {
    this.conta = conta;
  }

  public void logout() {
    this.conta = null;
  }

  public void verificarSaldo() {
    System.out.println("Caixa: " + conta.getSaldo());
  }

  public void verificarSaldoSaque() {
    // chamada polimórfica // polimorfismo
    // o método getSaldoDisponivelSaque é invocado na conta específica armazenada
    System.out.println("Caixa: " + conta.getSaldoDisponivelSaque());
  }

  public void sacar(int valor) {
    try {
      conta.sacar(valor); // polimórfico
    } catch (SaldoInsuficienteException e) {
      System.err.println("Erro: " + e.getMessage());
    }
  }

  @Override
  public String toString() {
    return "Caixa operando "
      + conta == null ? "sem conta" : "com a conta " + this.conta.getNumero();
  }
}
