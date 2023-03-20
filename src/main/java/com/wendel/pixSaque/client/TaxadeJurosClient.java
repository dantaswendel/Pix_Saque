package com.wendel.pixSaque.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "TaxadeJurosClient", url ="https://olinda.bcb.gov.br/olinda/servico/DASFN/versao/v1/odata/Recursos?$top=10000&$filter=Api%20eq%20'pix_saque'&$format=json&$select=Api,Versao,CnpjInstituicao,NomeInstituicao,NomeContato,EmailContato,Recurso,Situacao,URLDados,URLConsulta")
public interface TaxadeJurosClient {
    @GetMapping()
    ClientDTO getData();
}
