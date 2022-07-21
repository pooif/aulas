import model.Album;
import model.Artista;
import model.Colecao;
import model.Musica;
import model.Playlist;
import util.Duracao;

class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    Duracao d1 = new Duracao(5, 40, 31);
    System.out.println(d1);
    Duracao d2 = new Duracao(12, 38, 51);
    d1.somar(d2);
    System.out.println(d1);

    Artista legiao = new Artista("Legião Urbana");

    Musica metal = new Musica("Metal contra as Nuvens", new Duracao(0, 11, 28), legiao);
    Musica serenissima = new Musica("Sereníssima", new Duracao(0, 4, 1), legiao);

    // variable arguments (VARARGS)
    Album legiaoV = new Album("Legião Urbana V", metal, serenissima);
    // Metal e Sereníssima são agregadas ao Álbum e fixas!

    System.out.println(legiaoV.getTitulo().equals("Legião Urbana V"));
    System.out.println(legiaoV.getDuracao().toString()); // 00h15m29s

    System.out.println(legiaoV);

    Playlist minha = new Playlist("Minha lista", serenissima);
    System.out.println(minha.getNome());
    System.out.println(minha.getDataHoraCriacao());
    System.out.println(minha.getMusicas());
    System.out.println(minha.getDuracao());
    // a Playlist é uma agregação variável
    minha.adicionarMusica(serenissima);
    minha.adicionarMusica(metal);

    System.out.println(minha.getMusicas());
    System.out.println(minha.getDuracao());
    // pode ser vinculado e desvinculado, os relacionamentos são temporários
    minha.removerMusica(serenissima);

    System.out.println(minha.getMusicas());
    System.out.println(minha.getDuracao());

    minha.removerMusica(serenissima);

    // minha.removerMusica(metal);

    Artista daftPunk = new Artista("Daft Punk");

    Musica within = new Musica("Within", new Duracao(0, 3, 49), daftPunk);
    Musica beyond = new Musica("Beyond", new Duracao(0, 4, 50), daftPunk);

    Album ram = new Album("Random Access Memories", within, beyond);

    System.out.println(ram);

    Colecao minhaColecao = new Colecao("Minha Coleção");
    minhaColecao.adicionarAlbum(legiaoV);
    minhaColecao.adicionarAlbum(ram);
    System.out.println(minhaColecao);

    // NAVEGAR PELO/ATRAVESSAR O GRAFO DE OBJETOS

    System.out.println(
      ((Album)minhaColecao.getAlbuns().get(1))
        .getMusicas()[0]
        .getArtista()
        .getNome()
    );

    System.out.println(((Musica)minha.getMusicas().get(0)).getDuracao().getMinutos());

    System.out.println(((Album) minhaColecao.getAlbuns().get(0)).getMusicas()[1].getDuracao());

  }
}
