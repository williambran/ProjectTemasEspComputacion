package com.example.tarea3interfacealumno;

import java.util.ArrayList;
import java.util.List;

public class TestAlumnoPromedio {

    public static void main(String[] arg) {

        Materias materiasCalc = new Materias("calculo",10.0);
        Materias materiasFi = new Materias("fisica",9.0);
        Materias materiasProg = new Materias("Probabilidad",8.0);
        Materias materiasProb = new Materias("Programacion",7.0);


        List<Materias> materias = new ArrayList<>();

        materias.add(materiasCalc);
        materias.add(materiasFi);
        materias.add(materiasProg);
        materias.add(materiasProb);


        AlumnoRegular alumno = new AlumnoRegular("William Brando",
                "Estrada",
                "Tepec",
                "419107480",
                materias);

        System.out.println("Nombre del alumno: " + alumno.getNameFull());
        System.out.println("Promedio: " + alumno.promedio());

    }





}