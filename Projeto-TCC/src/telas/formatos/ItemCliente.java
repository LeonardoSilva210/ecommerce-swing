
package telas.formatos;

import Globals.GlobalWhats;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URLEncoder;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.bean.Usuarios;


public class ItemCliente extends javax.swing.JPanel {

    private final Usuarios usuario;
    private String formata;

    public ItemCliente(Usuarios usuario) {
        initComponents();
        
        this.usuario = usuario;
        
        txtNome.setText(usuario.getNome());
        txtEmail.setText(usuario.getEmail());
        
        String whatts = usuario.getWhatsapp();
            
        String divide = "+" + whatts.substring(0, 2) + " ";

        String ddd = whatts.substring(2, 4) + " ";
        
        String traco = whatts.substring(4, 8) + "-" + whatts.substring(8);
        
        String formatoFinal = divide + ddd + traco;

        formata = formatoFinal;
        
        txtWhatsApp.setText(formata);
        
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
                
                JOptionPane.showMessageDialog(null, usuario.getNome() + "\n" + usuario.getEmail() + "\n" + formata);
                
            }
  
        });
        
        btnEnviar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                
                btnEnviar.setBackground(new Color(250, 250, 250));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                btnEnviar.setBackground(new Color(51, 226, 75));
                
            }
            
        });
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtWhatsApp = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(920, 40));
        setLayout(new java.awt.GridLayout(1, 0));

        txtNome.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNome.setText("Nome");
        add(txtNome);

        txtEmail.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEmail.setText("E-mail");
        add(txtEmail);

        txtWhatsApp.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtWhatsApp.setForeground(new java.awt.Color(255, 255, 255));
        txtWhatsApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtWhatsApp.setText("WhatsApp");
        add(txtWhatsApp);

        btnEnviar.setBackground(new java.awt.Color(51, 226, 75));
        btnEnviar.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        btnEnviar.setText("Enviar Whatts");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        add(btnEnviar);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        
        try {
                
                String telefone = usuario.getWhatsapp();
                String mensagem = GlobalWhats.getMensagem();
                
                String encodedMensagem = URLEncoder.encode(mensagem, "UTF-8");
                String url = "https://api.whatsapp.com/send?phone=" + telefone + "&text=" + encodedMensagem;

                Desktop.getDesktop().browse(new URI(url));
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtWhatsApp;
    // End of variables declaration//GEN-END:variables
}
