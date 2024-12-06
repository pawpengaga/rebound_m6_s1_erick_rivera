package com.pawpengaga.main;

import java.util.List;

public class CalculadoraBaja implements ICalculadora {

  private List<Alumno> alumnos;

  public CalculadoraBaja(List<Alumno> alumnos) {
    this.alumnos = alumnos;
  }

  public List<Alumno> getAlumnos() {
    return this.alumnos;
  }

  public void setAlumno(List<Alumno> alumnos) {
    this.alumnos = alumnos;
  }

  @Override
  public List<Alumno> calcularPromedios() {

    for (Alumno alumno : alumnos) {
      float sumaNotas = 0F;
      int contador = 0;
      for (int i = 0; i < alumno.getNotas().size(); i++) {
        if (alumno.getNotas().get(i) >= 3) {
          sumaNotas += alumno.getNotas().get(i);
        } else {
          contador++;
        }
      }
      if (sumaNotas != 0) {
        float promedio = sumaNotas / (alumno.getNotas().size() - contador);
        alumno.setPromedio(promedio);
      }
    }

    return alumnos;

  }

  @Override
  public String toString() {
    return "{" +
      " alumnos='" + getAlumnos() + "'" +
      " }";
  }


}
