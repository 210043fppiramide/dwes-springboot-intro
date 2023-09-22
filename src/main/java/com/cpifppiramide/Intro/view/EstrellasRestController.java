package com.cpifppiramide.Intro.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstrellasRestController {

    @GetMapping("/estrellas/{n}")
    public String estrellas(@PathVariable Integer n){
        String html = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                html+="*";
            }
            html+="<br>";
        }
        return html;
    }

}
