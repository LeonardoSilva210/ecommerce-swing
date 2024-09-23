
package telas;

import Globals.GlobalAdmin;
import com.raven.chart.ModelChart;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import model.bean.EstoqueBean;
import model.bean.Notificacoes;
import model.bean.Produtos;
import model.bean.Relatorios;
import model.dao.EstoqueDAO;
import model.dao.NotificacoesDAO;
import model.dao.ProdutosDAO;
import model.dao.RelatoriosDAO;
import telas.formatos.ItemNotificacao;
import telas.formatos.ItemRelatorio;


public class Inicio extends javax.swing.JFrame {
    
    private final JFrame frame = this;
    private DefaultTableModel tableModel;
    private final NotificacoesDAO daoNotificacao = new NotificacoesDAO();
    private final RelatoriosDAO daoRelatorio = new RelatoriosDAO();
    private final ProdutosDAO daoProduto = new ProdutosDAO();
    private final EstoqueBean produtosAtual = new EstoqueBean();
    private List<Produtos> listaProdutos = new ArrayList();
    private List<EstoqueBean> estoqueTabela = new ArrayList();
    private List<Notificacoes> listaNotificacoes = new ArrayList();
    private List<Relatorios> listaRelatorios = new ArrayList();
    private boolean telaCheia = false;
    private float produtosTotal = 0, produtosDisponiveis = 0, produtosIndisponiveis = 0, calcPorcent = 0;
    private Dimension tamanhoOriginal;
    private Point localizacaoOriginal;
    
    public Inicio() {
        initComponents();
        inicia();

        radio1.addActionListener(e -> {
            
            preencherTabela(1);
            
        });
        
        radio2.addActionListener(e -> {
            
            preencherTabela(2);
            
        });
        
        radio3.addActionListener(e -> {
            
            preencherTabela(3);
            
        });

        tblEstoque.getSelectionModel().addListSelectionListener(e -> {
            
            if (!e.getValueIsAdjusting()) {
                
                int linhaSelecionada = tblEstoque.getSelectedRow();
                
                tabelaLinhaSelecionada(linhaSelecionada);
                
            }
            
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelAcimaFrame = new telas.formatos.PanelBorder();
        panelNoti = new javax.swing.JPanel();
        panelFundoCloseNoti = new javax.swing.JPanel();
        btnCloseNoti = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelNotificacoes = new telas.formatos.PanelItem();
        panelFundoNoti = new javax.swing.JPanel();
        panelPerfil = new telas.formatos.PanelBorder();
        imageAvatar2 = new com.raven.avatar.ImageAvatar();
        txtBemVindo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelButtons = new telas.formatos.PanelBorder();
        btnInicio = new javax.swing.JPanel();
        txtInicio = new javax.swing.JLabel();
        btnEstoque = new javax.swing.JPanel();
        txtEstoque = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        txtLogout = new javax.swing.JLabel();
        btnRelatorios = new javax.swing.JPanel();
        txtRelatorios = new javax.swing.JLabel();
        panelNav = new telas.formatos.PanelBorder();
        panelLogo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelClose = new javax.swing.JPanel();
        txtClose = new javax.swing.JLabel();
        panelMin = new javax.swing.JPanel();
        txtMin = new javax.swing.JLabel();
        panelMax = new javax.swing.JPanel();
        txtMax = new javax.swing.JLabel();
        txtLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tabInicio = new javax.swing.JTabbedPane();
        panelInicio = new javax.swing.JPanel();
        grafInicio = new com.raven.chart.Chart();
        progressDisponivel = new com.raven.swing.progress.Progress();
        jLabel12 = new javax.swing.JLabel();
        progressIndisponivel = new com.raven.swing.progress.Progress();
        jLabel13 = new javax.swing.JLabel();
        panelEstoque = new javax.swing.JPanel();
        panelBorder6 = new telas.formatos.PanelBorder();
        myButton1 = new button.MyButton();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        buttonEditar1 = new button.ButtonEditar();
        btn_disp = new button.ButtonVerde();
        btn_ind = new button.MyButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstoque = new tabledark.TableDark();
        panelRelatorios = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelListRelatorios = new telas.formatos.PanelItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelSubNav = new telas.formatos.PanelBorder();
        btnNoti = new com.raven.swing.ButtonBadges();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ecommerce");
        setUndecorated(true);
        setResizable(false);

        panelAcimaFrame.setBackground(new java.awt.Color(0, 0, 0));
        panelAcimaFrame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        panelAcimaFrame.setForeground(new java.awt.Color(0, 0, 0));
        panelAcimaFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNoti.setBackground(new java.awt.Color(102, 102, 102));
        panelNoti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNotiMouseClicked(evt);
            }
        });
        panelNoti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFundoCloseNoti.setBackground(new java.awt.Color(102, 102, 102));

        btnCloseNoti.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        btnCloseNoti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseNoti.setText("X");
        btnCloseNoti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseNotiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseNotiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseNotiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelFundoCloseNotiLayout = new javax.swing.GroupLayout(panelFundoCloseNoti);
        panelFundoCloseNoti.setLayout(panelFundoCloseNotiLayout);
        panelFundoCloseNotiLayout.setHorizontalGroup(
            panelFundoCloseNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFundoCloseNotiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCloseNoti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelFundoCloseNotiLayout.setVerticalGroup(
            panelFundoCloseNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCloseNoti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        panelNoti.add(panelFundoCloseNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(panelNotificacoes);

        panelNoti.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 500));

        panelAcimaFrame.add(panelNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, 260, 550));

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
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        panelFundoNotiLayout.setVerticalGroup(
            panelFundoNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        panelAcimaFrame.add(panelFundoNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1300, 550));

        imageAvatar2.setBackground(new java.awt.Color(255, 255, 255));
        imageAvatar2.setForeground(new java.awt.Color(255, 255, 255));
        imageAvatar2.setBorderSize(2);
        imageAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPerfil.png"))); // NOI18N

        txtBemVindo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        txtBemVindo.setText("Bem vindo, User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin");

        javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
        panelPerfil.setLayout(panelPerfilLayout);
        panelPerfilLayout.setHorizontalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBemVindo)
                    .addComponent(jLabel2))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelPerfilLayout.setVerticalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panelAcimaFrame.add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 100));

        panelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelButtons.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 290, 40));

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
            .addGroup(btnEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEstoqueLayout.setVerticalGroup(
            btnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEstoqueLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelButtons.add(btnEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 290, 40));

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

        panelButtons.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 290, 30));

        btnRelatorios.setBackground(new java.awt.Color(51, 51, 51));
        btnRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelatoriosMouseClicked(evt);
            }
        });

        txtRelatorios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        txtRelatorios.setText("Relatórios");

        javax.swing.GroupLayout btnRelatoriosLayout = new javax.swing.GroupLayout(btnRelatorios);
        btnRelatorios.setLayout(btnRelatoriosLayout);
        btnRelatoriosLayout.setHorizontalGroup(
            btnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRelatoriosLayout.setVerticalGroup(
            btnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRelatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelButtons.add(btnRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 290, 40));

        panelAcimaFrame.add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 290, 420));

        panelNav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogo.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("|");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLogo.png"))); // NOI18N

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelNav.add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

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

        panelNav.add(panelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 40, 30));

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
            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        panelNav.add(panelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 40, 30));

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

        panelNav.add(panelMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 40, 30));

        txtLogo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLogo.setForeground(new java.awt.Color(255, 255, 255));
        txtLogo.setText("E-commerce");
        panelNav.add(txtLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 12, 100, 30));

        panelAcimaFrame.add(panelNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabInicio.setBackground(new java.awt.Color(51, 51, 51));
        tabInicio.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        panelInicio.setBackground(new java.awt.Color(51, 51, 51));

        progressDisponivel.setBackground(new java.awt.Color(0, 255, 0));
        progressDisponivel.setBorder(null);
        progressDisponivel.setForeground(new java.awt.Color(0, 255, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Produtos Disponíveis");

        progressIndisponivel.setBackground(new java.awt.Color(255, 0, 0));
        progressIndisponivel.setBorder(null);
        progressIndisponivel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Produtos Indisponíveis");

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(progressDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressIndisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grafInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressIndisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grafInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        tabInicio.addTab("tab1", panelInicio);

        panelEstoque.setBackground(new java.awt.Color(51, 51, 51));

        panelBorder6.setForeground(new java.awt.Color(153, 153, 153));

        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lixo.png"))); // NOI18N
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio1);
        radio1.setText("Todos Produtos");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio2);
        radio2.setText("Disponíveis");
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio3);
        radio3.setText("Indisponíveis");

        btn_disp.setText("TORNAR DISPONÍVEL");
        btn_disp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dispActionPerformed(evt);
            }
        });

        btn_ind.setText("TORNAR INDISPONÍVEL");
        btn_ind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_indActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder6Layout = new javax.swing.GroupLayout(panelBorder6);
        panelBorder6.setLayout(panelBorder6Layout);
        panelBorder6Layout.setHorizontalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_disp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(radio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio3)
                .addGap(65, 65, 65))
        );
        panelBorder6Layout.setVerticalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelBorder6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio1)
                            .addComponent(radio2)
                            .addComponent(radio3))
                        .addComponent(myButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonEditar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_disp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_ind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblEstoque.setBackground(new java.awt.Color(204, 204, 204));
        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome do Produto", "Descrição Produto", "Valor", "Categoria", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        if (tblEstoque.getColumnModel().getColumnCount() > 0) {
            tblEstoque.getColumnModel().getColumn(0).setResizable(false);
            tblEstoque.getColumnModel().getColumn(1).setResizable(false);
            tblEstoque.getColumnModel().getColumn(2).setResizable(false);
            tblEstoque.getColumnModel().getColumn(3).setResizable(false);
            tblEstoque.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout panelEstoqueLayout = new javax.swing.GroupLayout(panelEstoque);
        panelEstoque.setLayout(panelEstoqueLayout);
        panelEstoqueLayout.setHorizontalGroup(
            panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                    .addComponent(panelBorder6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelEstoqueLayout.setVerticalGroup(
            panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBorder6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        tabInicio.addTab("tab2", panelEstoque);

        panelRelatorios.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportView(panelListRelatorios);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Produto");
        jPanel2.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Horário");
        jPanel2.add(jLabel7);

        jLabel9.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Data");
        jPanel2.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Quantidade");
        jPanel2.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Valor Unitário");
        jPanel2.add(jLabel11);

        jLabel8.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Valor Total");
        jPanel2.add(jLabel8);

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pessoa");
        jPanel2.add(jLabel5);

        javax.swing.GroupLayout panelRelatoriosLayout = new javax.swing.GroupLayout(panelRelatorios);
        panelRelatorios.setLayout(panelRelatoriosLayout);
        panelRelatoriosLayout.setHorizontalGroup(
            panelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelRelatoriosLayout.setVerticalGroup(
            panelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        tabInicio.addTab("tab3", panelRelatorios);

        jPanel1.add(tabInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        panelAcimaFrame.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 980, 470));

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

        javax.swing.GroupLayout panelSubNavLayout = new javax.swing.GroupLayout(panelSubNav);
        panelSubNav.setLayout(panelSubNavLayout);
        panelSubNavLayout.setHorizontalGroup(
            panelSubNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSubNavLayout.createSequentialGroup()
                .addContainerGap(913, Short.MAX_VALUE)
                .addComponent(btnNoti, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelSubNavLayout.setVerticalGroup(
            panelSubNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNoti, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelAcimaFrame.add(panelSubNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 980, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAcimaFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAcimaFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        panelClose.setBackground(new Color(204, 0, 0));
        
    }//GEN-LAST:event_txtCloseMouseEntered

    private void txtCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseExited
        
        panelClose.setBackground(new Color(51, 51, 51));
        
    }//GEN-LAST:event_txtCloseMouseExited

    private void txtMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaxMouseClicked
      
        if (telaCheia) {
            
            telaCheia = false;
            
            frame.setSize(tamanhoOriginal);
            frame.setLocation(localizacaoOriginal);
            
            redimensiona(false);
            
        } else {
            
            telaCheia = true;
            
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int width = screenSize.width;
            int height = screenSize.height;
            
            frame.setBounds(0, 0, width, height - 30);
            
            redimensiona(true);
       
        }
        
    }//GEN-LAST:event_txtMaxMouseClicked

    private void txtMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaxMouseEntered
           
        panelMax.setBackground(new Color(204, 204, 204));
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
        
        panelMin.setBackground(new Color(204, 204, 204));
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
        btnNoti.setBadges(0);
        daoNotificacao.atualizar(listaNotificacoes);
        
    }//GEN-LAST:event_btnNotiMouseClicked

    private void panelFundoNotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFundoNotiMouseClicked
        
        panelNoti.setVisible(false);
        panelFundoNoti.setVisible(false);
        
    }//GEN-LAST:event_panelFundoNotiMouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
      EstoqueBean estoque = new EstoqueBean();
      EstoqueDAO funcaoEstoque = new EstoqueDAO();
    
      funcaoEstoque.deletarProduto(produtosAtual);
      
        preencherTabela(1);
    
      
    }//GEN-LAST:event_myButton1ActionPerformed

    private void tblEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseEntered
       
    }//GEN-LAST:event_tblEstoqueMouseEntered

    private void panelNotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNotiMouseClicked
     
        
    }//GEN-LAST:event_panelNotiMouseClicked

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        
        
    }//GEN-LAST:event_radio1ActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
       
        
    }//GEN-LAST:event_radio2ActionPerformed

    private void btn_dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dispActionPerformed
          EstoqueBean estoque = new EstoqueBean();
      EstoqueDAO funcaoEstoque = new EstoqueDAO();
        
      funcaoEstoque.produtoDisponível(produtosAtual, true);
        preencherTabela(3);
    }//GEN-LAST:event_btn_dispActionPerformed

    private void btn_indActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_indActionPerformed
         EstoqueBean estoque = new EstoqueBean();
      EstoqueDAO funcaoEstoque = new EstoqueDAO();
        
      funcaoEstoque.produtoDisponível(produtosAtual, false);
        preencherTabela(2);
    }//GEN-LAST:event_btn_indActionPerformed

    private void btnCloseNotiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseNotiMouseEntered
        
        panelFundoCloseNoti.setBackground(Color.white);
        
    }//GEN-LAST:event_btnCloseNotiMouseEntered

    private void btnCloseNotiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseNotiMouseExited
        
        panelFundoCloseNoti.setBackground(new Color(102, 102, 102));
        
    }//GEN-LAST:event_btnCloseNotiMouseExited

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited

        btnLogout.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered

        btnLogout.setBackground(new Color(204, 0, 0));

    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                new Login().setVisible(true);
            }
        });

    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMouseClicked

        trocaTab(2);

    }//GEN-LAST:event_btnEstoqueMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked

        trocaTab(1);

    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseClicked
        
        trocaTab(3);
        
    }//GEN-LAST:event_btnRelatoriosMouseClicked


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
                btnRelatorios.setBackground(new Color(51, 51, 51));
                
                break;
                
            case 2:
                
                tabInicio.setSelectedIndex(1);
                atualiza(2);
                
                btnInicio.setBackground(new Color(51, 51, 51));
                btnEstoque.setBackground(new Color(102, 102, 102));
                btnRelatorios.setBackground(new Color(51, 51, 51));
                
                break;
            
            case 3:
                
                tabInicio.setSelectedIndex(2);
                atualiza(3);
                
                btnInicio.setBackground(new Color(51, 51, 51));
                btnEstoque.setBackground(new Color(51, 51, 51));
                btnRelatorios.setBackground(new Color(102, 102, 102));
                
                break;
            
        }
        
    }
    
    private void inicia() {
        
        animationLogo();
        graficoInicio();
        preencherTabela(1);
        listaRelatorios();
        listaNotificacoes();
        progressInicio();
        panelNoti.setVisible(false);
        panelFundoNoti.setVisible(false);
        radio1.setSelected(true);
        tamanhoOriginal = frame.getSize();
        localizacaoOriginal = frame.getLocation();
        
        if (GlobalAdmin.getNome() != null) {
            
            txtBemVindo.setText("Bem vindo, " + GlobalAdmin.getNome());
            
        }
        
    }
    
    private void atualiza(int tela) {
        
        switch(tela) {
         
            case 1:
                
                grafInicio.start();
                progressInicio();
                
                break;
            
            case 2:
                
                break;
                
            case 3:
                
                break;
                
        }

    }
    
    private void graficoInicio() {
        
        grafInicio.addLegend("Lucro", Color.green, Color.green);
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
    
    private void preencherTabela(int table){
        
        tableModel = (DefaultTableModel) tblEstoque.getModel();
        tableModel.setNumRows(0);
        
        EstoqueDAO funcoesEstoque = new EstoqueDAO();
        
        switch(table) {
            
            case 1:
                
                estoqueTabela = funcoesEstoque.ListarEstoque(1);
                btn_disp.setVisible(false);
                btn_ind.setVisible(false);
                break;
                
            case 2:
                
                estoqueTabela = funcoesEstoque.ListarEstoque(2);
                btn_ind.setVisible(true);
                btn_disp.setVisible(false);
                break;
            
            case 3:
                
                estoqueTabela = funcoesEstoque.ListarEstoque(3);
                btn_ind.setVisible(false);
                btn_disp.setVisible(true);
                break;
            
        }

        for(EstoqueBean objEstoque: estoqueTabela){
            Object[] rowData= {
                
                objEstoque.getNome_produto(),
                objEstoque.getDescricao_produto(),
                objEstoque.getValor(),
                objEstoque.getNome_categoria(),
                objEstoque.getQuantidade()

                };
            
            tableModel.addRow(rowData);
        }
    }

    private void tabelaLinhaSelecionada(int linha) {
        
        if (linha != -1) {
            
            produtosAtual.setId_produto(estoqueTabela.get(linha).getId_produto());
            produtosAtual.setNome_produto(estoqueTabela.get(linha).getNome_produto());
            produtosAtual.setDescricao_produto(estoqueTabela.get(linha).getDescricao_produto());
            produtosAtual.setNome_categoria(estoqueTabela.get(linha).getNome_categoria());
            produtosAtual.setDescricao_categoria(estoqueTabela.get(linha).getDescricao_categoria());
            produtosAtual.setQuantidade(estoqueTabela.get(linha).getQuantidade());
            produtosAtual.setValor(estoqueTabela.get(linha).getValor());
            produtosAtual.setDisponivel(estoqueTabela.get(linha).getDisponivel());
            produtosAtual.setFk_id_categoria(estoqueTabela.get(linha).getFk_id_categoria());
            
        }
        
    }
    
    private void redimensiona(boolean verifica) {
        
    }
    
    private void listaNotificacoes() {
       
       panelNotificacoes.removeAll();
        
       listaNotificacoes = daoNotificacao.listar();
       
       int cont = 0;
       
       for (int i = 0; i < listaNotificacoes.size(); i++) {
           
           panelNotificacoes.add(new ItemNotificacao(listaNotificacoes.get(i)));
           
           if (!listaNotificacoes.get(i).isVisto()) {
               
               cont++;
               
           }
           
       }
       
       btnNoti.setBadges(cont);
        
    }
    
    private void listaRelatorios() {
        
        listaRelatorios = daoRelatorio.listar();
        
        for (int i = 0; i < listaRelatorios.size(); i++) {
            
            panelListRelatorios.add(new ItemRelatorio(listaRelatorios.get(i)));
            
        }
        
    }
    
    private void progressInicio() {
        
        listaProdutos = daoProduto.listar();

        produtosTotal = listaProdutos.size();
        produtosDisponiveis = 0;
        produtosIndisponiveis = 0;
        
        for (int i = 0; i < produtosTotal; i++) {
            
            if (listaProdutos.get(i).getDisponivel() == 1) {
                
                produtosDisponiveis++;
                
            } else {
                
                produtosIndisponiveis++;
                
            }
            
        }

        calcPorcent = (produtosDisponiveis / produtosTotal) * 100;
        int porcent = convertePorcent(calcPorcent);
        
        if (porcent != 100 && porcent != 0) {
            porcent++;
        }
        
        verificaNivel(1, porcent);
        progressDisponivel.setValue(porcent);

        calcPorcent = (produtosIndisponiveis / produtosTotal) * 100;
        porcent = convertePorcent(calcPorcent);
        verificaNivel(2, porcent);
        progressIndisponivel.setValue(porcent);
        
        calcPorcent = 0;
        
        progressDisponivel.start();
        progressIndisponivel.start();
        
    }
    
    private int convertePorcent(float valor) {
        
        String resultado = String.valueOf(calcPorcent);
        String[] passaInt = resultado.split("\\.");
        
        int valorFinal = Integer.parseInt(passaInt[0]);
        
        return valorFinal;
        
    }
    
    private void verificaNivel(int vez, int porcent) {
        
        switch(vez) {
            
            case 1:
                
                Color backfore = Color.darkGray;
                
                if (porcent < 20) {
                    
                    backfore = Color.red;
                    
                } else if (porcent >= 20 && porcent < 40) {
                    
                    backfore = Color.orange;
                    
                } else if (porcent >= 40 && porcent < 50) {
                    
                    backfore = Color.yellow;
                    
                } else if (porcent >= 50) {
                    
                    backfore = Color.green;
                    
                }
                
                progressDisponivel.setBackground(backfore);
                progressDisponivel.setForeground(backfore);
                
                break;
                
            case 2: 
                
                Color backfore2 = Color.darkGray;
                
                if (porcent < 50) {
                    
                    backfore2 = Color.orange;
                    
                } else if (porcent >= 50) {
                    
                    backfore2 = Color.red;
                    
                }
                
                progressIndisponivel.setBackground(backfore2);
                progressIndisponivel.setForeground(backfore2);
                
                break;
            
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCloseNoti;
    private javax.swing.JPanel btnEstoque;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnLogout;
    private com.raven.swing.ButtonBadges btnNoti;
    private javax.swing.JPanel btnRelatorios;
    private button.ButtonVerde btn_disp;
    private button.MyButton btn_ind;
    private button.ButtonEditar buttonEditar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.raven.chart.Chart grafInicio;
    private com.raven.avatar.ImageAvatar imageAvatar2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private button.MyButton myButton1;
    private telas.formatos.PanelBorder panelAcimaFrame;
    private telas.formatos.PanelBorder panelBorder6;
    private telas.formatos.PanelBorder panelButtons;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelEstoque;
    private javax.swing.JPanel panelFundoCloseNoti;
    private javax.swing.JPanel panelFundoNoti;
    private javax.swing.JPanel panelInicio;
    private telas.formatos.PanelItem panelListRelatorios;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelMax;
    private javax.swing.JPanel panelMin;
    private telas.formatos.PanelBorder panelNav;
    private javax.swing.JPanel panelNoti;
    private telas.formatos.PanelItem panelNotificacoes;
    private telas.formatos.PanelBorder panelPerfil;
    private javax.swing.JPanel panelRelatorios;
    private telas.formatos.PanelBorder panelSubNav;
    private com.raven.swing.progress.Progress progressDisponivel;
    private com.raven.swing.progress.Progress progressIndisponivel;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JTabbedPane tabInicio;
    private tabledark.TableDark tblEstoque;
    private javax.swing.JLabel txtBemVindo;
    private javax.swing.JLabel txtClose;
    private javax.swing.JLabel txtEstoque;
    private javax.swing.JLabel txtInicio;
    private javax.swing.JLabel txtLogo;
    private javax.swing.JLabel txtLogout;
    private javax.swing.JLabel txtMax;
    private javax.swing.JLabel txtMin;
    private javax.swing.JLabel txtRelatorios;
    // End of variables declaration//GEN-END:variables


}
