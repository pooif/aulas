import model.Cliente;
import model.ContaConjunta;
import model.Usuario;
import model.alocacao.Desenvolvedor;
import model.alocacao.Projeto;

class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");
    Projeto p1 = new Projeto("p1");
    Projeto p2 = new Projeto("p2");
    Projeto p3 = new Projeto("p3");
    Desenvolvedor d1 = new Desenvolvedor("d1");
    Desenvolvedor d2 = new Desenvolvedor("d2");
    Desenvolvedor d3 = new Desenvolvedor("d3");
    Desenvolvedor d4 = new Desenvolvedor("d4");
    Desenvolvedor d5 = new Desenvolvedor("d5");
    Desenvolvedor d6 = new Desenvolvedor("d6");
    Desenvolvedor d7 = new Desenvolvedor("d7");

    d2.alocarNo(p1);
    System.out.println(d2.getProjetos());
    System.out.println(p1.getDesenvolvedores());

    p1.alocarDev(d1);
    System.out.println(p1.getDesenvolvedores());
    System.out.println(d1.getProjetos());
    p2.alocarDev(d1);
    System.out.println(d1.getProjetos());
    p3.alocarDev(d1);
    System.out.println(d1.getProjetos());
    System.out.println(p3.getDesenvolvedores());

    // TODO: não quebrar o encapsulamento
    d1.getProjetos().add(p2);
    d1.getProjetos().add(p3);
    System.out.println(d1.getProjetos());

    Usuario cibele = new Usuario(455454, "cibele.sinoti@if");
    cibele.getPerfil().setNome("Marcio Torres");

    Usuario betito = new Usuario(52111, "rafael.betito@if");

    cibele.seguir(betito);

    System.out.println(cibele.getSeguidos());
    System.out.println(cibele.getSeguidores());

    System.out.println(betito.getSeguidos());
    System.out.println(betito.getSeguidores());

    Cliente cli1 = new Cliente("um");
    Cliente cli2 = new Cliente("dois");
    ContaConjunta conta = new ContaConjunta(1233, cli1, cli2);
  }
}
