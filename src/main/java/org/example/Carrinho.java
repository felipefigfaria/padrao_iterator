package org.example;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carrinho implements Iterable<Produto> {

    private List<Produto> produtos = new ArrayList<Produto>();

    public Carrinho(Produto... produtos) {
        this.produtos = Arrays.asList(produtos);
    }

    @Override
    public Iterator<Produto> iterator() {
        return produtos.iterator();
    }
}