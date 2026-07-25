package com.vitorotto.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientDTO {
    
    private final int id;
    private final String name;
    private final String type;
    private final String city;
    private final String state;
    private final String registrationDate;

    @JsonCreator
    public ClientDTO(
        @JsonProperty("id")
        int id,
        @JsonProperty("nome")
        String name,
        @JsonProperty("tipo")
        String type,
        @JsonProperty("cidade")
        String city,    
        @JsonProperty("estado")
        String state,
        @JsonProperty("dataCadastro")
        String registrationDate
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.city = city;
        this.state = state;
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

}
