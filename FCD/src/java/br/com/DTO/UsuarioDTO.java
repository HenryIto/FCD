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
public class UsuarioDTO {
    private int id_usuario;
    private String nome_usuario;
    private String email_usuario;
    private String senha_usuario;
    private String senha_usuario_igual;

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the nome_usuario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_usuario the nome_usuario to set
     */
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    /**
     * @return the email_usuario
     */
    public String getEmail_usuario() {
        return email_usuario;
    }

    /**
     * @param email_usuario the email_usuario to set
     */
    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    /**
     * @return the senha_usuario
     */
    public String getSenha_usuario() {
        return senha_usuario;
    }

    /**
     * @param senha_usuario the senha_usuario to set
     */
    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    /**
     * @return the senha_usuario_igual
     */
    public String getSenha_usuario_igual() {
        return senha_usuario_igual;
    }

    /**
     * @param senha_usuario_igual the senha_usuario_igual to set
     */
    public void setSenha_usuario_igual(String senha_usuario_igual) {
        this.senha_usuario_igual = senha_usuario_igual;
    }
}
