package com.wendel.pixSaque.service;

import com.wendel.pixSaque.client.ClientDTO;
import com.wendel.pixSaque.client.PixSaqueClient;
import com.wendel.pixSaque.repository.PixSaqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class APIExternaService {

    @Autowired
    private PixSaqueClient service;
    @Autowired
    private PixSaqueRepository repository;

    public ClientDTO salvarDados() {
        ClientDTO dto = service.getData();
        repository.saveAll(dto.getValue());
        return dto;
    }

}
