package view.list;

import controller.ControllerFuncionario;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelFuncionario;
import view.viewFuncionario;
import static utils.ConversorData.converterDataParaJava;

public class ListFuncionario extends javax.swing.JFrame {

    private viewFuncionario objViewFuncionario;
    ModelFuncionario objModelFuncionario = new ModelFuncionario();
    ControllerFuncionario objControllerFuncionario = new ControllerFuncionario();

    public void setObjViewFuncionario(viewFuncionario objViewFuncionario) {
        this.objViewFuncionario = objViewFuncionario;
    }

    public ListFuncionario() {
        initComponents();
        readFuncionario();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFuncionario = new javax.swing.JTable();
        jbSelecionar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de funcionários");

        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 458));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "DN", "Sexo", "Rua", "Número", "Bairro", "Cidade", "Estado", "Email", "Salário", "Cargo", "Cargo", "Carga Horária", "Usuário", "Senha", "Permissão", "Atividade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFuncionario.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tableFuncionario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableFuncionario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableFuncionario.setShowGrid(true);
        tableFuncionario.getTableHeader().setReorderingAllowed(false);
        tableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableFuncionario);

        jbSelecionar.setText("Selecionar");
        jbSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecionarActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSelecionar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbPesquisar)))
                        .addGap(0, 136, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSelecionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarActionPerformed

        setListCampos();

    }//GEN-LAST:event_jbSelecionarActionPerformed

    private void tableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFuncionarioMouseClicked
        if (evt.getClickCount() == 2) {

            setListCampos();
        }
    }//GEN-LAST:event_tableFuncionarioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JTable tableFuncionario;
    // End of variables declaration//GEN-END:variables

    public void readFuncionario() {

        ArrayList<ModelFuncionario> listModelFuncionario = new ArrayList<>();
        ControllerFuncionario objControllerFuncionario = new ControllerFuncionario();

        listModelFuncionario = objControllerFuncionario.returnListFuncionarioController();
        DefaultTableModel model = (DefaultTableModel) tableFuncionario.getModel();
        model.setRowCount(0);

        for (ModelFuncionario objModelFuncionario : listModelFuncionario) {
            try {
                // Convertendo a data de nascimento para o formato desejado
                String dataNascimentoFormatada = converterDataParaJava(objModelFuncionario.getDataNascimento());

                // Adicionando uma nova linha à tabela com a data formatada
                model.addRow(new Object[]{
                    objModelFuncionario.getId(),
                    objModelFuncionario.getNome(),
                    objModelFuncionario.getCpf(),
                    dataNascimentoFormatada, // Aqui está a data formatada
                    objModelFuncionario.getGenero(),
                    objModelFuncionario.getRua(),
                    objModelFuncionario.getNumero(),
                    objModelFuncionario.getBairro(),
                    objModelFuncionario.getCidade(),
                    objModelFuncionario.getUf(),
                    objModelFuncionario.getTelefone(),
                    objModelFuncionario.getEmail(),
                    objModelFuncionario.getSalario(),
                    objModelFuncionario.getCargo(),
                    objModelFuncionario.getCargaHorariaSemanal(),
                    objModelFuncionario.getUsuario(),
                    objModelFuncionario.getSenha(),
                    objModelFuncionario.getPermissao(),
                    objModelFuncionario.getAtividade()
                });
            } catch (ParseException e) {
                // Se ocorrer algum erro na conversão da data, imprima o erro e continue para o próximo funcionário

                JOptionPane.showMessageDialog(null, "Erro na conversão de dara", "Erro", JOptionPane.ERROR_MESSAGE);

                //e.getMessage();
            }
        }
    }

    private void setListCampos() {
        int set = tableFuncionario.getSelectedRow();

        if (tableFuncionario.getSelectedRow() != -1) {

            ModelFuncionario objModelFuncionario = new ModelFuncionario();
            objModelFuncionario.setId(Integer.parseInt(tableFuncionario.getValueAt(set, 0).toString()));
            objModelFuncionario.setNome(tableFuncionario.getValueAt(set, 1).toString());
            objModelFuncionario.setCpf(tableFuncionario.getValueAt(set, 2).toString());
            objModelFuncionario.setDataNascimento(tableFuncionario.getValueAt(set, 3).toString());
            objModelFuncionario.setGenero(tableFuncionario.getValueAt(set, 4).toString());
            objModelFuncionario.setRua(tableFuncionario.getValueAt(set, 5).toString());
            objModelFuncionario.setNumero(tableFuncionario.getValueAt(set, 6).toString());
            objModelFuncionario.setBairro(tableFuncionario.getValueAt(set, 7).toString());
            objModelFuncionario.setCidade(tableFuncionario.getValueAt(set, 8).toString());
            objModelFuncionario.setUf(tableFuncionario.getValueAt(set, 9).toString());
            objModelFuncionario.setTelefone(tableFuncionario.getValueAt(set, 10).toString());
            objModelFuncionario.setEmail(tableFuncionario.getValueAt(set, 11).toString());
            objModelFuncionario.setSalario(Double.parseDouble((tableFuncionario.getValueAt(set, 12).toString())));
            objModelFuncionario.setCargo((tableFuncionario.getValueAt(set, 13).toString()));
            objModelFuncionario.setCargaHorariaSemanal(Integer.parseInt((tableFuncionario.getValueAt(set, 14).toString())));
            objModelFuncionario.setUsuario((tableFuncionario.getValueAt(set, 15).toString()));
            objModelFuncionario.setSenha((tableFuncionario.getValueAt(set, 16).toString()));
            objModelFuncionario.setPermissao((tableFuncionario.getValueAt(set, 17).toString()));
            objModelFuncionario.setAtividade((tableFuncionario.getValueAt(set, 18).toString()));

            //Inserir na view
            objViewFuncionario.selectFuncionario(objModelFuncionario);
            this.dispose();

            //Habilitando botões e campos
            objViewFuncionario.jbAdicionar.setEnabled(false);
            objViewFuncionario.jbAlterar.setEnabled(true);
            objViewFuncionario.jbCancelar.setEnabled(true);
            objViewFuncionario.jbSalvar.setEnabled(true);
            objViewFuncionario.jbExcluir.setEnabled(true);

        }

    }



}
