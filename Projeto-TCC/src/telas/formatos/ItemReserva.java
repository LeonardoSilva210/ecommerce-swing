package telas.formatos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.bean.Produtos;
import model.bean.Reservas;

public class ItemReserva extends javax.swing.JPanel {

    private final Reservas reserva;
    private final String data, dataBr;
    private final String[] divideData;
    private List<Produtos> produtos = new ArrayList();
    String divideProduto;
    
    public ItemReserva(Reservas reserva) {
        initComponents();
        
        this.reserva = reserva;

        txtPessoa.setText(reserva.getPessoa());
        txtObs.setText(reserva.getObs());
        
        data = String.valueOf(reserva.getData());
        divideData = data.split("\\-");
        dataBr = divideData[2] + "/" + divideData[1] + "/"+ divideData[0];
        
        txtData.setText(dataBr);
        txtHorario.setText(String.valueOf(reserva.getHorario()));
        
        produtos = reserva.getProdutos();
        
        int quantidade = produtos.size();
        
        txtQuantidade.setText(String.valueOf(quantidade));
        
        txtValor.setText("R$ " + String.valueOf(reserva.getValor_total()).replace(".", ","));
    
        divideProduto = "";
        
        for (int i = 0; i < produtos.size(); i++) {
            
            divideProduto = divideProduto + produtos.get(i).getNome_produto() + ",";
            
        }
        
        txtProdutos.setText(divideProduto);
        
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
                
                JOptionPane.showMessageDialog(null, "Nome: " + reserva.getPessoa() + "\n"
                        + "Produtos: " + divideProduto +"\n"
                        + "Valor total: R$" + String.valueOf(reserva.getValor_total()).replace(".", ",") + "\n"
                        + "Obs: " + reserva.getObs() + "\n"
                        + "Cód: " + reserva.getCodigo()
                        , "Reserva", JOptionPane.INFORMATION_MESSAGE);
                
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
        txtValor = new javax.swing.JLabel();
        txtProdutos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(690, 19));
        setPreferredSize(new java.awt.Dimension(940, 40));
        setLayout(new java.awt.GridLayout());

        txtPessoa.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtPessoa.setForeground(new java.awt.Color(255, 255, 255));
        txtPessoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPessoa.setText("Pessoa");
        add(txtPessoa);

        txtObs.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtObs.setForeground(new java.awt.Color(255, 255, 255));
        txtObs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtObs.setText("Obs");
        add(txtObs);

        txtData.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData.setText("Data");
        add(txtData);

        txtHorario.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtHorario.setForeground(new java.awt.Color(255, 255, 255));
        txtHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHorario.setText("Horario");
        add(txtHorario);

        txtQuantidade.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtQuantidade.setText("Quantidade");
        add(txtQuantidade);

        txtValor.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtValor.setForeground(new java.awt.Color(255, 255, 255));
        txtValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtValor.setText("Valor total");
        add(txtValor);

        txtProdutos.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtProdutos.setForeground(new java.awt.Color(255, 255, 255));
        txtProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtProdutos.setText("Produtos");
        add(txtProdutos);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtHorario;
    private javax.swing.JLabel txtObs;
    private javax.swing.JLabel txtPessoa;
    private javax.swing.JLabel txtProdutos;
    private javax.swing.JLabel txtQuantidade;
    private javax.swing.JLabel txtValor;
    // End of variables declaration//GEN-END:variables
}
