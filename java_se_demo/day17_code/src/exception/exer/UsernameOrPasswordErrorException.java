package com.tdsson.exception.exer;

public class UsernameOrPasswordErrorException extends Exception{

    private static final long serialVersionUID = 1L;
    public UsernameOrPasswordErrorException() {
    }

    public UsernameOrPasswordErrorException(String message) {
        super(message);
    }
}
