package com.meli_entrevista.produto_api.controller;

import com.meli_entrevista.produto_api.model.Produto;
import com.meli_entrevista.produto_api.service.ProdutoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> save(@RequestBody Produto produto) {
        return ResponseEntity.of(Optional.ofNullable(produtoService.save(produto)));
    }

    @GetMapping
    public ResponseEntity<Produto> get(@RequestParam Integer id) {
        return ResponseEntity.ok(produtoService.fetch(id));
    }
}
