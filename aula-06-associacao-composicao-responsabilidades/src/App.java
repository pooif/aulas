import model.Cidade;
import model.Onibus;
import model.Passageiro;
import model.Passagem;
import model.Rodoviaria;
import util.DataHora;

class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    Cidade rg = new Cidade("Rio Grande");

    Rodoviaria rodo = new Rodoviaria("Rodoviária de RG", rg);

    rodo.cadastrarUsuario("12345678912", "Manoel Silva");
    rodo.cadastrarUsuario("78945612310", "Marisa Pereira");
    try {
      rodo.cadastrarUsuario("12345678912", "Manoel Castro");
    } catch (Exception e) {
      System.err.println("Usuario já existe");
    }

    for (int i = 1; i <= 5; i++) rodo.registrarBox(i);


    Onibus o1255 = new Onibus("1255", 30, 10);

    System.out.println(o1255);

    Cidade pel = new Cidade("Pelotas");
    Cidade poa = new Cidade("Porto Alegre");
    DataHora dataHora = new DataHora(15, 2, 2020, 15, 0, 0);

    rodo.novaViagem(rodo.getBoxes().get(0), pel, dataHora, o1255);

    System.out.println(rodo.getViagens());

    Passageiro manoel = rodo.getUsuarios().get(0);
    Passagem pass = rodo.getViagem(1).getPassagem(5);
    System.out.println(pass);
    pass.comprar(manoel);
    System.out.println(pass.isDisponivel());

    pass.cancelar();

    System.out.println(pass.isDisponivel());
  }
}
