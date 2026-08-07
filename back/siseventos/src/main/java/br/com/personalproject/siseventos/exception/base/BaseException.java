package br.com.personalproject.siseventos.exception.base;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class BaseException extends RuntimeException {

    private HttpStatus status;

    public BaseException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}

//teste sonar