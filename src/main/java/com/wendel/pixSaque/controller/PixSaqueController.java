package com.wendel.pixSaque.controller;

import com.wendel.pixSaque.entity.PixSaque;
import com.wendel.pixSaque.mapper.PixSaqueMapper;
import com.wendel.pixSaque.request.PixSaqueRequest;
import com.wendel.pixSaque.response.PixSaqueResponse;
import com.wendel.pixSaque.service.PixSaqueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/PixSaque")
public class PixSaqueController {

    @Autowired
    PixSaqueServiceImpl service;

    @GetMapping
    public
    ResponseEntity<List<PixSaqueResponse>> mostrarTodos(){
       List<PixSaque> pixSaques = service.mostrarTodos();
       List<PixSaqueResponse> response = PixSaqueMapper.toPixSaqueResponseList(pixSaques);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<PixSaqueResponse> mostrarPorId(@PathVariable("id") Long id){
        PixSaque pixSaque = service.mostrarPorId(id);
        PixSaqueResponse response = PixSaqueMapper.toPixSaqueResponse(pixSaque);
         return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping(path = "/salvar")
    public ResponseEntity<PixSaqueResponse> salvar (@RequestBody PixSaqueRequest request){

        PixSaque pixSaque = PixSaqueMapper.toPixSaque(request);
        PixSaque pixSaqueSalvo = service.salvar( pixSaque);
        PixSaqueResponse response = PixSaqueMapper.toPixSaqueResponse(pixSaqueSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping(path = "/{id}")
    public void deletar (@PathVariable("id") Long id){

        service.deletar(id);
    }

    @PutMapping(path = "/{id}")

    public ResponseEntity<PixSaqueResponse> atualizar(@PathVariable("id") Long id, @RequestBody PixSaqueRequest request){

        PixSaque pixSaque = PixSaqueMapper.toPixSaque(request);
        PixSaque pixSaqueSalvo = service.salvar( pixSaque);
        PixSaqueResponse response = PixSaqueMapper.toPixSaqueResponse(pixSaqueSalvo);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
