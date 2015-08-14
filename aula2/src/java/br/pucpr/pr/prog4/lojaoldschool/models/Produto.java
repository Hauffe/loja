/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.pr.prog4.lojaoldschool.models;

/**
 *
 * @author alexandre.hauffe
 */
public class Produto {
    
    private Integer id;
    private String nome;
    private Number preco;

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Number getPreco() {
        return preco;
    }

    public void setPreco(Number preco) {
        this.preco = preco;
    }
    
    
    
}
