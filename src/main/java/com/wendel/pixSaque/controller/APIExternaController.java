package com.wendel.pixSaque.controller;

import com.wendel.pixSaque.entity.PixSaque;
import com.wendel.pixSaque.service.APIExternaService;
import com.wendel.pixSaque.service.PixSaqueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/consumirapi")
public class APIExternaController {

    @Autowired
    private PixSaqueServiceImpl service;
     @Autowired
    private APIExternaService apiExternaService;
     @PostMapping
    public List<PixSaque> salvarDados(){

         apiExternaService.salvarDados();

         return  service.mostrarTodos();
    }

}
