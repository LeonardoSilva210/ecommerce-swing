
package model.dao;

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
                
            }
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Usuarios usuario = new Usuarios();
                
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setWhatsapp(rs.getString("whatsapp"));
                
                list.add(usuario);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
}
