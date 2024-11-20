
package telas.formatos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.bean.Categorias;
import model.dao.CategoriasDAO;
import telas.Inicio;

public class ItemCategoria extends javax.swing.JPanel {

    private final Categorias categoria;
    private Inicio inicio;

    public ItemCategoria(Categorias categoria, Inicio ini) {
        initComponents();
        
        this.inicio = ini;
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
        
        if (categoria.isArquivado()) {
            
            panelAcoes.remove(btnDeletar);
            panelAcoes.add(btnReativar);
            
        } else {
            
            panelAcoes.add(btnDeletar);
            panelAcoes.remove(btnReativar);
            
        }
        
        txtNome.setText(categoria.getNome());
        txtDescricao.setText(categoria.getDescricao());
        txtQuantidade.setText(String.valueOf(categoria.getQuantidade_produtos()));
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JLabel();
        panelAcoes = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnReativar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(920, 40));
        setLayout(new java.awt.GridLayout(1, 0));

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

        txtQuantidade.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtQuantidade.setText("Quantidade Produtos");
        add(txtQuantidade);

        panelAcoes.setBackground(new java.awt.Color(51, 51, 51));
        panelAcoes.setLayout(new java.awt.GridLayout(1, 0));

        btnEditar.setBackground(new java.awt.Color(204, 153, 0));
        btnEditar.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panelAcoes.add(btnEditar);

        btnDeletar.setBackground(new java.awt.Color(211, 77, 92));
        btnDeletar.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        btnDeletar.setText("Arquivar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        panelAcoes.add(btnDeletar);

        btnReativar.setBackground(new java.awt.Color(102, 153, 0));
        btnReativar.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        btnReativar.setText("Reativar");
        btnReativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReativarActionPerformed(evt);
            }
        });
        panelAcoes.add(btnReativar);

        add(panelAcoes);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        
        int escolha = JOptionPane.showConfirmDialog(null, "Arquivar esta categoria: " + categoria.getNome(), "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (escolha == JOptionPane.YES_OPTION) {
            
            new CategoriasDAO().arquivar(categoria);
 
            JOptionPane.showMessageDialog(null, "Categoria arquivada com sucesso!");
            
            inicio.verificaRadioCategoria();
            
        }
        
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        btnEditar.setFocusable(false);
        inicio.visibilidadePanelEditarCategoria(categoria);  
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnReativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReativarActionPerformed
        
        int escolha = JOptionPane.showConfirmDialog(null, "Reativar esta categoria: " + categoria.getNome(), "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (escolha == JOptionPane.YES_OPTION) {
            
            new CategoriasDAO().reativar(categoria);
 
            JOptionPane.showMessageDialog(null, "Categoria ativada com sucesso!");
            
            inicio.verificaRadioCategoria();
            
        }
        
    }//GEN-LAST:event_btnReativarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnReativar;
    private javax.swing.JPanel panelAcoes;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
