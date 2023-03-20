package com.wendel.pixSaque.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wendel.pixSaque.entity.PixSaque;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private static final long serialVersionUID = 1L;
    @JsonProperty("@odata.context")
    private String odataContext;
    @JsonProperty(value = "value")
    private List<PixSaque> value;
}

