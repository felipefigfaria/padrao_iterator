package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    @Test
    void deveCalcularProdutosOutletCarrinho() {
        Carrinho carrinho = new Carrinho(
                new Produto("Camisa Nike Jordan", false),
                new Produto("Tênis Nike Air Max", true),
                new Produto("Camiseta Nike PSG I", true),
                new Produto("Tênis Nike Air Force 1", false)
        );
        assertEquals(2, Registro.calcularProdutosOutletCarrinho(carrinho));
    }

    @Test
    void deveCalcularTotalProdutosCarrinho() {
        Carrinho carrinho = new Carrinho(
                new Produto("Camisa Nike Jordan", false),
                new Produto("Tênis Nike Air Max", true),
                new Produto("Camiseta Nike PSG I", true),
                new Produto("Tênis Nike Air Force 1", false),
                new Produto("Casaco Nike Sportswear", true)
        );
        assertEquals(5, Registro.calcularTotalProdutosCarrinho(carrinho));
    }

}