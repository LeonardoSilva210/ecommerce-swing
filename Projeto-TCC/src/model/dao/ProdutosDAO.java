
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Produtos;


public class ProdutosDAO {
    
    public List<Produtos> listar(){
        List<Produtos> conjProdutos = new ArrayList();
        
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null; 
            
            stmt = conexao.prepareStatement("SELECT * FROM produtos");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos produtos = new Produtos();
                
                produtos.setId_produto(rs.getInt("id_produto"));
                produtos.setNome_produto(rs.getString("nome_produto"));
                produtos.setDescricao_produto(rs.getString("descricao_produto"));
                produtos.setFk_id_categoria(rs.getInt("fk_id_categoria"));
                produtos.setValor(rs.getFloat("valor"));
                produtos.setDisponivel(rs.getInt("disponivel"));
                produtos.setArquivado(rs.getInt("arquivado"));
                produtos.setImagem(rs.getString("imagem"));
                
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
    
    public void cadastrar(Produtos produto) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO produtos(nome_produto,descricao_produto,disponivel,fk_id_categoria,valor,quantidade,valor_custo,imagem) "
                    + "VALUES(?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, produto.getNome_produto());
            stmt.setString(2, produto.getDescricao_produto());
            stmt.setInt(3, produto.getDisponivel());
            stmt.setInt(4, produto.getFk_id_categoria());
            stmt.setFloat(5, produto.getValor());
            stmt.setFloat(6, produto.getQuantidade());
            stmt.setFloat(7, produto.getValor_custo());
            stmt.setString(8, produto.getImagem());
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public Produtos buscarProduto(int id) {
        
        Produtos produto = new Produtos();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE id_produto = ?");
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                produto.setId_produto(rs.getInt("id_produto"));
                produto.setNome_produto(rs.getString("nome_produto"));
                produto.setDescricao_produto(rs.getString("descricao_produto"));
                produto.setDisponivel(rs.getInt("disponivel"));
                produto.setFk_id_categoria(rs.getInt("fk_id_categoria"));
                produto.setValor(rs.getFloat("valor"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setValor_custo(rs.getFloat("valor_custo"));
                produto.setArquivado(rs.getInt("arquivado"));
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return produto;
    }

}
