
package telas.formatos;

import Globals.GlobalWhats;
import icons.CriaIcon;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URLEncoder;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.bean.Usuarios;
import model.dao.UsuariosDAO;
import telas.Inicio;


public class ItemCliente extends javax.swing.JPanel {

    private final Usuarios usuario;
    private String formata = "Sem Whatsapp";
    private final Inicio inicio;

    public ItemCliente(Usuarios usuario, Inicio inicio) {
        initComponents();
        
        this.usuario = usuario;
        this.inicio = inicio;
        
        txtNome.setText(usuario.getNome());
        txtEmail.setText(usuario.getEmail());
        
        if (usuario.getFoto() != null && !usuario.getFoto().equals("")) {
            
            ImageIcon icon = new CriaIcon().criaIcon(usuario.getFoto());
            imgPerfilUsuario.setIcon(icon);
            imgPerfilUsuario.revalidate();
            imgPerfilUsuario.repaint();
            
        }
        
        if (usuario.getArquivado() == 1) {
            
            this.remove(btnDesativar);
            this.add(btnReativar);
            
        } else {
            
            this.remove(btnReativar);
            this.add(btnDesativar);
            
        }
        
        String whatts = usuario.getWhatsapp();

        if (whatts != null && !whatts.equals("")) {
            
            String divide = "+" + whatts.substring(0, 2) + " ";

            String ddd = whatts.substring(2, 4) + " ";
        
            String traco = whatts.substring(4, 8) + "-" + whatts.substring(8);
        
            String formatoFinal = divide + ddd + traco;

            formata = formatoFinal;
        
            txtWhatsApp.setText(formata);
            this.add(btnEnviar);
            
        } else {
            
            txtWhatsApp.setText("Sem Whatsapp");
            this.remove(btnEnviar);
            
        }
        
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
        
        btnReativar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                
                btnReativar.setBackground(new Color(250, 250, 250));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                btnReativar.setBackground(new Color(51, 226, 75));
                
            }
            
        });
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        imgPerfilUsuario = new com.raven.avatar.ImageAvatar();
        txtNome = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtWhatsApp = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        btnReativar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(920, 40));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgPerfilUsuario.setForeground(new java.awt.Color(255, 255, 255));
        imgPerfilUsuario.setBorderSize(1);
        imgPerfilUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPerfil.png"))); // NOI18N
        jPanel2.add(imgPerfilUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        txtNome.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNome.setText("Nome");
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 44));

        jPanel1.add(jPanel2);

        add(jPanel1);

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

        btnDesativar.setBackground(new java.awt.Color(211, 77, 92));
        btnDesativar.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        btnDesativar.setText("Desativar Conta");
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });
        add(btnDesativar);

        btnReativar.setBackground(new java.awt.Color(51, 226, 75));
        btnReativar.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        btnReativar.setText("Reativar Conta");
        btnReativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReativarActionPerformed(evt);
            }
        });
        add(btnReativar);
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

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        
       int opcao = JOptionPane.showConfirmDialog(null, "Desativar esta conta: " + usuario.getNome(), "Confirmação", JOptionPane.YES_NO_OPTION);
       
       if (opcao == JOptionPane.YES_OPTION) {
           
           UsuariosDAO daoUsuarios = new UsuariosDAO();
       
           daoUsuarios.desativar(usuario.getId_usuario());
           inicio.verificaRadioUsuarios();
           
       }
        
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void btnReativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReativarActionPerformed
        
       int opcao = JOptionPane.showConfirmDialog(null, "Reativar esta conta: " + usuario.getNome(), "Confirmação", JOptionPane.YES_NO_OPTION);
       
       if (opcao == JOptionPane.YES_OPTION) {
           
           UsuariosDAO daoUsuarios = new UsuariosDAO();
       
           daoUsuarios.reativar(usuario.getId_usuario());
           inicio.verificaRadioUsuarios();
           
       }
        
    }//GEN-LAST:event_btnReativarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesativar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnReativar;
    private com.raven.avatar.ImageAvatar imgPerfilUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtWhatsApp;
    // End of variables declaration//GEN-END:variables
}
