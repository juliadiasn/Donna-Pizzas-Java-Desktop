package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class viewPrincipal extends javax.swing.JFrame {
    
    public viewPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        // Adicione este código logo após a inicialização do JDesktopPane no método initComponents()
// Carregar a imagem de fundo
        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/images/others/bg-principal.png"));
        // Substitua pelo caminho da sua imagem

// Criar um JLabel com a imagem de fundo
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setOpaque(true);
        backgroundLabel.setBackground(new Color(0, 0, 0, 0)); // tornar o JLabel transparente

// Colocar o JLabel no JLayeredPane do JDesktopPane
        desktopPane.add(backgroundLabel, Integer.valueOf(Integer.MIN_VALUE));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jmbMenu = new javax.swing.JMenuBar();
        jmSistema = new javax.swing.JMenu();
        jmiTrocarUsuario = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();
        jmCadastros = new javax.swing.JMenu();
        jmiClientes = new javax.swing.JMenuItem();
        jmiFornecedores = new javax.swing.JMenuItem();
        jmiFuncionarios = new javax.swing.JMenuItem();
        jmEstoque = new javax.swing.JMenu();
        jmiProduto = new javax.swing.JMenuItem();
        jmiCategorias = new javax.swing.JMenuItem();
        jmVenda = new javax.swing.JMenu();
        jmiNovaVenda = new javax.swing.JMenuItem();
        jmiVendas = new javax.swing.JMenuItem();
        jmCompra = new javax.swing.JMenu();
        jmiNovaCompra = new javax.swing.JMenuItem();
        jmiCompras = new javax.swing.JMenuItem();
        jmRelatorio = new javax.swing.JMenu();
        jmiFazerRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Donna Pizza");
        setMaximumSize(new java.awt.Dimension(1350, 720));
        setMinimumSize(new java.awt.Dimension(1350, 720));
        setPreferredSize(new java.awt.Dimension(1350, 720));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1948, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );

        jmSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/sistema.png"))); // NOI18N
        jmSistema.setText("Sistema");

        jmiTrocarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/troca.png"))); // NOI18N
        jmiTrocarUsuario.setText("Trocar usuário");
        jmiTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTrocarUsuarioActionPerformed(evt);
            }
        });
        jmSistema.add(jmiTrocarUsuario);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/logout.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmiSairMousePressed(evt);
            }
        });
        jmSistema.add(jmiSair);

        jmbMenu.add(jmSistema);

        jmCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/cadastro.png"))); // NOI18N
        jmCadastros.setText("Cadastros");

        jmiClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/cliente.png"))); // NOI18N
        jmiClientes.setText("Clientes");
        jmCadastros.add(jmiClientes);

        jmiFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/fornecedor.png"))); // NOI18N
        jmiFornecedores.setText("Fornecedores");
        jmiFornecedores.setEnabled(false);
        jmCadastros.add(jmiFornecedores);

        jmiFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/funcionario.png"))); // NOI18N
        jmiFuncionarios.setText("Funcionários");
        jmiFuncionarios.setEnabled(false);
        jmiFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFuncionariosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiFuncionarios);

        jmbMenu.add(jmCadastros);

        jmEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/estoque.png"))); // NOI18N
        jmEstoque.setText("Estoque");
        jmEstoque.setEnabled(false);

        jmiProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/produto.png"))); // NOI18N
        jmiProduto.setText("Produtos");
        jmEstoque.add(jmiProduto);

        jmiCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/categoria.png"))); // NOI18N
        jmiCategorias.setText("Categorias");
        jmEstoque.add(jmiCategorias);

        jmbMenu.add(jmEstoque);

        jmVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/venda.png"))); // NOI18N
        jmVenda.setText("Venda");

        jmiNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/new venda.png"))); // NOI18N
        jmiNovaVenda.setText("Nova venda");
        jmVenda.add(jmiNovaVenda);

        jmiVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/lista venda.png"))); // NOI18N
        jmiVendas.setText("Vendas");
        jmVenda.add(jmiVendas);

        jmbMenu.add(jmVenda);

        jmCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/compras.png"))); // NOI18N
        jmCompra.setText("Compra");
        jmCompra.setEnabled(false);

        jmiNovaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/new compra.png"))); // NOI18N
        jmiNovaCompra.setText("Nova compra");
        jmCompra.add(jmiNovaCompra);

        jmiCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/lista compra.png"))); // NOI18N
        jmiCompras.setText("Compras");
        jmCompra.add(jmiCompras);

        jmbMenu.add(jmCompra);

        jmRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/relatorio.png"))); // NOI18N
        jmRelatorio.setText("Relatorio");
        jmRelatorio.setEnabled(false);

        jmiFazerRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/new relatorio.png"))); // NOI18N
        jmiFazerRelatorio.setText("Fazer relatório");
        jmRelatorio.add(jmiFazerRelatorio);

        jmbMenu.add(jmRelatorio);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        setSize(new java.awt.Dimension(1200, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTrocarUsuarioActionPerformed
        String[] options = {"Trocar", "Cancelar"}; // Textos personalizados dos botões

        int confirmacaoTrocaUsuario = JOptionPane.showOptionDialog(
                this, "Tem certeza que deseja trocar de usuário?", "Confirmação", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]
        );

        //Fecha a tela atual e reabre a de login
        if (confirmacaoTrocaUsuario == JOptionPane.YES_OPTION) {
            dispose();
            new viewLogin().setVisible(true);
        }
    }//GEN-LAST:event_jmiTrocarUsuarioActionPerformed

    private void jmiSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiSairMousePressed
        String[] options = {"Sair", "Cancelar"}; // Textos personalizados dos botões

        int confirmarSaida = JOptionPane.showOptionDialog(
                this, "Tem certeza que deseja fechar o sistema?", "Confirmação", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]
        );
        
        if (confirmarSaida == JOptionPane.YES_OPTION) {
            
            System.exit(0);
            
        }
    }//GEN-LAST:event_jmiSairMousePressed

    private void jmiFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFuncionariosActionPerformed
        
        try {
            viewFuncionario objViewFuncionario = new viewFuncionario();
            objViewFuncionario.setVisible(true);
            desktopPane.add(objViewFuncionario);
            objViewFuncionario.requestFocus();
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        

    }//GEN-LAST:event_jmiFuncionariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jmCadastros;
    public static javax.swing.JMenu jmCompra;
    public static javax.swing.JMenu jmEstoque;
    public static javax.swing.JMenu jmRelatorio;
    private javax.swing.JMenu jmSistema;
    private javax.swing.JMenu jmVenda;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiCategorias;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiCompras;
    private javax.swing.JMenuItem jmiFazerRelatorio;
    public static javax.swing.JMenuItem jmiFornecedores;
    public static javax.swing.JMenuItem jmiFuncionarios;
    private javax.swing.JMenuItem jmiNovaCompra;
    private javax.swing.JMenuItem jmiNovaVenda;
    private javax.swing.JMenuItem jmiProduto;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiTrocarUsuario;
    public static javax.swing.JMenuItem jmiVendas;
    // End of variables declaration//GEN-END:variables
}
