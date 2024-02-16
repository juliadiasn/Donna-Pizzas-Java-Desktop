package view;

import DAO.DAOFuncionario;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelFuncionario;

public class viewLogin extends javax.swing.JFrame {

    //OBJ
    DAOFuncionario objDaoFuncionario = new DAOFuncionario();
    ModelFuncionario objModelFuncionario = new ModelFuncionario();
    viewPrincipal objViewPrincipal = new viewPrincipal();

    public viewLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfUsuario = new javax.swing.JTextField();
        jpsSenha = new javax.swing.JPasswordField();
        jbEntrar = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Donna Pizza");
        setMaximumSize(new java.awt.Dimension(611, 430));
        setMinimumSize(new java.awt.Dimension(611, 430));
        setPreferredSize(new java.awt.Dimension(611, 430));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfUsuarioMousePressed(evt);
            }
        });
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 190, -1));

        jpsSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpsSenhaMousePressed(evt);
            }
        });
        jpsSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpsSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(jpsSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, -1));

        jbEntrar.setBackground(new java.awt.Color(227, 21, 21));
        jbEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jbEntrar.setText("Entrar");
        jbEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 283, 110, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/others/donna-bg-login.png"))); // NOI18N
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 620, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(598, 381));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        jpsSenha.requestFocus();
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jpsSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpsSenhaActionPerformed
        logar();
    }//GEN-LAST:event_jpsSenhaActionPerformed

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        logar();
    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jtfUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsuarioMousePressed
        if (jtfUsuario.getText().equals("Digite o usuário")) {
            jtfUsuario.setText(null);
        }
        jtfUsuario.setForeground(Color.black);
        if (String.valueOf(jpsSenha.getPassword()).isEmpty()) {
            jpsSenha.setText("Digite a senha");
            jpsSenha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtfUsuarioMousePressed

    private void jpsSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsSenhaMousePressed
        if (String.valueOf(jpsSenha.getPassword()).equals("Digite a senha")) {
            jpsSenha.setText(null);
        }
        jpsSenha.setForeground(Color.black);
        if (jtfUsuario.getText().isEmpty()) {
            jtfUsuario.setText("Digite o usuário");
            jtfUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jpsSenhaMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JPasswordField jpsSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

//METODOS
    //Login
    private void logar() {
        try {
            char[] senha = jpsSenha.getPassword();

            if (jtfUsuario.getText().isEmpty() || senha.length == 0) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha estão vazios.", "Atenção!", JOptionPane.WARNING_MESSAGE);

            } else {
                //Model
                objModelFuncionario.setUsuario(jtfUsuario.getText());
                objModelFuncionario.setSenha(new String(senha));

                //DAO
                ResultSet rsDaoFuncionario = objDaoFuncionario.autenticarFuncionario(objModelFuncionario);

                //Verificar se existe funcionario
                if (rsDaoFuncionario.next()) {
                    String verificarAtividade = rsDaoFuncionario.getString(19);

                    //Verificando Ativo ou Inativo
                    if (verificarAtividade.equals("Inativo")) {
                        JOptionPane.showMessageDialog(null, "Funcionário inativo.\nNão é possível fazer o login no sistema.", "Atenção!", JOptionPane.ERROR_MESSAGE);

                    } else {

                        verificarPermissao(rsDaoFuncionario);
                        //Abrir tela principal
                        objViewPrincipal.setVisible(true);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "Atenção.", JOptionPane.ERROR_MESSAGE);

                    //Fechar Resulset
                    rsDaoFuncionario.close();

                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar fazer login. ", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());

        }
    }

    private void verificarPermissao(ResultSet rsDaoFuncionario) {

        try {

            String permissao = rsDaoFuncionario.getString(18);
            if (permissao.equals("Admin")) {

                viewPrincipal.jmiFornecedores.setEnabled(true);
                viewPrincipal.jmiFuncionarios.setEnabled(true);
                viewPrincipal.jmEstoque.setEnabled(true);
                viewPrincipal.jmiVendas.setEnabled(true);
                viewPrincipal.jmCompra.setEnabled(true);
                viewPrincipal.jmRelatorio.setEnabled(true);
                viewPrincipal.jmPdv.setEnabled(true);

                this.dispose();

            } else {

                this.dispose();

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    private void limparCampos() {
        jtfUsuario.setText(null);
        jpsSenha.setText(null);
    }

}
