import java.util.ArrayList;

import model.CaixaEletronico;
import model.Conta;
import model.ContaConjunta;
import model.ContaEspecial;
import model.ContaSalario;
import model.Poupanca;

class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    Conta conta = new Conta(1234, 77889, "Marcio Torres");

    System.out.println(conta.getAgencia());
    System.out.println(conta.getNumero());
    System.out.println(conta.getTitular());
    System.out.println(conta.getSaldo());
    System.out.println(conta.getSaquesRemanescentes());

    conta.depositar(2000);

    conta.getHistorico().forEach(System.out::println);

    for (int i = 0; i < 11; i++) {
      conta.sacar(100);
    }

    conta.getHistorico().forEach(System.out::println);

    System.out.println("Histórico da Poupança\n-----------------------");

    Poupanca poupanca = new Poupanca(454, 45454, "Márcio", 1000);

    poupanca.getHistorico().forEach(System.out::println);

    poupanca.aplicarRendimentos();

    poupanca.getHistorico().forEach(System.out::println);

    System.out.println("Histórico da Conjunta\n-----------------------");

    ContaConjunta conjunta = new ContaConjunta(4548, 988989, "Márcio", "Josué");

    System.out.println(conjunta.getSegundoTitular());

    conjunta.getHistorico().forEach(System.out::println);


    System.out.println("Verificando a hierarquia");

    System.out.println(conta.getClass());
    System.out.println(poupanca.getClass());
    System.out.println(poupanca.getClass().getSuperclass());
    System.out.println(poupanca.getClass().getSuperclass().getSuperclass());
    System.out.println(poupanca.getClass().getSuperclass().getSuperclass().getSuperclass());
    System.out.println(conjunta.getClass().getSuperclass());


    System.out.println("Covariância: aceitar o subtipo onde é exigido o supertipo");

    // Poupança é covariante de Conta
    // recipiente é mais abrangente que o item
    Conta conta2 = new Poupanca(1223, 1231, "Torres", 2000);

    System.out.println(conta2.getTitular());

    // SuperTipo variavel = Subtipo
    // Poupanca conta3 = new Conta(2112, 54554, "Ramos");
    // Poupanca conta4 = new ContaConjunta(2112, 54554, "Ramos", "Torres");

    System.out.println(conta2.getTitular());

    // conta2 foi declarado como Conta (esse é o contrato)
    // não pode ser feito:
    // conta2.aplicarRendimentos();

    if (conta2 instanceof ContaConjunta) {
      System.out.println(((ContaConjunta)conta2).getSegundoTitular());
    }

    if (conta2 instanceof Poupanca) {
      ((Poupanca)conta2).aplicarRendimentos();
    }

    double d = 9.9; // Double
    int i = 7; // Integer
    Number n1;
    n1 = d;
    n1 = i;
    String s;

    Object objeto;

    objeto = 2;
    objeto = "Texto";
    objeto = conta;
    objeto = poupanca;

    if (objeto instanceof String) {
      System.out.println("objeto é uma String");
    }

    System.out.println("Conta Especial");

    ContaEspecial especial = new ContaEspecial(123, 45564, "Márcio", 1000);
    System.out.println(especial.getSaldo());
    System.out.println(especial.getSaldoDisponivelSaque());

    especial.depositar(1000);
    System.out.println(especial.getSaldoDisponivelSaque());

    System.out.println("Caixa Eletrônico - polimorfismo");

    CaixaEletronico caixa = new CaixaEletronico();

    ContaSalario salario = new ContaSalario(1231, 3131, "Ninguém");
    salario.depositar(5000);

    caixa.login("546", "545", salario);
    caixa.verificarSaldoSaque();
    caixa.sacar(1000);
    caixa.verificarSaldoSaque();

    caixa.login("546", "545", conjunta);
    caixa.verificarSaldoSaque();

    caixa.login("546", "545", especial);
    caixa.verificarSaldo();
    caixa.sacar(1500);
    caixa.verificarSaldo();
  }
}
