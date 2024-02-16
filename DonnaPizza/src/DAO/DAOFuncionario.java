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
        con = ConnectionFactory.getConnection(); // Cria uma conexão com o BD

        try {
            String sql = "SELECT * FROM funcionario WHERE usuario=? AND senha=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, objModelFuncionario.getUsuario());
            pstm.setString(2, objModelFuncionario.getSenha());
            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar autenticar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

}
