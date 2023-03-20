package com.wendel.pixSaque.service;

import com.wendel.pixSaque.client.ClientDTO;
import com.wendel.pixSaque.client.TaxadeJurosClient;
import com.wendel.pixSaque.repository.PixSaqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class APIExternaService {

    @Autowired
    private TaxadeJurosClient taxadeJurosClient;
    @Autowired
    private PixSaqueRepository repository;

    public ClientDTO salvarDados() {
        ClientDTO dto = taxadeJurosClient.getData();
        repository.saveAll(dto.getValue());
        return dto;
    }

}
