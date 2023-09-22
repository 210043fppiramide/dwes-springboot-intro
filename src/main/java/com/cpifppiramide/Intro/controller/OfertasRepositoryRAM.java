package com.cpifppiramide.Intro.controller;

import com.cpifppiramide.Intro.model.Oferta;

import java.util.ArrayList;
import java.util.List;

public class OfertasRepositoryRAM implements OfertasRepository{

    private List<Oferta> lista;

    @Override
    public List<Oferta> getAll(){
        if(this.lista == null){
            this.lista = new ArrayList<>();
            relleno();
        }
        return this.lista;
    }

    @Override
    public void add(Oferta oferta){
        this.lista.add(oferta);
    }

    private void relleno(){
        this.lista.add(new Oferta("Programador/a backend", "PHP y nodejs"));
        this.lista.add(new Oferta("Programador frontend", "JavaScript"));
    }

}
