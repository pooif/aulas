package util;

import static java.lang.Integer.parseInt;

// ausência da palavra-chave de visibilidade torna "privado do pacote"
public class Tempo implements Comparable<Tempo> {
  // UM ATRIBUTO SEGUNDOS E ELE É INVISÍVEL PARA FORA
  private int segundos;

  public Tempo(int segundos) {
    this.segundos = segundos;
  }

  public Tempo(int minutos, int segundos) {
    this(segundos + minutos * ConstTempo.MINUTOS.segundos);
  }

  // 00:00
  // 01234
  public Tempo(String str) {
    this(parseInt(str.substring(0, 2)),
         parseInt(str.substring(3, 5)));
  }

  // MÉTODOS CONSULTA/GETTER/LEITURA DE UMA PROPRIEDADE
  public int getSegundos() {
    return this.segundos % 60;
  }

  public int getMinutos() {
    return this.segundos / 60;
  }

  public int getHoras() {
    return this.segundos / 3600;
  }

  public int getSegundosTotal() {
    return this.segundos;
  }

  public void adiciona(Tempo t) {
    this.segundos += t.segundos;
  }

  @Override
  public boolean equals(Object outroObjeto) {
    if (this == outroObjeto) return true;
    if (null == outroObjeto) return false;
    if (outroObjeto instanceof Tempo) {
      // class cast, coerção, conversão
      Tempo outroTempo = (Tempo) outroObjeto;
      return this.segundos == outroTempo.segundos;
    }
    return false;
  }

  @Override
  public int compareTo(Tempo outroTempo) {
    // if (this.segundos > outroTempo.segundos) return 1;
    // if (this.segundos < outroTempo.segundos) return -1;
    // return 0;
    return this.segundos - outroTempo.segundos;
  }
}
