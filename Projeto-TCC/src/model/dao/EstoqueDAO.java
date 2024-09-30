
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.EstoqueBean;


public class EstoqueDAO {
    
    
    public List<EstoqueBean> ListarEstoque(int table){
        List<EstoqueBean> conjEstoque = new ArrayList();
        
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            switch(table) {
                
                case 1:
                    
                    stmt = conexao.prepareStatement("select produtos.nome_produto as produto,"
                            + "produtos.disponivel, produtos.id_produto, produtos.quantidade,"
                            + "produtos.descricao_produto, produtos.disponivel, produtos.fk_id_categoria, produtos.valor, produtos.valor_custo, categorias.nome as categoria, categorias.descricao "
                            + "from produtos inner join categorias on produtos.fk_id_categoria = categorias.id_categoria");
            
                    break;
                
                case 2: 
                    
                    stmt = conexao.prepareStatement("select produtos.nome_produto as produto," 
                            + "produtos.descricao_produto, produtos.id_produto, produtos.quantidade,"
                            + "produtos.disponivel, produtos.fk_id_categoria, produtos.valor, produtos.valor_custo, categorias.nome as categoria, categorias.descricao "
                            + "from produtos inner join categorias on produtos.fk_id_categoria = categorias.id_categoria where produtos.disponivel = 1");
                    
                    break;
                    
                case 3:
                    
                    stmt = conexao.prepareStatement("select produtos.nome_produto as produto,produtos.descricao_produto, produtos.disponivel, "
                            + "produtos.fk_id_categoria, produtos.valor, produtos.valor_custo, categorias.nome as categoria, categorias.descricao, produtos.id_produto, produtos.quantidade "
                            + "from produtos inner join categorias on produtos.fk_id_categoria = categorias.id_categoria where produtos.disponivel = 0");
                    
                    break;
            }
            
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                EstoqueBean estoque = new EstoqueBean();
                
                estoque.setNome_produto(rs.getString("produto"));
                estoque.setDescricao_produto(rs.getString("descricao_produto"));
                estoque.setValor(rs.getFloat("valor"));
                estoque.setValor_custo(rs.getFloat("valor_custo"));
                estoque.setNome_categoria(rs.getString("categoria"));
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
    
    public void atualizar(EstoqueBean estoque) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE produtos set nome_produto = ?, descricao_produto = ?, valor = ?, valor_custo = ?, quantidade = ?, fk_id_categoria = ? WHERE id_produto = ?");
            
            stmt.setString(1, estoque.getNome_produto());
            stmt.setString(2, estoque.getDescricao_produto());
            stmt.setFloat(3, estoque.getValor());
            stmt.setFloat(4, estoque.getValor_custo());
            stmt.setInt(5, estoque.getQuantidade());
            stmt.setInt(6, estoque.getFk_id_categoria());
            stmt.setInt(7, estoque.getId_produto());
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
