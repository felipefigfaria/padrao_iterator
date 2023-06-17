package org.example;

import java.util.Iterator;

public class Registro {

    public static Integer calcularProdutosOutletCarrinho(Carrinho carrinho) {
        int quantidade = 0;
        for (Produto produto : carrinho) {
            if (produto.isOutlet()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer calcularTotalProdutosCarrinho(Carrinho carrinho) {
        int quantidade = 0;
        for (Iterator p = carrinho.iterator(); p.hasNext(); ) {
            quantidade++;
            p.next();
        }
        return quantidade;
    }
}
