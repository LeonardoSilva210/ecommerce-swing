
package telas;

import com.raven.chart.ModelChart;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.bean.EstoqueBean;
import model.bean.ProdutosBean;
import model.dao.EstoqueDAO;
import model.dao.ProdutosDAO;


public class Inicio extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    ProdutosBean produtosAtual = new ProdutosBean();
    
    public Inicio() {
        initComponents();
        inicia();

        
        radio1.addActionListener(e -> {
            
            System.out.println("Teste 1");
            
        });
        
        radio2.addActionListener(e -> {
            
            System.out.println("Teste 2");
            
        });
        
        radio3.addActionListener(e -> {
            
            System.out.println("Teste 3");
            
        });
        
        preencherTabela();
        
        tblEstoque.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            
            public void valueChanged(ListSelectionEvent event){
                if(!event.getValueIsAdjusting()){
                   int linhaSelecionada = tblEstoque.getSelectedRow();
                   if(linhaSelecionada != -1){
                       produtosAtual.setId_produto((int) tblEstoque.getValueAt(linhaSelecionada,0));
                        produtosAtual.setNome_produto(
                               (String) tblEstoque.getValueAt(linhaSelecionada, 1)       
                       );
                        
                        produtosAtual.setDescricao_produto(
                               (String) tblEstoque.getValueAt(linhaSelecionada, 2)   
                       );
                        
                        
                   }
                }
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBorder4 = new telas.formatos.PanelBorder();
        panelNoti = new javax.swing.JPanel();
        btnCloseNoti = new javax.swing.JLabel();
        panelFundoNoti = new javax.swing.JPanel();
        panelBorder1 = new telas.formatos.PanelBorder();
        imageAvatar2 = new com.raven.avatar.ImageAvatar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelBorder3 = new telas.formatos.PanelBorder();
        btnInicio = new javax.swing.JPanel();
        txtInicio = new javax.swing.JLabel();
        btnEstoque = new javax.swing.JPanel();
        txtEstoque = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        txtLogout = new javax.swing.JLabel();
        panelBorder5 = new telas.formatos.PanelBorder();
        panelLogo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelClose = new javax.swing.JPanel();
        txtClose = new javax.swing.JLabel();
        panelMin = new javax.swing.JPanel();
        txtMin = new javax.swing.JLabel();
        panelMax = new javax.swing.JPanel();
        txtMax = new javax.swing.JLabel();
        txtLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tabInicio = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        grafInicio = new com.raven.chart.Chart();
        panelFundoTable = new javax.swing.JPanel();
        panelBorder6 = new telas.formatos.PanelBorder();
        myButton1 = new button.MyButton();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstoque = new tabledark.TableDark();
        panelBorder2 = new telas.formatos.PanelBorder();
        btnNoti = new com.raven.swing.ButtonBadges();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ecommerce");
        setUndecorated(true);
        setResizable(false);

        panelBorder4.setBackground(new java.awt.Color(0, 0, 0));
        panelBorder4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        panelBorder4.setForeground(new java.awt.Color(0, 0, 0));
        panelBorder4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNoti.setBackground(new java.awt.Color(102, 102, 102));
        panelNoti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNotiMouseClicked(evt);
            }
        });

        btnCloseNoti.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        btnCloseNoti.setText("X");
        btnCloseNoti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseNotiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelNotiLayout = new javax.swing.GroupLayout(panelNoti);
        panelNoti.setLayout(panelNotiLayout);
        panelNotiLayout.setHorizontalGroup(
            panelNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnCloseNoti))
        );
        panelNotiLayout.setVerticalGroup(
            panelNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotiLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnCloseNoti))
        );

        panelBorder4.add(panelNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, 260, 550));

        panelFundoNoti.setBackground(new java.awt.Color(0, 0, 0, 100));
        panelFundoNoti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFundoNotiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFundoNotiLayout = new javax.swing.GroupLayout(panelFundoNoti);
        panelFundoNoti.setLayout(panelFundoNotiLayout);
        panelFundoNotiLayout.setHorizontalGroup(
            panelFundoNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelFundoNotiLayout.setVerticalGroup(
            panelFundoNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        panelBorder4.add(panelFundoNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 300, 550));

        imageAvatar2.setBackground(new java.awt.Color(255, 255, 255));
        imageAvatar2.setForeground(new java.awt.Color(255, 255, 255));
        imageAvatar2.setBorderSize(2);
        imageAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPerfil.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem vindo, User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panelBorder4.add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 100));

        panelBorder3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(102, 102, 102));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        txtInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtInicio.setForeground(new java.awt.Color(255, 255, 255));
        txtInicio.setText("Início");

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelBorder3.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 290, 40));

        btnEstoque.setBackground(new java.awt.Color(51, 51, 51));
        btnEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstoqueMouseClicked(evt);
            }
        });

        txtEstoque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEstoque.setForeground(new java.awt.Color(255, 255, 255));
        txtEstoque.setText("Estoque");

        javax.swing.GroupLayout btnEstoqueLayout = new javax.swing.GroupLayout(btnEstoque);
        btnEstoque.setLayout(btnEstoqueLayout);
        btnEstoqueLayout.setHorizontalGroup(
            btnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnEstoqueLayout.setVerticalGroup(
            btnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelBorder3.add(btnEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 290, 40));

        btnLogout.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });

        txtLogout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLogout.setForeground(new java.awt.Color(255, 255, 255));
        txtLogout.setText("Logout");

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnLogoutLayout.setVerticalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelBorder3.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 290, 30));

        panelBorder4.add(panelBorder3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 290, 420));

        panelBorder5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogo.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("|");

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelBorder5.add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

        panelClose.setBackground(new java.awt.Color(51, 51, 51));
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
            .addComponent(txtClose, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelCloseLayout.setVerticalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtClose))
        );

        panelBorder5.add(panelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 40, 30));

        panelMin.setBackground(new java.awt.Color(51, 51, 51));
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
            .addGroup(panelMinLayout.createSequentialGroup()
                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBorder5.add(panelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 40, 30));

        panelMax.setBackground(new java.awt.Color(51, 51, 51));
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

        panelBorder5.add(panelMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 40, 30));

        txtLogo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLogo.setForeground(new java.awt.Color(255, 255, 255));
        txtLogo.setText("E-commerce");
        panelBorder5.add(txtLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 12, 100, 30));

        panelBorder4.add(panelBorder5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabInicio.setBackground(new java.awt.Color(51, 51, 51));
        tabInicio.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grafInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grafInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        tabInicio.addTab("tab1", jPanel2);

        panelFundoTable.setBackground(new java.awt.Color(51, 51, 51));

        panelBorder6.setForeground(new java.awt.Color(153, 153, 153));

        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lixo.png"))); // NOI18N
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio1);
        radio1.setText("jRadioButton1");

        buttonGroup1.add(radio2);
        radio2.setText("jRadioButton2");

        buttonGroup1.add(radio3);
        radio3.setText("jRadioButton3");

        javax.swing.GroupLayout panelBorder6Layout = new javax.swing.GroupLayout(panelBorder6);
        panelBorder6.setLayout(panelBorder6Layout);
        panelBorder6Layout.setHorizontalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio3)
                .addGap(65, 65, 65))
        );
        panelBorder6Layout.setVerticalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radio1)
                        .addComponent(radio2)
                        .addComponent(radio3))
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblEstoque.setBackground(new java.awt.Color(204, 204, 204));
        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome do Produto", "Descrição Produto", "Valor", "Categoria", "Quantidade", "IDentificador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.getTableHeader().setReorderingAllowed(false);
        tblEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblEstoqueMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tblEstoque);

        javax.swing.GroupLayout panelFundoTableLayout = new javax.swing.GroupLayout(panelFundoTable);
        panelFundoTable.setLayout(panelFundoTableLayout);
        panelFundoTableLayout.setHorizontalGroup(
            panelFundoTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFundoTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFundoTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                    .addComponent(panelBorder6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelFundoTableLayout.setVerticalGroup(
            panelFundoTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFundoTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(panelBorder6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        tabInicio.addTab("tab2", panelFundoTable);

        jPanel1.add(tabInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        panelBorder4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 980, 470));

        btnNoti.setBackground(new java.awt.Color(102, 102, 102));
        btnNoti.setBorder(null);
        btnNoti.setForeground(new java.awt.Color(255, 0, 0));
        btnNoti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/noti.png"))); // NOI18N
        btnNoti.setBadges(5);
        btnNoti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNotiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap(913, Short.MAX_VALUE)
                .addComponent(btnNoti, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNoti, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBorder4.add(panelBorder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 980, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseClicked
      
        dispose();
        
    }//GEN-LAST:event_txtCloseMouseClicked

    private void panelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseEntered
 
    }//GEN-LAST:event_panelCloseMouseEntered

    private void panelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseExited

    }//GEN-LAST:event_panelCloseMouseExited

    private void panelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseClicked

    }//GEN-LAST:event_panelCloseMouseClicked

    private void txtCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseEntered
        
        panelClose.setBackground(Color.white);
        txtClose.setForeground(Color.black);
        
    }//GEN-LAST:event_txtCloseMouseEntered

    private void txtCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseExited
        
        panelClose.setBackground(new Color(51, 51, 51));
        txtClose.setForeground(Color.white);
        
    }//GEN-LAST:event_txtCloseMouseExited

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        
        trocaTab(1);
        
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMouseClicked
        
        trocaTab(2);
        
    }//GEN-LAST:event_btnEstoqueMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                new Login().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        
        btnLogout.setBackground(Color.red);
        
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        
        btnLogout.setBackground(new Color(51, 51, 51));
        
    }//GEN-LAST:event_btnLogoutMouseExited

    private void txtMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaxMouseClicked
      boolean telaCheia = false;
        int MAXIMIZED_BOTH1 = JFrame.MAXIMIZED_BOTH;
        
    }//GEN-LAST:event_txtMaxMouseClicked

    private void txtMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaxMouseEntered
           
        panelMax.setBackground(Color.white);
        txtMax.setForeground(Color.black);
        
    }//GEN-LAST:event_txtMaxMouseEntered

    private void txtMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaxMouseExited
 
        panelMax.setBackground(new Color(51, 51, 51));
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

    private void txtMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseClicked
        
        setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_txtMinMouseClicked

    private void txtMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseEntered
        
        panelMin.setBackground(Color.white);
        txtMin.setForeground(Color.black);
        
    }//GEN-LAST:event_txtMinMouseEntered

    private void txtMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseExited
        
        panelMin.setBackground(new Color(51, 51, 51));
        txtMin.setForeground(Color.white);
        
    }//GEN-LAST:event_txtMinMouseExited

    private void panelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseClicked
   
    }//GEN-LAST:event_panelMinMouseClicked

    private void panelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseEntered
     
    }//GEN-LAST:event_panelMinMouseEntered

    private void panelMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseExited

    }//GEN-LAST:event_panelMinMouseExited

    private void btnCloseNotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseNotiMouseClicked
        
        panelNoti.setVisible(false);
        panelFundoNoti.setVisible(false);
        
    }//GEN-LAST:event_btnCloseNotiMouseClicked

    private void btnNotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotiMouseClicked
        
        panelNoti.setVisible(true);
        panelFundoNoti.setVisible(true);
        
    }//GEN-LAST:event_btnNotiMouseClicked

    private void panelFundoNotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFundoNotiMouseClicked
        
        panelNoti.setVisible(false);
        panelFundoNoti.setVisible(false);
        
    }//GEN-LAST:event_panelFundoNotiMouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton1ActionPerformed

    private void tblEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseEntered
       
    }//GEN-LAST:event_tblEstoqueMouseEntered

    private void panelNotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNotiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelNotiMouseClicked


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    private void trocaTab(int selecionado) {
        
        switch(selecionado) {
            
            case 1:
                
                tabInicio.setSelectedIndex(0);
                atualiza(1);
                
                btnInicio.setBackground(new Color(102, 102, 102));
                btnEstoque.setBackground(new Color(51, 51, 51));
                
                break;
                
            case 2:
                
                tabInicio.setSelectedIndex(1);
                atualiza(2);
                
                btnInicio.setBackground(new Color(51, 51, 51));
                btnEstoque.setBackground(new Color(102, 102, 102));
                
                break;
            
        }
        
    }
    
    private void inicia() {
        
        graficoInicio();
        animationLogo();
        panelNoti.setVisible(false);
        panelFundoNoti.setVisible(false);
        
    }
    
    private void atualiza(int tela) {
        
        switch(tela) {
         
            case 1:
                
                grafInicio.start();
                
                break;
            
            case 2:
                
                
                break;
                
        }

    }
    
    private void graficoInicio() {
        
        grafInicio.addLegend("Lucro", Color.magenta, Color.magenta);
        grafInicio.addLegend("Perda", Color.red, Color.red);
        
        grafInicio.addData(new ModelChart("Janeiro", new double[]{200, 150, 50, 50}));
        grafInicio.addData(new ModelChart("Fevereiro", new double[]{300, 100, 100, 190}));
        grafInicio.addData(new ModelChart("Março", new double[]{100, 400, 100, 190}));
        grafInicio.addData(new ModelChart("Abril", new double[]{600, 200, 100, 190}));
        grafInicio.addData(new ModelChart("Maio", new double[]{190, 150, 100, 190}));
        grafInicio.addData(new ModelChart("Junho", new double[]{10, 70, 100, 190}));
        grafInicio.addData(new ModelChart("Julho", new double[]{800, 600, 100, 190}));
        grafInicio.addData(new ModelChart("Agosto", new double[]{500, 500, 100, 190}));
        grafInicio.addData(new ModelChart("Setembro", new double[]{100, 400, 100, 190}));
        grafInicio.addData(new ModelChart("Outubro", new double[]{600, 100, 100, 190}));
        grafInicio.addData(new ModelChart("Novembro", new double[]{200, 100, 100, 190}));
        grafInicio.addData(new ModelChart("Dezembro", new double[]{100, 60, 100, 190}));
        
        grafInicio.start();
        
    }
    
    private void animationLogo() {
        
        Timer timer = new Timer(7, new ActionListener() {
            
            private int x = panelLogo.getX() - 10;
            private final int xFinal = 70;
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (x < xFinal) {
                    
                    x += 2;
                    txtLogo.setLocation(x, txtLogo.getY());
                    
                } else {
                    
                    ((Timer) e.getSource()).stop();
                    
                }
                
            }
        });
        
        timer.start();
        
      }
    
    public void preencherTabela(){
        tableModel = (DefaultTableModel) tblEstoque.getModel();
        tableModel.setNumRows(0);
        EstoqueDAO funcoesEstoque = new EstoqueDAO();
        List<EstoqueBean> estoque = funcoesEstoque.ListarEstoque();
    
        for(EstoqueBean objEstoque: estoque){
            Object[ ] rowData= {
                
                objEstoque.getNome_produto(),
                objEstoque.getDescricao_produto(),
                objEstoque.getValor(),
                objEstoque.getFk_id_categoria(),
                objEstoque.getQuantidade(),
                objEstoque.getId_produto()
                
                
                };
            tableModel.addRow(rowData); /////ADICIONA UMA LINHA NA TABELA
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCloseNoti;
    private javax.swing.JPanel btnEstoque;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnLogout;
    private com.raven.swing.ButtonBadges btnNoti;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.raven.chart.Chart grafInicio;
    private com.raven.avatar.ImageAvatar imageAvatar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private button.MyButton myButton1;
    private telas.formatos.PanelBorder panelBorder1;
    private telas.formatos.PanelBorder panelBorder2;
    private telas.formatos.PanelBorder panelBorder3;
    private telas.formatos.PanelBorder panelBorder4;
    private telas.formatos.PanelBorder panelBorder5;
    private telas.formatos.PanelBorder panelBorder6;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelFundoNoti;
    private javax.swing.JPanel panelFundoTable;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelMax;
    private javax.swing.JPanel panelMin;
    private javax.swing.JPanel panelNoti;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JTabbedPane tabInicio;
    private tabledark.TableDark tblEstoque;
    private javax.swing.JLabel txtClose;
    private javax.swing.JLabel txtEstoque;
    private javax.swing.JLabel txtInicio;
    private javax.swing.JLabel txtLogo;
    private javax.swing.JLabel txtLogout;
    private javax.swing.JLabel txtMax;
    private javax.swing.JLabel txtMin;
    // End of variables declaration//GEN-END:variables
}
