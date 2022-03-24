package com.example.tareaherenciaalunos;
import java.util.List;

public class Alumnos extends GetPromedio {
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public String numCuenta;
    public List<Materias> materias;
    public double calificacionTotal;



    public Alumnos(String nombre,
                   String apellidoPaterno,
                   String apellidoMaterno,
                   String numCuenta,
                   List<Materias> materias){
        super( materias );

        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numCuenta = numCuenta;
        this.materias = materias;
    }



    public String getNameFull(){

        return  nombre + apellidoPaterno + apellidoMaterno;

    }



}
