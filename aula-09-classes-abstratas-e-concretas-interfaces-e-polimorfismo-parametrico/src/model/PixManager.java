package model;

import java.util.HashMap;

public class PixManager {

  public HashMap<String, Pix> contas = new HashMap<>();


  public void registrar(String cpf, Pix pix) {
    contas.put(cpf, pix);
  }

  public void transfere(String cpfOrigem, String cpfDestino, int valor) {
    Pix origem = contas.get(cpfOrigem);
    if (origem == null) throw new RuntimeException();
    Pix destino = contas.get(cpfDestino);
    if (destino == null) throw new RuntimeException();
    try {
      origem.pagar(valor);
      destino.receber(valor);
    } catch (SaldoInsuficienteException e) {
      throw new RuntimeException(e);
    }
  }
}
