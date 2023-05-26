package com.example.ecommerce.produto;

import com.example.ecommerce.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
}
