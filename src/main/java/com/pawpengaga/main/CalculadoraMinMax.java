package com.pawpengaga.main;

import java.util.Collections;
import java.util.List;

public class CalculadoraMinMax implements ICalculadora {

  private List<Alumno> alumnos;

  public CalculadoraMinMax(List<Alumno> alumnos) {
    this.alumnos = alumnos;
  }

  public List<Alumno> getAlumnos() {
    return this.alumnos;
  }

  public void setAlumnos(List<Alumno> alumnos) {
    this.alumnos = alumnos;
  }


  @Override
  public List<Alumno> calcularPromedios() {
    
    for (Alumno alumno : alumnos) {
      
      int min = Collections.min(alumno.getNotas());
      int max = Collections.max(alumno.getNotas());

      float sumaNotas = 0F;
      int cantidadNotas = 0;

      for (int i = 0; i < alumno.getNotas().size(); i++) {
        if (alumno.getNotas().get(i) != min && alumno.getNotas().get(i) != max) {
          sumaNotas += alumno.getNotas().get(i);
        } else {
          cantidadNotas++;
        }
      }

      float promedio = sumaNotas / (alumno.getNotas().size() - cantidadNotas);
      alumno.setPromedio(promedio);

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
