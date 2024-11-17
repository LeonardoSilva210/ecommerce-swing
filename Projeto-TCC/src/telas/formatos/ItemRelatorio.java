
package telas.formatos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.bean.Produtos;
import model.bean.Relatorios;

public class ItemRelatorio extends javax.swing.JPanel {

    String divideProduto = "";
    private final String data, dataBr;
    private final String[] divideData;
    
    public ItemRelatorio(Relatorios relatorio) {
        initComponents();
        
        List<Produtos> produtos = relatorio.getProdutos();

        for (int i = 0; i < produtos.size(); i++) {
            
            divideProduto = divideProduto + produtos.get(i).getNome_produto() + ",";
           
        }
        
        txtProduto.setText(divideProduto);
        txtHorario.setText(String.valueOf(relatorio.getHorario()));
        txtObs.setText(relatorio.getObs());
        
        data = String.valueOf(relatorio.getData());
        divideData = data.split("\\-");
        dataBr = divideData[2] + "/" + divideData[1] + "/"+ divideData[0];
        
        txtData.setText(dataBr);
        txtQuantidade.setText(String.valueOf(produtos.size()));
        txtValorTotal.setText("R$ " + String.valueOf(relatorio.getValorTotal()).replace(".", ","));
        txtPessoa.setText(String.valueOf(relatorio.getPessoa()));

        this.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
               
                setBorder(new LineBorder(Color.white, 1));
                
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                setBorder(null);
                
                
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                JOptionPane.showMessageDialog(null, "Nome: " + relatorio.getPessoa() + "\n"
                + "Produtos: " + divideProduto +"\n"
                + "Valor total: R$" + String.valueOf(relatorio.getValorTotal()).replace(".", ",") + "\n"
                + "Obs: " + relatorio.getObs() + "\n",
                "Relatório", JOptionPane.INFORMATION_MESSAGE);
                
            }
  
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPessoa = new javax.swing.JLabel();
        txtObs = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtHorario = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JLabel();
        txtProduto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(940, 40));
        setPreferredSize(new java.awt.Dimension(940, 40));
        setLayout(new java.awt.GridLayout(1, 0));

        txtPessoa.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtPessoa.setForeground(new java.awt.Color(255, 255, 255));
        txtPessoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPessoa.setText("Pessoa");
        add(txtPessoa);

        txtObs.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtObs.setForeground(new java.awt.Color(255, 255, 255));
        txtObs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtObs.setText("Observação");
        add(txtObs);

        txtData.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData.setText("Data");
        add(txtData);

        txtHorario.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtHorario.setForeground(new java.awt.Color(255, 255, 255));
        txtHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHorario.setText("Horário");
        add(txtHorario);

        txtQuantidade.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtQuantidade.setText("Quantidade");
        add(txtQuantidade);

        txtValorTotal.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtValorTotal.setText("Valor Total");
        add(txtValorTotal);

        txtProduto.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtProduto.setText("Produto");
        add(txtProduto);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtHorario;
    private javax.swing.JLabel txtObs;
    private javax.swing.JLabel txtPessoa;
    private javax.swing.JLabel txtProduto;
    private javax.swing.JLabel txtQuantidade;
    private javax.swing.JLabel txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
