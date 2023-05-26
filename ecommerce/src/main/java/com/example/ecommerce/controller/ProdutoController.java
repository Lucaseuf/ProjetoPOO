package com.example.ecommerce.controller;

import com.example.ecommerce.produto.Produto;
import com.example.ecommerce.produto.ProdutoRepository;

import com.example.ecommerce.produto.ProdutoRequestDTO;
import com.example.ecommerce.produto.ProdutoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveProduto(@RequestBody ProdutoRequestDTO data) {
        Produto produtoData = new Produto(data);
        repository.save(produtoData);

        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ProdutoResponseDTO> getAll() {

        List<ProdutoResponseDTO> produtoList = (List<ProdutoResponseDTO>) repository.findAll().stream().map(ProdutoResponseDTO::new);

        return produtoList;
    }
}
