
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Relatorios;


public class RelatoriosDAO {
    
    public List<Relatorios> listar() {
        
        List<Relatorios> list = new ArrayList();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("select compras.horario AS Horario,\n" +
            "compras.data AS Data,\n" +
            "usuarios.nome AS Pessoa,\n" +
            "compras.id_compra, compras.produtos,\n" +
            "compras.fk_id_usuario \n" +
            "from compras\n" +
            "inner join usuarios on compras.fk_id_usuario = usuarios.id_usuario\n" +
            "GROUP BY \n" +
            "compras.id_compra "
            + "ORDER BY data DESC, horario DESC;");
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {

                Relatorios rela = new Relatorios();
                
                rela.setId_compra(rs.getInt("id_compra"));
                rela.setFk_id_usuario(rs.getInt("fk_id_usuario"));
                rela.setHorario(rs.getTime("horario"));
                rela.setData(rs.getDate("data"));
                rela.setPessoa(rs.getString("pessoa"));
                rela.setProduto(rs.getString("produtos"));
                
                list.add(rela);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return list;
    }
    
}
