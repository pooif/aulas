import util.Tempo;
import util.IData;
import java.util.Arrays;

class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    System.out.println(soma(3, 4));
    System.out.println(soma(5, 10, 30));
    System.out.println(soma("linguagem", "java"));

    // Copo está encapsulado? Copo protege suas invariantes?
    Copo copo = new Copo(300);
    // copo.quantidade = 800;

    // leitura feita pelo getter/acessor
    System.out.println(copo.getQuantidade()); // 0

    copo.encher();

    System.out.println(copo.getQuantidade()); // 300
    copo.esvaziar();
    System.out.println(copo.getQuantidade()); // 0
    copo.esvaziar();

    copo.encher(100);
    System.out.println(copo.getQuantidade()); // 100
    copo.esvaziar();
    System.out.println(copo.getQuantidade()); // 0

    copo.encher(0.1);
    System.out.println(copo.getQuantidade()); // 30

    Copo copo2 = new Copo();
    System.out.println(copo2.capacidade); // 300

    Lampada lamp3 = new Lampada();
    System.out.println(lamp3.getTensao());
    System.out.println(lamp3.getPotencia());

    Tempo tempo = new Tempo(60);
    System.out.println(tempo.getSegundos()); // 60

    Tempo tempo2 = new Tempo(3, 30);
    System.out.println(tempo2.getSegundos() == 210); // 210

    Tempo tempo3 = new Tempo("01:35"); // 95s
    System.out.println(tempo3.getSegundos() == 95); // 95

    ArCondicionado ar = new ArCondicionado("LG", 9000);
    System.out.println(ar.temp);
    ar.aumentarTemperatura(5);
    System.out.println(ar.temp);

    Tempo tempo4 = new Tempo("05:15");
    System.out.println(tempo4.getMinutos());
    System.out.println(tempo4.getSegundos());
    System.out.println(tempo4.getMinutos() + ":" + tempo4.getSegundos());
    tempo4.adiciona(new Tempo(30));
    System.out.println(tempo4.getMinutos() + ":" + tempo4.getSegundos());

    Pessoa p = new Pessoa("Marcio", "Torres");
    p.setSobrenome("Ramos");
    System.out.println(p.getSobrenome());

    Lampada lamp4 = new Lampada(225, 25);
    // NO FACAM ISSO
    lamp4.ligar();

    // cp1 armazena uma referência a um copo
    Copo cp1 = new Copo(200);
    Copo cp2 = new Copo(300);
    Copo cp3 = new Copo(200);
    System.out.println(cp1);
    System.out.println(cp2);
    System.out.println(cp3);
    System.out.println(cp1 == cp2); // == em objetos compara a identidade!
    Copo cp4 = cp2;
    System.out.println(cp4);
    System.out.println(cp2 == cp4);

    // Copo quantidade = 0
    // cp2.getQuantidade()  cp4.getQuantidade()

    System.out.println(cp4.getQuantidade());
    cp2.encher();
    System.out.println(cp4.getQuantidade());
    System.out.println(cp2.getQuantidade());

    // igualdade
    System.out.println(cp1 == cp3); // == identidade // false
    System.out.println(cp1.equals(cp3)); // equals compara equivalência // true
    cp1.encher();
    System.out.println(cp1.equals(cp3)); // false
    System.out.println(cp3.equals(cp1)); // false
    System.out.println(cp3.equals(cp1)); // false
    System.out.println(cp3.equals(cp1)); // false

    System.out.println(cp3.equals(null)); // false

    Copo cp5 = null;
    System.out.println(cp3.equals(cp5)); // false



    int x = 8;     // x = 10
    int y = x;     // y = 8
    x = 10;
    System.out.println(y);


    Tempo t1 = new Tempo(60);
    Tempo t2 = new Tempo(30);
    Tempo t3 = new Tempo(60);
    System.out.println(t1.equals(t2)); // false
    System.out.println(t1.equals(t3)); // true
    System.out.println(t1 == t3);      // false

    Tempo tp1 = new Tempo(5, 15);
    Tempo tp2 = new Tempo(8, 30);
    if (tp1.compareTo(tp2) < 0) { // tp1 é menor que tp2
      System.out.println("Tempo1 menor que Tempo2");
    }
    Tempo tp3 = new Tempo(1, 10);
    Tempo tp4 = new Tempo(2, 20);
    Tempo tp5 = new Tempo(6, 25);

    Tempo[] tempos = {tp1, tp2, tp3, tp4, tp5};
    // for each
    for (Tempo t : tempos) {
      System.out.println(t.getMinutos()+":"+t.getSegundos());
    }

    Arrays.sort(tempos);

    for (Tempo t : tempos) {
      System.out.println(t.getMinutos() + ":" + t.getSegundos());
    }

  }
  // assinatura do método:
  // é definida pelo nome do método e
  // quantidade e tipos dos parâmetros (retorno)

  static int soma(int x, int y) {
    return x + y;
  }

  static String soma(String x, String y) {
    return x + " " + y;
  }

  // sobrecarga do método soma
  static int soma(int x, int y, int z) {
    return x + y + z;
  }
}
