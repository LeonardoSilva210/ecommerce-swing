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
    
    public AdministradorBean verificarLogin(){
        AdministradorBean bean = new AdministradorBean();
        
        try{
                Connection conexao = Conexao.conectar();
                PreparedStatement stmt = null;
                boolean verificaLogin = false;
                
                stmt = conexao.prepareStatement("SELECT * FROM administrador WHERE cpf = ? AND senha = ?");
                
                    stmt.setString(1, bean.getCpf());
                    stmt.setString(2, bean.getSenha());
                    
                 stmt.executeQuery();
                
                 if(bean.getCpf().trim().equals("") || bean.getSenha().trim().equals("")){
                        verificaLogin = false;
                     JOptionPane.showMessageDialog(null, "INTRODUZA ALGO NOS CAMPOS");
                     
                 } else {
                     
                     verificaLogin = true;
                      if(verificaLogin == true){
                     
                     JOptionPane.showMessageDialog(null, "LOGIN EFETUADO COM SUCESSO");
                     
                     } else {
                     
                     JOptionPane.showMessageDialog(null, "CPF OU SENHA DO ADMINISTRADOR, INVÁLIDA");
                     
                    }
                     
                 }
                 
                
                 
                 stmt.close();
                 conexao.close();
                 
            }catch(SQLException e){
              e.printStackTrace();
            }
            
        return bean;
        
    }
    
}
