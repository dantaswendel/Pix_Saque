package com.wendel.pixSaque.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PixSaqueRequest {

    @Column
    @JsonProperty("Api")
    public String api;
    @Column
    @JsonProperty("Versao")
    public String versao;

    @Column
    @JsonProperty("CnpjInstituicao")
    public String cnpjInstituicao;

    @Column
    @JsonProperty("NomeInstituicao")
    public String nomeInstituicao;
    @Column
    @JsonProperty("NomeContato")
    public String nomeContato;
    @Column
    @JsonProperty("EmailContato")
    public String emailContato;
    @Column
    @JsonProperty("Recurso")
    public String recurso;
    @Column
    @JsonProperty("Situacao")
    public String situacao;
    @Column
    @JsonProperty("URLDados")
    public String uRLDados;
    @Column
    @JsonProperty("URLConsulta")
    public String uRLConsulta;
}
