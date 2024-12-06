package com.pawpengaga.main;

public class Profesor {

  private ICalculadora calculadora;

  public Profesor(ICalculadora calculadora) {
    this.calculadora = calculadora;
  }

  public void mostrarAlumnosPromedio(){
    System.out.println(calculadora.calcularPromedios());
  }

}
