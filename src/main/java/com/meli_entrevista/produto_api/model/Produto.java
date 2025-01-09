package com.meli_entrevista.produto_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(schema = "entrevista", name = "tb_produto")
public class Produto {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @JsonProperty
    @Column(name = "nome")
    private String nome;

    @JsonProperty
    @Column(name = "valor")
    private Double valor;

    @JsonProperty
    @Column(name = "quantidade")
    private Long quantidade;
}
