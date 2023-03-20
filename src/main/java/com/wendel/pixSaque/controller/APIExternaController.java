package com.wendel.pixSaque.controller;

import com.wendel.pixSaque.service.APIExternaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/consumirapi")
public class APIExternaController {

     @Autowired
    private APIExternaService apiExternaService;
     @PostMapping
    public void salvarDados(){
         apiExternaService.salvarDados();
    }

}
