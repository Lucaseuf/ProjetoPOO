package com.example.ecommerce.produto;

public record ProdutoResponseDTO(Long id, String title, String image, Integer preco) {
    public ProdutoResponseDTO(Produto produto) {
        this(produto.getId(), produto.getTitle(), produto.getImage(), produto.getPreco());
    }
}
