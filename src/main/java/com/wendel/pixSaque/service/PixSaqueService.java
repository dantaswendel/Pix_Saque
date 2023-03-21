package com.wendel.pixSaque.service;

import com.wendel.pixSaque.entity.PixSaque;
import com.wendel.pixSaque.repository.PixSaqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class PixSaqueService {

    @Autowired
    private PixSaqueRepository repository;

    public PixSaqueService (PixSaqueRepository pixSaqueRepository){
        this.repository =pixSaqueRepository;
    }

    @Autowired
    EntityManager entityManager;

    @Transactional
    public PixSaque salvar (PixSaque pixSaque){
        return  repository.save(pixSaque);
    }

    public List<PixSaque> mostrarTodos(){
        return repository.findAll();
    }

    public PixSaque mostrarPorId(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException();
        }
        return repository.findById(id).orElse(null);
    }

        @Transactional
        public void deletar(Long id){

            if(!repository.existsById(id)){
                throw new RuntimeException();
            }
            repository.deleteById(id);
        }

}
