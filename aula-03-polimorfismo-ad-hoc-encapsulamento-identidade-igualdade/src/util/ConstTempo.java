package util;

enum ConstTempo {
  // privado do pacote (só as classes do pacote útil podem ver)

  MINUTOS(60), HORAS(3600);

  final int segundos;

  ConstTempo(int segundos) {
    this.segundos = segundos;
  }

}
