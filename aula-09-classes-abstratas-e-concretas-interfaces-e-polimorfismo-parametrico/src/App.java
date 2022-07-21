import game.Anao;
import game.Elfo;
import game.Mago;
import game.Ogro;
import game.Personagem;
import game.Trol;
import model.CaixaEletronico;
import model.Conta;
import model.ContaCorrente;
import model.ContaEspecial;
import model.Documentario;
import model.Livro;
import model.Obra;
import model.PayPal;
import model.PixManager;
import model.Poupanca;
import util.Dado;
import util.DadoGenerico;
import util.DadoObjetos;
import util.DadoPersonagens;
import util.DadoString;

class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    // Livro e Documentario são concretas e podem ser instanciadas.
    Livro livro = new Livro("Sala de Aula Invertida", "Jonathan", 2012, 60);
    Documentario doc = new Documentario("O dilema das redes", "Jeff Orlowski", 2020, 94);

    Obra[] obras = {livro, doc};

    // não se pode instanciar classes abstratas, apenas concretas!
    // Obra o = new Obra("Algum Titulo", "Algum Autor", 2021);

    Elfo elfo = new Elfo("Arandel");
    Anao anao = new Anao("Magrod", 70);
    Trol trol = new Trol("Anaqen");
    Ogro ogro = new Ogro("Ogritude Jr", 120);

    // Heroi h = new Heroi("Um nome", 266);

    // ogro.ataca(elfo);

    System.out.println(trol);

    anao.ataca(trol);

    System.out.println(trol);

    elfo.ataca(trol);

    System.out.println(trol);

    System.out.println("Mago ataca geral!");
    Mago mago = new Mago("Wizard", 200);
    mago.ataca(trol);
    mago.ataca(anao);

    System.out.println(trol);
    System.out.println(anao);



    ContaCorrente corrente = new ContaCorrente(123, 4566, "Um Titular");

    CaixaEletronico caixa = new CaixaEletronico();
    caixa.login("544565", "454", corrente);
    Poupanca poupanca = new Poupanca(164, 6546, "Outro", 1500);
    caixa.login("544565", "454", poupanca);

    ContaEspecial especial = new ContaEspecial(46, 654465, "Alguém");
    PayPal paypal = new PayPal();
    especial.depositar(1000);

    PixManager pixManager = new PixManager();
    pixManager.registrar("12345678910", especial);
    pixManager.registrar("78945612310", paypal);

    pixManager.transfere("12345678910", "78945612310", 200);

    System.out.println(especial.getSaldo());
    System.out.println(paypal.saldo);

    // ==========================================================================
    System.out.println("Randomizando os personagens");

    Personagem[] personagens = { elfo, anao, trol, ogro };
    Dado dado = new Dado(4);
    for (int i = 0; i < 10; i++) {
      dado.rolar();
      System.out.println(personagens[dado.getValor() - 1]);
    }

    System.out.println("Dado de personagens");
    DadoPersonagens dadop = new DadoPersonagens(elfo, anao, trol);
    for (int i = 0; i < 3; i++) {
      dadop.rolar();
      System.out.println(dadop.getPersonagem());
      System.out.println(dadop.getPersonagem().getVida());
    }

    System.out.println("Dado de objetos");
    DadoObjetos dadoo = new DadoObjetos(elfo, "Texto", anao, 8, poupanca, trol, ogro);
    for (int i = 0; i < 5; i++) { // type-safety
      dadoo.rolar();
      System.out.println(dadoo.getObjeto()); // toString
      if (dadoo.getObjeto() instanceof Personagem) {
        System.out.println(((Personagem)dadoo.getObjeto()).getVida());
      }
    }

    Conta[] contas = { especial, poupanca };

    System.out.println("Dado genérico");

    DadoGenerico<Personagem> dadogp =
        new DadoGenerico<>(anao, ogro);
    for (int i = 0; i < 3; i++) {
      dadogp.rolar();
      System.out.println(dadogp.getObjeto());
      System.out.println(dadogp.getObjeto().getVida());
    }

    DadoGenerico<Conta> dadogc = new DadoGenerico<>(especial, poupanca);
    dadogc.rolar();
    System.out.println(dadogc.getObjeto().getSaldo());

    DadoString strings = new DadoString("t", "a", "d", "s");
    strings.rolar();
    System.out.println(strings.getString());
  }
}
