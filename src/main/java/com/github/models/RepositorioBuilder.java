package com.github.models;

public class RepositorioBuilder {

    private String nombre;
    private String descripcion;

    public RepositorioBuilder(String nombre) {
        this.nombre = nombre;
    }

    public static RepositorioBuilder nombre(String nombre){
        return new RepositorioBuilder(nombre);
    }

    public Repositorio descripcion(String descripcion){
        this.descripcion = descripcion;
        return new Repositorio(this);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
