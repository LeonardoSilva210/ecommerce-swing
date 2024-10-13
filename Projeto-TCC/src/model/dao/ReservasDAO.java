
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Produtos;
import model.bean.Reservas;


public class ReservasDAO {
    
    public List<Reservas> listar(int tipo, String pesquisa) {
        
        List<Reservas> list = new ArrayList();
        ProdutosDAO daoProduto = new ProdutosDAO();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            switch(tipo) {
                
                case 1:

                    stmt = conexao.prepareStatement("select compras.id_compra, compras.valor_total, compras.fk_id_usuario, \n" +
                    "compras.ativo, compras.obs, compras.produtos, compras.codigo, compras.data, compras.horario, \n" +
                    "usuarios.nome \n" +
                    "from compras\n" +
                    "inner join usuarios on compras.fk_id_usuario = usuarios.id_usuario \n" +
                    "where compras.ativo = 1 \n" +
                    "group by compras.id_compra ORDER BY compras.data DESC;");
                    
                    break;
                
                case 2:

                    stmt = conexao.prepareStatement("select compras.id_compra, compras.valor_total, compras.fk_id_usuario, \n" +
                    "compras.ativo, compras.obs, compras.produtos, compras.codigo, compras.data, compras.horario, \n" +
                    "usuarios.nome \n" +
                    "from compras \n" +
                    "inner join usuarios on compras.fk_id_usuario = usuarios.id_usuario \n" +
                    "where compras.ativo = 1 AND compras.codigo = ?\n" +
                    "group by compras.id_compra ORDER BY compras.data DESC;");
                    
                    stmt.setString(1, pesquisa);
                    
                    break;
                
                case 3:

                    stmt = conexao.prepareStatement("select compras.id_compra, compras.valor_total, compras.fk_id_usuario, \n" +
                    "compras.ativo, compras.obs, compras.produtos, compras.codigo, compras.data, compras.horario, \n" +
                    "usuarios.nome \n" +
                    "from compras \n" +
                    "inner join usuarios on compras.fk_id_usuario = usuarios.id_usuario \n" +
                    "where compras.ativo = 1 AND usuarios.nome LIKE ?\n" +
                    "group by compras.id_compra ORDER BY compras.data DESC;");
                    
                    stmt.setString(1, "%" + pesquisa + "%");
                    
                    break;
                
            }
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Reservas reserva = new Reservas();
                
                reserva.setId_compra(rs.getInt("id_compra"));
                reserva.setAtivo(1);
                reserva.setCodigo(rs.getString("codigo"));
                reserva.setPessoa(rs.getString("nome"));
                reserva.setData(rs.getDate("data"));
                reserva.setHorario(rs.getTime("horario"));
                reserva.setObs(rs.getString("obs"));
                reserva.setFk_id_usuario(rs.getInt("fk_id_usuario"));
                reserva.setValor_total(rs.getFloat("valor_total"));
                
                String produtos = rs.getString("produtos");
                
                String[] divideProdutos = produtos.split("\\,");
                
                List<Produtos> listProduto = new ArrayList();
                Produtos produto;
                
                for (int i = 0; i < divideProdutos.length; i++) {

                    produto = daoProduto.buscarProduto(Integer.parseInt(divideProdutos[i]));
                    listProduto.add(produto);
                    
                }
                
                reserva.setProdutos(listProduto);
                
                list.add(reserva);
                
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
