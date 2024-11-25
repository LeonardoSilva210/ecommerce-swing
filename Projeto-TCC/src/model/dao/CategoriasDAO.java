
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
                
                case 3:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM categorias WHERE arquivado = 1");
                    
                    break;
                
                case 4:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM categorias WHERE arquivado = 0");
                    
                    break;
                    
                case 5:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM categorias WHERE arquivado = 0 AND nome LIKE ?");
                    stmt.setString(1, "%" + pesquisa + "%");
                    
                    break;
                
                case 6:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM categorias WHERE arquivado = 1 AND nome LIKE ?");
                    stmt.setString(1, "%" + pesquisa + "%");
                    
                    break;
                
            }
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Categorias categoria = new Categorias();
                
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setNome(rs.getString("nome"));
                categoria.setDescricao(rs.getString("descricao"));
                categoria.setArquivado(rs.getBoolean("arquivado"));
                categoria.setQuantidade_produtos(rs.getInt("quantidade_produtos"));
                categoria.setPromocao(rs.getBoolean("promocao"));
                
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
    
    public Categorias categoriaDisponivel(String nome) {
        
        Categorias categoria = new Categorias();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM categorias WHERE nome = ?");
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setNome(rs.getString("nome"));
                categoria.setDescricao(rs.getString("descricao"));
                categoria.setArquivado(rs.getBoolean("arquivado"));
                categoria.setPromocao(rs.getBoolean("promocao"));
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return categoria;
    }
    
    public void adicionar(Categorias categoria) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO categorias(nome,descricao,promocao) VALUES(?,?,?)");
            
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getDescricao());
            stmt.setBoolean(3, categoria.isPromocao());
            
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
    
    public void reativar(Categorias categoria) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE categorias set arquivado = 0 WHERE id_categoria = ?");
            stmt.setInt(1, categoria.getId_categoria());
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public void editar(String nome, String descricao, int id, boolean promocao) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE categorias set nome = ?, descricao = ?, promocao = ? WHERE id_categoria = ?");
            
            stmt.setString(1, nome);
            stmt.setString(2, descricao);
            stmt.setBoolean(3, promocao);
            stmt.setInt(4, id);
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
