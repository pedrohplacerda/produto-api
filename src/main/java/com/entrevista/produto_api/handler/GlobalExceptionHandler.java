package com.entrevista.produto_api.handler;

import com.entrevista.produto_api.exception.ProdutoNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProdutoNaoEncontradoException.class)
    public ResponseEntity<String> produtoNaoEncontradoExceptionHandler(ProdutoNaoEncontradoException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
    }
}
