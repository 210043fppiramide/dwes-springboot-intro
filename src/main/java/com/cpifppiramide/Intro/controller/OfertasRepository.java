package com.cpifppiramide.Intro.controller;

import com.cpifppiramide.Intro.model.Oferta;

import java.util.List;

public interface OfertasRepository {

    public List<Oferta> getAll();
    public void add(Oferta oferta);

}
