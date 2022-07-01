/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author henry
 */
public class UsuarioDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    
    public void CadastrarUsuario(UsuarioDTO objUsuarioDTO) throws ClassNotFoundException{
        String sql = "insert into usuario(nome_usuario, email_usuario, senha_usuario, senha_usuario_igual) values(?, ?, ?, ?)";
        con = new ConexaoDAO().conxaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getEmail_usuario());
            pstm.setString(3, objUsuarioDTO.getSenha_usuario());
            pstm.setString(4, objUsuarioDTO.getSenha_usuario_igual());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
        }
    }
    
    public void LoginUsuario(UsuarioDTO objUsuarioDTO) throws ClassNotFoundException{
        
        String sql = "select * from usuario where email_usuario = ? and senha_usuario = ?";
        con = new ConexaoDAO().conxaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            
            pstm.setString(1, objUsuarioDTO.getEmail_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());
            
            if(rs.next()){
                
            }
        } catch (Exception e) {
        }
    }
}
