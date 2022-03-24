package com.example.tarea3interfacealumno;


public class Materias {

    public String materia;
    public double calificacion;

    public Materias(
            String materia,
            double calificacion
    ){
        this.materia = materia;
        this.calificacion = calificacion;

    }


    public String getMateria(){

        return this.materia;
    }

    public double getCalificacion(){

        return this.calificacion;
    }



}
