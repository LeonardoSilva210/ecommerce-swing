
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Admins;


public class AdminsDAO {
    
    public void InserirAdministrador(Admins bean){
        
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareStatement("INSERT INTO admins(nome,sobrenome,cpf,senha) VALUES(?,?,?,?)");
            stmt.setString(1, bean.getNome());
            stmt.setString(2, bean.getSobrenome());
            stmt.setString(3, bean.getCpf());
            stmt.setString(4, bean.getSenha());
            
            stmt.execute();
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }
    
    public Admins verificarLogin(String cpf, String senha){
        Admins bean = new Admins();
        
        try{
                Connection conexao = Conexao.conectar();
                PreparedStatement stmt = null;
                ResultSet rs = null;
                
                stmt = conexao.prepareStatement("SELECT * FROM admins WHERE cpf = ? AND senha = ?");
                
                stmt.setString(1, cpf);
                stmt.setString(2, senha);
                    
                rs = stmt.executeQuery();
                 
                if (rs.next()) {
                    
                    bean.setId_administrador(rs.getInt("id_admin"));
                    bean.setCpf(rs.getString("cpf"));
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
