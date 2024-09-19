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
    
    
    public List<EstoqueBean> ListarEstoque(int table){
        List<EstoqueBean> conjEstoque = new ArrayList();
        
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            switch(table) {
                
                case 1:
                    
                    stmt = conexao.prepareStatement("select produtos.nome_produto, produtos.disponivel, produtos.id_produto, produtos.quantidade, produtos.descricao_produto, produtos.disponivel, produtos.fk_id_categoria, produtos.valor, categorias.nome, categorias.descricao from produtos inner join categorias on produtos.fk_id_categoria = categorias.id_categoria");
            
                    break;
                
                case 2: 
                    
                    stmt = conexao.prepareStatement("select produtos.nome_produto," 
                            + "produtos.descricao_produto, produtos.id_produto, produtos.quantidade,"
                            + "produtos.disponivel, produtos.fk_id_categoria, produtos.valor, categorias.nome, categorias.descricao "
                            + "from produtos inner join categorias on produtos.fk_id_categoria = categorias.id_categoria where produtos.disponivel = 1");
                    
                    break;
                    
                case 3:
                    
                    stmt = conexao.prepareStatement("select produtos.nome_produto,produtos.descricao_produto, produtos.disponivel, "
                            + "produtos.fk_id_categoria, produtos.valor, categorias.nome, categorias.descricao, produtos.id_produto, produtos.quantidade "
                            + "from produtos inner join categorias on produtos.fk_id_categoria = categorias.id_categoria where produtos.disponivel = 0");
                    
                    break;
            }
            
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                EstoqueBean estoque = new EstoqueBean();
                
                estoque.setNome_produto(rs.getString("nome_produto"));
                estoque.setDescricao_produto(rs.getString("descricao_produto"));
                estoque.setValor(rs.getInt("valor"));
                estoque.setFk_id_categoria(rs.getInt("fk_id_categoria"));
                estoque.setQuantidade(rs.getInt("quantidade"));
                estoque.setDisponivel(rs.getInt("disponivel"));
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
    
    public void produtoDisponível(EstoqueBean estoque, boolean verif){
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareStatement("UPDATE produtos SET disponivel = "+verif+" where id_produto = ?");
                stmt.setInt(1, estoque.getId_produto());
            
                stmt.executeUpdate();
                
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
    
    
    public void deletarProduto(EstoqueBean estoque){
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareStatement("DELETE FROM produtos WHERE id_produto = ?");
                stmt.setInt(1, estoque.getId_produto());
                
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
