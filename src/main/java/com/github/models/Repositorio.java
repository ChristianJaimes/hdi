package com.github.models;

public class Repositorio {

    private String nombre;
    private String descripcion;

    public Repositorio(String nombre) {
        this.nombre = nombre;
    }

    public Repositorio(RepositorioBuilder builder){
        this.nombre = builder.getNombre();
        this.descripcion = builder.getDescripcion();
    }

    public static Repositorio conNombre(String nombre) {
        return new Repositorio(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
