
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Produtos;
import model.bean.Relatorios;


public class RelatoriosDAO {
    
    public List<Relatorios> listar(int tipo, String pesquisa) {
        
        List<Relatorios> list = new ArrayList();
        ProdutosDAO daoProduto = new ProdutosDAO();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            switch(tipo) {
                
                case 1:
                    
                    stmt = conexao.prepareStatement("select compras.horario AS Horario, compras.quantidades, \n" +
                    "compras.data AS Data,\n" +
                    "compras.valor_total, compras.obs,\n" +
                    "usuarios.nome AS Pessoa,\n" +
                    "compras.id_compra, compras.produtos,\n" +
                    "compras.fk_id_usuario \n" +
                    "from compras\n" +
                    "inner join usuarios on compras.fk_id_usuario = usuarios.id_usuario WHERE usuarios.arquivado = 0\n" +
                    "GROUP BY compras.id_compra "
                    + "ORDER BY data DESC, horario DESC");
                    
                    break;
                    
                case 2:
                    
                    stmt = conexao.prepareStatement("select compras.horario AS Horario, compras.quantidades, \n" +
                    "compras.data AS Data,\n" +
                    "compras.valor_total, compras.obs,\n" +
                    "usuarios.nome AS Pessoa,\n" +
                    "compras.id_compra, compras.produtos,\n" +
                    "compras.fk_id_usuario \n" +
                    "from compras\n" +
                    "inner join usuarios on compras.fk_id_usuario = usuarios.id_usuario WHERE usuarios.arquivado = 0 AND usuarios.nome LIKE ?\n" +
                    "GROUP BY compras.id_compra "
                    + "ORDER BY data DESC, horario DESC");
                    
                    stmt.setString(1, "%" + pesquisa + "%");
                    
                    break;
                
            }
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {

                Relatorios rela = new Relatorios();
                
                rela.setId_compra(rs.getInt("id_compra"));
                rela.setFk_id_usuario(rs.getInt("fk_id_usuario"));
                rela.setHorario(rs.getTime("horario"));
                rela.setData(rs.getDate("data"));
                rela.setObs(rs.getString("obs"));
                rela.setPessoa(rs.getString("pessoa"));
                rela.setValorTotal(rs.getFloat("valor_total"));
                
                String quantidades = rs.getString("quantidades");
                String[] divideQuantidades = quantidades.split("\\,");
                List<Integer> listQuantidades = new ArrayList();
                int totalQuantidades = 0;
                
                for (int j = 0; j < divideQuantidades.length; j++) {
                    
                    listQuantidades.add(Integer.parseInt(divideQuantidades[j]));
                    totalQuantidades = totalQuantidades + Integer.parseInt(divideQuantidades[j]);
                    
                    
                }
                
                rela.setQuantidade(totalQuantidades);
                
                String produtos = rs.getString("produtos");
                
                List<Produtos> listaProdutos = new ArrayList();
                Produtos produto;
                
                String[] divideProdutos = produtos.split("\\,");
                
                for (int i = 0; i < divideProdutos.length; i++){
                    
                    produto = daoProduto.buscarProduto(Integer.parseInt(divideProdutos[i]));
                    produto.setQuantidade(listQuantidades.get(i));
                    listaProdutos.add(produto);
                    
                }
                
                rela.setProdutos(listaProdutos);
                
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
