
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

    public ItemNotificacao(Notificacoes noti) {
        initComponents();

        this.addMouseListener(new MouseAdapter() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            JOptionPane.showMessageDialog(null, noti.getNotificacao()+ " - " + noti.getDescricao());

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
                txtNotificacao.setText(noti.getNotificacao());
                txtDescricao.setText(noti.getDescricao());
                icon = new ImageIcon(getClass().getResource("/imagens/iconInfo.png"));
                imgIcon.setIcon(icon);
                
                break;
                
            case 2:
                
                setBackground(new Color(204, 0, 0));
                txtNotificacao.setText(noti.getNotificacao());
                txtDescricao.setText(noti.getDescricao());
                icon = new ImageIcon(getClass().getResource("/imagens/iconRuim.png"));
                imgIcon.setIcon(icon);
                
                break;
            
            case 3:
                
                setBackground(new Color(0, 153, 0));
                txtNotificacao.setText(noti.getNotificacao());
                txtDescricao.setText(noti.getDescricao());
                icon = new ImageIcon(getClass().getResource("/imagens/iconBom.png"));
                imgIcon.setIcon(icon);
                
                break;
            
        }
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNotificacao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JLabel();
        imgIcon = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(235, 50));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNotificacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNotificacao.setForeground(new java.awt.Color(255, 255, 255));
        txtNotificacao.setText("Texto");
        add(txtNotificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 0, 180, 30));

        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(255, 255, 255));
        txtDescricao.setText("Descrição");
        add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 20, 180, 30));

        imgIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconInfo.png"))); // NOI18N
        add(imgIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgIcon;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtNotificacao;
    // End of variables declaration//GEN-END:variables
}
