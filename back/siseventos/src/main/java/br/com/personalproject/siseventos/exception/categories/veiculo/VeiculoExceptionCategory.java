package br.com.personalproject.siseventos.exception.categories.veiculo;

import org.springframework.http.HttpStatus;

import br.com.personalproject.siseventos.exception.base.BaseException;

public class VeiculoExceptionCategory extends BaseException {

    public VeiculoExceptionCategory(String message, HttpStatus status) {
        super(message, status);
    }
    
}
