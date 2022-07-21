class Livro { // classificação de Livro (abstração)
  String titulo; // atributo título (característica)
  String subtitulo;
  String autor;
  String editora;
  int paginas;

  // construtor: inicializar o objeto
  Livro(String paramTitulo) { // o parâmetro título é obrigatório
    titulo = paramTitulo;
  }
}
