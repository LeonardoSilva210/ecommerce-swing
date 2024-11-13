
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
    
    public List<Categorias> listar(int tipo, String pesquisa) {
        
        List<Categorias> lista = new ArrayList();
        
        try{
           
            Connection conexao = Conexao.conectar();
            
            PreparedStatement stmt = null;
            
            switch(tipo) {
                
                case 1:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM categorias");
                    
                    break;
                    
                case 2:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM categorias WHERE nome LIKE ?");
                    stmt.setString(1, "%" + pesquisa + "%");
                    
                    break;
                
            }
            
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
    
    public void adicionar(Categorias categoria) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO categorias(nome,descricao) VALUES(?,?)");
            
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getDescricao());
            
            stmt.execute();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public void arquivar(Categorias categoria) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE categorias set arquivado = 1 WHERE id_categoria = ?");
            stmt.setInt(1, categoria.getId_categoria());
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public void editar(String nome, String descricao, int id) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE categorias set nome = ?, descricao = ? WHERE id_categoria = ?");
            
            stmt.setString(1, nome);
            stmt.setString(2, descricao);
            stmt.setInt(3, id);
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
