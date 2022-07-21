package model;

import java.time.LocalDate;
import java.util.Date;

public class Perfil {

  private String nome;
  private LocalDate dataNasc;

  @Deprecated(since = "1.2")
  public String getNome() {
    return nome;
  }

  public String getNomeCompleto() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataNascimento() {
    return dataNasc;
  }

  public void setDataNasc(LocalDate dataNasc) {
    this.dataNasc = dataNasc;
  }
}
