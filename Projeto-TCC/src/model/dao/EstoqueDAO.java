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
import model.bean.EstoqueBean;

/**
 *
 * @author LEONARDO
 */
public class EstoqueDAO {
    
    
    public List<EstoqueBean> ListarEstoque(){
        List<EstoqueBean> conjEstoque = new ArrayList();
        
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("select produtos.nome_produto, produtos.descricao_produto, "
             + "produtos.disponivel, produtos.fk_id_categoria, produtos.valor, categorias.nome, "
             + "categorias.descricao from produtos inner join categorias on produtos.fk_id_categoria = categorias.id_categoria");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                EstoqueBean estoque = new EstoqueBean();
                
                estoque.setNome_produto(rs.getString("nome_produto"));
                estoque.setDescricao_produto(rs.getString("descricao_produto"));
                estoque.setValor(rs.getInt("valor"));
                estoque.setFk_id_categoria(rs.getInt("fk_id_categoria"));
                estoque.setQuantidade(rs.getInt("quantidade"));
                estoque.setId_produto(rs.getInt("id_produto"));
                                            
                conjEstoque.add(estoque);
            
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conjEstoque;
        
    }
    
}
