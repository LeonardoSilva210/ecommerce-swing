
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/tcc";
    private static final String user = "root";
    private static final String pass = "";
    
    public static Connection conectar(){
        Connection conexao = null; 
        
        try{
            
            conexao = DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conexao;
        
    }
    
}
