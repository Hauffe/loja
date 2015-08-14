/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.pr.prog4.lojaoldschool.models;

import java.math.BigDecimal;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexandre.hauffe
 */
public class ProdutoManager implements IProdutoManager{

    private static List<Produto> produtos; 

    static
    {
         produtos = new ArrayList<>();
    
         Produto p1 = new Produto();
         p1.setId(1);
         p1.setNome("pc 1");
         p1.setPreco(new BigDecimal(50.0f));
         produtos.add(p1);
         
         Produto p2 = new Produto();
         p2.setId(2);
         p2.setNome("pc 2");
         p2.setPreco(new BigDecimal(50.0f));
         produtos.add(p2);
         
         Produto p3 = new Produto();
         p3.setId(3);
         p3.setNome("pc 3");
         p3.setPreco(new BigDecimal(50.0f));
         produtos.add(p3);
    }
    
    
    
    @Override
    public List<Produto> obterTodos() {
        return produtos;
    }

}
