package com.cpifppiramide.Intro.model;

public class Oferta {

    private final String titulo, descripcion;

    public Oferta(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
