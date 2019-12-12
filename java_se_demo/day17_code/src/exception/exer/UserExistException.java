package com.tdsson.exception.exer;

public class UserExistException extends Exception {

    private static final long serialVersionUID = 1L;
    public UserExistException() {
    }

    public UserExistException(String message) {
        super(message);
    }

}
