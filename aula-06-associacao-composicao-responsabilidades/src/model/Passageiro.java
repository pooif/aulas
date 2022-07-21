package model;

import java.util.ArrayList;

public class Passageiro {

  private final String CPF;
  private final String nome;
  private final ArrayList<Passagem> passagens = new ArrayList<>();

  public Passageiro(String CPF, String nome) {
    this.CPF = CPF;
    this.nome = nome;
  }

  public String getCPF() {
    return CPF;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Passageiro) {
      return ((Passageiro)o).CPF.equals(this.CPF);
    }
    return false;
  }

  @Override
  public String toString() {
    return this.nome + " CPF " + this.CPF;
  }

  public void adquiriu(Passagem passagem) {
    this.passagens.add(passagem);
  }

  public void cancelou(Passagem passagem) {
    this.passagens.remove(passagem);
  }
}
