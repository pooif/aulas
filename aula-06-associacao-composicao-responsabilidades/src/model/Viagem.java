package model;

import java.util.ArrayList;

import util.DataHora;

public class Viagem {
  private final Cidade origem;
  private final Cidade destino;
  private final DataHora dataHora;
  private Onibus onibus;
  private final Box box;
  private final ArrayList<Passagem> passagens = new ArrayList<>();

  public Viagem(Cidade origem, Cidade destino,
    DataHora dataHora, Onibus onibus, Box box) {
    this.origem = origem;
    this.destino = destino;
    this.dataHora = dataHora;
    this.onibus = onibus;
    this.box = box;
    criarPassagens();
  }

  private void criarPassagens() {
    for (Assento assento : this.onibus.getAssentos()) {
      this.passagens.add(new Passagem(this, assento));
    }
  }

  public Passagem getPassagem(int nro) {
    return passagens.get(nro - 1);
  }

  public int getQuantidadePassagensDisponiveis() {
    int cont = 0;
    for (Passagem p : this.passagens) if (p.isDisponivel()) cont++;
    return cont;
  }

  public Cidade getOrigem() {
    return origem;
  }

  public Cidade getDestino() {
    return destino;
  }

  public DataHora getDataHora() {
    return dataHora;
  }

  public Onibus getOnibus() {
    return onibus;
  }

  public Box getBox() {
    return box;
  }

  @Override
  public String toString() {
    return "Viagem de " + this.getOrigem()
      + " para " + this.getDestino()
      + " data/hora " + this.getDataHora()
      + " partindo do box " + this.getBox();
  }

}
