
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Notificacoes;

public class NotificacoesDAO {
    
    public List<Notificacoes> listar() {
        
        List<Notificacoes> list = new ArrayList();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM notificacoes \n" +
            "WHERE tipo = 3 \n" +
            "\n" +
            "UNION ALL \n" +
            "\n" +
            "SELECT * FROM notificacoes WHERE tipo = 1 AND fk_id_usuario = ? ORDER BY id_notificacao DESC LIMIT 10");
            stmt.setInt(1, Globals.GlobalAdmin.getId_admin());
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Notificacoes noti = new Notificacoes();
                
                noti.setId_notificacao(rs.getInt("id_notificacao"));
                noti.setNotificacao(rs.getString("notificacao"));
                noti.setTipo(rs.getInt("tipo"));
                noti.setVisto(rs.getBoolean("visto"));
                noti.setData(rs.getDate("data"));
                noti.setHorario(rs.getTime("horario"));
                
                list.add(noti);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return list;
    }
    
    public void atualizar(Notificacoes notificacao) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE notificacoes set visto = 1 WHERE id_notificacao = ?");
            
            stmt.setInt(1, notificacao.getId_notificacao());
            
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
