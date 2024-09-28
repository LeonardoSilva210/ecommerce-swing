
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Categorias;


public class CategoriasDAO {
    
    public List<Categorias> listar() {
        
        List<Categorias> lista = new ArrayList();
        
        try{
           
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM categorias");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Categorias categoria = new Categorias();
                
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setNome(rs.getString("nome"));
                categoria.setDescricao(rs.getString("descricao"));
                
                lista.add(categoria);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return lista;
        
    }
    
}
