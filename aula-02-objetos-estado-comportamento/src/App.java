class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    Livro livro1; // declaração
    livro1 = new Livro("Padrões de Implementação"); // instanciação / construtor
    System.out.println(livro1.titulo);
    System.out.println(livro1.paginas);
    livro1.subtitulo = "Um catálogo de padrões ...";
    livro1.autor = "Kent Beck";
    livro1.editora = "Bookman";
    livro1.paginas = 154;
    System.out.println(livro1.titulo + " " + livro1.paginas + "p");

    Livro livro2 = new Livro("Homo Deus");
    livro2.titulo = "HOMO DEUS";

    Lampada lamp1 = new Lampada(127, 15);
    System.out.println(lamp1.ligada); // false

    lamp1.ligada = true;
    // lamp1.tensao = 250; / não é possível reatribuir tensão pq é constante

    System.out.println(lamp1.tensao);
    System.out.println(lamp1.potencia);
    System.out.println(lamp1.ligada);

    FoneOuvido fone1 = new FoneOuvido("JVC", PosicaoOrelha.CIRCUMAURAL, false);
    // fone1.fabricante = "JVC";
    // fone1.bluetooth = false;
    // fone1.posicao = PosicaoOrelha.CIRCUMAURAL;

    Livro livro3 = new Livro("Algoritmos para viver");
    System.out.println(livro3.titulo);
    System.out.println("Ar-condicionado -----------------------------");
    ArCondicionado ar1 = new ArCondicionado("Springer", 9000);
    System.out.println(ar1.fabricante);
    System.out.println(ar1.temp); // 21
    ar1.temp++; // ar1.temp = ar1.temp + 1;
    System.out.println(ar1.temp); // 22
    ar1.temp = 30;
    ar1.temp = 300; // constraints

    Copo copo1 = new Copo(500);
    System.out.println(copo1.capacidade);
    System.out.println(copo1.quantidade);

    ArCondicionado ar2 = new ArCondicionado("Springer", 9000);
    System.out.println(ar2.btus);
    ar2.temp += 10;
    System.out.println(ar2.temp);
    ar2.temp += 10;
    System.out.println(ar2.temp);

    try {
      ArCondicionado ar3 = new ArCondicionado("Philco", 5000);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

    System.out.println("Chegamos aqui!");

    System.out.println("Comportamento");
    System.out.println("==============================");
    Lampada lamp = new Lampada(227, 25);

    System.out.println(lamp.tensao);
    System.out.println(lamp.potencia);

    if (lamp.estaLigada()) System.out.println("Lampada ligada");
    else System.out.println("Lampada desligada");

    // lamp.ligada = true;
    lamp.ligar();

    if (lamp.estaLigada()) System.out.println("Lampada ligada");
    else System.out.println("Lampada desligada");

    Copo copo2 = new Copo(500);
    System.out.println(copo2.capacidade);
    System.out.println(copo2.quantidade);
    copo2.encher(); // invocar/chamar o método encher
    System.out.println(copo2.quantidade);
    copo2.esvaziar(); // o método esvaziar foi invocado
    System.out.println(copo2.quantidade);


    Evento show = new Evento("Show do Cidadão Quem", 10);
    System.out.println(show.descricao);
    System.out.println(show.totalIngressos);
    System.out.println(show.ingressosDisponiveis()); // 10
    System.out.println(show.ingressosVendidos()); // 0
    show.venderIngresso(); // comando / altera o estado
    System.out.println(show.ingressosDisponiveis()); // 9 // método consulta
    System.out.println(show.ingressosVendidos()); // 1
    show.venderIngresso();
    // ASSERTIVAS/CASOS DE TESTE
    System.out.println(show.ingressosDisponiveis() == 8); // 8
    System.out.println(show.ingressosVendidos() == 2); // 2
    for (int i = 0; i < 8; i++) {
      show.venderIngresso();
    }
    System.out.println(show.ingressosDisponiveis());
    System.out.println(show.ingressosVendidos());
    System.out.println(show.haIngressosDisponiveis());

    try {
      show.venderIngresso();
    } catch(Exception e) {
      System.err.println("Ingressos esgotados");
    }


    System.out.println(show.ingressosVendidos());


    ArCondicionado outroAr = new ArCondicionado("LG", 9000);
    System.out.println(outroAr.temp);
    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();

    outroAr.temp = 31; // deveria ser impossível alterar o estado diretamente
    outroAr.temp++;

    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();
    outroAr.aumentarTemperatura();

    System.out.println(outroAr.temp);

  }
}
