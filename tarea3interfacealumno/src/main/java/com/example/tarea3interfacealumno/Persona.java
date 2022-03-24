package com.example.tarea3interfacealumno;

public abstract class Persona {

    public String name;
    public String firtsName;
    public String seconName;


    protected Persona(String name,
                      String firtsName,
                      String seconName
                      ) {
        this.name = name;
        this.firtsName = firtsName;
        this.seconName = seconName;
    }


    public  String getNameComplete(){

        return name +" "+ firtsName + " " + seconName;
    }


    public abstract String getPromedio();

}
