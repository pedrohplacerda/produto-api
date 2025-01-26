package com.entrevista.produto_api.service;

import com.entrevista.produto_api.dto.ProdutoDTO;
import com.entrevista.produto_api.entities.Produto;
import com.entrevista.produto_api.exception.ProdutoNaoEncontradoException;
import com.entrevista.produto_api.mapper.ProdutoMapper;
import com.entrevista.produto_api.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {


    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto save(ProdutoDTO produtoDTO) {
        return repository.save(ProdutoMapper.INSTANCE.toProduto(produtoDTO));
    }

    public ProdutoDTO fetch(Integer id) {
        Produto produtoById = repository.getProdutoById(id);
        return Optional.ofNullable(ProdutoMapper.INSTANCE.toProdutoDTO(produtoById)).orElseThrow(ProdutoNaoEncontradoException::new);
    }
}
