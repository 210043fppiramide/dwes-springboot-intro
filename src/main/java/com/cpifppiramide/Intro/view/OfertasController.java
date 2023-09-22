package com.cpifppiramide.Intro.view;

import com.cpifppiramide.Intro.controller.OfertasRepository;
import com.cpifppiramide.Intro.controller.OfertasRepositoryRAM;
import com.cpifppiramide.Intro.model.Oferta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OfertasController {

    OfertasRepository ofertasRepository;

    public OfertasController(){
        this.ofertasRepository = new OfertasRepositoryRAM();
    }

    @GetMapping("/ofertas")
    public String muestraOfertas(Model model){
        model.addAttribute("ofertas", this.ofertasRepository.getAll());
        return "ofertas";
    }

    @GetMapping("/nueva")
    public String nuevaOferta(){
        return "nueva";
    }

    @PostMapping("/nuevaOferta")
    public String add(Oferta oferta, Model model){
        model.addAttribute("oferta", oferta);
        this.ofertasRepository.add(oferta);
        return "nuevaOferta";
    }
}
