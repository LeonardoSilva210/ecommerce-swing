
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Compras;


public class ComprasDAO {
    
    int[] valores = new int[12];
    
    public List<Compras> listar() {
        
        List<Compras> list = new ArrayList();

        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM compras");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Compras compra = new Compras();
                
                compra.setId_compra(rs.getInt("id_compra"));
                compra.setHorario(rs.getTime("horario"));
                compra.setData(rs.getDate("data"));
                compra.setFk_id_carrinho(rs.getInt("fk_id_carrinho"));
                compra.setFk_id_usuario(rs.getInt("fk_id_usuario"));
                compra.setCodigo(rs.getString("codigo"));
                compra.setObs(rs.getString("obs"));
                
                String data = compra.getData().toString();
                
                String[] divideData = data.split("\\-");
                
                int mes = Integer.parseInt(divideData[1]) -1;
                
                valores[mes]++;
                
                list.add(compra);
                
            }

            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return list;
    }
    
    public int[] comprasMes() {
        
        for (int i = 0; i < valores.length; i++) {
            
            valores[i] = 0;
            
        }
        
        listar();
        
        return valores; 
    }
    
    
    
}
