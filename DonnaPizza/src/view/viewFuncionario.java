package view;

import view.list.ListFuncionario;
import controller.ControllerFuncionario;
import java.text.ParseException;
import javax.swing.JOptionPane;
import model.ModelFuncionario;
import utils.ConversorData;

public class viewFuncionario extends javax.swing.JInternalFrame {

    ModelFuncionario objModelFuncionario = new ModelFuncionario();
    ControllerFuncionario objControllerFuncionario = new ControllerFuncionario();
    int opSalvar;

    public viewFuncionario() {

        initComponents();
        jtfNome.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupSexo = new javax.swing.ButtonGroup();
        groupAtividade = new javax.swing.ButtonGroup();
        groupPermissao = new javax.swing.ButtonGroup();
        scroll = new javax.swing.JScrollPane();
        jpDados = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jftfCpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jftfDataNascimento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jrbFeminino = new javax.swing.JRadioButton();
        jrbMasculino = new javax.swing.JRadioButton();
        jrbOutro = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jftfTelefone = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfCargaHorariaSemanal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jcbCargo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jrbComum = new javax.swing.JRadioButton();
        jrbAdministrador = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jrbAtivo = new javax.swing.JRadioButton();
        jrbInaivo = new javax.swing.JRadioButton();
        jtfSalario = new javax.swing.JTextField();
        jbListar = new javax.swing.JButton();
        jbAdicionar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de funcionários");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/funcionario.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(900, 700));
        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(900, 700));

        scroll.setMaximumSize(new java.awt.Dimension(900, 635));
        scroll.setMinimumSize(new java.awt.Dimension(900, 635));
        scroll.setName(""); // NOI18N
        scroll.setPreferredSize(new java.awt.Dimension(900, 635));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Código:");

        jtfId.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jtfNome.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CPF:");

        try {
            jftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfCpf.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Data de nascimento:");

        try {
            jftfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfDataNascimento.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Gênero");

        groupSexo.add(jrbFeminino);
        jrbFeminino.setText("Feminino");
        jrbFeminino.setEnabled(false);

        groupSexo.add(jrbMasculino);
        jrbMasculino.setText("Masculino");
        jrbMasculino.setEnabled(false);

        groupSexo.add(jrbOutro);
        jrbOutro.setSelected(true);
        jrbOutro.setText("Outro");
        jrbOutro.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Telefone:");

        try {
            jftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfTelefone.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Email:");

        jtfEmail.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftfCpf)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbFeminino)
                                    .addComponent(jrbOutro)
                                    .addComponent(jrbMasculino))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jrbFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbMasculino, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrbOutro)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jtfId.getAccessibleContext().setAccessibleName("Código");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Rua:");

        jtfRua.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Número:");

        jtfNumero.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Bairro:");

        jtfBairro.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Cidade:");

        jtfCidade.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Estado:");

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        jcbEstado.setToolTipText("Estado");
        jcbEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCidade)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adiministrativo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Salário:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Carga horária semanal:");

        jtfCargaHorariaSemanal.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Usuário:");

        jtfUsuario.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Senha:");

        jtfSenha.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Cargo:");

        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Entregador", "Atendente", "Cozinheiro", "Gerente" }));
        jcbCargo.setToolTipText("Estado");
        jcbCargo.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Permissão:");

        groupPermissao.add(jrbComum);
        jrbComum.setSelected(true);
        jrbComum.setText("Comum");
        jrbComum.setEnabled(false);

        groupPermissao.add(jrbAdministrador);
        jrbAdministrador.setText("Administrador");
        jrbAdministrador.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Atividade:");

        groupAtividade.add(jrbAtivo);
        jrbAtivo.setSelected(true);
        jrbAtivo.setText("Ativo");
        jrbAtivo.setEnabled(false);

        groupAtividade.add(jrbInaivo);
        jrbInaivo.setText("Inativo");
        jrbInaivo.setEnabled(false);

        jtfSalario.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCargaHorariaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jrbComum)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel19))
                            .addComponent(jrbAdministrador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbInaivo)
                            .addComponent(jrbAtivo))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jtfCargaHorariaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jrbComum)
                    .addComponent(jLabel19)
                    .addComponent(jrbAtivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInaivo)
                    .addComponent(jrbAdministrador))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jbListar.setText("Listar");
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });

        jbAdicionar.setText("Adicionar");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDadosLayout = new javax.swing.GroupLayout(jpDados);
        jpDados.setLayout(jpDadosLayout);
        jpDadosLayout.setHorizontalGroup(
            jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addComponent(jbListar)
                        .addGap(134, 134, 134)
                        .addComponent(jbAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jbLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalvar)
                        .addGap(167, 167, 167))
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpDadosLayout.setVerticalGroup(
            jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbListar)
                    .addComponent(jbAdicionar)
                    .addComponent(jbAlterar)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar)
                    .addComponent(jbExcluir))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        scroll.setViewportView(jpDados);

        getContentPane().add(scroll, java.awt.BorderLayout.CENTER);

        setBounds(50, 30, 900, 635);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed

        opSalvar = 2;
        habilitaCampos(true);
        jbAlterar.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbSalvar.setEnabled(true);

    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        if (opSalvar == 1) {

            createFuncionario();
            updateFuncionario();
            habilitaCampos(false);
            limpaCampos();
            jbAdicionar.setEnabled(true);
            jbAlterar.setEnabled(false);
            jbCancelar.setEnabled(false);
            jbSalvar.setEnabled(false);
            //System.out.println("Adicionado");

        } else if (opSalvar == 2) {

            //System.out.println("Alterado");
            updateFuncionario();
            habilitaCampos(false);
            limpaCampos();
            jbAdicionar.setEnabled(true);
            jbAlterar.setEnabled(false);
            jbCancelar.setEnabled(false);
            jbSalvar.setEnabled(false);

        }

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed

        ListFuncionario objList = new ListFuncionario();
        objList.readFuncionario();
        objList.setObjViewFuncionario(this);
        objList.setVisible(true);

    }//GEN-LAST:event_jbListarActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed

        opSalvar = 1;

        jtfNome.requestFocus();
        habilitaCampos(true);
        jbAdicionar.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbSalvar.setEnabled(true);
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        habilitaCampos(false);
        limpaCampos();
        jbAdicionar.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbSalvar.setEnabled(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        deleteFuncionario();
        jbExcluir.setEnabled(false);
        limpaCampos();
        jbAdicionar.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbSalvar.setEnabled(false);
    }//GEN-LAST:event_jbExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup groupAtividade;
    private javax.swing.ButtonGroup groupPermissao;
    private javax.swing.ButtonGroup groupSexo;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JButton jbAdicionar;
    public javax.swing.JButton jbAlterar;
    public javax.swing.JButton jbCancelar;
    public javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbListar;
    public javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JFormattedTextField jftfCpf;
    private javax.swing.JFormattedTextField jftfDataNascimento;
    private javax.swing.JFormattedTextField jftfTelefone;
    private javax.swing.JPanel jpDados;
    private javax.swing.JRadioButton jrbAdministrador;
    private javax.swing.JRadioButton jrbAtivo;
    private javax.swing.JRadioButton jrbComum;
    private javax.swing.JRadioButton jrbFeminino;
    private javax.swing.JRadioButton jrbInaivo;
    private javax.swing.JRadioButton jrbMasculino;
    private javax.swing.JRadioButton jrbOutro;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCargaHorariaSemanal;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfEmail;
    public static javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfRua;
    private javax.swing.JTextField jtfSalario;
    private javax.swing.JTextField jtfSenha;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

    private void createFuncionario() {

        if (jtfNome.getText().isEmpty() || jftfCpf.getText().isEmpty() || jftfDataNascimento.getText().isEmpty() || jftfTelefone.getText().isEmpty() || jtfEmail.getText().isEmpty() || jtfRua.getText().isEmpty() || jtfNumero.getText().isEmpty() || jtfBairro.getText().isEmpty() || jtfCidade.getText().isEmpty() || jtfSalario.getText().isEmpty() || jtfCargaHorariaSemanal.getText().isEmpty() || jtfUsuario.getText().isEmpty() || jtfSenha.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);

        } else {

            String dataParaBanco = null;
            String estado = null;
            String cargo = null;

            //Convertendo data
            try {
                dataParaBanco = ConversorData.converterDataParaMySql(jftfDataNascimento.getText());

            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }

            //Pegando o RadioButton
            //sexo
            String sexoSelecionado;
            if (jrbFeminino.isSelected()) {
                sexoSelecionado = "Feminino";
            } else if (jrbMasculino.isSelected()) {
                sexoSelecionado = "Masculino";
            } else {
                sexoSelecionado = "Outro";
            }

            //Permissao
            String permissaoSelecionada;
            if (jrbComum.isSelected()) {
                permissaoSelecionada = "Comum";
            } else {
                permissaoSelecionada = "Admin";
            }

            //Atividade
            String atividadeSelecionada;
            if (jrbAtivo.isSelected()) {
                atividadeSelecionada = "Ativo";
            } else {
                atividadeSelecionada = "Inativo";
            }

            //Se Estado ou Cargo for "Selecione"
            if (jcbEstado.getSelectedItem() == "Selecione") {
                JOptionPane.showMessageDialog(rootPane, "Selecione um estado.", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {

                estado = (String) jcbEstado.getSelectedItem();
            }

            //Se cargo for "Selecione"
            if (jcbCargo.getSelectedItem() == "Selecione") {
                JOptionPane.showMessageDialog(rootPane, "Selecione um cargo.", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {

                cargo = (String) jcbCargo.getSelectedItem();
            }

            //SETTER
            objModelFuncionario.setNome(jtfNome.getText());
            objModelFuncionario.setCpf(jftfCpf.getText());
            objModelFuncionario.setDataNascimento(dataParaBanco);
            objModelFuncionario.setGenero(sexoSelecionado);
            objModelFuncionario.setRua(jtfRua.getText());
            objModelFuncionario.setNumero(jtfNumero.getText());
            objModelFuncionario.setBairro(jtfBairro.getText());
            objModelFuncionario.setCidade(jtfCidade.getText());
            objModelFuncionario.setUf(estado);
            objModelFuncionario.setTelefone(jftfTelefone.getText());
            objModelFuncionario.setEmail(jtfEmail.getText());
            objModelFuncionario.setSalario(Double.parseDouble(jtfSalario.getText()));
            objModelFuncionario.setCargo(cargo);
            objModelFuncionario.setCargaHorariaSemanal(Integer.parseInt(jtfCargaHorariaSemanal.getText()));
            objModelFuncionario.setUsuario(jtfUsuario.getText());
            objModelFuncionario.setSenha(jtfSenha.getText());
            objModelFuncionario.setPermissao(permissaoSelecionada);
            objModelFuncionario.setAtividade(atividadeSelecionada);

            //Controller
            objControllerFuncionario.createFuncionarioController(objModelFuncionario);

        }

    }

    public void habilitaCampos(boolean status) {

        jtfNome.setEnabled(status);
        jftfCpf.setEnabled(status);
        jftfDataNascimento.setEnabled(status);
        jftfTelefone.setEnabled(status);
        jtfEmail.setEnabled(status);
        jrbFeminino.setEnabled(status);
        jrbMasculino.setEnabled(status);
        jrbOutro.setEnabled(status);
        jtfRua.setEnabled(status);
        jtfBairro.setEnabled(status);
        jtfNumero.setEnabled(status);
        jtfCidade.setEnabled(status);
        jcbEstado.setEnabled(status);
        jtfSalario.setEnabled(status);
        jtfCargaHorariaSemanal.setEnabled(status);
        jcbCargo.setEnabled(status);
        jtfUsuario.setEnabled(status);
        jtfSenha.setEnabled(status);
        jrbAdministrador.setEnabled(status);
        jrbComum.setEnabled(status);
        jrbAtivo.setEnabled(status);
        jrbInaivo.setEnabled(status);

    }

    public void limpaCampos() {

        jtfId.setText(null);
        jtfNome.setText(null);
        jftfCpf.setText(null);
        jftfDataNascimento.setText(null);
        jftfTelefone.setText(null);
        jtfEmail.setText(null);
        jrbOutro.setSelected(true);
        jtfRua.setText(null);
        jtfBairro.setText(null);
        jtfNumero.setText(null);
        jtfCidade.setText(null);
        jcbEstado.setSelectedItem("Selecione");
        jcbCargo.setSelectedItem("Selecione");
        jtfSalario.setText(null);
        jtfCargaHorariaSemanal.setText(null);
        jtfUsuario.setText(null);
        jtfSenha.setText(null);
        jrbComum.setSelected(true);
        jrbAtivo.setSelected(true);

    }

    public void selectFuncionario(ModelFuncionario objModelFuncionario) {

        jtfId.setText(String.valueOf(objModelFuncionario.getId()));
        jtfNome.setText(objModelFuncionario.getNome());
        jftfCpf.setText(objModelFuncionario.getCpf());
        jftfDataNascimento.setText(objModelFuncionario.getDataNascimento());

        //Genero selecionado
        if (objModelFuncionario.getGenero().equals("Feminino")) {

            jrbFeminino.setSelected(true);

        } else if (objModelFuncionario.getGenero().equals("Masculino")) {

            jrbMasculino.setSelected(true);
        } else {
            jrbOutro.setSelected(true);
        }

        jtfRua.setText(objModelFuncionario.getRua());
        jtfNumero.setText(objModelFuncionario.getNumero());
        jtfBairro.setText(objModelFuncionario.getBairro());
        jtfCidade.setText(objModelFuncionario.getCidade());

        //Estado
        jcbEstado.setSelectedItem(objModelFuncionario.getUf());

        jftfTelefone.setText(objModelFuncionario.getTelefone());
        jtfEmail.setText(objModelFuncionario.getEmail());
        jtfSalario.setText(String.valueOf(objModelFuncionario.getSalario()));

        //Cargo
        jcbCargo.setSelectedItem(objModelFuncionario.getCargo());

        jtfCargaHorariaSemanal.setText(String.valueOf(objModelFuncionario.getCargaHorariaSemanal()));
        jtfUsuario.setText(objModelFuncionario.getUsuario());
        jtfSenha.setText(objModelFuncionario.getSenha());

        //Persmissao
        if (objModelFuncionario.getPermissao().equals("Admin")) {
            jrbAdministrador.setSelected(true);
        } else {
            jrbComum.setSelected(true);
        }

        //Atividade
        if (objModelFuncionario.getAtividade().equals("Ativo")) {

            jrbAtivo.setSelected(true);

        } else {
            jrbInaivo.setSelected(true);
        }

    }

    private void updateFuncionario() {

        if (jtfNome.getText().isEmpty() || jftfCpf.getText().isEmpty() || jftfDataNascimento.getText().isEmpty() || jftfTelefone.getText().isEmpty() || jtfEmail.getText().isEmpty() || jtfRua.getText().isEmpty() || jtfNumero.getText().isEmpty() || jtfBairro.getText().isEmpty() || jtfCidade.getText().isEmpty() || jtfSalario.getText().isEmpty() || jtfCargaHorariaSemanal.getText().isEmpty() || jtfUsuario.getText().isEmpty() || jtfSenha.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);

        } else {

            String dataParaBanco = null;
            String estado = null;
            String cargo = null;

            //Convertendo data
            try {
                dataParaBanco = ConversorData.converterDataParaMySql(jftfDataNascimento.getText());

            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }

            //Pegando o RadioButton
            //sexo
            String sexoSelecionado;
            if (jrbFeminino.isSelected()) {
                sexoSelecionado = "Feminino";
            } else if (jrbMasculino.isSelected()) {
                sexoSelecionado = "Masculino";
            } else {
                sexoSelecionado = "Outro";
            }

            //Permissao
            String permissaoSelecionada;
            if (jrbComum.isSelected()) {
                permissaoSelecionada = "Comum";
            } else {
                permissaoSelecionada = "Admin";
            }

            //Atividade
            String atividadeSelecionada;
            if (jrbAtivo.isSelected()) {
                atividadeSelecionada = "Ativo";
            } else {
                atividadeSelecionada = "Inativo";
            }

            //Se Estado ou Cargo for "Selecione"
            if (jcbEstado.getSelectedItem() == "Selecione") {
                JOptionPane.showMessageDialog(rootPane, "Selecione um estado.", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {

                estado = (String) jcbEstado.getSelectedItem();
            }

            //Se cargo for "Selecione"
            if (jcbCargo.getSelectedItem() == "Selecione") {
                JOptionPane.showMessageDialog(rootPane, "Selecione um cargo.", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {

                cargo = (String) jcbCargo.getSelectedItem();
            }

            //SETTER
            objModelFuncionario.setId(Integer.parseInt(jtfId.getText()));
            objModelFuncionario.setNome(jtfNome.getText());
            objModelFuncionario.setCpf(jftfCpf.getText());
            objModelFuncionario.setDataNascimento(dataParaBanco);
            objModelFuncionario.setGenero(sexoSelecionado);
            objModelFuncionario.setRua(jtfRua.getText());
            objModelFuncionario.setNumero(jtfNumero.getText());
            objModelFuncionario.setBairro(jtfBairro.getText());
            objModelFuncionario.setCidade(jtfCidade.getText());
            objModelFuncionario.setUf(estado);
            objModelFuncionario.setTelefone(jftfTelefone.getText());
            objModelFuncionario.setEmail(jtfEmail.getText());
            objModelFuncionario.setSalario(Double.parseDouble(jtfSalario.getText()));
            objModelFuncionario.setCargo(cargo);
            objModelFuncionario.setCargaHorariaSemanal(Integer.parseInt(jtfCargaHorariaSemanal.getText()));
            objModelFuncionario.setUsuario(jtfUsuario.getText());
            objModelFuncionario.setSenha(jtfSenha.getText());
            objModelFuncionario.setPermissao(permissaoSelecionada);
            objModelFuncionario.setAtividade(atividadeSelecionada);

            //Controller
            objControllerFuncionario.updateFuncionarioController(objModelFuncionario);

        }
    }

    private void deleteFuncionario() {

        objModelFuncionario.setId(Integer.parseInt(jtfId.getText()));
        objControllerFuncionario.deleteFuncionarioController(objModelFuncionario);

    }

}
