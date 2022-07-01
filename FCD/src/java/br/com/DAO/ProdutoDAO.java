/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author henry
 */
public class ProdutoDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProdutoDTO> lista = new ArrayList<>();
    
    public void CadastrarProduto(ProdutoDTO objProdutoDTO) throws ClassNotFoundException{
        
        String sql = "insert into produto(nome_produto, qnt_produto) values(?, ?)";
        con = new ConexaoDAO().conxaoBD();
        
        try{
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objProdutoDTO.getNome_produto());
            pstm.setString(2, objProdutoDTO.getQnt_produto());
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
            
        }
    }
    
    public ArrayList<ProdutoDTO> PesquisarProduto() throws ClassNotFoundException{
        
        String sql = "select * from produto";
        con = new ConexaoDAO().conxaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            
            while(rs.next()){
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
                objProdutoDTO.setId_produto(rs.getInt("id_produto"));
                objProdutoDTO.setNome_produto(rs.getString("nome_produto"));
                objProdutoDTO.setQnt_produto(rs.getString("qnt_produto"));
                
                lista.add(objProdutoDTO);
            }
        } catch (SQLException e) {
        }
        return lista;
    } 
    
    public void ExcluirProduto(ProdutoDTO objProdutoDTO) throws ClassNotFoundException{
        
        String sql = "delete from produto where id_produto = ?";
        con = new ConexaoDAO().conxaoBD();
        
        try{
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, objProdutoDTO.getId_produto());
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
            
        }
    }
    
    public void AlterarProduto(ProdutoDTO objProdutoDTO) throws ClassNotFoundException{
        
        String sql = "update produto set nome_produto = ?, qnt_produto = ? where id_produto = ?";
        con = new ConexaoDAO().conxaoBD();
        
        try{
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objProdutoDTO.getNome_produto());
            pstm.setString(2, objProdutoDTO.getQnt_produto());
            pstm.setInt(3, objProdutoDTO.getId_produto());
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
            
        }
    }
}
