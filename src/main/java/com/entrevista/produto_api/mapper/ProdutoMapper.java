package com.entrevista.produto_api.mapper;

import com.entrevista.produto_api.dto.ProdutoDTO;
import com.entrevista.produto_api.entities.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProdutoMapper {

    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    Produto toProduto(ProdutoDTO produtoDTO);

    ProdutoDTO toProdutoDTO(Produto produto);
}
