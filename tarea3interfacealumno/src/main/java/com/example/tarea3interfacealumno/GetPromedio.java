package com.example.tarea3interfacealumno;

import java.util.List;

public class GetPromedio {

    public double promedio;
    public List<Materias> materias;


    public GetPromedio(
            List<Materias> materias
    ){
        this.materias = materias;
    }


    public double getPromedio(){
        //operacion para optener el promedio


        for (Materias mat: materias) {
            promedio = promedio + mat.getCalificacion();

        }
        promedio = promedio / materias.size();

        return promedio ;
    }


    public String getPromediotoString() {
        for (Materias mat: materias) {
            promedio = promedio + mat.getCalificacion();

        }
        promedio = promedio / materias.size();

        String promedioString = String.valueOf(promedio);


        return promedioString;
    }
}
