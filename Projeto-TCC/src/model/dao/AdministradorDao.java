/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.AdministradorBean;

/**
 *
 * @author LEONARDO
 */
public class AdministradorDao {
    
    public void InserirAdministrador(AdministradorBean bean){
        
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareStatement("INSERT INTO administrador(nome,sobrenome,cpf,senha) VALUES(?,?,?,?)");
            stmt.setString(1, bean.getNome());
            stmt.setString(2, bean.getSobrenome());
            stmt.setString(3, bean.getCpf());
            stmt.setString(4, bean.getSenha());
            
            stmt.executeUpdate();
            
            
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
