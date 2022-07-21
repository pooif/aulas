package model;

import java.util.ArrayList;
import java.util.HashSet;

public class Usuario {
  private final int numero;
  private final String email;
  private final Perfil perfil;
  private final HashSet<Usuario> seguidores =
      new HashSet<>();
  private final HashSet<Usuario> seguidos =
      new HashSet<>();

  public HashSet<Usuario> getSeguidores() {
    return seguidores;
  }

  public HashSet<Usuario> getSeguidos() {
    return seguidos;
  }

  public Usuario(int numero, String email) {
    this.numero = numero;
    this.email = email;
    this.perfil = new Perfil();
  }

  public int getNumero() {
    return numero;
  }

  public String getEmail() {
    return email;
  }

  public Perfil getPerfil() {
    return perfil;
  }

  public void seguir(Usuario outro) {
    this.seguidos.add(outro);
    outro.seguidores.add(this);
  }

  @Override
  public String toString() {
    return this.getEmail() + this.perfil.getNome();
  }
}
