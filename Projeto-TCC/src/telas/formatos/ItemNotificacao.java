
package telas.formatos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.bean.Notificacoes;


public class ItemNotificacao extends javax.swing.JPanel{

    private ImageIcon icon;
    private String data, dataBr;
    private String[] divideData;

    public ItemNotificacao(Notificacoes noti) {
        initComponents();

        this.addMouseListener(new MouseAdapter() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            String notificacao = "";
            
            switch(noti.getTipo()) {
                
                case 1:
                    
                    notificacao = noti.getNotificacao();
                    
                    break;
                    
                case 2:
                    
                    notificacao = noti.getNotificacao();
                    
                    break;
                    
                case 3:
                    
                    notificacao = noti.getNotificacao() + " - Valor total: R$";
                    
                    break;
                
            }
            
            JOptionPane.showMessageDialog(null, notificacao);

        }

        @Override
        public void mouseEntered(MouseEvent e) {
                
            setBorder(new LineBorder(Color.white, 1));
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
               
            setBorder(null);
            
        }
        
        });
       
        switch(noti.getTipo()) {
            
            case 1:
                
                setBackground(new Color(153, 153, 153));
                icon = new ImageIcon(getClass().getResource("/imagens/iconInfo.png"));
                
                
                break;
                
            case 2:
                
                setBackground(new Color(204, 0, 0));
                icon = new ImageIcon(getClass().getResource("/imagens/iconRuim.png"));
                
                break;
            
            case 3:
                
                setBackground(new Color(0, 153, 0));
                icon = new ImageIcon(getClass().getResource("/imagens/iconBom.png"));
                
                break;
            
        }
        
        txtNotificacao.setText(noti.getNotificacao());
        
        data = String.valueOf(noti.getData());
        divideData = data.split("\\-");
        dataBr = divideData[2] + "/" + divideData[1] + "/"+ divideData[0];
        
        txtData.setText(dataBr);
        txtHorario.setText(String.valueOf(noti.getHorario()));
        imgIcon.setIcon(icon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNotificacao = new javax.swing.JLabel();
        imgIcon = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtHorario = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(235, 50));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNotificacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNotificacao.setForeground(new java.awt.Color(255, 255, 255));
        txtNotificacao.setText("Texto");
        add(txtNotificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 0, 110, 50));

        imgIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconInfo.png"))); // NOI18N
        add(imgIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 30));

        txtData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtData.setText("20/10/2024");
        add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 80, 20));

        txtHorario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHorario.setForeground(new java.awt.Color(255, 255, 255));
        txtHorario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtHorario.setText("22:10:10");
        add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 80, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgIcon;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtHorario;
    private javax.swing.JLabel txtNotificacao;
    // End of variables declaration//GEN-END:variables
}
