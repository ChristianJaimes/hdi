package com.github.exceptions;

public class RepositorioYaExisteError extends AssertionError {


    public RepositorioYaExisteError(String message, Throwable cause) {
        super(message, cause);
    }
}
