package model.alocacao;

import java.util.ArrayList;

public class Projeto {

  private final String nome;
  private ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<>();

  public Projeto(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public ArrayList<Desenvolvedor> getDesenvolvedores() {
    return desenvolvedores;
  }

  boolean poderiaAlocarDev(Desenvolvedor dev) {
    return ! this.desenvolvedores.contains(dev) && this.desenvolvedores.size() < 5;
  }

  public void alocarDev(Desenvolvedor dev) {
    if (this.poderiaAlocarDev(dev) && dev.podeAlocarNo(this)) {
      this.desenvolvedores.add(dev);
      dev.getProjetos().add(this);
    }
  }

  @Override
  public String toString() {
    return "PROJ_" + this.nome;
  }
}
