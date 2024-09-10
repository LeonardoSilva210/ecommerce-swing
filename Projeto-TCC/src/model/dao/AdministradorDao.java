
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.AdministradorBean;


public class AdministradorDao {
    
    public void InserirAdministrador(AdministradorBean bean){
        
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareStatement("INSERT INTO usuarios(email,senha) VALUES(?,?)");
            stmt.setString(1, bean.getNome());
            stmt.setString(2, bean.getSenha());
            
            stmt.execute();
            
            stmt.close();
            conexao.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }
    
    public AdministradorBean verificarLogin(String cpf, String senha){
        AdministradorBean bean = new AdministradorBean();
        
        try{
                Connection conexao = Conexao.conectar();
                PreparedStatement stmt = null;
                ResultSet rs = null;
                
                stmt = conexao.prepareStatement("SELECT * FROM administrador WHERE cpf = ? AND senha = ?");
                
                stmt.setString(1, cpf);
                stmt.setString(2, senha);
                    
                rs = stmt.executeQuery();
                 
                if (rs.next()) {
                    
                    bean.setCpf(rs.getString("cpf"));
                    bean.setId_administrador(rs.getInt("id_administrador"));
                    bean.setNome(rs.getString("nome"));
                    bean.setSobrenome(rs.getString("sobrenome"));
                    bean.setSenha(rs.getString("senha"));
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Cpf/Senha incorretos!");
                    
                }
                 
                rs.close();
                stmt.close();
                conexao.close();
                 
            }catch(SQLException e){
              e.printStackTrace();
            }
            
        return bean;
        
    }
    
}
