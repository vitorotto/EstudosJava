package com.vitorotto.model.enums;

public enum ClientType {
    VIP(1),
    COMUM(2);

    private final int cod;

    ClientType(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }
    
}
