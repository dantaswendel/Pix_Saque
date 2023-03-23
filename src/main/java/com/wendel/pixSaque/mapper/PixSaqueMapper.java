package com.wendel.pixSaque.mapper;

import com.wendel.pixSaque.entity.PixSaque;
import com.wendel.pixSaque.request.PixSaqueRequest;
import com.wendel.pixSaque.response.PixSaqueResponse;

public class PixSaqueMapper {

    public  static PixSaque toPixSaque (PixSaqueRequest request){

        PixSaque pixSaque = new PixSaque();
        pixSaque.setNomeInstituicao(request.nomeInstituicao);
        pixSaque.setCnpjInstituicao(request.cnpjInstituicao);
        pixSaque.setNomeContato(request.nomeContato);
        pixSaque.setEmailContato(request.emailContato);
        pixSaque.setURLDados(request.uRLDados);

        return pixSaque;
    }

    public  static PixSaqueResponse toPixSaqueResponse (PixSaque pixSaque){

        PixSaqueResponse response = new PixSaqueResponse();
        response.setNomeInstituicao(pixSaque.nomeInstituicao);
        response.setCnpjInstituicao(pixSaque.cnpjInstituicao);
        response.setNomeContato(pixSaque.nomeContato);
        response.setEmailContato(pixSaque.emailContato);
       response.setURLDados(pixSaque.uRLDados);

        return response;

    }

}
