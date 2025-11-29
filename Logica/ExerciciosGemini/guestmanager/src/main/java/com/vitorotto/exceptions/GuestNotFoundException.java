package com.vitorotto.exceptions;

public class GuestNotFoundException extends Exception{

    public GuestNotFoundException() {
    }

    public GuestNotFoundException(String message) {
        super(message);
    }

}
