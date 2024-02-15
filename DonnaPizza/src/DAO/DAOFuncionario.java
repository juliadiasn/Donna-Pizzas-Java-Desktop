package DAO;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelFuncionario;

public class DAOFuncionario {

    ArrayList<ModelFuncionario> lista = new ArrayList<>();
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ConnectionFactory conFactory;

    public ResultSet autenticarFuncionario(ModelFuncionario objModelFuncionario) {

        try {

            String sql = "select * from funcionario where usuario=? and senha=?;";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, objModelFuncionario.getUsuario());
            pstm.setString(2, objModelFuncionario.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException e) {
            // JOptionPane.showMessageDialog(null, "TelaLogin - Logar: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao tentar autenticar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
            conFactory.closeConnection(con, pstm, rs);
        }
    }
}

/**
 *
 * CREATE TABLE IF NOT EXISTS funcionario (
 * pk_id_funcionario SERIAL PRIMARY KEY,
 * funcionario_nome VARCHAR(300) NOT NULL,
 * funcionario_cpf VARCHAR(14) NOT NULL UNIQUE,
 * funcionario_data_nascimento DATE NOT NULL,
 * funcionario_sexo VARCHAR(20) NOT NULL,
 * funcionario_rua VARCHAR(200) NOT NULL,
 * funcionario_numero VARCHAR(10) NOT NULL,
 * funcionario_bairro VARCHAR(100) NOT NULL,
 * funcionario_cidade VARCHAR(100) NOT NULL,
 * funcionario_uf CHAR(2) NOT NULL,
 * funcionario_telefone VARCHAR(15) NOT NULL UNIQUE,
 * funcionario_email VARCHAR(1000) NOT NULL UNIQUE,
 * funcionario_salario DOUBLE(10 , 2 ) NOT NULL,
 * funcionario_cargo VARCHAR(50) NOT NULL,
 * funcionario_carga_horaria_semanal INT(2) NOT NULL,
 * funcionario_usuario VARCHAR(100) NOT NULL UNIQUE,
 * funcionario_senha VARCHAR(20) NOT NULL UNIQUE,
 * funcionario_permissao VARCHAR(5) NOT NULL,
 * funcionario_atividade VARCHAR(8) NOT NULL
 * );
 *
 *
 * @author julia
 */
