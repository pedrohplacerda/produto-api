package com.meli_entrevista.produto_api.service;

import com.meli_entrevista.produto_api.exception.ProdutoNaoEncontradoException;
import com.meli_entrevista.produto_api.model.Produto;
import com.meli_entrevista.produto_api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto save(Produto produto) {
        return repository.save(produto);
    }

    public Produto fetch(Integer id) {
        Produto produtoById = repository.getProdutoById(id);
        return Optional.ofNullable(produtoById).orElseThrow(ProdutoNaoEncontradoException::new);
    }
}
