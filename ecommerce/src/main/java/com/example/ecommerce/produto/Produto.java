package com.example.ecommerce.produto;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "produtos")
@Entity(name = "produtos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer preco;

    public Produto(ProdutoRequestDTO data) {
        this.image = data.image();
        this.preco = data.preco();
        this.title = data.title();
    }
}
