
package telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.bean.Usuarios;
import model.dao.AdminsDAO;


public class Cadastro extends javax.swing.JFrame {

    private final JFrame frame = this;
    private boolean telaCheia = false;
    private Dimension tamanhoOriginal;
    private Point localizacaoOriginal;

    public Cadastro() {
        initComponents();
        inicia();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        inputNome = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        senhaCad = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });
        jPanel2.add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 310, 30));
        jPanel2.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 310, 30));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 250, 33));
        jPanel2.add(senhaCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 310, 30));

        jButton2.setText("<-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 316, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 313, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 319, -1));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed

    }//GEN-LAST:event_inputNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Usuarios bean = new Usuarios();
     AdminsDAO dao = new AdminsDAO();
        
     String nome = inputNome.getText().trim();
     String email = inputEmail.getText().trim();
     String senha = senhaCad.getText().trim();
     
     if (nome.isEmpty() || nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
         
         JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
         
     } else {
         
        bean.setNome(nome);
        bean.setEmail(email);
        bean.setSenha(senha);
     
        dao.InserirAdministrador(bean);
            
        dispose();
        new Login().setVisible(true);
        
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
         
     }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                new Login().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_jButton2ActionPerformed

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


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
    
    private void inicia() {
        
        tamanhoOriginal = frame.getSize();
        localizacaoOriginal = frame.getLocation();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelMax;
    private javax.swing.JPanel panelMin;
    private javax.swing.JPasswordField senhaCad;
    private javax.swing.JLabel txtClose;
    private javax.swing.JLabel txtMax;
    private javax.swing.JLabel txtMin;
    // End of variables declaration//GEN-END:variables
}
