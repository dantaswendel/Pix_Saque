package com.wendel.pixSaque.mapper;

import com.wendel.pixSaque.entity.PixSaque;
import com.wendel.pixSaque.request.PixSaqueRequest;
import com.wendel.pixSaque.response.PixSaqueResponse;

import java.util.ArrayList;
import java.util.List;

public class PixSaqueMapper {

    public  static PixSaque toPixSaque (PixSaqueRequest request){

        PixSaque pixSaque = new PixSaque();
        
        pixSaque.setNomeInstituicao(request.nomeInstituicao);
        pixSaque.setCnpjInstituicao(request.cnpjInstituicao);
        pixSaque.setNomeContato(request.nomeContato);
        pixSaque.setEmailContato(request.emailContato);
        pixSaque.setURLDados(request.uRLDados);
        pixSaque.setApi(request.api);
        pixSaque.setRecurso(request.recurso);
        pixSaque.setURLConsulta(request.uRLConsulta);
        pixSaque.setSituacao(request.situacao);
        pixSaque.setVersao(request.versao);

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

    public static List<PixSaqueResponse> toPixSaqueResponseList(List<PixSaque> pixSaques){

        List<PixSaqueResponse> responses = new ArrayList<>();
        for ( PixSaque pixSaque:pixSaques){
            responses.add(toPixSaqueResponse(pixSaque));
        }
        return responses;
    }

}
