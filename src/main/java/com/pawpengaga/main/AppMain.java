package com.pawpengaga.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppMain {

  public static void main(String[] args) {
    
    List<Alumno> alumnos = new ArrayList<>();

    // Se crea una lista de alumnos con el RUT en 0
    alumnos.add(new Alumno("15562563","HeathSchowalter",Arrays.asList(6,7,2),0f));
    alumnos.add(new Alumno("13635430","RozellaBartoletti",Arrays.asList(3,2,6,6,6,4,3,3,4),0f));
    alumnos.add(new Alumno("17554475","JedRunolfsdottir",Arrays.asList(2,5,3,6,2,1,7,2),0f));
    alumnos.add(new Alumno("15911676","NadiaRomaguera",Arrays.asList(2,4,2,7,4,2,5),0f));
    alumnos.add(new Alumno("15257972","DelaneyKing",Arrays.asList(4,2,7,3,5,5),0f));
    alumnos.add(new Alumno("12903628","JermainGleason",Arrays.asList(2,3,6,3,2,6,6,6,4,5),0f));
    alumnos.add(new Alumno("17289139","AmiraCummings",Arrays.asList(6,4,2,2,4,4),0f));
    alumnos.add(new Alumno("11937304","ColbyDaugherty",Arrays.asList(2,3,3,4,5,3,7,4,3),0f));
    alumnos.add(new Alumno("19494989","MicheleAdams",Arrays.asList(3,4),0f));
    alumnos.add(new Alumno("16858319","FelicitaTromp",Arrays.asList(5,2),0f));
    alumnos.add(new Alumno("15731640","ScottyPacocha",Arrays.asList(6,4,2),0f));
    alumnos.add(new Alumno("12900399","RansomDenesik",Arrays.asList(6,6,5),0f));
    alumnos.add(new Alumno("12756544","RockyWyman",Arrays.asList(3),0f));
    alumnos.add(new Alumno("15653448","EmiliaBlock",Arrays.asList(6,7,6,3,5,3,4,3),0f));
    alumnos.add(new Alumno("16790751","LaurenTrantow",Arrays.asList(3,3,5,1,3,5,1,6,4,6),0f));
    alumnos.add(new Alumno("18766487","TessiePacocha",Arrays.asList(2,3,4,5),0f));
    alumnos.add(new Alumno("11988765","GeovannyRippin",Arrays.asList(5,4,4,2,3),0f));
    alumnos.add(new Alumno("12352553","AlexanderBerge",Arrays.asList(6,6,4,2,4,2,6),0f));
    alumnos.add(new Alumno("19886598","MauriceZboncak",Arrays.asList(4,2,4,3,2,5,1),0f));
    alumnos.add(new Alumno("18939934","KenHaley",Arrays.asList(6,7,2,1),0f));

    // Ahora se hace la inyeccion
    ICalculadora calculadora = new Calculadora(alumnos);
    ICalculadora calculadora2 = new CalculadoraBaja(alumnos);
    ICalculadora calculadora3 = new CalculadoraMinMax(alumnos);

    // Segunda inyeccion
    Profesor profesor = new Profesor(calculadora);
    Profesor profesor2 = new Profesor(calculadora2);
    Profesor profesor3 = new Profesor(calculadora3);

    // Mostrar resultados
    System.out.println("-------------------------------");
    System.out.println("PROFESOR 1 --------------------");
    profesor.mostrarAlumnosPromedio();
    System.out.println("-------------------------------");
    System.out.println("PROFESOR 2 --------------------");
    profesor2.mostrarAlumnosPromedio();
    System.out.println("-------------------------------");
    System.out.println("PROFESOR 3 --------------------");
    profesor3.mostrarAlumnosPromedio();

  }

}
