package util;

public class DataHora {

  private final Data data;
  private final Hora hora;

  public DataHora(int dia, int mes, int ano, int horas, int minutos, int segundos) {
    this.data = new Data(dia, mes, ano);
    this.hora = new Hora(horas, minutos, segundos);
  }

  public Data getData() {
    return data;
  }

  public Hora getHora() {
    return hora;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof DataHora) {
      return ((DataHora)o).data.equals(this.data)
        && ((DataHora)o).hora.equals(this.hora);
    }

    return false;
  }

  @Override
  public String toString() {
    return this.data.toString() + " " + this.hora.toString();
  }

}
