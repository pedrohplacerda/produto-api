package com.entrevista.produto_api.controller;

import com.entrevista.produto_api.dto.ProdutoDTO;
import com.entrevista.produto_api.entities.Produto;
import com.entrevista.produto_api.mapper.ProdutoMapper;
import com.entrevista.produto_api.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProdutoController {
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    private final ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoDTO> save(@RequestBody ProdutoDTO produto) {
        Produto savedProduct = produtoService.save(produto);
        return ResponseEntity.of(Optional.ofNullable(ProdutoMapper.INSTANCE.toProdutoDTO(savedProduct)));
    }

    @GetMapping
    public ResponseEntity<ProdutoDTO> get(@RequestParam Integer id) {
        return ResponseEntity.ok(produtoService.fetch(id));
    }
}
