
package model.dao;

import Globals.GlobalAdmin;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Usuarios;


public class AdminsDAO {
    
    public void InserirAdministrador(Usuarios usuario){
        
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareStatement("INSERT INTO usuarios(nome,email,senha,data_nascimento,adm,whatsapp) VALUES(?,?,?,?,?,?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setDate(4, usuario.getData_nascimento());
            stmt.setBoolean(5, true);
            stmt.setString(6, usuario.getWhatsapp());
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }
    
    public Usuarios verificarLogin(String email, String senha){
        Usuarios bean = new Usuarios();
        
        try{
                Connection conexao = Conexao.conectar();
                PreparedStatement stmt = null;
                ResultSet rs = null;
                
                stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE email = ? AND senha = ? AND adm = true");
                
                stmt.setString(1, email);
                stmt.setString(2, senha);
                    
                rs = stmt.executeQuery();
                 
                if (rs.next()) {
                    
                    bean.setId_usuario(rs.getInt("id_usuario"));
                    bean.setEmail(rs.getString("email"));
                    bean.setNome(rs.getString("nome"));
                    bean.setSenha(rs.getString("senha"));
                    bean.setAdm(rs.getInt("adm"));
                    bean.setFoto(rs.getString("foto"));
                    bean.setWhatsapp(rs.getString("whatsapp"));

                } else {
                    
                    JOptionPane.showMessageDialog(null, "Email/Senha incorretos!");
                    
                }
                 
                rs.close();
                stmt.close();
                conexao.close();
                 
            }catch(SQLException e){
              e.printStackTrace();
            }
            
        return bean;
        
    }
    
    public void atualizarPerfil(Usuarios usuario, int tipo) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            switch(tipo) {
                
                case 1:
                    
                    stmt = conexao.prepareStatement("UPDATE usuarios set nome = ?, email = ?, senha = ?, whatsapp = ? WHERE id_usuario = ?");
                    
                    stmt.setString(1, usuario.getNome());
                    stmt.setString(2, usuario.getEmail());
                    stmt.setString(3, usuario.getSenha());
                    stmt.setString(4, usuario.getWhatsapp());
                    stmt.setInt(5, GlobalAdmin.getId_admin());
                    
                    break;
                    
                case 2:
                    
                    stmt = conexao.prepareStatement("UPDATE usuarios set whatsapp = ? WHERE id_usuario = ?");
                    stmt.setString(1, usuario.getWhatsapp());
                    stmt.setInt(2, GlobalAdmin.getId_admin());
                    
                    break;
                
            }
 
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }

}
