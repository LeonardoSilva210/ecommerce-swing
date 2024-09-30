package telas;

import Globals.GlobalAdmin;
import com.raven.chart.ModelChart;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import model.bean.Categorias;
import model.bean.Compras;
import model.bean.EstoqueBean;
import model.bean.Notificacoes;
import model.bean.Produtos;
import model.bean.Relatorios;
import model.dao.CategoriasDAO;
import model.dao.ComprasDAO;
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
    private final CategoriasDAO daoCategoria = new CategoriasDAO();
    private final EstoqueDAO daoEstoque = new EstoqueDAO();
    private final ComprasDAO daoCompra = new ComprasDAO();
    private final EstoqueBean produtosAtual = new EstoqueBean();
    private List<Produtos> listaProdutos = new ArrayList();
    private List<EstoqueBean> estoqueTabela = new ArrayList();
    private List<Notificacoes> listaNotificacoes = new ArrayList();
    private List<Relatorios> listaRelatorios = new ArrayList();
    private List<Categorias> listaCategorias = new ArrayList();
    private List<Compras> listaCompras = new ArrayList();
    private boolean telaCheia = false, animacao = false;
    private float produtosTotal = 0, produtosDisponiveis = 0, produtosIndisponiveis = 0, calcPorcent = 0;
    private Dimension tamanhoOriginal;
    private Point localizacaoOriginal;

    public Inicio() {
        initComponents();
        inicia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelAcimaFrame = new telas.formatos.PanelBorder();
        panelFundoAdicionarProduto = new javax.swing.JPanel();
        panelAdicionarProduto = new javax.swing.JPanel();
        inputValorCusto = new javax.swing.JTextField();
        inputNomeProduto = new javax.swing.JTextField();
        inputDescricaoProduto = new javax.swing.JTextField();
        inputValor = new javax.swing.JTextField();
        inputQuantidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        comboAdicionarProdutoCategoria = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        panelInformacoesPerfil = new javax.swing.JPanel();
        imageAvatar1 = new com.raven.avatar.ImageAvatar();
        inputNome = new javax.swing.JTextField();
        inputSobrenome = new javax.swing.JTextField();
        inputSenha = new javax.swing.JPasswordField();
        inputCPF = new javax.swing.JFormattedTextField();
        btnFechaInformacoesPerfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelFundoPerfil = new javax.swing.JPanel();
        panelNoti = new javax.swing.JPanel();
        panelFundoCloseNoti = new javax.swing.JPanel();
        btnCloseNoti = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelNotificacoes = new telas.formatos.PanelItem();
        panelFundoNoti = new javax.swing.JPanel();
        panelPopProduto = new javax.swing.JPanel();
        txtNomeProduto = new javax.swing.JLabel();
        panelBtnClosePopProduto = new javax.swing.JPanel();
        btnClosePopProduto = new javax.swing.JLabel();
        edtNomeProduto = new javax.swing.JTextField();
        txtNomeProduto1 = new javax.swing.JLabel();
        edtDescricaoProduto = new javax.swing.JTextField();
        txtNomeProduto2 = new javax.swing.JLabel();
        edtValorProduto = new javax.swing.JTextField();
        txtNomeProduto3 = new javax.swing.JLabel();
        edtQuantidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        comboCategorias = new javax.swing.JComboBox<>();
        btnDiminuirQuantidade = new javax.swing.JButton();
        btnAdicionarQuantidade = new javax.swing.JButton();
        txtNomeProduto4 = new javax.swing.JLabel();
        edtValorCustoProduto = new javax.swing.JTextField();
        panelFundoPopProdutoSelecionado = new javax.swing.JPanel();
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
        panelFundoTab = new javax.swing.JPanel();
        tabInicio = new javax.swing.JTabbedPane();
        panelInicio = new javax.swing.JPanel();
        grafInicio = new com.raven.chart.Chart();
        progressDisponivel = new com.raven.swing.progress.Progress();
        jLabel12 = new javax.swing.JLabel();
        progressIndisponivel = new com.raven.swing.progress.Progress();
        jLabel13 = new javax.swing.JLabel();
        comboGrafico = new javax.swing.JComboBox<>();
        panelEstoque = new javax.swing.JPanel();
        panelBorder6 = new telas.formatos.PanelBorder();
        myButton1 = new button.MyButton();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        btnEditarProduto = new button.ButtonEditar();
        btn_disp = new button.ButtonVerde();
        btn_ind = new button.MyButton();
        btnAdicionarProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstoque = new tabledark.TableDark();
        panelRelatorios = new javax.swing.JPanel();
        scrollRelatorios = new javax.swing.JScrollPane();
        panelListRelatorios = new telas.formatos.PanelItem();
        panelTitulosRelatorios = new javax.swing.JPanel();
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

        panelFundoAdicionarProduto.setBackground(new java.awt.Color(0, 0, 0, 100));

        panelAdicionarProduto.setBackground(new java.awt.Color(0, 153, 204));
        panelAdicionarProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelAdicionarProduto.add(inputValorCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 169, 34));
        panelAdicionarProduto.add(inputNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 169, 34));
        panelAdicionarProduto.add(inputDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 168, 169, 34));
        panelAdicionarProduto.add(inputValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 169, 34));
        panelAdicionarProduto.add(inputQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 169, 34));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Valor de Custo");
        panelAdicionarProduto.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Valor");
        panelAdicionarProduto.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Descrição do Produto");
        panelAdicionarProduto.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Nome do Produto");
        panelAdicionarProduto.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Categoria");
        panelAdicionarProduto.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelAdicionarProduto.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 170, 30));

        panelAdicionarProduto.add(comboAdicionarProdutoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 170, 34));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Quantidade");
        panelAdicionarProduto.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Disponível");
        panelAdicionarProduto.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 90, -1));

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Indisponível");
        panelAdicionarProduto.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 90, -1));

        javax.swing.GroupLayout panelFundoAdicionarProdutoLayout = new javax.swing.GroupLayout(panelFundoAdicionarProduto);
        panelFundoAdicionarProduto.setLayout(panelFundoAdicionarProdutoLayout);
        panelFundoAdicionarProdutoLayout.setHorizontalGroup(
            panelFundoAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFundoAdicionarProdutoLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(panelAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        panelFundoAdicionarProdutoLayout.setVerticalGroup(
            panelFundoAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFundoAdicionarProdutoLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(panelAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        panelAcimaFrame.add(panelFundoAdicionarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1300, 550));

        panelInformacoesPerfil.setBackground(new java.awt.Color(153, 153, 153));
        panelInformacoesPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelInformacoesPerfilMouseClicked(evt);
            }
        });
        panelInformacoesPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageAvatar1.setBackground(new java.awt.Color(255, 255, 255));
        imageAvatar1.setForeground(new java.awt.Color(255, 255, 255));
        imageAvatar1.setBorderSize(2);
        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPerfil.png"))); // NOI18N
        panelInformacoesPerfil.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, 100));

        inputNome.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        inputNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelInformacoesPerfil.add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 270, 40));

        inputSobrenome.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        inputSobrenome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelInformacoesPerfil.add(inputSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 270, 40));

        inputSenha.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        inputSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelInformacoesPerfil.add(inputSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 270, 40));

        try {
            inputCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelInformacoesPerfil.add(inputCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 270, 40));

        btnFechaInformacoesPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFechaInformacoesPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFechaInformacoesPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFechaInformacoesPerfilMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<-");

        javax.swing.GroupLayout btnFechaInformacoesPerfilLayout = new javax.swing.GroupLayout(btnFechaInformacoesPerfil);
        btnFechaInformacoesPerfil.setLayout(btnFechaInformacoesPerfilLayout);
        btnFechaInformacoesPerfilLayout.setHorizontalGroup(
            btnFechaInformacoesPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnFechaInformacoesPerfilLayout.setVerticalGroup(
            btnFechaInformacoesPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelInformacoesPerfil.add(btnFechaInformacoesPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 20));

        panelAcimaFrame.add(panelInformacoesPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 550));

        panelFundoPerfil.setBackground(new java.awt.Color(0, 0, 0, 100));
        panelFundoPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFundoPerfilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFundoPerfilLayout = new javax.swing.GroupLayout(panelFundoPerfil);
        panelFundoPerfil.setLayout(panelFundoPerfilLayout);
        panelFundoPerfilLayout.setHorizontalGroup(
            panelFundoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        panelFundoPerfilLayout.setVerticalGroup(
            panelFundoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panelAcimaFrame.add(panelFundoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1300, 30));

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

        panelAcimaFrame.add(panelNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, -1, 550));

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
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelAcimaFrame.add(panelFundoNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1300, 50));

        panelPopProduto.setBackground(new java.awt.Color(204, 204, 204));
        panelPopProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPopProdutoMouseClicked(evt);
            }
        });
        panelPopProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeProduto.setText("Produto");
        panelPopProduto.add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        panelBtnClosePopProduto.setBackground(new java.awt.Color(204, 204, 204));

        btnClosePopProduto.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        btnClosePopProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClosePopProduto.setText("X");
        btnClosePopProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClosePopProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClosePopProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClosePopProdutoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBtnClosePopProdutoLayout = new javax.swing.GroupLayout(panelBtnClosePopProduto);
        panelBtnClosePopProduto.setLayout(panelBtnClosePopProdutoLayout);
        panelBtnClosePopProdutoLayout.setHorizontalGroup(
            panelBtnClosePopProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClosePopProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        panelBtnClosePopProdutoLayout.setVerticalGroup(
            panelBtnClosePopProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClosePopProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelPopProduto.add(panelBtnClosePopProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));
        panelPopProduto.add(edtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 170, 30));

        txtNomeProduto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeProduto1.setText("Descrição");
        panelPopProduto.add(txtNomeProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));
        panelPopProduto.add(edtDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 170, 30));

        txtNomeProduto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeProduto2.setText("Valor de venda");
        panelPopProduto.add(txtNomeProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));
        panelPopProduto.add(edtValorProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 170, 30));

        txtNomeProduto3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeProduto3.setText("Quantidade");
        panelPopProduto.add(txtNomeProduto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        edtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edtQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPopProduto.add(edtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 50, 30));

        jButton1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelPopProduto.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 130, 40));

        panelPopProduto.add(comboCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 170, 30));

        btnDiminuirQuantidade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDiminuirQuantidade.setText("-");
        btnDiminuirQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuirQuantidadeActionPerformed(evt);
            }
        });
        panelPopProduto.add(btnDiminuirQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 40, 30));

        btnAdicionarQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdicionarQuantidade.setText("+");
        btnAdicionarQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarQuantidadeActionPerformed(evt);
            }
        });
        panelPopProduto.add(btnAdicionarQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 40, 30));

        txtNomeProduto4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeProduto4.setText("Valor de custo");
        panelPopProduto.add(txtNomeProduto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));
        panelPopProduto.add(edtValorCustoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 170, 30));

        panelAcimaFrame.add(panelPopProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 960, 40));

        panelFundoPopProdutoSelecionado.setBackground(new java.awt.Color(0, 0, 0, 100));
        panelFundoPopProdutoSelecionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFundoPopProdutoSelecionadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFundoPopProdutoSelecionadoLayout = new javax.swing.GroupLayout(panelFundoPopProdutoSelecionado);
        panelFundoPopProdutoSelecionado.setLayout(panelFundoPopProdutoSelecionadoLayout);
        panelFundoPopProdutoSelecionadoLayout.setHorizontalGroup(
            panelFundoPopProdutoSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        panelFundoPopProdutoSelecionadoLayout.setVerticalGroup(
            panelFundoPopProdutoSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        panelAcimaFrame.add(panelFundoPopProdutoSelecionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1300, 140));

        panelPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelPerfilMouseExited(evt);
            }
        });

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstoqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstoqueMouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRelatoriosMouseExited(evt);
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
            .addComponent(txtClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
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
        txtLogo.setText("Império Beer");
        panelNav.add(txtLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 12, 110, 30));

        panelAcimaFrame.add(panelNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        panelFundoTab.setBackground(new java.awt.Color(51, 51, 51));
        panelFundoTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        comboGrafico.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N

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
                .addGap(451, 451, 451)
                .addComponent(comboGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grafInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelInicioLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(progressDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelInicioLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(progressIndisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

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

        btnAdicionarProduto.setText("Adicionar Produto");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
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
                .addComponent(btnEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdicionarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
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
                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radio1)
                        .addComponent(radio2)
                        .addComponent(radio3))
                    .addComponent(myButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_disp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                "Nome do Produto", "Descrição Produto", "Valor", "Valor de Custo", "Categoria", "Quantidade"
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
        if (tblEstoque.getColumnModel().getColumnCount() > 0) {
            tblEstoque.getColumnModel().getColumn(0).setResizable(false);
            tblEstoque.getColumnModel().getColumn(1).setResizable(false);
            tblEstoque.getColumnModel().getColumn(2).setResizable(false);
            tblEstoque.getColumnModel().getColumn(3).setResizable(false);
            tblEstoque.getColumnModel().getColumn(4).setResizable(false);
            tblEstoque.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout panelEstoqueLayout = new javax.swing.GroupLayout(panelEstoque);
        panelEstoque.setLayout(panelEstoqueLayout);
        panelEstoqueLayout.setHorizontalGroup(
            panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(panelBorder6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEstoqueLayout.setVerticalGroup(
            panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBorder6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(303, 303, 303))
        );

        tabInicio.addTab("tab2", panelEstoque);

        panelRelatorios.setBackground(new java.awt.Color(51, 51, 51));

        scrollRelatorios.setBorder(null);
        scrollRelatorios.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollRelatorios.setViewportView(panelListRelatorios);

        panelTitulosRelatorios.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Produtos");
        panelTitulosRelatorios.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Horário");
        panelTitulosRelatorios.add(jLabel7);

        jLabel9.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Data");
        panelTitulosRelatorios.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Quantidade");
        panelTitulosRelatorios.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Valor Unitário");
        panelTitulosRelatorios.add(jLabel11);

        jLabel8.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Valor Total");
        panelTitulosRelatorios.add(jLabel8);

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pessoa");
        panelTitulosRelatorios.add(jLabel5);

        javax.swing.GroupLayout panelRelatoriosLayout = new javax.swing.GroupLayout(panelRelatorios);
        panelRelatorios.setLayout(panelRelatoriosLayout);
        panelRelatoriosLayout.setHorizontalGroup(
            panelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitulosRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelRelatoriosLayout.setVerticalGroup(
            panelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulosRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        tabInicio.addTab("tab3", panelRelatorios);

        panelFundoTab.add(tabInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        panelAcimaFrame.add(panelFundoTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 980, 470));

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

        if (!animacao) {

            animacoesPanel(4, panelNoti, panelFundoNoti, true);

        }

    }//GEN-LAST:event_btnCloseNotiMouseClicked

    private void btnNotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotiMouseClicked

        panelNoti.setVisible(true);
        panelFundoNoti.setVisible(true);
        btnNoti.setBadges(0);
        daoNotificacao.atualizar(listaNotificacoes);
        animacoesPanel(3, panelNoti, panelFundoNoti, false);

    }//GEN-LAST:event_btnNotiMouseClicked

    private void panelFundoNotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFundoNotiMouseClicked

        if (!animacao) {

            animacoesPanel(4, panelNoti, panelFundoNoti, true);

        }

    }//GEN-LAST:event_panelFundoNotiMouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        EstoqueBean estoque = new EstoqueBean();
        EstoqueDAO funcaoEstoque = new EstoqueDAO();

        funcaoEstoque.deletarProduto(produtosAtual);

        verificaRadio();

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

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed

        if (produtosAtual.getId_produto() > 0) {

            btnEditarProduto.setVisible(false);
            panelFundoPopProdutoSelecionado.setVisible(true);
            panelPopProduto.setVisible(true);

            edtNomeProduto.setText(produtosAtual.getNome_produto());
            edtDescricaoProduto.setText(produtosAtual.getDescricao_produto());
            edtQuantidade.setText(String.valueOf(produtosAtual.getQuantidade()));
            edtValorProduto.setText(String.valueOf(produtosAtual.getValor()));
            edtValorCustoProduto.setText(String.valueOf(produtosAtual.getValor_custo()));

            listaCategorias = daoCategoria.listar();

            comboCategorias.removeAllItems();

            for (int i = 0; i < listaCategorias.size(); i++) {

                comboCategorias.addItem(listaCategorias.get(i).getNome());

                if (listaCategorias.get(i).getNome().equals(produtosAtual.getNome_categoria())) {

                    comboCategorias.setSelectedIndex(i);

                }

            }

        } else {

            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");

        }

    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnClosePopProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClosePopProdutoMouseClicked

        fechaPopProduto();

    }//GEN-LAST:event_btnClosePopProdutoMouseClicked

    private void btnClosePopProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClosePopProdutoMouseEntered

        panelBtnClosePopProduto.setBackground(Color.white);

    }//GEN-LAST:event_btnClosePopProdutoMouseEntered

    private void btnClosePopProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClosePopProdutoMouseExited

        panelBtnClosePopProduto.setBackground(new Color(204, 204, 204));

    }//GEN-LAST:event_btnClosePopProdutoMouseExited

    private void panelPopProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPopProdutoMouseClicked

    }//GEN-LAST:event_panelPopProdutoMouseClicked

    private void panelFundoPopProdutoSelecionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFundoPopProdutoSelecionadoMouseClicked

        fechaPopProduto();

    }//GEN-LAST:event_panelFundoPopProdutoSelecionadoMouseClicked

    private void btnAdicionarQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarQuantidadeActionPerformed

        alteraQuantidade(2);

    }//GEN-LAST:event_btnAdicionarQuantidadeActionPerformed

    private void btnDiminuirQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuirQuantidadeActionPerformed

        alteraQuantidade(1);

    }//GEN-LAST:event_btnDiminuirQuantidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (Integer.parseInt(edtQuantidade.getText()) >= 0) {
            
            EstoqueBean estoque = new EstoqueBean();

            estoque.setId_produto(produtosAtual.getId_produto());
            estoque.setNome_produto(edtNomeProduto.getText());
            estoque.setDescricao_produto(edtDescricaoProduto.getText());
            estoque.setValor(Float.parseFloat(edtValorProduto.getText()));
            estoque.setValor_custo(Float.parseFloat(edtValorCustoProduto.getText()));
            estoque.setQuantidade(Integer.parseInt(edtQuantidade.getText()));
            estoque.setFk_id_categoria(listaCategorias.get(comboCategorias.getSelectedIndex()).getId_categoria());

            daoEstoque.atualizar(estoque);

            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Quantidade não permitida!");
            
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void panelPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPerfilMouseEntered

        panelPerfil.setForeground(new Color(102, 102, 102));
        setCursor(Cursor.HAND_CURSOR);

    }//GEN-LAST:event_panelPerfilMouseEntered

    private void panelPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPerfilMouseExited

        panelPerfil.setForeground(new Color(51, 51, 51));
        setCursor(Cursor.DEFAULT_CURSOR);

    }//GEN-LAST:event_panelPerfilMouseExited

    private void panelFundoPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFundoPerfilMouseClicked

        if (!animacao) {

            animacoesPanel(2, panelInformacoesPerfil, panelFundoPerfil, true);

        }

    }//GEN-LAST:event_panelFundoPerfilMouseClicked

    private void panelPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPerfilMouseClicked

        if (!animacao) {

            panelPerfil.setForeground(new Color(51, 51, 51));
            panelInformacoesPerfil.setVisible(true);
            panelFundoPerfil.setVisible(true);
            setCursor(Cursor.DEFAULT_CURSOR);
            animacoesPanel(1, panelInformacoesPerfil, panelFundoPerfil, false);
            preenchePerfil();

        }

    }//GEN-LAST:event_panelPerfilMouseClicked

    private void panelInformacoesPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInformacoesPerfilMouseClicked

    }//GEN-LAST:event_panelInformacoesPerfilMouseClicked

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        
        btnInicio.setBorder(new LineBorder(Color.white, 1));
        
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        
        btnInicio.setBorder(null);
        
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMouseEntered
        
        btnEstoque.setBorder(new LineBorder(Color.white, 1));
        
    }//GEN-LAST:event_btnEstoqueMouseEntered

    private void btnEstoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMouseExited
        
        btnEstoque.setBorder(null);
        
    }//GEN-LAST:event_btnEstoqueMouseExited

    private void btnRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseEntered
        
        btnRelatorios.setBorder(new LineBorder(Color.white, 1));
        
    }//GEN-LAST:event_btnRelatoriosMouseEntered

    private void btnRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseExited
        
        btnRelatorios.setBorder(null);
        
    }//GEN-LAST:event_btnRelatoriosMouseExited

    private void btnFechaInformacoesPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFechaInformacoesPerfilMouseClicked
        
        if (!animacao) {

            animacoesPanel(2, panelInformacoesPerfil, panelFundoPerfil, true);

        }
        
    }//GEN-LAST:event_btnFechaInformacoesPerfilMouseClicked

    private void btnFechaInformacoesPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFechaInformacoesPerfilMouseEntered
        
        btnFechaInformacoesPerfil.setBackground(Color.white);
        btnFechaInformacoesPerfil.setBorder(new LineBorder(Color.black, 1));
        
    }//GEN-LAST:event_btnFechaInformacoesPerfilMouseEntered

    private void btnFechaInformacoesPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFechaInformacoesPerfilMouseExited
        
        btnFechaInformacoesPerfil.setBackground(new Color(240, 240, 240));
        btnFechaInformacoesPerfil.setBorder(null);
        
    }//GEN-LAST:event_btnFechaInformacoesPerfilMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (inputNomeProduto.getText().isEmpty() || inputDescricaoProduto.getText().isEmpty() || inputValor.getText().isEmpty() || inputValorCusto.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        } else {
            
            Produtos produto = new Produtos();
        
            produto.setNome_produto(inputNomeProduto.getText());
            produto.setDescricao_produto(inputDescricaoProduto.getText());

            daoProduto.cadastrar(produto);
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed

        panelFundoAdicionarProduto.setVisible(true);
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

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

        switch (selecionado) {

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
        atualizaGraficoInicio(1);
        preencherTabela(1);
        listaRelatorios();
        listaNotificacoes();
        progressInicio();
        radioSelecionado();
        listaComboGrafico();
        eventTable();
        eventCombo();
        btnEditarProduto.setVisible(false);
        panelNoti.setVisible(false);
        panelFundoNoti.setVisible(false);
        radio1.setSelected(true);
        panelFundoAdicionarProduto.setVisible(false);
        panelPopProduto.setVisible(false);
        panelFundoPopProdutoSelecionado.setVisible(false);
        panelInformacoesPerfil.setVisible(false);
        panelFundoPerfil.setVisible(false);
        tamanhoOriginal = frame.getSize();
        localizacaoOriginal = frame.getLocation();

        if (GlobalAdmin.getNome() != null) {

            txtBemVindo.setText("Bem vindo, " + GlobalAdmin.getNome());

        }

    }

    private void atualiza(int tela) {

        switch (tela) {

            case 1:
                
                verificaComboGrafico();
                progressInicio();

                break;

            case 2:

                break;

            case 3:

                break;

        }

    }

    private void atualizaGraficoInicio(int escolha) {

        switch (escolha) {

            case 1:

                grafInicio.clear();

                grafInicio.addLegend("Quantidade vendida", Color.blue, Color.blue);
                
                int[] valores = daoCompra.comprasMes();

                grafInicio.addData(new ModelChart("Janeiro", new double[]{valores[0], 0, 50, 50}));
                grafInicio.addData(new ModelChart("Fevereiro", new double[]{valores[1], 0, 100, 190}));
                grafInicio.addData(new ModelChart("Março", new double[]{valores[2], 0, 100, 190}));
                grafInicio.addData(new ModelChart("Abril", new double[]{valores[3], 0, 100, 190}));
                grafInicio.addData(new ModelChart("Maio", new double[]{valores[4], 0, 100, 190}));
                grafInicio.addData(new ModelChart("Junho", new double[]{valores[5], 0, 100, 190}));
                grafInicio.addData(new ModelChart("Julho", new double[]{valores[6], 0, 100, 190}));
                grafInicio.addData(new ModelChart("Agosto", new double[]{valores[7], 0, 100, 190}));
                grafInicio.addData(new ModelChart("Setembro", new double[]{valores[8], 0, 100, 190}));
                grafInicio.addData(new ModelChart("Outubro", new double[]{valores[9], 0, 100, 190}));
                grafInicio.addData(new ModelChart("Novembro", new double[]{valores[10], 0, 100, 190}));
                grafInicio.addData(new ModelChart("Dezembro", new double[]{valores[11], 0, 100, 190}));

                grafInicio.start();
                
                break;

            case 2:

                grafInicio.clear();
                
                grafInicio.addLegend("Lucro", Color.green, Color.green);
                grafInicio.addLegend("Perda", Color.red, Color.red);
                
                grafInicio.addData(new ModelChart("Janeiro", new double[]{200, 0, 50, 50}));
                grafInicio.addData(new ModelChart("Fevereiro", new double[]{200, 0, 100, 190}));
                grafInicio.addData(new ModelChart("Março", new double[]{200, 0, 100, 190}));
                grafInicio.addData(new ModelChart("Abril", new double[]{200, 0, 100, 190}));
                grafInicio.addData(new ModelChart("Maio", new double[]{200, 0, 100, 190}));
                grafInicio.addData(new ModelChart("Junho", new double[]{200, 0, 100, 190}));
                grafInicio.addData(new ModelChart("Julho", new double[]{200, 0, 100, 190}));
                grafInicio.addData(new ModelChart("Agosto", new double[]{200, 0, 100, 190}));
                grafInicio.addData(new ModelChart("Setembro", new double[]{200, 0, 100, 190}));
                grafInicio.addData(new ModelChart("Outubro", new double[]{200, 0, 100, 190}));
                grafInicio.addData(new ModelChart("Novembro", new double[]{200, 0, 100, 190}));
                grafInicio.addData(new ModelChart("Dezembro", new double[]{200, 0, 100, 190}));
                
                grafInicio.start();

                break;

        }

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

    private void animacoesPanel(int escolha, JPanel panel, JPanel fundo, boolean fecha) {

        switch (escolha) {

            case 1:

                animacao = true;

                Timer timer = new Timer(5, new ActionListener() {

                    private int x = panel.getX() - panel.getWidth();
                    private final int xFinal = 0;
                    private int transparencia = 0;

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (x < xFinal) {

                            x += 10;
                            transparencia = transparencia + 5;

                            panel.setLocation(x, panel.getY());

                            if (transparencia < 100) {

                                fundo.setBackground(new Color(0, 0, 0, transparencia));

                            }

                        } else {

                            ((Timer) e.getSource()).stop();
                            animacao = false;

                            if (fecha) {

                                panel.setVisible(false);
                                fundo.setVisible(false);

                            }

                        }

                    }
                });

                timer.start();

                break;

            case 2:

                animacao = true;

                Timer timer2 = new Timer(5, new ActionListener() {

                    private int x = 0;
                    private final int xFinal = panel.getX() - panel.getWidth();
                    private int transparencia = 100;

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (x > xFinal) {

                            x -= 10;
                            transparencia = transparencia - 5;

                            panel.setLocation(x, panel.getY());

                            if (transparencia > 0) {

                                fundo.setBackground(new Color(0, 0, 0, transparencia));

                            }

                        } else {

                            ((Timer) e.getSource()).stop();
                            animacao = false;

                            if (fecha) {

                                panel.setVisible(false);
                                fundo.setVisible(false);

                            }

                        }
                    }
                });

                timer2.start();

                break;

            case 3:

                animacao = true;

                Timer timer3 = new Timer(5, new ActionListener() {

                    private int x = panel.getX() + panel.getWidth();
                    private final int xFinal = panel.getX();
                    private int transparencia = 0;

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (x > xFinal) {

                            x -= 10;
                            transparencia += 5;

                            panel.setLocation(x, panel.getY());

                            if (transparencia < 100) {

                                fundo.setBackground(new Color(0, 0, 0, transparencia));

                            }
                        } else {

                            ((Timer) e.getSource()).stop();
                            animacao = false;

                            if (fecha) {

                                panel.setVisible(false);
                                fundo.setVisible(false);

                            }
                        }
                    }
                });

                timer3.start();

                break;

            case 4:

                animacao = true;

                Timer timer4 = new Timer(5, new ActionListener() {

                    private int x = panel.getX();
                    private final int xFinal = panel.getX() + panelNoti.getWidth();
                    private int transparencia = 100;

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (x < xFinal) {

                            x += 10;
                            transparencia -= 5;

                            panel.setLocation(x, panel.getY());

                            if (transparencia > 0) {

                                fundo.setBackground(new Color(0, 0, 0, transparencia));

                            }
                        } else {

                            ((Timer) e.getSource()).stop();
                            animacao = false;

                            if (fecha) {

                                panel.setVisible(false);
                                fundo.setVisible(false);

                            }
                        }
                    }
                });

                timer4.start();

                break;

        }

    }

    private void preencherTabela(int table) {

        tableModel = (DefaultTableModel) tblEstoque.getModel();
        tableModel.setNumRows(0);

        EstoqueDAO funcoesEstoque = new EstoqueDAO();

        switch (table) {

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

        for (EstoqueBean objEstoque : estoqueTabela) {
            Object[] rowData = {
                objEstoque.getNome_produto(),
                objEstoque.getDescricao_produto(),
                objEstoque.getValor(),
                objEstoque.getValor_custo(),
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
            produtosAtual.setValor_custo(estoqueTabela.get(linha).getValor_custo());

            btnEditarProduto.setVisible(true);

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

        switch (vez) {

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

    private void fechaPopProduto() {

        tblEstoque.clearSelection();
        panelPopProduto.setVisible(false);
        panelFundoPopProdutoSelecionado.setVisible(false);
        btnEditarProduto.setVisible(false);
        resetaProdutoAtual();
        verificaRadio();

    }

    private void resetaProdutoAtual() {

        produtosAtual.setDescricao_categoria("");
        produtosAtual.setDescricao_produto("");
        produtosAtual.setNome_categoria("");
        produtosAtual.setNome_produto("");
        produtosAtual.setValor(0);
        produtosAtual.setDisponivel(0);
        produtosAtual.setFk_id_categoria(0);
        produtosAtual.setId_produto(0);
        produtosAtual.setQuantidade(0);

    }

    private void radioSelecionado() {

        radio1.addActionListener(e -> {

            preencherTabela(1);

        });

        radio2.addActionListener(e -> {

            preencherTabela(2);

        });

        radio3.addActionListener(e -> {

            preencherTabela(3);

        });

    }

    private void verificaRadio() {

        if (radio1.isSelected()) {

            preencherTabela(1);

        }

        if (radio2.isSelected()) {

            preencherTabela(2);

        }

        if (radio3.isSelected()) {

            preencherTabela(3);

        }

    }

    private void alteraQuantidade(int metodo) {

        int valor = Integer.parseInt(edtQuantidade.getText());

        switch (metodo) {

            case 1:

                if (valor > 0) {

                    valor = valor - 1;

                }

                break;

            case 2:

                valor = valor + 1;

                break;

        }

        edtQuantidade.setText(String.valueOf(valor));

    }
    
    private void listaComboGrafico() {
        
        comboGrafico.addItem("Produtos");
        comboGrafico.addItem("Finanças");
        
        comboGrafico.setSelectedIndex(0);
        
    }
    
    private void verificaComboGrafico() {
        
        switch(comboGrafico.getSelectedIndex()) {
            
            case 0:
                
                atualizaGraficoInicio(1);
                
                break;
                
            case 1:
                
                atualizaGraficoInicio(2);
                
                break;
  
        }
        
    }
    
    private void eventCombo() {
        
        comboGrafico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                verificaComboGrafico();
           
            }
        });
        
    }
    
    private void eventTable() {
        
        tblEstoque.getSelectionModel().addListSelectionListener(e -> {

            if (!e.getValueIsAdjusting()) {

                int linhaSelecionada = tblEstoque.getSelectedRow();

                tabelaLinhaSelecionada(linhaSelecionada);

            }

        });
        
    }
    
    private void preenchePerfil() {
        
        inputNome.setText(GlobalAdmin.getNome());
        inputSobrenome.setText(GlobalAdmin.getSobrenome());
        inputCPF.setText(GlobalAdmin.getCpf());
        inputSenha.setText(GlobalAdmin.getSenha());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAdicionarQuantidade;
    private javax.swing.JLabel btnCloseNoti;
    private javax.swing.JLabel btnClosePopProduto;
    private javax.swing.JButton btnDiminuirQuantidade;
    private button.ButtonEditar btnEditarProduto;
    private javax.swing.JPanel btnEstoque;
    private javax.swing.JPanel btnFechaInformacoesPerfil;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnLogout;
    private com.raven.swing.ButtonBadges btnNoti;
    private javax.swing.JPanel btnRelatorios;
    private button.ButtonVerde btn_disp;
    private button.MyButton btn_ind;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboAdicionarProdutoCategoria;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JComboBox<String> comboGrafico;
    private javax.swing.JTextField edtDescricaoProduto;
    private javax.swing.JTextField edtNomeProduto;
    private javax.swing.JTextField edtQuantidade;
    private javax.swing.JTextField edtValorCustoProduto;
    private javax.swing.JTextField edtValorProduto;
    private com.raven.chart.Chart grafInicio;
    private com.raven.avatar.ImageAvatar imageAvatar1;
    private com.raven.avatar.ImageAvatar imageAvatar2;
    private javax.swing.JFormattedTextField inputCPF;
    private javax.swing.JTextField inputDescricaoProduto;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputNomeProduto;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JTextField inputSobrenome;
    private javax.swing.JTextField inputValor;
    private javax.swing.JTextField inputValorCusto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private button.MyButton myButton1;
    private telas.formatos.PanelBorder panelAcimaFrame;
    private javax.swing.JPanel panelAdicionarProduto;
    private telas.formatos.PanelBorder panelBorder6;
    private javax.swing.JPanel panelBtnClosePopProduto;
    private telas.formatos.PanelBorder panelButtons;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelEstoque;
    private javax.swing.JPanel panelFundoAdicionarProduto;
    private javax.swing.JPanel panelFundoCloseNoti;
    private javax.swing.JPanel panelFundoNoti;
    private javax.swing.JPanel panelFundoPerfil;
    private javax.swing.JPanel panelFundoPopProdutoSelecionado;
    private javax.swing.JPanel panelFundoTab;
    private javax.swing.JPanel panelInformacoesPerfil;
    private javax.swing.JPanel panelInicio;
    private telas.formatos.PanelItem panelListRelatorios;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelMax;
    private javax.swing.JPanel panelMin;
    private telas.formatos.PanelBorder panelNav;
    private javax.swing.JPanel panelNoti;
    private telas.formatos.PanelItem panelNotificacoes;
    private telas.formatos.PanelBorder panelPerfil;
    private javax.swing.JPanel panelPopProduto;
    private javax.swing.JPanel panelRelatorios;
    private telas.formatos.PanelBorder panelSubNav;
    private javax.swing.JPanel panelTitulosRelatorios;
    private com.raven.swing.progress.Progress progressDisponivel;
    private com.raven.swing.progress.Progress progressIndisponivel;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JScrollPane scrollRelatorios;
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
    private javax.swing.JLabel txtNomeProduto;
    private javax.swing.JLabel txtNomeProduto1;
    private javax.swing.JLabel txtNomeProduto2;
    private javax.swing.JLabel txtNomeProduto3;
    private javax.swing.JLabel txtNomeProduto4;
    private javax.swing.JLabel txtRelatorios;
    // End of variables declaration//GEN-END:variables

}
