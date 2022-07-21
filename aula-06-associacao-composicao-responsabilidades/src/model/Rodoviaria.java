package model;

import java.util.ArrayList;

import util.DataHora;

public class Rodoviaria {

  private final String nome;
  private final Cidade cidade;
  private final ArrayList<Box> boxes = new ArrayList<>();
  private final ArrayList<Passageiro> usuarios = new ArrayList<>();
  private final ArrayList<Viagem> viagens = new ArrayList<>();

  public Rodoviaria(String nome, Cidade cidade) {
    this.nome = nome;
    this.cidade = cidade;
  }


  public Cidade getCidade() {
    return cidade;
  }

  public String getNome() {
    return nome;
  }

  public ArrayList<Box> getBoxes() {
    return boxes;
  }

  public ArrayList<Passageiro> getUsuarios() {
    return usuarios;
  }

  public void cadastrarUsuario(String CPF, String nome) {
    Passageiro novo = new Passageiro(CPF, nome);
    if (usuarios.contains(novo)) throw new IllegalArgumentException();
    this.usuarios.add(novo);
  }

  public void registrarBox(int numero) {
    Box novoBox = new Box(numero);
    if (boxes.contains(novoBox)) throw new IllegalArgumentException();
    this.boxes.add(novoBox);
  }

  public ArrayList<Viagem> getViagens() {
    return viagens;
  }

  public Viagem getViagem(int nro) {
    return this.viagens.get(nro - 1);
  }


  public void novaViagem(Box box, Cidade destino,
    DataHora dataHora, Onibus onibus) {

      Viagem novaViagem = new Viagem(this.cidade, destino, dataHora, onibus, box);
      this.viagens.add(novaViagem);
  }

}
