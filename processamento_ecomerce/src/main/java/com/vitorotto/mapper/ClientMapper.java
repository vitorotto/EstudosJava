package com.vitorotto.mapper;

import java.util.List;

import com.vitorotto.dto.ClientDTO;
import com.vitorotto.model.ClientModel;
import com.vitorotto.model.enums.ClientType;

public class ClientMapper {

    private List<ClientDTO> dtos;

    public ClientMapper(List<ClientDTO> dtos) {
        this.dtos = dtos;
    }

    public MappingResult<ClientModel> mapAll() {

        MappingResult<ClientModel> result = new MappingResult<>();

        for (ClientDTO clientDTO : dtos) {
            // Try to add client
            try {
                // Client type converted to the enum value
                ClientType type = ClientType.valueOf(clientDTO.getType());
                result.addSucessItem(new ClientModel(
                        clientDTO.getId(),
                        clientDTO.getName(),
                        type,
                        clientDTO.getCity(),
                        clientDTO.getState(),
                        clientDTO.getRegistrationDate()));
                // If don't add and throws an IllegalArgumentException
            } catch (IllegalArgumentException e) {
                // Write an error message on errors list of MappingResult class
                String errMsg = "Tipo inválido (" + clientDTO.getType() + ") no o cliente " + clientDTO.getId();
                result.addErrorItem(errMsg);
            }
        }
        return result;
    }
}
