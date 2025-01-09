package com.meli_entrevista.produto_api.repository;

import com.meli_entrevista.produto_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    Produto getProdutoById(Integer id);
}
