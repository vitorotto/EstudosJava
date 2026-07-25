package com.vitorotto.mapper;

import java.util.ArrayList;
import java.util.List;

// Classe que pode receber uma lista de qualquer um dos tipos ClientDTO, ProductDTO e OrderDTO
public class MappingResult<T> {

    private List<T> successItemsList;
    private List<String> errorItemsList;

    public MappingResult() {
        this.successItemsList = new ArrayList<T>();
        this.errorItemsList = new ArrayList<String>();
    }

    public List<T> getSuccessItemsList() {
        return successItemsList;
    }

    public List<String> getErrorItemsList() {
        return errorItemsList;
    }

    public void addSucessItem(T sucessItem) {
        this.successItemsList.add(sucessItem);
    }

    public void addErrorItem(String errorItem) {
        this.errorItemsList.add(errorItem);
    }

}
