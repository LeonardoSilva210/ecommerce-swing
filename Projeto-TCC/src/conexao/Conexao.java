/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LEONARDO
 */
public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/tcc";
    private static final String user = "root";
    private static final String pass = "21062007";
    
    public static Connection conectar(){
        Connection conexao = null; 
        
        try{
            
            conexao = DriverManager.getConnection(url, user, pass);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return conexao;
        
    }
    
}
