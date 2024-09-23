
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
