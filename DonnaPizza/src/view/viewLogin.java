package view;

import DAO.DAOFuncionario;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelFuncionario;

public class viewLogin extends javax.swing.JFrame {

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
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(611, 430));
        setMinimumSize(new java.awt.Dimension(611, 430));
        setPreferredSize(new java.awt.Dimension(611, 430));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 190, -1));

        jpsSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpsSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(jpsSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, -1));

        jbEntrar.setBackground(new java.awt.Color(255, 51, 51));
        jbEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jbEntrar.setText("Entrar");
        jbEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jbEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 283, 110, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/others/donna-bg-login.png"))); // NOI18N
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 600, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(614, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        jpsSenha.requestFocus();
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jpsSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpsSenhaActionPerformed
        Logar();
    }//GEN-LAST:event_jpsSenhaActionPerformed

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
    private void Logar() {

        try {

            String senhaSecret = new String(jpsSenha.getPassword());

            if (jtfUsuario.getText().isEmpty() || senhaSecret.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Usuário ou senha estão vazios.", "Atenção!", JOptionPane.WARNING_MESSAGE);

            } else {

                //Model
                ModelFuncionario objModelFuncionario = new ModelFuncionario();
                objModelFuncionario.setUsuario(jtfUsuario.getText());
                objModelFuncionario.setSenha(senhaSecret);

                //DAO
                DAOFuncionario objDaoFuncionario = new DAOFuncionario();
                ResultSet rsDaoFuncionario = objDaoFuncionario.autenticarFuncionario(objModelFuncionario);

                //Verificar se existe funcionario
                if (rsDaoFuncionario.next()) {

                    String verificarAtividade = rsDaoFuncionario.getString(19);

                    //Verificando Ativo ou Inativo
                    if (verificarAtividade.equals("Inativo")) {

                        JOptionPane.showMessageDialog(null, "Funcionário inativo.\nNão é possível fazer o login no sistema.", "Atenção!", JOptionPane.ERROR_MESSAGE);

                        jtfUsuario.setText(null);
                        jpsSenha.setText(null);

                    } else {

                        String permissao = rsDaoFuncionario.getString(16);
                        if (permissao.equals("ADM")) {
                            System.out.println("admin");
                        } else {
                            System.out.println("user");
                        }

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "Atenção.", JOptionPane.ERROR_MESSAGE);
                }

            }

        } catch (SQLException ex) {

            ex.getMessage();

        }

    }
}
