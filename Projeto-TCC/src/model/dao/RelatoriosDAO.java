
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
            
            stmt = conexao.prepareStatement("select produtos.nome_produto AS Produto,\n" +
            "compras.horario AS Horario,\n" +
            "compras.data AS Data,\n" +
            "carrinho.quantidade AS Quantidade,\n" +
            "produtos.valor as ValorUnitario,\n" +
            "SUM(produtos.valor * carrinho.quantidade) AS ValorTotal,\n" +
            "usuarios.nome AS Pessoa,\n" +
            "compras.id_compra,\n" +
            "compras.fk_id_usuario,\n" +
            "compras.fk_id_produto,\n" +
            "compras.fk_id_carrinho\n" +
            "from compras\n" +
            "inner join produtos on compras.fk_id_produto = produtos.id_produto\n" +
            "inner join usuarios on compras.fk_id_usuario = usuarios.id_usuario\n" +
            "inner join carrinho on compras.fk_id_carrinho = carrinho.id_carrinho\n" +
            "GROUP BY \n" +
            "produtos.nome_produto, compras.horario, compras.data, usuarios.nome "
            + "ORDER BY data DESC, horario DESC;");
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Relatorios rela = new Relatorios();
                
                rela.setId_compra(rs.getInt("id_compra"));
                rela.setFk_id_carrinho(rs.getInt("fk_id_carrinho"));
                rela.setFk_id_produto(rs.getInt("fk_id_produto"));
                rela.setFk_id_usuario(rs.getInt("fk_id_usuario"));
                rela.setProduto(rs.getString("produto"));
                rela.setHorario(rs.getTime("horario"));
                rela.setData(rs.getDate("data"));
                rela.setPessoa(rs.getString("pessoa"));
                rela.setQuantidade(rs.getInt("quantidade"));
                rela.setValorUnitario(rs.getFloat("valorUnitario"));
                rela.setValorTotal(rs.getFloat("valorTotal"));
                
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
