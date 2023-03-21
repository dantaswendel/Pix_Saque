package com.wendel.pixSaque.controller;

import com.wendel.pixSaque.entity.PixSaque;
import com.wendel.pixSaque.service.PixSaqueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/PixSaque")
public class PixSaqueController {

    @Autowired
    PixSaqueServiceImpl service;

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

    @PutMapping(path = "/{id}")

    public PixSaque atualizar(@PathVariable("id") Long id, @RequestBody PixSaque pixSaque){

        return service.atualizar(pixSaque.getId(), pixSaque);
    }
}
