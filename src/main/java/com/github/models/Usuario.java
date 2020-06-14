package com.github.models;

import java.util.List;

public class Usuario {
    private String usuario;
    private String contrasena;

    public Usuario(List<String> data) {
        usuario = data.get(0);
        contrasena = data.get(1);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public static Usuario con(List<String> data) {
        return new Usuario(data);
    }

    @Override
    public String toString() {
        return "{" +
                "usuario='" + usuario + '\'' +
                ", contrasena='******'}";
    }
}
