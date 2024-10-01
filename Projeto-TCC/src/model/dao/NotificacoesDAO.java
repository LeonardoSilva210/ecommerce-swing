
package model.dao;

import Globals.GlobalAdmin;
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
            
            stmt = conexao.prepareStatement("SELECT * FROM notificacoes WHERE fk_id_usuario = ? ORDER BY id_notificacao DESC");
            stmt.setInt(1, GlobalAdmin.getId_admin());
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Notificacoes noti = new Notificacoes();
                
                noti.setId_notificacao(rs.getInt("id_notificacao"));
                noti.setNotificacao(rs.getString("notificacao"));
                noti.setDescricao(rs.getString("descricao"));
                noti.setTipo(rs.getInt("tipo"));
                noti.setVisto(rs.getBoolean("visto"));
                noti.setFk_id_admin(rs.getInt("fk_id_usuario"));
                
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
    
    public void atualizar(List<Notificacoes> list) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt;
            
            for (int i = 0; i < list.size(); i++) {
                
               if (!list.get(i).isVisto()) {
                   
                   stmt = conexao.prepareStatement("UPDATE notificacoes set visto = true WHERE id_notificacao = ?"); 
                   stmt.setInt(1, list.get(i).getId_notificacao());
                   stmt.executeUpdate();
                   stmt.close();
                   
               }
            
            }

            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
