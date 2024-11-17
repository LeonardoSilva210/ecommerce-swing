
package model.dao;

import Globals.GlobalAdmin;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Usuarios;


public class UsuariosDAO {
    
    public List<Usuarios> listar(int tipo, String pesquisa) {
        
        List<Usuarios> list = new ArrayList();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs;
            
            switch(tipo) {
                
                case 1:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE whatsapp != ?");
                    stmt.setString(1, "");
                    
                    break;
                    
                case 2:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE whatsapp != ? AND nome LIKE ?");
                    stmt.setString(1, "");
                    stmt.setString(2, "%" + pesquisa + "%");
                    
                    break;
                
                case 3:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE whatsapp != ? AND nome = ?");
                    stmt.setString(1, "");
                    stmt.setString(2, pesquisa);
                    
                    break;
                
                case 4:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE adm = 1");
                    
                    break;
                    
                case 5:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE adm = 1 AND nome LIKE ?");
                    stmt.setString(1, "%" + pesquisa + "%");
                    
                    break;
                
                case 6:
                    
                    stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE adm = 1 AND nome = ?");
                    stmt.setString(1, pesquisa);
                    
                    break;
                
            }
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                if (rs.getInt("id_usuario") != GlobalAdmin.getId_admin()) {
                    
                    Usuarios usuario = new Usuarios();
                
                    usuario.setId_usuario(rs.getInt("id_usuario"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setWhatsapp(rs.getString("whatsapp"));
                    usuario.setFoto(rs.getString("foto"));
                
                    list.add(usuario);
                    
                }
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public void deletar(int id_usuario) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("DELETE FROM usuarios WHERE id_usuario = ?");
            stmt.setInt(1, id_usuario);
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public boolean validarEmailExistente(String email) {
        
        boolean very = false;
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE email = ?");
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                very = true;
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return very;
        
    }
    
    public void alterarFoto(String caminho, int id_usuario) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE usuarios set foto = ? WHERE id_usuario = ?");
            stmt.setString(1, caminho);
            stmt.setInt(2, id_usuario);
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
