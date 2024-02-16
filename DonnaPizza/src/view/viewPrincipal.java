package view;



public class viewPrincipal extends javax.swing.JFrame {

    public viewPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
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
        jmPdv = new javax.swing.JMenu();
        jmiAbrirPdv = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("da região!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("A melhor pizza");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/others/donna-logo.png"))); // NOI18N
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 60));

        jmSistema.setText("Sistema");

        jmiTrocarUsuario.setText("Trocar usuário");
        jmiTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTrocarUsuarioActionPerformed(evt);
            }
        });
        jmSistema.add(jmiTrocarUsuario);

        jmiSair.setText("Sair");
        jmSistema.add(jmiSair);

        jmbMenu.add(jmSistema);

        jmCadastros.setText("Cadastros");

        jmiClientes.setText("Clientes");
        jmCadastros.add(jmiClientes);

        jmiFornecedores.setText("Fornecedores");
        jmiFornecedores.setEnabled(false);
        jmCadastros.add(jmiFornecedores);

        jmiFuncionarios.setText("Funcionários");
        jmiFuncionarios.setEnabled(false);
        jmCadastros.add(jmiFuncionarios);

        jmbMenu.add(jmCadastros);

        jmEstoque.setText("Estoque");
        jmEstoque.setEnabled(false);

        jmiProduto.setText("Produtos");
        jmEstoque.add(jmiProduto);

        jmiCategorias.setText("Categorias");
        jmEstoque.add(jmiCategorias);

        jmbMenu.add(jmEstoque);

        jmVenda.setText("Venda");

        jmiNovaVenda.setText("Nova venda");
        jmVenda.add(jmiNovaVenda);

        jmiVendas.setText("Vendas");
        jmiVendas.setEnabled(false);
        jmVenda.add(jmiVendas);

        jmbMenu.add(jmVenda);

        jmCompra.setText("Compra");
        jmCompra.setEnabled(false);

        jmiNovaCompra.setText("Nova compra");
        jmCompra.add(jmiNovaCompra);

        jmiCompras.setText("Compras");
        jmCompra.add(jmiCompras);

        jmbMenu.add(jmCompra);

        jmRelatorio.setText("Relatorio");
        jmRelatorio.setEnabled(false);

        jmiFazerRelatorio.setText("Fazer relatório");
        jmRelatorio.add(jmiFazerRelatorio);

        jmbMenu.add(jmRelatorio);

        jmPdv.setText("PDV");
        jmPdv.setEnabled(false);

        jmiAbrirPdv.setText("Abrir PDV");
        jmPdv.add(jmiAbrirPdv);

        jmbMenu.add(jmPdv);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        setSize(new java.awt.Dimension(900, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTrocarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiTrocarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmCadastros;
    public static javax.swing.JMenu jmCompra;
    public static javax.swing.JMenu jmEstoque;
    public static javax.swing.JMenu jmPdv;
    public static javax.swing.JMenu jmRelatorio;
    private javax.swing.JMenu jmSistema;
    private javax.swing.JMenu jmVenda;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiAbrirPdv;
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
