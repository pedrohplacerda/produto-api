package com.entrevista.produto_api.repository;

import com.entrevista.produto_api.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    Produto getProdutoById(Integer id);
}
