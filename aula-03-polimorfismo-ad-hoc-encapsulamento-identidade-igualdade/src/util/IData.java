package util;

public interface IData {
  // é público por padrão
  int getDia();
  void setDia(int dia);

  int getMes();
  void setMes(int mes);

  int getAno();
  void setAno(int ano);

  DiaDaSemana getDiaDaSemana();

  public enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
  }

}
