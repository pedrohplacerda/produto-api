package com.entrevista.produto_api.dto;

public class ProdutoDTO {

    private Integer id;
    private String nome;
    private Double valor;
    private Long quantidade;

    public ProdutoDTO(Integer id, String nome, Double valor, Long quantidade) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public ProdutoDTO() {
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }


    public Long getQuantidade() {
        return quantidade;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }
}
