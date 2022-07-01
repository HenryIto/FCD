/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DTO;

/**
 *
 * @author henry
 */
public class ProdutoDTO {
    private int id_produto;
    private String nome_produto;
    private String qnt_produto;

    
    public int getId_produto() {
        return id_produto;
    }

    
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    
    public String getNome_produto() {
        return nome_produto;
    }

    
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    
    public String getQnt_produto() {
        return qnt_produto;
    }

    
    public void setQnt_produto(String qnt_produto) {
        this.qnt_produto = qnt_produto;
    }
    
}
