/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.ProdutosBean;

/**
 *
 * @author Senai
 */
public class ProdutosDAO {
    
    public List<ProdutosBean> lerItens(){
        List<ProdutosBean> conjProdutos = new ArrayList();
        
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null; 
            
            stmt = conexao.prepareStatement("SELECT * FROM produtos");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                ProdutosBean produtos = new ProdutosBean();
                
                produtos.setId_produto(rs.getInt("id_produto"));
                produtos.setNome_produto(rs.getString("nome_produto"));
                produtos.setDescricao_produto(rs.getString("descricao_produto"));
                produtos.setFk_id_categoria(rs.getInt("fk_id_categoria"));
                produtos.setValor(rs.getFloat("valor"));
                
                conjProdutos.add(produtos);
                
            }
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conjProdutos;
        
    }
    
    
}
