
package telas.formatos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.bean.Categorias;

public class ItemCategoria extends javax.swing.JPanel {

    private final Categorias categoria;

    public ItemCategoria(Categorias categoria) {
        initComponents();
        
        this.categoria = categoria;
        
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
                
                JOptionPane.showMessageDialog(null, categoria.getNome() + "\n" + categoria.getDescricao());
                
            }
  
        });
        
        txtNome.setText(categoria.getNome());
        txtDescricao.setText(categoria.getDescricao());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(940, 40));
        setLayout(new java.awt.GridLayout());

        txtNome.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNome.setText("Nome");
        add(txtNome);

        txtDescricao.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(255, 255, 255));
        txtDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescricao.setText("Descrição");
        add(txtDescricao);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.GridLayout());

        btnEditar.setBackground(new java.awt.Color(204, 153, 0));
        btnEditar.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        jPanel1.add(btnEditar);

        btnDeletar.setBackground(new java.awt.Color(255, 51, 51));
        btnDeletar.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        btnDeletar.setText("Deletar");
        jPanel1.add(btnDeletar);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtNome;
    // End of variables declaration//GEN-END:variables
}
