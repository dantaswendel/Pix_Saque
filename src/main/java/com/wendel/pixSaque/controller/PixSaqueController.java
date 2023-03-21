package com.wendel.pixSaque.controller;

import com.wendel.pixSaque.entity.PixSaque;
import com.wendel.pixSaque.service.PixSaqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/PixSaque")
public class PixSaqueController {

    @Autowired
    PixSaqueService service;

    @GetMapping
    public List<PixSaque> mostrarTodos(){
        return service.mostrarTodos();
    }

    @GetMapping(path = "/{id}")
    public PixSaque mostrarPorId(@PathVariable("id") Long id){
        return service.mostrarPorId(id);
    }

    @PostMapping(path = "/salvar")
    public PixSaque salvar(@RequestBody PixSaque pixSaque){
        return  service.salvar(pixSaque);
    }

    @DeleteMapping(path = "/{id}")
    public void deletar (@PathVariable("id") Long id){

        service.deletar(id);
    }

    @PutMapping(path = "/atualizar")
    public PixSaque atualizar(@RequestBody PixSaque pixSaque){
        return  service.salvar(pixSaque);
    }
}