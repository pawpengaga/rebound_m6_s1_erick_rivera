package com.pawpengaga.main;

import java.util.List;

public class Calculadora implements ICalculadora {

  private List<Alumno> alumnos;


  public Calculadora(List<Alumno> alumnos) {
    this.alumnos = alumnos;
  }

  @Override
  public List<Alumno> calcularPromedios() {
    
    int myindex = 0;

    for (Alumno alumno : alumnos) {
      float sumaNotas = 0F;
      int cantidadNotas = 0;
      for (Integer nota : alumno.getNotas()) {
        sumaNotas += nota;
        cantidadNotas++;
      }
      alumno.setPromedio(sumaNotas / cantidadNotas);
      alumnos.set(myindex, alumno);
      myindex++;

    }

    return alumnos;

  }

  public List<Alumno> getAlumnos() {
    return this.alumnos;
  }

  public void setAlumnos(List<Alumno> alumnos) {
    this.alumnos = alumnos;
  }

  @Override
  public String toString() {
    return "{" +
      " alumnos='" + getAlumnos() + "'" +
      " }";
  }

}
