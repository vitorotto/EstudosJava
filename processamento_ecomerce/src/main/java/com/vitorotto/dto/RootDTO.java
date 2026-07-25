package com.vitorotto.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public class RootDTO {
    private final String jsonContent;

    @JsonCreator
    public RootDTO(
        String jsonContent
    ) {
        this.jsonContent = jsonContent;
    }

    public String getJsonContent() {
        return jsonContent;
    }

}
