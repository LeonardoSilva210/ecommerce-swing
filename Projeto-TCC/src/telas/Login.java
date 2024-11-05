
package telas;

import Globals.GlobalAdmin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.bean.Usuarios;
import model.dao.AdminsDAO;


public class Login extends javax.swing.JFrame {

    private final JFrame frame = this;
    private boolean telaCheia = false;
    private Dimension tamanhoOriginal;
    private Point localizacaoOriginal;

    public Login() {
        initComponents();
        
        inicia();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        inputSenha = new javax.swing.JPasswordField();
        buttonEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        panelMin = new javax.swing.JPanel();
        txtMin = new javax.swing.JLabel();
        panelMax = new javax.swing.JPanel();
        txtMax = new javax.swing.JLabel();
        panelClose = new javax.swing.JPanel();
        txtClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1290, 607));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(51, 51, 51, 100));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputSenhaKeyPressed(evt);
            }
        });
        panelLogin.add(inputSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 260, 30));

        buttonEntrar.setText("Logar");
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });
        panelLogin.add(buttonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 160, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        inputEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputEmailKeyPressed(evt);
            }
        });
        panelLogin.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 260, 30));

        jPanel1.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 520, 440));

        panelMin.setBackground(new java.awt.Color(0, 102, 102));
        panelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMinMouseExited(evt);
            }
        });

        txtMin.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        txtMin.setForeground(new java.awt.Color(255, 255, 255));
        txtMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMin.setText("-");
        txtMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMinLayout = new javax.swing.GroupLayout(panelMin);
        panelMin.setLayout(panelMinLayout);
        panelMinLayout.setHorizontalGroup(
            panelMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelMinLayout.setVerticalGroup(
            panelMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, 30));

        panelMax.setBackground(new java.awt.Color(0, 102, 102));
        panelMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMaxMouseExited(evt);
            }
        });

        txtMax.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        txtMax.setForeground(new java.awt.Color(255, 255, 255));
        txtMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMax.setText("□");
        txtMax.setToolTipText("");
        txtMax.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMaxMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMaxLayout = new javax.swing.GroupLayout(panelMax);
        panelMax.setLayout(panelMaxLayout);
        panelMaxLayout.setHorizontalGroup(
            panelMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelMaxLayout.setVerticalGroup(
            panelMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(panelMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 40, 30));

        panelClose.setBackground(new java.awt.Color(0, 102, 102));
        panelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCloseMouseExited(evt);
            }
        });

        txtClose.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        txtClose.setForeground(new java.awt.Color(255, 255, 255));
        txtClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtClose.setText("X");
        txtClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCloseLayout = new javax.swing.GroupLayout(panelClose);
        panelClose.setLayout(panelCloseLayout);
        panelCloseLayout.setHorizontalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelCloseLayout.setVerticalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCloseLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1301, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
       
       Usuarios bean = new Usuarios();
       AdminsDAO dao = new AdminsDAO();
        
       String email = inputEmail.getText();
       String senha = inputSenha.getText(); 

       if (email.isEmpty() || senha.isEmpty()) {
           
           JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
           
       } else {
           
           bean = dao.verificarLogin(email, senha);
           
           if (bean.getId_usuario() != 0) {
               
               GlobalAdmin.setId_admin(bean.getId_usuario());
               GlobalAdmin.setNome(bean.getNome());
               GlobalAdmin.setSenha(bean.getSenha());
               GlobalAdmin.setEmail(bean.getEmail());
               
               java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        dispose();
                        new Inicio().setVisible(true);
                    }
               });
               
           }
           
       }
 
    }//GEN-LAST:event_buttonEntrarActionPerformed

    private void txtMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseClicked

        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_txtMinMouseClicked

    private void txtMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseEntered

        panelMin.setBackground(new Color(204, 204, 204));
        txtMin.setForeground(Color.black);
    }//GEN-LAST:event_txtMinMouseEntered

    private void txtMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseExited

        panelMin.setBackground(new Color(0, 102, 102));
        txtMin.setForeground(Color.white);
    }//GEN-LAST:event_txtMinMouseExited

    private void panelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseClicked

    }//GEN-LAST:event_panelMinMouseClicked

    private void panelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseEntered

    }//GEN-LAST:event_panelMinMouseEntered

    private void panelMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseExited

    }//GEN-LAST:event_panelMinMouseExited

    private void txtMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaxMouseClicked

        if (telaCheia) {

            telaCheia = false;

            frame.setSize(tamanhoOriginal);
            frame.setLocation(localizacaoOriginal);

        } else {

            telaCheia = true;

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int width = screenSize.width;
            int height = screenSize.height;
            
            

            frame.setBounds(0, 0, width, height - 30);

        }
    }//GEN-LAST:event_txtMaxMouseClicked

    private void txtMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaxMouseEntered

        panelMax.setBackground(new Color(204, 204, 204));
        txtMax.setForeground(Color.black);
    }//GEN-LAST:event_txtMaxMouseEntered

    private void txtMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaxMouseExited

        panelMax.setBackground(new Color(0, 102, 102));
        txtMax.setForeground(Color.white);
    }//GEN-LAST:event_txtMaxMouseExited

    private void panelMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMaxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMaxMouseClicked

    private void panelMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMaxMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMaxMouseEntered

    private void panelMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMaxMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMaxMouseExited

    private void txtCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseClicked

        dispose();
    }//GEN-LAST:event_txtCloseMouseClicked

    private void txtCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseEntered

        panelClose.setBackground(new Color(204, 0, 0));
    }//GEN-LAST:event_txtCloseMouseEntered

    private void txtCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseExited

        panelClose.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_txtCloseMouseExited

    private void panelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseClicked

    }//GEN-LAST:event_panelCloseMouseClicked

    private void panelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseEntered

    }//GEN-LAST:event_panelCloseMouseEntered

    private void panelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseExited

    }//GEN-LAST:event_panelCloseMouseExited

    private void inputEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputEmailKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            buttonEntrar.doClick();
            
        }
        
    }//GEN-LAST:event_inputEmailKeyPressed

    private void inputSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSenhaKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            buttonEntrar.doClick();
            
        }
        
    }//GEN-LAST:event_inputSenhaKeyPressed

    private void inicia() {
        
        tamanhoOriginal = frame.getSize();
        localizacaoOriginal = frame.getLocation();
        
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEntrar;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMax;
    private javax.swing.JPanel panelMin;
    private javax.swing.JLabel txtClose;
    private javax.swing.JLabel txtMax;
    private javax.swing.JLabel txtMin;
    // End of variables declaration//GEN-END:variables
}
