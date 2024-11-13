package telas;

import Globals.GlobalAdmin;
import Globals.GlobalWhats;
import com.raven.chart.ModelChart;
import icons.CriaIcon;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
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
import model.bean.Reservas;
import model.bean.Usuarios;
import model.dao.AdminsDAO;
import model.dao.CategoriasDAO;
import model.dao.ComprasDAO;
import model.dao.EstoqueDAO;
import model.dao.NotificacoesDAO;
import model.dao.ProdutosDAO;
import model.dao.RelatoriosDAO;
import model.dao.ReservasDAO;
import model.dao.UsuariosDAO;
import org.json.JSONException;
import org.json.JSONObject;
import telas.formatos.ItemCategoria;
import telas.formatos.ItemCliente;
import telas.formatos.ItemNotificacao;
import telas.formatos.ItemRelatorio;
import telas.formatos.ItemReserva;

public class Inicio extends javax.swing.JFrame {

    private final JFrame frame = this;
    private DefaultTableModel tableModel;
    private final NotificacoesDAO daoNotificacao = new NotificacoesDAO();
    private final RelatoriosDAO daoRelatorio = new RelatoriosDAO();
    private final ProdutosDAO daoProduto = new ProdutosDAO();
    private final CategoriasDAO daoCategoria = new CategoriasDAO();
    private final EstoqueDAO daoEstoque = new EstoqueDAO();
    private final ComprasDAO daoCompra = new ComprasDAO();
    private final AdminsDAO daoAdmin = new AdminsDAO();
    private final UsuariosDAO daoUsuario = new UsuariosDAO();
    private final ReservasDAO daoReserva = new ReservasDAO();
    private final EstoqueBean produtosAtual = new EstoqueBean();
    private Categorias categoriaAtual = new Categorias();
    private List<Produtos> listaProdutos = new ArrayList();
    private List<EstoqueBean> estoqueTabela = new ArrayList();
    private List<Notificacoes> listaNotificacoes = new ArrayList();
    private List<Relatorios> listaRelatorios = new ArrayList();
    private List<Categorias> listaCategorias = new ArrayList();
    private List<Categorias> listaCategorias2 = new ArrayList();
    private List<Usuarios> listaClientes = new ArrayList();
    private List<Compras> listaCompras = new ArrayList();
    private List<Reservas> listaReservas = new ArrayList();
    private File arquivoSelecionado;
    private static final String CLOUD_NAME = "dh4zkueea";
    private static final String UPLOAD_PRESET = "ml_default";
    private boolean animacao = false;
    private String caminhoImagem = null;
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
        buttonSalvar = new javax.swing.JButton();
        comboAdicionarProdutoCategoria = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        radioDisponivel = new javax.swing.JRadioButton();
        radioIndisponivel = new javax.swing.JRadioButton();
        buttonClosePanelAdicionarProduto = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        txtImagemSelecionada = new javax.swing.JLabel();
        txtImagem = new javax.swing.JLabel();
        panelInformacoesPerfil = new javax.swing.JPanel();
        imageAvatar1 = new com.raven.avatar.ImageAvatar();
        inputNome = new javax.swing.JTextField();
        inputSenha = new javax.swing.JPasswordField();
        btnFechaInformacoesPerfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonSalvarPerfil = new javax.swing.JButton();
        inputEmail = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        checkEdicao = new javax.swing.JCheckBox();
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
        txtImagemProduto = new javax.swing.JLabel();
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
        btnReservas = new javax.swing.JPanel();
        txtReservas = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        txtClientes = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JPanel();
        txtCategorias = new javax.swing.JLabel();
        btnAdicionarADM = new javax.swing.JPanel();
        txtAdicionarADM = new javax.swing.JLabel();
        panelNav = new telas.formatos.PanelBorder();
        panelLogo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelClose = new javax.swing.JPanel();
        txtClose = new javax.swing.JLabel();
        panelMin = new javax.swing.JPanel();
        txtMin = new javax.swing.JLabel();
        txtLogo = new javax.swing.JLabel();
        panelFundoTab = new javax.swing.JPanel();
        tabInicio = new javax.swing.JTabbedPane();
        panelInicio = new javax.swing.JPanel();
        grafInicio = new com.raven.chart.Chart();
        progressDisponivel = new com.raven.swing.progress.Progress();
        jLabel12 = new javax.swing.JLabel();
        progressIndisponivel = new com.raven.swing.progress.Progress();
        jLabel13 = new javax.swing.JLabel();
        panelEstoque = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstoque = new tabledark.TableDark();
        btnAdicionarProduto = new javax.swing.JButton();
        buttonIndisponivel = new button.MyButton();
        buttonDisponivel = new button.ButtonVerde();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        inputPesquisarProduto = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        radio4 = new javax.swing.JRadioButton();
        buttonReativar = new javax.swing.JButton();
        buttonArquivar = new javax.swing.JButton();
        buttonEditarProduto = new javax.swing.JButton();
        panelRelatorios = new javax.swing.JPanel();
        scrollRelatorios = new javax.swing.JScrollPane();
        panelListRelatorios = new telas.formatos.PanelItem();
        panelTitulosRelatorios = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonPesquisarReserva1 = new javax.swing.JButton();
        buttonAtualizarRelatorios = new javax.swing.JButton();
        inputPesquisaRelatorios = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        panelReservas = new javax.swing.JPanel();
        panelTitulosReservas = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        buttonPesquisarReserva = new javax.swing.JButton();
        inputPesquisaReserva = new javax.swing.JTextField();
        txtPesquisaReservas = new javax.swing.JLabel();
        comboMetodoPesquisa = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelItemReservas = new telas.formatos.PanelItem();
        buttonAtualizar = new javax.swing.JButton();
        panelTabClientes = new javax.swing.JPanel();
        panelClientes = new javax.swing.JPanel();
        panelFundoPopCliente = new javax.swing.JPanel();
        panelPopCliente = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        inputMensagem = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        buttonPesquisarCliente = new javax.swing.JButton();
        inputPesquisaCliente = new javax.swing.JTextField();
        buttonAtualizarClientes = new javax.swing.JButton();
        txtPesquisaCliente = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        panelListClientes = new telas.formatos.PanelItem();
        panelTitulosClientes = new javax.swing.JPanel();
        jLabele0 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        buttonAddMensagem = new javax.swing.JButton();
        panelCategorias = new javax.swing.JPanel();
        panelEditarCategoriaFundo = new javax.swing.JPanel();
        panelEditarCategoria = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        inputNomeCategoriaEdit = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        inputDescricaoCategoriaEdit = new javax.swing.JTextField();
        btnSalvarEdicaoCategoria = new javax.swing.JButton();
        panelFundoPopCategoria = new javax.swing.JPanel();
        panelPopCategoria = new telas.formatos.PanelBorder();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        btnCriarCategoria = new javax.swing.JButton();
        inputNomeCategoria = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        inputDescricaoCategoria = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        panelListCategorias = new telas.formatos.PanelItem();
        jPanel3 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        buttonAtualizarCategorias = new javax.swing.JButton();
        buttonPesquisarCategorias = new javax.swing.JButton();
        inputPesquisaCategorias = new javax.swing.JTextField();
        btnAdicionarCategoria = new javax.swing.JButton();
        panelAdicionarADM = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        edtNomeADM = new javax.swing.JTextField();
        edtEmailADM = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        edtSenhaADM = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        edtWhatsappADM = new javax.swing.JFormattedTextField();
        jLabel51 = new javax.swing.JLabel();
        edtDataNascimentoADM = new javax.swing.JFormattedTextField();
        jButton4 = new javax.swing.JButton();
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
        panelFundoAdicionarProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFundoAdicionarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFundoAdicionarProdutoMouseClicked(evt);
            }
        });

        panelAdicionarProduto.setBackground(new java.awt.Color(102, 102, 102));
        panelAdicionarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAdicionarProdutoMouseClicked(evt);
            }
        });
        panelAdicionarProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputValorCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputValorCustoKeyTyped(evt);
            }
        });
        panelAdicionarProduto.add(inputValorCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 169, 34));
        panelAdicionarProduto.add(inputNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 169, 34));
        panelAdicionarProduto.add(inputDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 169, 34));

        inputValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputValorKeyTyped(evt);
            }
        });
        panelAdicionarProduto.add(inputValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 169, 34));

        inputQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputQuantidadeKeyTyped(evt);
            }
        });
        panelAdicionarProduto.add(inputQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 169, 34));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Valor de Custo");
        panelAdicionarProduto.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Valor");
        panelAdicionarProduto.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Descrição do Produto");
        panelAdicionarProduto.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nome do Produto");
        panelAdicionarProduto.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Categoria");
        panelAdicionarProduto.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelAdicionarProduto.add(buttonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 170, 40));

        panelAdicionarProduto.add(comboAdicionarProdutoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 170, 34));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Quantidade");
        panelAdicionarProduto.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        buttonGroup2.add(radioDisponivel);
        radioDisponivel.setForeground(new java.awt.Color(255, 255, 255));
        radioDisponivel.setText("Disponível");
        panelAdicionarProduto.add(radioDisponivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 90, -1));

        buttonGroup2.add(radioIndisponivel);
        radioIndisponivel.setForeground(new java.awt.Color(255, 255, 255));
        radioIndisponivel.setText("Indisponível");
        panelAdicionarProduto.add(radioIndisponivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 90, -1));

        buttonClosePanelAdicionarProduto.setBackground(new java.awt.Color(102, 102, 102));
        buttonClosePanelAdicionarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonClosePanelAdicionarProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonClosePanelAdicionarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonClosePanelAdicionarProdutoMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconClose.png"))); // NOI18N

        javax.swing.GroupLayout buttonClosePanelAdicionarProdutoLayout = new javax.swing.GroupLayout(buttonClosePanelAdicionarProduto);
        buttonClosePanelAdicionarProduto.setLayout(buttonClosePanelAdicionarProdutoLayout);
        buttonClosePanelAdicionarProdutoLayout.setHorizontalGroup(
            buttonClosePanelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        buttonClosePanelAdicionarProdutoLayout.setVerticalGroup(
            buttonClosePanelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelAdicionarProduto.add(buttonClosePanelAdicionarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Adicionar Produto");
        panelAdicionarProduto.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jButton7.setText("Carregar Imagem");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panelAdicionarProduto.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 170, 30));

        txtImagemSelecionada.setForeground(new java.awt.Color(255, 255, 255));
        txtImagemSelecionada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtImagemSelecionada.setText("Nenhuma imagem selecionada");
        panelAdicionarProduto.add(txtImagemSelecionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 170, 20));
        panelAdicionarProduto.add(txtImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 150, 190));

        javax.swing.GroupLayout panelFundoAdicionarProdutoLayout = new javax.swing.GroupLayout(panelFundoAdicionarProduto);
        panelFundoAdicionarProduto.setLayout(panelFundoAdicionarProdutoLayout);
        panelFundoAdicionarProdutoLayout.setHorizontalGroup(
            panelFundoAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFundoAdicionarProdutoLayout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(panelAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelFundoAdicionarProdutoLayout.setVerticalGroup(
            panelFundoAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFundoAdicionarProdutoLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(panelAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
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
        inputNome.setEnabled(false);
        panelInformacoesPerfil.add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 270, 40));

        inputSenha.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        inputSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputSenha.setEnabled(false);
        panelInformacoesPerfil.add(inputSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 270, 40));

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconArrowBack.png"))); // NOI18N

        javax.swing.GroupLayout btnFechaInformacoesPerfilLayout = new javax.swing.GroupLayout(btnFechaInformacoesPerfil);
        btnFechaInformacoesPerfil.setLayout(btnFechaInformacoesPerfilLayout);
        btnFechaInformacoesPerfilLayout.setHorizontalGroup(
            btnFechaInformacoesPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnFechaInformacoesPerfilLayout.setVerticalGroup(
            btnFechaInformacoesPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelInformacoesPerfil.add(btnFechaInformacoesPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 30));

        buttonSalvarPerfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSalvarPerfil.setText("Salvar");
        buttonSalvarPerfil.setEnabled(false);
        buttonSalvarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarPerfilActionPerformed(evt);
            }
        });
        panelInformacoesPerfil.add(buttonSalvarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 270, 40));

        inputEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputEmail.setEnabled(false);
        panelInformacoesPerfil.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 270, 40));

        jLabel25.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("E-mail");
        panelInformacoesPerfil.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel26.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Nome");
        panelInformacoesPerfil.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel27.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Senha");
        panelInformacoesPerfil.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        checkEdicao.setText("Edição");
        panelInformacoesPerfil.add(checkEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 150, 70, -1));

        panelAcimaFrame.add(panelInformacoesPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 310, 550));

        panelFundoPerfil.setBackground(new java.awt.Color(0, 0, 0, 100));
        panelFundoPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFundoPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFundoPerfilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFundoPerfilLayout = new javax.swing.GroupLayout(panelFundoPerfil);
        panelFundoPerfil.setLayout(panelFundoPerfilLayout);
        panelFundoPerfilLayout.setHorizontalGroup(
            panelFundoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1298, Short.MAX_VALUE)
        );
        panelFundoPerfilLayout.setVerticalGroup(
            panelFundoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        panelAcimaFrame.add(panelFundoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1300, 550));

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

        panelNoti.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, 500));

        panelAcimaFrame.add(panelNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, 280, 550));

        panelFundoNoti.setBackground(new java.awt.Color(0, 0, 0, 100));
        panelFundoNoti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFundoNoti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFundoNotiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFundoNotiLayout = new javax.swing.GroupLayout(panelFundoNoti);
        panelFundoNoti.setLayout(panelFundoNotiLayout);
        panelFundoNotiLayout.setHorizontalGroup(
            panelFundoNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1298, Short.MAX_VALUE)
        );
        panelFundoNotiLayout.setVerticalGroup(
            panelFundoNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        panelAcimaFrame.add(panelFundoNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1300, 550));

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
        btnClosePopProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconClose.png"))); // NOI18N
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

        edtValorProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtValorProdutoKeyTyped(evt);
            }
        });
        panelPopProduto.add(edtValorProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 170, 30));

        txtNomeProduto3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeProduto3.setText("Quantidade");
        panelPopProduto.add(txtNomeProduto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        edtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edtQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtQuantidadeKeyTyped(evt);
            }
        });
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

        edtValorCustoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtValorCustoProdutoKeyTyped(evt);
            }
        });
        panelPopProduto.add(edtValorCustoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 170, 30));
        panelPopProduto.add(txtImagemProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 310, 200));

        panelAcimaFrame.add(panelPopProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 970, 420));

        panelFundoPopProdutoSelecionado.setBackground(new java.awt.Color(0, 0, 0, 100));
        panelFundoPopProdutoSelecionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFundoPopProdutoSelecionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFundoPopProdutoSelecionadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFundoPopProdutoSelecionadoLayout = new javax.swing.GroupLayout(panelFundoPopProdutoSelecionado);
        panelFundoPopProdutoSelecionado.setLayout(panelFundoPopProdutoSelecionadoLayout);
        panelFundoPopProdutoSelecionadoLayout.setHorizontalGroup(
            panelFundoPopProdutoSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1298, Short.MAX_VALUE)
        );
        panelFundoPopProdutoSelecionadoLayout.setVerticalGroup(
            panelFundoPopProdutoSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        panelAcimaFrame.add(panelFundoPopProdutoSelecionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1300, 550));

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

        btnReservas.setBackground(new java.awt.Color(51, 51, 51));
        btnReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReservasMouseExited(evt);
            }
        });

        txtReservas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtReservas.setForeground(new java.awt.Color(255, 255, 255));
        txtReservas.setText("Reservas");

        javax.swing.GroupLayout btnReservasLayout = new javax.swing.GroupLayout(btnReservas);
        btnReservas.setLayout(btnReservasLayout);
        btnReservasLayout.setHorizontalGroup(
            btnReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnReservasLayout.setVerticalGroup(
            btnReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelButtons.add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 290, 40));

        btnClientes.setBackground(new java.awt.Color(51, 51, 51));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });

        txtClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtClientes.setForeground(new java.awt.Color(255, 255, 255));
        txtClientes.setText("Clientes");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelButtons.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 40));

        btnCategorias.setBackground(new java.awt.Color(51, 51, 51));
        btnCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseExited(evt);
            }
        });

        txtCategorias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCategorias.setForeground(new java.awt.Color(255, 255, 255));
        txtCategorias.setText("Categorias");

        javax.swing.GroupLayout btnCategoriasLayout = new javax.swing.GroupLayout(btnCategorias);
        btnCategorias.setLayout(btnCategoriasLayout);
        btnCategoriasLayout.setHorizontalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCategoriasLayout.setVerticalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelButtons.add(btnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 40));

        btnAdicionarADM.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionarADM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarADMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarADMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarADMMouseExited(evt);
            }
        });

        txtAdicionarADM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAdicionarADM.setForeground(new java.awt.Color(255, 255, 255));
        txtAdicionarADM.setText("Adicionar ADM");

        javax.swing.GroupLayout btnAdicionarADMLayout = new javax.swing.GroupLayout(btnAdicionarADM);
        btnAdicionarADM.setLayout(btnAdicionarADMLayout);
        btnAdicionarADMLayout.setHorizontalGroup(
            btnAdicionarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAdicionarADMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAdicionarADM, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAdicionarADMLayout.setVerticalGroup(
            btnAdicionarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAdicionarADM, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelButtons.add(btnAdicionarADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 290, 40));

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

        panelNav.add(panelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, 40, 30));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMinLayout.setVerticalGroup(
            panelMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelNav.add(panelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 40, 30));

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

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grafInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE))
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(progressDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressIndisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressIndisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grafInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );

        tabInicio.addTab("tab1", panelInicio);

        panelEstoque.setBackground(new java.awt.Color(51, 51, 51));

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

        btnAdicionarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconAdd.png"))); // NOI18N
        btnAdicionarProduto.setText("Adicionar Produto");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        buttonIndisponivel.setText("Tornar Indisponível");
        buttonIndisponivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonIndisponivel.setPreferredSize(new java.awt.Dimension(170, 50));
        buttonIndisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIndisponivelActionPerformed(evt);
            }
        });

        buttonDisponivel.setText("Tornar Disponível");
        buttonDisponivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonDisponivel.setPreferredSize(new java.awt.Dimension(170, 50));
        buttonDisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDisponivelActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio1);
        radio1.setForeground(new java.awt.Color(255, 255, 255));
        radio1.setText("Todos Produtos");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio2);
        radio2.setForeground(new java.awt.Color(255, 255, 255));
        radio2.setText("Disponíveis");
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio3);
        radio3.setForeground(new java.awt.Color(255, 255, 255));
        radio3.setText("Indisponíveis");

        inputPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputPesquisarProdutoKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Pesquisar produto");

        buttonGroup1.add(radio4);
        radio4.setForeground(new java.awt.Color(255, 255, 255));
        radio4.setText("Arquivados");

        buttonReativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconRestore.png"))); // NOI18N
        buttonReativar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonReativarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonReativarMouseExited(evt);
            }
        });
        buttonReativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReativarActionPerformed(evt);
            }
        });

        buttonArquivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconArchive.png"))); // NOI18N
        buttonArquivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonArquivarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonArquivarMouseExited(evt);
            }
        });
        buttonArquivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonArquivarActionPerformed(evt);
            }
        });

        buttonEditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconEdit.png"))); // NOI18N
        buttonEditarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEditarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEditarProdutoMouseExited(evt);
            }
        });
        buttonEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstoqueLayout = new javax.swing.GroupLayout(panelEstoque);
        panelEstoque.setLayout(panelEstoqueLayout);
        panelEstoqueLayout.setHorizontalGroup(
            panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEstoqueLayout.createSequentialGroup()
                        .addComponent(radio1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstoqueLayout.createSequentialGroup()
                        .addGroup(panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPesquisarProduto)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonArquivar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonReativar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonIndisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panelEstoqueLayout.setVerticalGroup(
            panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelEstoqueLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(buttonIndisponivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEstoqueLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(8, 8, 8)
                        .addComponent(inputPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonReativar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonArquivar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio1)
                    .addComponent(radio2)
                    .addComponent(radio3)
                    .addComponent(radio4))
                .addContainerGap(360, Short.MAX_VALUE))
        );

        tabInicio.addTab("tab2", panelEstoque);

        panelRelatorios.setBackground(new java.awt.Color(51, 51, 51));
        panelRelatorios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollRelatorios.setBorder(null);
        scrollRelatorios.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollRelatorios.setViewportView(panelListRelatorios);

        panelRelatorios.add(scrollRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, 960, 300));

        panelTitulosRelatorios.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pessoa");
        panelTitulosRelatorios.add(jLabel5);

        jLabel23.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Observação");
        panelTitulosRelatorios.add(jLabel23);

        jLabel9.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Data");
        panelTitulosRelatorios.add(jLabel9);

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Horário");
        panelTitulosRelatorios.add(jLabel7);

        jLabel10.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Quantidade");
        panelTitulosRelatorios.add(jLabel10);

        jLabel8.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Valor Total");
        panelTitulosRelatorios.add(jLabel8);

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Produtos");
        panelTitulosRelatorios.add(jLabel6);

        panelRelatorios.add(panelTitulosRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, 960, 47));

        buttonPesquisarReserva1.setBackground(new java.awt.Color(204, 204, 204));
        buttonPesquisarReserva1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconSearch.png"))); // NOI18N
        buttonPesquisarReserva1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPesquisarReserva1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPesquisarReserva1MouseExited(evt);
            }
        });
        buttonPesquisarReserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarReserva1ActionPerformed(evt);
            }
        });
        panelRelatorios.add(buttonPesquisarReserva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 40, 40));

        buttonAtualizarRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconRefresh.png"))); // NOI18N
        buttonAtualizarRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarRelatoriosActionPerformed(evt);
            }
        });
        panelRelatorios.add(buttonAtualizarRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 40));

        inputPesquisaRelatorios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputPesquisaRelatorios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputPesquisaRelatoriosKeyTyped(evt);
            }
        });
        panelRelatorios.add(inputPesquisaRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 910, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Relatórios");
        panelRelatorios.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 960, 20));

        tabInicio.addTab("tab3", panelRelatorios);

        panelReservas.setBackground(new java.awt.Color(51, 51, 51));
        panelReservas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulosReservas.setLayout(new java.awt.GridLayout(1, 0));

        jLabel29.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Pessoa");
        panelTitulosReservas.add(jLabel29);

        jLabel30.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Observação");
        panelTitulosReservas.add(jLabel30);

        jLabel31.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Data");
        panelTitulosReservas.add(jLabel31);

        jLabel32.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Horário");
        panelTitulosReservas.add(jLabel32);

        jLabel33.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Quantidade");
        panelTitulosReservas.add(jLabel33);

        jLabel34.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Valor Total");
        panelTitulosReservas.add(jLabel34);

        jLabel35.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Produtos");
        panelTitulosReservas.add(jLabel35);

        panelReservas.add(panelTitulosReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 960, 50));

        buttonPesquisarReserva.setBackground(new java.awt.Color(204, 204, 204));
        buttonPesquisarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconSearch.png"))); // NOI18N
        buttonPesquisarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPesquisarReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPesquisarReservaMouseExited(evt);
            }
        });
        buttonPesquisarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarReservaActionPerformed(evt);
            }
        });
        panelReservas.add(buttonPesquisarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 40, 40));

        inputPesquisaReserva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputPesquisaReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputPesquisaReservaKeyTyped(evt);
            }
        });
        panelReservas.add(inputPesquisaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 760, 40));

        txtPesquisaReservas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPesquisaReservas.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisaReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPesquisaReservas.setText("Pesquisar código");
        panelReservas.add(txtPesquisaReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 20));

        panelReservas.add(comboMetodoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 140, 40));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportView(panelItemReservas);

        panelReservas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 960, 300));

        buttonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconRefresh.png"))); // NOI18N
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });
        panelReservas.add(buttonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 40));

        tabInicio.addTab("tab4", panelReservas);

        panelClientes.setBackground(new java.awt.Color(51, 51, 51));
        panelClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFundoPopCliente.setOpaque(false);
        panelFundoPopCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFundoPopClienteMouseClicked(evt);
            }
        });

        panelPopCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelPopCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPopClienteMouseClicked(evt);
            }
        });

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        inputMensagem.setColumns(20);
        inputMensagem.setRows(5);
        inputMensagem.setText("Digite sua mensagem...");
        inputMensagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputMensagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputMensagemFocusGained(evt);
            }
        });
        jScrollPane5.setViewportView(inputMensagem);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Salvar Mensagem");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconClose.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Aba WhatsApp");

        javax.swing.GroupLayout panelPopClienteLayout = new javax.swing.GroupLayout(panelPopCliente);
        panelPopCliente.setLayout(panelPopClienteLayout);
        panelPopClienteLayout.setHorizontalGroup(
            panelPopClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPopClienteLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelPopClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPopClienteLayout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPopClienteLayout.createSequentialGroup()
                        .addGroup(panelPopClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        panelPopClienteLayout.setVerticalGroup(
            panelPopClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPopClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPopClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFundoPopClienteLayout = new javax.swing.GroupLayout(panelFundoPopCliente);
        panelFundoPopCliente.setLayout(panelFundoPopClienteLayout);
        panelFundoPopClienteLayout.setHorizontalGroup(
            panelFundoPopClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFundoPopClienteLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(panelPopCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFundoPopClienteLayout.setVerticalGroup(
            panelFundoPopClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFundoPopClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPopCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );

        panelClientes.add(panelFundoPopCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 820));

        buttonPesquisarCliente.setBackground(new java.awt.Color(204, 204, 204));
        buttonPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconSearch.png"))); // NOI18N
        buttonPesquisarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPesquisarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPesquisarClienteMouseExited(evt);
            }
        });
        buttonPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarClienteActionPerformed(evt);
            }
        });
        panelClientes.add(buttonPesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 40, 40));

        inputPesquisaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputPesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputPesquisaClienteKeyTyped(evt);
            }
        });
        panelClientes.add(inputPesquisaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 650, 40));

        buttonAtualizarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconRefresh.png"))); // NOI18N
        buttonAtualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarClientesActionPerformed(evt);
            }
        });
        panelClientes.add(buttonAtualizarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 40));

        txtPesquisaCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPesquisaCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisaCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPesquisaCliente.setText("Pesquisar Cliente");
        panelClientes.add(txtPesquisaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 20));

        jScrollPane4.setViewportView(panelListClientes);

        panelClientes.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 960, 300));

        panelTitulosClientes.setLayout(new java.awt.GridLayout(1, 0));

        jLabele0.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabele0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabele0.setText("Nome");
        panelTitulosClientes.add(jLabele0);

        jLabel11.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("E-mail");
        panelTitulosClientes.add(jLabel11);

        jLabel36.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("WhatsApp");
        panelTitulosClientes.add(jLabel36);

        jLabel37.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Ação");
        panelTitulosClientes.add(jLabel37);

        panelClientes.add(panelTitulosClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 960, 50));

        buttonAddMensagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAddMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconAdd.png"))); // NOI18N
        buttonAddMensagem.setText("Adicionar Mensagem");
        buttonAddMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddMensagemActionPerformed(evt);
            }
        });
        panelClientes.add(buttonAddMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 250, 40));

        javax.swing.GroupLayout panelTabClientesLayout = new javax.swing.GroupLayout(panelTabClientes);
        panelTabClientes.setLayout(panelTabClientesLayout);
        panelTabClientesLayout.setHorizontalGroup(
            panelTabClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTabClientesLayout.setVerticalGroup(
            panelTabClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabInicio.addTab("tab5", panelTabClientes);

        panelCategorias.setBackground(new java.awt.Color(51, 51, 51));
        panelCategorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEditarCategoriaFundo.setOpaque(false);
        panelEditarCategoriaFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEditarCategoriaFundoMouseClicked(evt);
            }
        });

        panelEditarCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconClose.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelEditarCategoria.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 0, 40, 30));
        panelEditarCategoria.add(inputNomeCategoriaEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, 40));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Nome categoria");
        panelEditarCategoria.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Descrição Categoria");
        panelEditarCategoria.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        panelEditarCategoria.add(inputDescricaoCategoriaEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 250, 40));

        btnSalvarEdicaoCategoria.setText("Salvar");
        btnSalvarEdicaoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEdicaoCategoriaActionPerformed(evt);
            }
        });
        panelEditarCategoria.add(btnSalvarEdicaoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 250, 40));

        javax.swing.GroupLayout panelEditarCategoriaFundoLayout = new javax.swing.GroupLayout(panelEditarCategoriaFundo);
        panelEditarCategoriaFundo.setLayout(panelEditarCategoriaFundoLayout);
        panelEditarCategoriaFundoLayout.setHorizontalGroup(
            panelEditarCategoriaFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarCategoriaFundoLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(panelEditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        panelEditarCategoriaFundoLayout.setVerticalGroup(
            panelEditarCategoriaFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarCategoriaFundoLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(panelEditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        panelCategorias.add(panelEditarCategoriaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1050, 850));

        panelFundoPopCategoria.setOpaque(false);
        panelFundoPopCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFundoPopCategoriaMouseClicked(evt);
            }
        });

        panelPopCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPopCategoria.setForeground(new java.awt.Color(255, 255, 255));
        panelPopCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconClose.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelPopCategoria.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 30, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Adicionar Categoria");
        panelPopCategoria.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, -1));

        btnCriarCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCriarCategoria.setText("Adicionar");
        btnCriarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarCategoriaActionPerformed(evt);
            }
        });
        panelPopCategoria.add(btnCriarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 310, 50));
        panelPopCategoria.add(inputNomeCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 310, 40));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Descrição");
        panelPopCategoria.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        inputDescricaoCategoria.setColumns(20);
        inputDescricaoCategoria.setRows(5);
        jScrollPane7.setViewportView(inputDescricaoCategoria);

        panelPopCategoria.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 310, 110));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Nome");
        panelPopCategoria.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        javax.swing.GroupLayout panelFundoPopCategoriaLayout = new javax.swing.GroupLayout(panelFundoPopCategoria);
        panelFundoPopCategoria.setLayout(panelFundoPopCategoriaLayout);
        panelFundoPopCategoriaLayout.setHorizontalGroup(
            panelFundoPopCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFundoPopCategoriaLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(panelPopCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFundoPopCategoriaLayout.setVerticalGroup(
            panelFundoPopCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFundoPopCategoriaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelPopCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        panelCategorias.add(panelFundoPopCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 820));

        jScrollPane6.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane6.setViewportView(panelListCategorias);

        panelCategorias.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 960, 300));

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel39.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Nome");
        jPanel3.add(jLabel39);

        jLabel40.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Descrição");
        jPanel3.add(jLabel40);

        jLabel41.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 15)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Ações");
        jPanel3.add(jLabel41);

        panelCategorias.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 960, 50));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Categorias");
        panelCategorias.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, -1));

        buttonAtualizarCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconRefresh.png"))); // NOI18N
        buttonAtualizarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarCategoriasActionPerformed(evt);
            }
        });
        panelCategorias.add(buttonAtualizarCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 40));

        buttonPesquisarCategorias.setBackground(new java.awt.Color(204, 204, 204));
        buttonPesquisarCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconSearch.png"))); // NOI18N
        buttonPesquisarCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPesquisarCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPesquisarCategoriasMouseExited(evt);
            }
        });
        buttonPesquisarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarCategoriasActionPerformed(evt);
            }
        });
        panelCategorias.add(buttonPesquisarCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 40, 40));

        inputPesquisaCategorias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputPesquisaCategorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputPesquisaCategoriasKeyTyped(evt);
            }
        });
        panelCategorias.add(inputPesquisaCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 650, 40));

        btnAdicionarCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdicionarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconAdd.png"))); // NOI18N
        btnAdicionarCategoria.setText("Adicionar Categoria");
        btnAdicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCategoriaActionPerformed(evt);
            }
        });
        panelCategorias.add(btnAdicionarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 250, 40));

        tabInicio.addTab("tab6", panelCategorias);

        panelAdicionarADM.setBackground(new java.awt.Color(51, 51, 51));
        panelAdicionarADM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Adicionar ADM");
        panelAdicionarADM.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1020, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Nome");
        panelAdicionarADM.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 220, -1));
        panelAdicionarADM.add(edtNomeADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 218, 32));
        panelAdicionarADM.add(edtEmailADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 218, 32));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("E-mail");
        panelAdicionarADM.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 220, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Senha");
        panelAdicionarADM.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 220, -1));
        panelAdicionarADM.add(edtSenhaADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 218, 32));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Data Nascimento");
        panelAdicionarADM.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 220, -1));

        try {
            edtWhatsappADM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+## ## ####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelAdicionarADM.add(edtWhatsappADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 218, 32));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Whatsapp");
        panelAdicionarADM.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 220, -1));

        try {
            edtDataNascimentoADM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelAdicionarADM.add(edtDataNascimentoADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 218, 32));

        jButton4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jButton4.setText("Salvar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelAdicionarADM.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 220, 40));

        tabInicio.addTab("tab7", panelAdicionarADM);

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

    private void tblEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseEntered

    }//GEN-LAST:event_tblEstoqueMouseEntered

    private void panelNotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNotiMouseClicked


    }//GEN-LAST:event_panelNotiMouseClicked

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed


    }//GEN-LAST:event_radio1ActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed


    }//GEN-LAST:event_radio2ActionPerformed

    private void buttonDisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDisponivelActionPerformed

        if (produtosAtual.getId_produto() > 0) {

            int escolha = JOptionPane.showConfirmDialog(null, "Disponibilizar produto: " + produtosAtual.getNome_produto(), "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if (escolha == JOptionPane.YES_OPTION) {
                
                daoEstoque.produtoDisponível(produtosAtual, true);
                preencherTabela(3, null);
                resetaProdutoAtual();
                
            }
            
        }
        
    }//GEN-LAST:event_buttonDisponivelActionPerformed

    private void buttonIndisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndisponivelActionPerformed

        if (produtosAtual.getId_produto() > 0) {

            int escolha = JOptionPane.showConfirmDialog(null, "Indisponibilizar produto: " + produtosAtual.getNome_produto(), "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if(escolha == JOptionPane.YES_OPTION) {
                
                daoEstoque.produtoDisponível(produtosAtual, false);
                preencherTabela(2, null);
                
            }
            
        }     
        
    }//GEN-LAST:event_buttonIndisponivelActionPerformed

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

        if (edtNomeProduto.getText().trim().isEmpty() || edtDescricaoProduto.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Campos Nome/Descrição, não podem estar vazio!");
            
        } else {
            
            if (Integer.parseInt(edtQuantidade.getText()) >= 0) {
            
                int escolha = JOptionPane.showConfirmDialog(null, "Confirmar edição?", "Confirmar", JOptionPane.YES_NO_OPTION);
            
                if (escolha == JOptionPane.YES_OPTION) {
                
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
                
                }
            
            } else {
            
                JOptionPane.showMessageDialog(null, "Quantidade não permitida!");
            
            }
            
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

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        
        String nome = inputNomeProduto.getText().trim();
        String descricao = inputDescricaoProduto.getText().trim();
        String valor = inputValor.getText().trim();
        String quantidade = inputQuantidade.getText().trim();
        String valorCusto = inputValorCusto.getText().trim();
        
        if (nome.isEmpty() || descricao.isEmpty() || valor.isEmpty() || quantidade.isEmpty() || valorCusto.isEmpty() || !radioDisponivel.isSelected() && !radioIndisponivel.isSelected()) {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        } else {
            
            Produtos produto = new Produtos();
        
            if (arquivoSelecionado != null) {
                
                    try {
                        enviarImagem(arquivoSelecionado);
                    } catch (JSONException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao enviar imagem: " + ex.getMessage());
                    } catch (IOException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                } else {
                
                    JOptionPane.showMessageDialog(null, "Por favor, selecione uma imagem.");
                }
            
            produto.setNome_produto(nome);
            produto.setDescricao_produto(descricao);
            produto.setValor(Float.parseFloat(valor));
            produto.setValor_custo(Float.parseFloat(valorCusto));
            produto.setQuantidade(Integer.parseInt(quantidade));
            produto.setImagem(caminhoImagem);
            caminhoImagem = null;

            int disponibilidade = 0;
            
            if (radioDisponivel.isSelected()) {
                
                disponibilidade = 1;
                
            } else {
                
                disponibilidade = 0;
                
            }
            
            produto.setDisponivel(disponibilidade);
            produto.setFk_id_categoria(listaCategorias.get(comboAdicionarProdutoCategoria.getSelectedIndex()).getId_categoria());

            daoProduto.cadastrar(produto);
            resetaCamposAdicionarProduto();
            
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
            
            txtImagem.setIcon(null);
            txtImagemSelecionada.setText("Nenhuma imagem selecionada");
 
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void enviarImagem(File imagem) throws IOException, JSONException {
        
        String url = "https://api.cloudinary.com/v1_1/" + CLOUD_NAME + "/image/upload";
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        String boundary = "----WebKitFormBoundary7MA4YWxkTrZu0gW";
        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

        DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
        outputStream.writeBytes("--" + boundary + "\r\n");
        outputStream.writeBytes("Content-Disposition: form-data; name=\"file\"; filename=\"" + imagem.getName() + "\"\r\n");
        outputStream.writeBytes("Content-Type: " + URLConnection.guessContentTypeFromName(imagem.getName()) + "\r\n");
        outputStream.writeBytes("\r\n");

        FileInputStream fileInputStream = new FileInputStream(imagem);
        byte[] buffer = new byte[4096];
        int bytesRead;
        
        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
            
            outputStream.write(buffer, 0, bytesRead);
        }
        
        outputStream.writeBytes("\r\n");

        outputStream.writeBytes("--" + boundary + "\r\n");
        outputStream.writeBytes("Content-Disposition: form-data; name=\"upload_preset\"\r\n\r\n");
        outputStream.writeBytes(UPLOAD_PRESET + "\r\n");
        outputStream.writeBytes("--" + boundary + "--\r\n");

        fileInputStream.close();
        outputStream.flush();
        outputStream.close();

        int responseCode = connection.getResponseCode();
        
        if (responseCode == HttpURLConnection.HTTP_OK) {
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            reader.close();

            JSONObject jsonResponse = new JSONObject(response.toString());
            String imageUrl = jsonResponse.getString("secure_url");
            JOptionPane.showMessageDialog(null, "Imagem enviada com sucesso!\nURL: " + imageUrl);

            caminhoImagem = imageUrl;
            
            mostrarImagem(imageUrl);
            
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao enviar a imagem. Código de resposta: " + responseCode);
        }
    }
    
    private void mostrarImagem(String imageUrl) {
        
        ImageIcon icon = new CriaIcon().criaIcon(imageUrl);
        txtImagem.setIcon(icon);
        
    }
    
    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed

        abrePopAdicionarProduto();
        
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void panelFundoAdicionarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFundoAdicionarProdutoMouseClicked
        
        fechaPopAdicionarProduto();
        
    }//GEN-LAST:event_panelFundoAdicionarProdutoMouseClicked

    private void buttonClosePanelAdicionarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClosePanelAdicionarProdutoMouseClicked
        
        fechaPopAdicionarProduto();
        
    }//GEN-LAST:event_buttonClosePanelAdicionarProdutoMouseClicked

    private void buttonClosePanelAdicionarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClosePanelAdicionarProdutoMouseEntered
        
        buttonClosePanelAdicionarProduto.setBackground(new Color(240, 240, 240));
        
    }//GEN-LAST:event_buttonClosePanelAdicionarProdutoMouseEntered

    private void buttonClosePanelAdicionarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClosePanelAdicionarProdutoMouseExited
        
        buttonClosePanelAdicionarProduto.setBackground(new Color(102,102,102));
        
    }//GEN-LAST:event_buttonClosePanelAdicionarProdutoMouseExited

    private void panelAdicionarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAdicionarProdutoMouseClicked

    }//GEN-LAST:event_panelAdicionarProdutoMouseClicked

    private void buttonSalvarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarPerfilActionPerformed
        
        String nome = inputNome.getText().trim();
        String email = inputEmail.getText().trim();
        String senha = inputSenha.getText().trim();
        
        if (nome.equals(GlobalAdmin.getNome()) && email.equals(GlobalAdmin.getEmail()) && senha.equals(GlobalAdmin.getSenha())) {
  
            JOptionPane.showMessageDialog(null, "Nenhuma alteração feita!");
            
        } else {
 
                if (!senha.equals(GlobalAdmin.getSenha())) {
                    
                    String confirma;
                    
                    confirma = JOptionPane.showInputDialog("Confirme a senha atual");
                    
                    if (confirma == null) {
                        
                        inputNome.setText(GlobalAdmin.getNome());
                        inputEmail.setText(GlobalAdmin.getEmail());
                        inputSenha.setText(GlobalAdmin.getSenha());
                        
                    } else {
                        
                        if (confirma.equals(GlobalAdmin.getSenha())) {  
                        
                            int resposta = JOptionPane.showConfirmDialog(null, "Salvar as alterações?", "Confirmar", JOptionPane.YES_NO_OPTION);

                            if (resposta == JOptionPane.YES_OPTION) {
            
                                Usuarios usuario = new Usuarios(0, nome, email, senha, null, null, 0);
            
                                daoAdmin.atualizarPerfil(usuario);
            
                                GlobalAdmin.setEmail(email);
                                GlobalAdmin.setNome(nome);
                                GlobalAdmin.setSenha(senha);
            
                                txtBemVindo.setText("Bem vindo, " + GlobalAdmin.getNome());
            
                                JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
            
                                listarNotificacoes();
                                
                                }   
                        
                        } else {
                        
                            JOptionPane.showMessageDialog(null, "Senha incorreta!");
                        
                        }
                        
                    }
 
                } else {
                    
                    if(!nome.equals(GlobalAdmin.getNome()) || !email.equals(GlobalAdmin.getEmail())) {
                        
                        Usuarios usuario = new Usuarios(0, nome, email, GlobalAdmin.getSenha(), null, null, 0);
            
                        daoAdmin.atualizarPerfil(usuario);
            
                        GlobalAdmin.setEmail(email);
                        GlobalAdmin.setNome(nome);
                        GlobalAdmin.setSenha(senha);

                        txtBemVindo.setText("Bem vindo, " + GlobalAdmin.getNome());
            
                        JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
                        
                        listarNotificacoes();
                        
                    }
                    
                }
            
            }
        
    }//GEN-LAST:event_buttonSalvarPerfilActionPerformed

    private void edtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtQuantidadeKeyTyped

        char letra = evt.getKeyChar();
        
        if (!Character.isDigit(letra)) {
            evt.consume();
        }
        
        String quantidadeTexto = edtQuantidade.getText().trim();

        if (quantidadeTexto == null || quantidadeTexto.isEmpty()) {
            
            edtQuantidade.setText("0");
            
        }


    }//GEN-LAST:event_edtQuantidadeKeyTyped

    private void edtValorCustoProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtValorCustoProdutoKeyTyped
        
        char letra = evt.getKeyChar();

        if (!Character.isDigit(letra) && letra != '.') {
            evt.consume(); 
        }
        
        String quantidadeTexto = edtValorCustoProduto.getText().trim();

        if (quantidadeTexto == null || quantidadeTexto.isEmpty()) {
            
            edtValorCustoProduto.setText("0");
            
        }
        
    }//GEN-LAST:event_edtValorCustoProdutoKeyTyped

    private void edtValorProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtValorProdutoKeyTyped
        
        char letra = evt.getKeyChar();

        if (!Character.isDigit(letra) && letra != '.') {
            evt.consume(); 
        }
        
        String quantidadeTexto = edtValorProduto.getText().trim();

        if (quantidadeTexto == null || quantidadeTexto.isEmpty()) {
            
            edtValorProduto.setText("0");
            
        }
        
    }//GEN-LAST:event_edtValorProdutoKeyTyped

    private void inputPesquisarProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPesquisarProdutoKeyTyped
        
        String produto = inputPesquisarProduto.getText().trim();
        
        if (radio1.isSelected()) {
            
            preencherTabela(4, produto);
            
        }
        
        if (radio2.isSelected()) {
            
            preencherTabela(5, produto);
            
        }
        
        if (radio3.isSelected()) {
            
            preencherTabela(6, produto);
            
        }
        
        if (radio4.isSelected()) {
            
            preencherTabela(8, produto);
            
        }
        
    }//GEN-LAST:event_inputPesquisarProdutoKeyTyped

    private void btnReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasMouseClicked
        
        trocaTab(4);
        
    }//GEN-LAST:event_btnReservasMouseClicked

    private void btnReservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasMouseEntered
        
        btnReservas.setBorder(new LineBorder(Color.white, 1));
        
    }//GEN-LAST:event_btnReservasMouseEntered

    private void btnReservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasMouseExited
        
        btnReservas.setBorder(null);
        
    }//GEN-LAST:event_btnReservasMouseExited

    private void buttonReativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReativarActionPerformed
        
        int escolha = JOptionPane.showConfirmDialog(null, "Reativar produto: " + produtosAtual.getNome_produto(), "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (escolha == JOptionPane.YES_OPTION) {
            
            daoEstoque.reativarProduto(produtosAtual);
            verificaRadio();
            resetaProdutoAtual();
            
        }
        
    }//GEN-LAST:event_buttonReativarActionPerformed

    private void buttonReativarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReativarMouseEntered
        
        buttonReativar.setBackground(new Color(51, 204, 0));
        
    }//GEN-LAST:event_buttonReativarMouseEntered

    private void buttonReativarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReativarMouseExited
        
        buttonReativar.setBackground(new Color(240, 240, 240));
        
    }//GEN-LAST:event_buttonReativarMouseExited

    private void buttonArquivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonArquivarActionPerformed
        
        int escolha = JOptionPane.showConfirmDialog(null, "Arquivar este produto: " + produtosAtual.getNome_produto(), "Confirmação", JOptionPane.YES_NO_OPTION);

        if (escolha == JOptionPane.YES_OPTION) {
            
            daoEstoque.arquivarProduto(produtosAtual);
            verificaRadio();
            resetaProdutoAtual();
            
        }
        
    }//GEN-LAST:event_buttonArquivarActionPerformed

    private void buttonEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarProdutoActionPerformed
        
        if (produtosAtual.getId_produto() > 0) {

            buttonEditarProduto.setVisible(false);
            buttonArquivar.setVisible(false);
            buttonReativar.setVisible(false);
            inputPesquisarProduto.setVisible(false);
            panelFundoPopProdutoSelecionado.setVisible(true);
            panelPopProduto.setVisible(true);

            edtNomeProduto.setText(produtosAtual.getNome_produto());
            edtDescricaoProduto.setText(produtosAtual.getDescricao_produto());
            edtQuantidade.setText(String.valueOf(produtosAtual.getQuantidade()));
            edtValorProduto.setText(String.valueOf(produtosAtual.getValor()));
            edtValorCustoProduto.setText(String.valueOf(produtosAtual.getValor_custo()));
            
            String imagem = produtosAtual.getImagem();
            
            if (imagem != null && !imagem.isEmpty() && !imagem.equals("null")) {
                
                txtImagemProduto.setIcon(new CriaIcon().criaIcon(imagem));
            
            }

            listaCategorias = daoCategoria.listar(1, null);

            comboCategorias.removeAllItems();

            for (int i = 0; i < listaCategorias.size(); i++) {

                comboCategorias.addItem(listaCategorias.get(i).getNome());

                if (listaCategorias.get(i).getNome().equals(produtosAtual.getNome_categoria())) {

                    comboCategorias.setSelectedIndex(i);

                }

            }

        }
        
    }//GEN-LAST:event_buttonEditarProdutoActionPerformed

    private void buttonArquivarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArquivarMouseEntered
        
        buttonArquivar.setBackground(new Color(255, 0, 0));
        
    }//GEN-LAST:event_buttonArquivarMouseEntered

    private void buttonArquivarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArquivarMouseExited
        
        buttonArquivar.setBackground(new Color(240, 240, 240));
        
    }//GEN-LAST:event_buttonArquivarMouseExited

    private void buttonEditarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarProdutoMouseEntered
        
        buttonEditarProduto.setBackground(new Color(255, 153, 0));
        
    }//GEN-LAST:event_buttonEditarProdutoMouseEntered

    private void buttonEditarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarProdutoMouseExited
        
        buttonEditarProduto.setBackground(new Color(240, 240, 240));
        
    }//GEN-LAST:event_buttonEditarProdutoMouseExited

    private void inputPesquisaReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPesquisaReservaKeyTyped
      
        pesquisaReserva();
        
    }//GEN-LAST:event_inputPesquisaReservaKeyTyped

    private void buttonPesquisarReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarReservaMouseEntered

    }//GEN-LAST:event_buttonPesquisarReservaMouseEntered

    private void buttonPesquisarReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarReservaMouseExited

    }//GEN-LAST:event_buttonPesquisarReservaMouseExited

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed
        
        
        inputPesquisaReserva.setText("");
        listarReservas(1, null);
        
    }//GEN-LAST:event_buttonAtualizarActionPerformed

    private void buttonPesquisarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarReservaActionPerformed
        
        pesquisaReserva();
        
    }//GEN-LAST:event_buttonPesquisarReservaActionPerformed

    private void inputValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputValorKeyTyped
        
        char letra = evt.getKeyChar();

        if (!Character.isDigit(letra) && letra != '.') {
            evt.consume(); 
        }
        
    }//GEN-LAST:event_inputValorKeyTyped

    private void inputValorCustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputValorCustoKeyTyped
       
        char letra = evt.getKeyChar();

        if (!Character.isDigit(letra) && letra != '.') {
            evt.consume(); 
        }
        
    }//GEN-LAST:event_inputValorCustoKeyTyped

    private void inputQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputQuantidadeKeyTyped
        
        char letra = evt.getKeyChar();

        if (!Character.isDigit(letra)) {
            evt.consume(); 
        }
        
    }//GEN-LAST:event_inputQuantidadeKeyTyped

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked

        trocaTab(5);
        
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered

        btnClientes.setBorder(new LineBorder(Color.white, 1));
  
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited

        btnClientes.setBorder(null);

    }//GEN-LAST:event_btnClientesMouseExited

    private void buttonPesquisarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPesquisarClienteMouseEntered

    private void buttonPesquisarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarClienteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPesquisarClienteMouseExited

    private void buttonPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarClienteActionPerformed
        
        String pesquisa = inputPesquisaCliente.getText().trim();
        
        listarClientes(3, pesquisa);
        
    }//GEN-LAST:event_buttonPesquisarClienteActionPerformed

    private void inputPesquisaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPesquisaClienteKeyTyped
        
        String pesquisa = inputPesquisaCliente.getText().trim();
   
        listarClientes(2, pesquisa);
        
    }//GEN-LAST:event_inputPesquisaClienteKeyTyped

    private void buttonAtualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarClientesActionPerformed
        
        inputPesquisaCliente.setText("");
        
        listarClientes(1, null);
        
    }//GEN-LAST:event_buttonAtualizarClientesActionPerformed

    private void buttonAddMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddMensagemActionPerformed
        
        panelFundoPopCliente.setVisible(true);
        panelPopCliente.setVisible(true);
        
    }//GEN-LAST:event_buttonAddMensagemActionPerformed

    private void inputMensagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMensagemFocusGained
        
        if (inputMensagem.getText().trim().equals("Digite sua mensagem...")) {
            
            inputMensagem.setText("");
            
        }
        
    }//GEN-LAST:event_inputMensagemFocusGained

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if (inputMensagem.getText().trim().equals("")) {
            
            inputMensagem.setBorder(new LineBorder(Color.red, 1));
            
        } else {

            GlobalWhats.setMensagem(inputMensagem.getText().trim());
            JOptionPane.showMessageDialog(null, "Mensagem salva!");
            
            panelFundoPopCliente.setVisible(false);
            panelPopCliente.setVisible(false);
            
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        panelFundoPopCliente.setVisible(false);
        panelPopCliente.setVisible(false);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void panelFundoPopClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFundoPopClienteMouseClicked
        
        panelFundoPopCliente.setVisible(false);
        panelPopCliente.setVisible(false);
        
    }//GEN-LAST:event_panelFundoPopClienteMouseClicked

    private void panelPopClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPopClienteMouseClicked

        if (!inputMensagem.getText().trim().equals("")) {
            
            inputMensagem.setBorder(null);
            
        }
        
    }//GEN-LAST:event_panelPopClienteMouseClicked

    private void btnCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseClicked
        
        trocaTab(6);
        
    }//GEN-LAST:event_btnCategoriasMouseClicked

    private void btnCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseEntered
        
        btnCategorias.setBorder(new LineBorder(Color.white, 1));
        
    }//GEN-LAST:event_btnCategoriasMouseEntered

    private void btnCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseExited
        
        btnCategorias.setBorder(null);
        
    }//GEN-LAST:event_btnCategoriasMouseExited

    private void buttonAtualizarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarCategoriasActionPerformed
        
        inputPesquisaCategorias.setText("");
        
        listarCategorias(1, null);
        
    }//GEN-LAST:event_buttonAtualizarCategoriasActionPerformed

    private void inputPesquisaCategoriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPesquisaCategoriasKeyTyped
       
        String pesquisa = inputPesquisaCategorias.getText().trim();
        
        listarCategorias(2, pesquisa);
        
    }//GEN-LAST:event_inputPesquisaCategoriasKeyTyped

    private void buttonPesquisarCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarCategoriasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPesquisarCategoriasMouseEntered

    private void buttonPesquisarCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarCategoriasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPesquisarCategoriasMouseExited

    private void buttonPesquisarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarCategoriasActionPerformed
        
        String pesquisa = inputPesquisaCategorias.getText().trim();
        
        listarCategorias(2, pesquisa);
        
    }//GEN-LAST:event_buttonPesquisarCategoriasActionPerformed

    private void buttonAtualizarRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarRelatoriosActionPerformed
        
        inputPesquisaRelatorios.setText("");
        
        listarRelatorios(1, null);
        
    }//GEN-LAST:event_buttonAtualizarRelatoriosActionPerformed

    private void inputPesquisaRelatoriosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPesquisaRelatoriosKeyTyped
        
        String pesquisa = inputPesquisaRelatorios.getText().trim();
        
        listarRelatorios(2, pesquisa);
        
    }//GEN-LAST:event_inputPesquisaRelatoriosKeyTyped

    private void buttonPesquisarReserva1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarReserva1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPesquisarReserva1MouseEntered

    private void buttonPesquisarReserva1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarReserva1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPesquisarReserva1MouseExited

    private void buttonPesquisarReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarReserva1ActionPerformed
        
        
        
    }//GEN-LAST:event_buttonPesquisarReserva1ActionPerformed

    private void btnAdicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCategoriaActionPerformed
        
        panelFundoPopCategoria.setVisible(true);
        panelPopCategoria.setVisible(true);
        
    }//GEN-LAST:event_btnAdicionarCategoriaActionPerformed

    private void panelFundoPopCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFundoPopCategoriaMouseClicked
        
        panelFundoPopCategoria.setVisible(false);
        panelPopCategoria.setVisible(false);
        
    }//GEN-LAST:event_panelFundoPopCategoriaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        panelFundoPopCategoria.setVisible(false);
        panelPopCategoria.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCriarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarCategoriaActionPerformed
        
        String nome = inputNomeCategoria.getText().trim();
        String descricao = inputDescricaoCategoria.getText().trim();
        
        if (nome.isEmpty() || descricao.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        } else {
            
            daoCategoria.adicionar(new Categorias(nome, descricao, 0));
        
            inputNomeCategoria.setText("");
            inputDescricaoCategoria.setText("");
        
            JOptionPane.showMessageDialog(null, "Categoria criada com sucesso!");
            inputPesquisaCategorias.setText("");
            
            listarCategorias(1, null);
            
        }
        
    }//GEN-LAST:event_btnCriarCategoriaActionPerformed

    private void btnAdicionarADMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarADMMouseClicked
        
        trocaTab(7);
        
    }//GEN-LAST:event_btnAdicionarADMMouseClicked

    private void btnAdicionarADMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarADMMouseEntered
        
        btnAdicionarADM.setBorder(new LineBorder(Color.white, 1));
        
    }//GEN-LAST:event_btnAdicionarADMMouseEntered

    private void btnAdicionarADMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarADMMouseExited
        
        btnAdicionarADM.setBorder(null);
        
    }//GEN-LAST:event_btnAdicionarADMMouseExited

    private void panelEditarCategoriaFundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEditarCategoriaFundoMouseClicked
      
        fecharPanelEditarCategoria();
        
    }//GEN-LAST:event_panelEditarCategoriaFundoMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        fecharPanelEditarCategoria();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        Usuarios usuario = new Usuarios();
        
        String nomeADM = edtNomeADM.getText();
        String emailADM = edtEmailADM.getText();
        String senhaADM = edtSenhaADM.getText();
        
        String[] divide = edtDataNascimentoADM.getText().split("\\/");
        
        String dia = "";
        String mes = "";
        String ano = "";
        
        if (divide.length > 0) {
            
            dia = divide[0];
            mes = divide[1];
            ano = divide[2];
            
        }
        
        String data = ano + "-" + mes + "-" + dia;
        
        Date dataNascimento = Date.valueOf(data);

        String num = edtWhatsappADM.getText();

        String whatsap = num.replaceAll("[^0-9]", "");
   
        usuario.setAdm(1);
        usuario.setData_nascimento(dataNascimento);
        usuario.setEmail(emailADM);
        usuario.setWhatsapp(whatsap);
        usuario.setSenha(senhaADM);
        usuario.setId_usuario(0);
        usuario.setNome(nomeADM);
        
        daoAdmin.InserirAdministrador(usuario);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecione uma Imagem");
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Imagens", "jpg", "png", "gif"));
        int result = chooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            arquivoSelecionado = chooser.getSelectedFile();
            txtImagemSelecionada.setText("Imagem selecionada: " + arquivoSelecionado.getName());
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnSalvarEdicaoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEdicaoCategoriaActionPerformed
        
        String novoNomeCategoria = inputNomeCategoriaEdit.getText().trim();
        String novaDescricaoCategoria = inputDescricaoCategoriaEdit.getText().trim();
        
        if (novoNomeCategoria.isEmpty() || novaDescricaoCategoria.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        } else {
            
            daoCategoria.editar(novoNomeCategoria, novaDescricaoCategoria, categoriaAtual.getId_categoria());
            
            inputNomeCategoriaEdit.setText("");
            inputDescricaoCategoriaEdit.setText("");
            JOptionPane.showMessageDialog(null, "Edição realizada com sucesso!");
 
        }
        
    }//GEN-LAST:event_btnSalvarEdicaoCategoriaActionPerformed

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
                btnReservas.setBackground(new Color(51, 51, 51));
                btnClientes.setBackground(new Color(51, 51, 51));
                btnCategorias.setBackground(new Color(51, 51, 51));
                btnAdicionarADM.setBackground(new Color(51, 51, 51));

                break;

            case 2:

                tabInicio.setSelectedIndex(1);
                atualiza(2);

                btnInicio.setBackground(new Color(51, 51, 51));
                btnEstoque.setBackground(new Color(102, 102, 102));
                btnRelatorios.setBackground(new Color(51, 51, 51));
                btnReservas.setBackground(new Color(51, 51, 51));
                btnClientes.setBackground(new Color(51, 51, 51));
                btnCategorias.setBackground(new Color(51, 51, 51));
                btnAdicionarADM.setBackground(new Color(51, 51, 51));

                break;

            case 3:

                tabInicio.setSelectedIndex(2);
                atualiza(3);

                btnInicio.setBackground(new Color(51, 51, 51));
                btnEstoque.setBackground(new Color(51, 51, 51));
                btnRelatorios.setBackground(new Color(102, 102, 102));
                btnReservas.setBackground(new Color(51, 51, 51));
                btnClientes.setBackground(new Color(51, 51, 51));
                btnCategorias.setBackground(new Color(51, 51, 51));
                btnAdicionarADM.setBackground(new Color(51, 51, 51));

                break;
            
            case 4:

                tabInicio.setSelectedIndex(3);
                atualiza(4);

                btnInicio.setBackground(new Color(51, 51, 51));
                btnEstoque.setBackground(new Color(51, 51, 51));
                btnRelatorios.setBackground(new Color(51, 51, 51));
                btnReservas.setBackground(new Color(102, 102, 102));
                btnClientes.setBackground(new Color(51, 51, 51));
                btnCategorias.setBackground(new Color(51, 51, 51));
                btnAdicionarADM.setBackground(new Color(51, 51, 51));

                break;
            
            case 5:

                tabInicio.setSelectedIndex(4);
                atualiza(5);

                btnInicio.setBackground(new Color(51, 51, 51));
                btnEstoque.setBackground(new Color(51, 51, 51));
                btnRelatorios.setBackground(new Color(51, 51, 51));
                btnReservas.setBackground(new Color(51, 51, 51));
                btnClientes.setBackground(new Color(102, 102, 102));
                btnCategorias.setBackground(new Color(51, 51, 51));
                btnAdicionarADM.setBackground(new Color(51, 51, 51));

                break;
            
            case 6:

                tabInicio.setSelectedIndex(5);
                atualiza(6);

                btnInicio.setBackground(new Color(51, 51, 51));
                btnEstoque.setBackground(new Color(51, 51, 51));
                btnRelatorios.setBackground(new Color(51, 51, 51));
                btnReservas.setBackground(new Color(51, 51, 51));
                btnClientes.setBackground(new Color(51, 51, 51));
                btnAdicionarADM.setBackground(new Color(51, 51, 51));
                btnCategorias.setBackground(new Color(102, 102, 102));

                break;
            
            case 7:

                tabInicio.setSelectedIndex(6);
                atualiza(7);

                btnInicio.setBackground(new Color(51, 51, 51));
                btnEstoque.setBackground(new Color(51, 51, 51));
                btnRelatorios.setBackground(new Color(51, 51, 51));
                btnReservas.setBackground(new Color(51, 51, 51));
                btnClientes.setBackground(new Color(51, 51, 51));
                btnCategorias.setBackground(new Color(51, 51, 51));
                btnAdicionarADM.setBackground(new Color(102, 102, 102));

                break;

        }

    }

    private void inicia() {
        
        animationLogo();
        atualizaGraficoInicio(1);
        preencherTabela(1, null);
        listarRelatorios(1, null);
        listarClientes(1, null);
        listarCategorias(1, null);
        listarNotificacoes();
        progressInicio();
        radioSelecionado();
        eventTable();
        eventCheck();
        verificaComboReservas();
        inserirMetodosComboReservas();
        listarReservas(1, null);
        buttonEditarProduto.setVisible(false);
        panelEditarCategoriaFundo.setVisible(false);
        panelNoti.setVisible(false);
        panelFundoNoti.setVisible(false);
        radio1.setSelected(true);
        panelFundoPopCategoria.setVisible(false);
        panelPopCategoria.setVisible(false);
        panelFundoAdicionarProduto.setVisible(false);
        panelAdicionarProduto.setVisible(false);
        panelPopProduto.setVisible(false);
        panelFundoPopProdutoSelecionado.setVisible(false);
        panelInformacoesPerfil.setVisible(false);
        panelFundoPerfil.setVisible(false);
        buttonArquivar.setVisible(false);
        buttonReativar.setVisible(false);
        panelFundoPopCliente.setVisible(false);
        panelPopCliente.setVisible(false);
        tamanhoOriginal = frame.getSize();
        localizacaoOriginal = frame.getLocation();

        if (GlobalAdmin.getNome() != null) {

            txtBemVindo.setText("Bem vindo, " + GlobalAdmin.getNome());

        }
        
        GlobalWhats.setMensagem("Digite sua mensagem...");

    }

    private void atualiza(int tela) {

        switch (tela) {

            case 1:
                
                progressInicio();

                break;

            case 2:

                
                
                break;

            case 3:

                listarRelatorios(1, null);
                
                break;
                
            case 4:
                
                
                
                break;
            
            case 5:
                
                listarClientes(1, null);
                
                break;
            
            case 6:
                
                listarCategorias(1, null);
                
                break;

        }
        
        listarNotificacoes();

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

    private void preencherTabela(int table, String produto) {

        tableModel = (DefaultTableModel) tblEstoque.getModel();
        tableModel.setNumRows(0);

        EstoqueDAO funcoesEstoque = new EstoqueDAO();

        switch (table) {

            case 1:

                estoqueTabela = funcoesEstoque.ListarEstoque(1, null);
                buttonDisponivel.setVisible(false);
                buttonIndisponivel.setVisible(false);
                
                break;

            case 2:

                estoqueTabela = funcoesEstoque.ListarEstoque(2, null);
                buttonIndisponivel.setVisible(true);
                buttonDisponivel.setVisible(false);
                
                break;

            case 3:

                estoqueTabela = funcoesEstoque.ListarEstoque(3, null);
                buttonIndisponivel.setVisible(false);
                buttonDisponivel.setVisible(true);
                
                break;
                
            case 4:
                
                estoqueTabela = funcoesEstoque.ListarEstoque(4, produto);
                buttonDisponivel.setVisible(false);
                buttonIndisponivel.setVisible(false);
                
                break;
                
            case 5:
                
                estoqueTabela = funcoesEstoque.ListarEstoque(5, produto);
                buttonIndisponivel.setVisible(true);
                buttonDisponivel.setVisible(false);
                
                break;
                
            case 6:
                
                estoqueTabela = funcoesEstoque.ListarEstoque(6, produto);
                buttonIndisponivel.setVisible(false);
                buttonDisponivel.setVisible(true);
                
                break;
                
            case 7:
                
                estoqueTabela = funcoesEstoque.ListarEstoque(7, null);
                buttonIndisponivel.setVisible(false);
                buttonDisponivel.setVisible(false);
                buttonArquivar.setVisible(false);
                
                break;
            
            case 8:
                
                estoqueTabela = funcoesEstoque.ListarEstoque(8, produto);
                buttonIndisponivel.setVisible(false);
                buttonDisponivel.setVisible(false);
                buttonArquivar.setVisible(false);
                
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
            produtosAtual.setImagem(estoqueTabela.get(linha).getImagem());

            trocaVisibilidadeButtons(2);
            
            if (radio1.isSelected()) {
                
                buttonDisponivel.setVisible(false);
                buttonIndisponivel.setVisible(false);
                buttonReativar.setVisible(false);
                
            }
            
            if (radio2.isSelected()) {
                
                buttonDisponivel.setVisible(false);
                buttonReativar.setVisible(false);
                
            }
            
            if (radio3.isSelected()) {
                
                buttonIndisponivel.setVisible(false);
                buttonReativar.setVisible(false);
                
            }
            
            if (radio4.isSelected()) {
                
                buttonDisponivel.setVisible(false);
                buttonIndisponivel.setVisible(false);
                buttonArquivar.setVisible(false);
                
            }

        }

    }

    private void redimensiona(boolean verifica) {

        if (verifica) {
            
            panelNav.setBounds(0, 0, frame.getWidth(), panelNav.getHeight());
            panelNav.revalidate();
            panelNav.repaint();
            
        }
        
    }

    private void listarNotificacoes() {

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
        btnNoti.repaint();

    }

    private void listarRelatorios(int tipo, String pesquisa) {

        panelListRelatorios.removeAll();
        
        switch(tipo) {
            
            case 1:
                
                listaRelatorios = daoRelatorio.listar(1, null);
                
                break;
                
            case 2:
                
                listaRelatorios = daoRelatorio.listar(2, pesquisa);
                
                break;
            
        }

        for (int i = 0; i < listaRelatorios.size(); i++) {

            panelListRelatorios.add(new ItemRelatorio(listaRelatorios.get(i)));

        }
        
        panelListRelatorios.revalidate();
        panelListRelatorios.repaint();

    }
    
    private void listarClientes(int tipo, String pesquisa) {
        
        panelListClientes.removeAll();
        
        switch(tipo) {
            
            case 1:
                
                listaClientes = daoUsuario.listar(1, null);
                
                break;
                
            case 2:
                
                listaClientes = daoUsuario.listar(2, pesquisa);
                
                break;
            
            case 3:
                
                listaClientes = daoUsuario.listar(3, pesquisa);
                
                break;
            
        }
        
        for (int i = 0; i < listaClientes.size(); i++) {
            
            panelListClientes.add(new ItemCliente(listaClientes.get(i)));
            
        }
        
        panelClientes.revalidate();
        panelClientes.repaint();
        
    }
    
    public void listarCategorias(int tipo, String pesquisa) {
        
        panelListCategorias.removeAll();
        
        switch(tipo) {
            
            case 1:
                
                listaCategorias2 = daoCategoria.listar(1, null);
                
                break;
            
            case 2:
                
                listaCategorias2 = daoCategoria.listar(2, pesquisa);
                
                break;

        }
        
        for (int i = 0; i < listaCategorias2.size(); i++) {
            
            panelListCategorias.add(new ItemCategoria(listaCategorias2.get(i), this));
            
        }
        
        panelCategorias.revalidate();
        panelCategorias.repaint();
        
    }

    private void progressInicio() {

        listaProdutos = daoProduto.listar();

        if (!listaProdutos.isEmpty()) {

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
        buttonEditarProduto.setVisible(false);
        inputPesquisarProduto.setVisible(true);
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
        produtosAtual.setImagem(null);
        txtImagemProduto.setIcon(null);
        
        trocaVisibilidadeButtons(1);

    }

    private void radioSelecionado() {

        radio1.addActionListener(e -> {

            preencherTabela(1, null);
            trocaVisibilidadeButtons(1);

        });

        radio2.addActionListener(e -> {

            preencherTabela(2, null);
            trocaVisibilidadeButtons(1);

        });

        radio3.addActionListener(e -> {

            preencherTabela(3, null);
            trocaVisibilidadeButtons(1);

        });
        
        radio4.addActionListener(e -> {
            
            preencherTabela(7, null);
            trocaVisibilidadeButtons(1);
            
        });

    }

    private void verificaRadio() {

        if (radio1.isSelected()) {

            preencherTabela(1, null);

        }

        if (radio2.isSelected()) {

            preencherTabela(2, null);

        }

        if (radio3.isSelected()) {

            preencherTabela(3, null);

        }
        
        if (radio4.isSelected()) {
            
            preencherTabela(7, null);
            
        }
        
        resetaProdutoAtual();

    }
    
    private void trocaVisibilidadeButtons(int escolha) {
        
        switch(escolha) {
            
            case 1:
                
                buttonEditarProduto.setVisible(false);
                buttonArquivar.setVisible(false);
                buttonIndisponivel.setVisible(false);
                buttonDisponivel.setVisible(false);
                buttonReativar.setVisible(false);
                
                break;
               
            case 2:
                
                buttonEditarProduto.setVisible(true);
                buttonArquivar.setVisible(true);
                buttonIndisponivel.setVisible(true);
                buttonDisponivel.setVisible(true);
                buttonReativar.setVisible(true);
                
                break;
            
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
        inputEmail.setText(GlobalAdmin.getEmail());
        inputSenha.setText(GlobalAdmin.getSenha());
        
    }
    
    private void resetaCamposAdicionarProduto() {
        
        inputNomeProduto.setText("");
        inputDescricaoProduto.setText("");
        inputValor.setText("");
        inputQuantidade.setText("");
        inputValorCusto.setText(""); 
        radioDisponivel.setSelected(false);
        radioIndisponivel.setSelected(false);
        
    }
    
    private void fechaPopAdicionarProduto() {
        
        panelFundoAdicionarProduto.setVisible(false);
        panelAdicionarProduto.setVisible(false);
        resetaCamposAdicionarProduto();
        btnAdicionarProduto.setVisible(true);
        inputPesquisarProduto.setVisible(true);
        txtImagemProduto.setIcon(null);
        
    }
    
    private void listaComboCategoriasAdicionarProduto() {
        
       comboAdicionarProdutoCategoria.removeAllItems();
        
       listaCategorias = daoCategoria.listar(1, null);
       
       for (int i = 0; i < listaCategorias.size(); i++) {
           
           comboAdicionarProdutoCategoria.addItem(listaCategorias.get(i).getNome());
           
       }
        
    }
    
    private void abrePopAdicionarProduto() {
        
        panelFundoAdicionarProduto.setVisible(true);
        panelAdicionarProduto.setVisible(true);
        listaComboCategoriasAdicionarProduto();
        btnAdicionarProduto.setVisible(false);
        inputPesquisarProduto.setVisible(false);
        
    }
    
    private void eventCheck() {
        
        checkEdicao.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    
                    inputNome.setEnabled(true);
                    inputEmail.setEnabled(true);
                    inputSenha.setEnabled(true);
                    buttonSalvarPerfil.setEnabled(true);
                    
                } else {
                    
                    inputNome.setEnabled(false);
                    inputEmail.setEnabled(false);
                    inputSenha.setEnabled(false);
                    buttonSalvarPerfil.setEnabled(false);
                    
                }
                
            }
        });
 
    }
    
    private void inserirMetodosComboReservas() {
        
        comboMetodoPesquisa.addItem("Código de reserva");
        comboMetodoPesquisa.addItem("Nome da pessoa");
        
    }
    
    private void verificaComboReservas() {
        
        comboMetodoPesquisa.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                switch(comboMetodoPesquisa.getSelectedIndex()) {
                    
                    case 0:
                        
                        txtPesquisaReservas.setText("Pesquisar código");
                        
                        break;
                        
                    case 1:
                        
                        txtPesquisaReservas.setText("Pesquisar nome");
                        
                        break;
                    
                }
                
            }
        });
  
    }
    
    private void listarReservas(int tipo, String produto) {
        
        panelItemReservas.removeAll();
        
        listaReservas = daoReserva.listar(tipo, produto);
        
        for (int i = 0; i < listaReservas.size(); i++) {
  
            panelItemReservas.add(new ItemReserva(listaReservas.get(i)));
            
        }
        
        panelItemReservas.revalidate();
        panelItemReservas.repaint();
        
    }
    
    private void pesquisaReserva() {
        
        String produto = inputPesquisaReserva.getText().trim();
        
        int tipo = 0;
        
        switch(comboMetodoPesquisa.getSelectedIndex()) {
            
            case 0:
                
                tipo = 2;
                
                break;
                
            case 1:
                
                tipo = 3;
                
                break;
            
        }
        
        if (produto.isEmpty()) {
            
            tipo = 1;
            produto = null;
            
        }
        
        listarReservas(tipo, produto);
        
    }
    
    public void visibilidadePanelEditarCategoria(Categorias categoria) {
        
        panelEditarCategoriaFundo.setVisible(true);
        
        inputNomeCategoriaEdit.setText(categoria.getNome());
        inputDescricaoCategoriaEdit.setText(categoria.getDescricao());
 
        categoriaAtual = categoria;
        
    }
    
    private void fecharPanelEditarCategoria() {
        
        panelEditarCategoriaFundo.setVisible(false);
        
        categoriaAtual = null;
        
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAdicionarADM;
    private javax.swing.JButton btnAdicionarCategoria;
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAdicionarQuantidade;
    private javax.swing.JPanel btnCategorias;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JLabel btnCloseNoti;
    private javax.swing.JLabel btnClosePopProduto;
    private javax.swing.JButton btnCriarCategoria;
    private javax.swing.JButton btnDiminuirQuantidade;
    private javax.swing.JPanel btnEstoque;
    private javax.swing.JPanel btnFechaInformacoesPerfil;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnLogout;
    private com.raven.swing.ButtonBadges btnNoti;
    private javax.swing.JPanel btnRelatorios;
    private javax.swing.JPanel btnReservas;
    private javax.swing.JButton btnSalvarEdicaoCategoria;
    private javax.swing.JButton buttonAddMensagem;
    private javax.swing.JButton buttonArquivar;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonAtualizarCategorias;
    private javax.swing.JButton buttonAtualizarClientes;
    private javax.swing.JButton buttonAtualizarRelatorios;
    private javax.swing.JPanel buttonClosePanelAdicionarProduto;
    private button.ButtonVerde buttonDisponivel;
    private javax.swing.JButton buttonEditarProduto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private button.MyButton buttonIndisponivel;
    private javax.swing.JButton buttonPesquisarCategorias;
    private javax.swing.JButton buttonPesquisarCliente;
    private javax.swing.JButton buttonPesquisarReserva;
    private javax.swing.JButton buttonPesquisarReserva1;
    private javax.swing.JButton buttonReativar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonSalvarPerfil;
    private javax.swing.JCheckBox checkEdicao;
    private javax.swing.JComboBox<String> comboAdicionarProdutoCategoria;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JComboBox<String> comboMetodoPesquisa;
    private javax.swing.JFormattedTextField edtDataNascimentoADM;
    private javax.swing.JTextField edtDescricaoProduto;
    private javax.swing.JTextField edtEmailADM;
    private javax.swing.JTextField edtNomeADM;
    private javax.swing.JTextField edtNomeProduto;
    private javax.swing.JTextField edtQuantidade;
    private javax.swing.JTextField edtSenhaADM;
    private javax.swing.JTextField edtValorCustoProduto;
    private javax.swing.JTextField edtValorProduto;
    private javax.swing.JFormattedTextField edtWhatsappADM;
    private com.raven.chart.Chart grafInicio;
    private com.raven.avatar.ImageAvatar imageAvatar1;
    private com.raven.avatar.ImageAvatar imageAvatar2;
    private javax.swing.JTextArea inputDescricaoCategoria;
    private javax.swing.JTextField inputDescricaoCategoriaEdit;
    private javax.swing.JTextField inputDescricaoProduto;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextArea inputMensagem;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputNomeCategoria;
    private javax.swing.JTextField inputNomeCategoriaEdit;
    private javax.swing.JTextField inputNomeProduto;
    private javax.swing.JTextField inputPesquisaCategorias;
    private javax.swing.JTextField inputPesquisaCliente;
    private javax.swing.JTextField inputPesquisaRelatorios;
    private javax.swing.JTextField inputPesquisaReserva;
    private javax.swing.JTextField inputPesquisarProduto;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JTextField inputValor;
    private javax.swing.JTextField inputValorCusto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabele0;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private telas.formatos.PanelBorder panelAcimaFrame;
    private javax.swing.JPanel panelAdicionarADM;
    private javax.swing.JPanel panelAdicionarProduto;
    private javax.swing.JPanel panelBtnClosePopProduto;
    private telas.formatos.PanelBorder panelButtons;
    private javax.swing.JPanel panelCategorias;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelEditarCategoria;
    private javax.swing.JPanel panelEditarCategoriaFundo;
    private javax.swing.JPanel panelEstoque;
    private javax.swing.JPanel panelFundoAdicionarProduto;
    private javax.swing.JPanel panelFundoCloseNoti;
    private javax.swing.JPanel panelFundoNoti;
    private javax.swing.JPanel panelFundoPerfil;
    private javax.swing.JPanel panelFundoPopCategoria;
    private javax.swing.JPanel panelFundoPopCliente;
    private javax.swing.JPanel panelFundoPopProdutoSelecionado;
    private javax.swing.JPanel panelFundoTab;
    private javax.swing.JPanel panelInformacoesPerfil;
    private javax.swing.JPanel panelInicio;
    private telas.formatos.PanelItem panelItemReservas;
    private telas.formatos.PanelItem panelListCategorias;
    private telas.formatos.PanelItem panelListClientes;
    private telas.formatos.PanelItem panelListRelatorios;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelMin;
    private telas.formatos.PanelBorder panelNav;
    private javax.swing.JPanel panelNoti;
    private telas.formatos.PanelItem panelNotificacoes;
    private telas.formatos.PanelBorder panelPerfil;
    private telas.formatos.PanelBorder panelPopCategoria;
    private javax.swing.JPanel panelPopCliente;
    private javax.swing.JPanel panelPopProduto;
    private javax.swing.JPanel panelRelatorios;
    private javax.swing.JPanel panelReservas;
    private telas.formatos.PanelBorder panelSubNav;
    private javax.swing.JPanel panelTabClientes;
    private javax.swing.JPanel panelTitulosClientes;
    private javax.swing.JPanel panelTitulosRelatorios;
    private javax.swing.JPanel panelTitulosReservas;
    private com.raven.swing.progress.Progress progressDisponivel;
    private com.raven.swing.progress.Progress progressIndisponivel;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JRadioButton radioDisponivel;
    private javax.swing.JRadioButton radioIndisponivel;
    private javax.swing.JScrollPane scrollRelatorios;
    private javax.swing.JTabbedPane tabInicio;
    private tabledark.TableDark tblEstoque;
    private javax.swing.JLabel txtAdicionarADM;
    private javax.swing.JLabel txtBemVindo;
    private javax.swing.JLabel txtCategorias;
    private javax.swing.JLabel txtClientes;
    private javax.swing.JLabel txtClose;
    private javax.swing.JLabel txtEstoque;
    private javax.swing.JLabel txtImagem;
    private javax.swing.JLabel txtImagemProduto;
    private javax.swing.JLabel txtImagemSelecionada;
    private javax.swing.JLabel txtInicio;
    private javax.swing.JLabel txtLogo;
    private javax.swing.JLabel txtLogout;
    private javax.swing.JLabel txtMin;
    private javax.swing.JLabel txtNomeProduto;
    private javax.swing.JLabel txtNomeProduto1;
    private javax.swing.JLabel txtNomeProduto2;
    private javax.swing.JLabel txtNomeProduto3;
    private javax.swing.JLabel txtNomeProduto4;
    private javax.swing.JLabel txtPesquisaCliente;
    private javax.swing.JLabel txtPesquisaReservas;
    private javax.swing.JLabel txtRelatorios;
    private javax.swing.JLabel txtReservas;
    // End of variables declaration//GEN-END:variables

}
