package com.example.tarea3interfacealumno;

import java.util.List;

public  class AlumnoRegular extends Persona {


    public String nombreComplete;
    public String numCuenta;
    public List<Materias> materias;
    public double calificacionTotal;


    public AlumnoRegular(String nombre,
                         String apellidoPaterno,
                         String apellidoMaterno,
                         String numCuenta,
                         List<Materias> materias){
        super( nombre,apellidoPaterno,apellidoMaterno);

        this.numCuenta = numCuenta;
        this.materias = materias;

    }



    public String getNameFull(){
        nombreComplete = super.getNameComplete();
        return nombreComplete;
    }


    public String promedio(){
        for (Materias mat: materias) {
            calificacionTotal = calificacionTotal + mat.getCalificacion();
        }

        calificacionTotal = calificacionTotal / materias.size();

        String promedioString = String.valueOf(calificacionTotal);

        return  promedioString;
    }


    @Override
    public String getPromedio() {
        return null;
    }
}

