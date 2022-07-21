package model;

import java.util.ArrayList;

public class Onibus {

  private final String identificacao;
  private final ArrayList<Assento> assentos =
    new ArrayList<>();

  public Onibus(String id, int assentosNormais, int assentosExecutivos) {
    this.identificacao = id;
    int i = 1;
    for (; i <= assentosExecutivos; i++) {
      this.assentos.add(new Assento(i, true, i % 2 == 1));
    }
    for (; i <= assentosNormais; i++) {
      this.assentos.add(new Assento(i, false, i % 2 == 1));
    }
  }

  public Onibus(String id, int assentosNormais) {
    this(id, assentosNormais, 0);
  }

  public String getIdentificacao() {
    return identificacao;
  }

  public ArrayList<Assento> getAssentos() {
    return assentos;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Onibus) {
      return ((Onibus)o).identificacao.equals(this.identificacao);
    }
    return false;
  }

  @Override
  public String toString() {
    return this.identificacao + " " + this.assentos.size() + " assentos";
  }
}
