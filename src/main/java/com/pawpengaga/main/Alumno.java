package com.pawpengaga.main;

import java.util.List;

public class Alumno {

  private String rut;
  private String nombre;
  private List<Integer> notas;
  private float promedio;

  public Alumno() {
  }

  public Alumno(String rut, String nombre, List<Integer> notas, float promedio) {
    this.rut = rut;
    this.nombre = nombre;
    this.notas = notas;
    this.promedio = promedio;
  }

  public String getRut() {
    return this.rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public List<Integer> getNotas() {
    return this.notas;
  }

  public void setNotas(List<Integer> notas) {
    this.notas = notas;
  }

  public float getPromedio() {
    return this.promedio;
  }

  public void setPromedio(float promedio) {
    this.promedio = promedio;
  }

  @Override
  public String toString() {
    return "{" +
      " rut='" + getRut() + "'" +
      ", nombre='" + getNombre() + "'" +
      ", notas='" + getNotas() + "'" +
      ", promedio='" + getPromedio() + "'" +
      " }";
  }


}
