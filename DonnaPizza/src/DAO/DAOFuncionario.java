package DAO;

import connection.ConnectionFactory;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelFuncionario;
import utils.VerificarCpf;

public class DAOFuncionario {
    
    ArrayList<ModelFuncionario> lista = new ArrayList<>();
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public ResultSet autenticarFuncionario(ModelFuncionario objModelFuncionario) {
        conn = ConnectionFactory.getConnection(); // Cria uma conexão com o BD

        try {
            String sql = "SELECT * FROM funcionario WHERE usuario=? AND senha=?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objModelFuncionario.getUsuario());
            pstm.setString(2, objModelFuncionario.getSenha());
            rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar autenticar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void createFuncionario(ModelFuncionario objModelFuncionario) {
        
        conn = ConnectionFactory.getConnection(); // Cria uma conexão com o BD
        String sql = "INSERT INTO funcionario (nome, cpf, data_nascimento, genero, rua, numero, bairro, cidade, uf, telefone, email, salario, cargo, carga_horaria_semanal, usuario, senha, permissao, atividade)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            
            pstm = conn.prepareStatement(sql);

            // Verificar se o CPF já existe no banco de dados
            if (VerificarCpf.verificarCPF(objModelFuncionario.getCpf(), conn)) {
                JOptionPane.showMessageDialog(null, "CPF já cadastrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            pstm.setString(1, objModelFuncionario.getNome());
            pstm.setString(2, objModelFuncionario.getCpf());
            pstm.setString(3, objModelFuncionario.getDataNascimento());
            pstm.setString(4, objModelFuncionario.getGenero());
            pstm.setString(5, objModelFuncionario.getRua());
            pstm.setString(6, objModelFuncionario.getNumero());
            pstm.setString(7, objModelFuncionario.getBairro());
            pstm.setString(8, objModelFuncionario.getCidade());
            pstm.setString(9, objModelFuncionario.getUf());
            pstm.setString(10, objModelFuncionario.getTelefone());
            pstm.setString(11, objModelFuncionario.getEmail());
            pstm.setDouble(12, objModelFuncionario.getSalario());
            pstm.setString(13, objModelFuncionario.getCargo());
            pstm.setInt(14, objModelFuncionario.getCargaHorariaSemanal());
            pstm.setString(15, objModelFuncionario.getUsuario());
            pstm.setString(16, objModelFuncionario.getSenha());
            pstm.setString(17, objModelFuncionario.getPermissao());
            pstm.setString(18, objModelFuncionario.getAtividade());
            
            int add = pstm.executeUpdate();
            pstm.close();
            
            if (add > 0) {
                
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
            }            
            
        } catch (HeadlessException | SQLException e) {

            //JOptionPane.showMessageDialog(null, "FuncionarioDAO-Cadastrar: " + e);
            JOptionPane.showMessageDialog(null, "Erro no cadastro de funcionário.", "Erro", JOptionPane.ERROR_MESSAGE);
            //System.out.println(e.getMessage());
            
        } finally {
            
            ConnectionFactory.closeConnection(conn, pstm);
            
        }
        
    }
    
    public ModelFuncionario readFuncionario(int idFuncionario) {
        
        ModelFuncionario objModelFuncionario = new ModelFuncionario();
        conn = ConnectionFactory.getConnection(); // Cria uma conexão com o BD
        String sql = "SELECT * FROM funcionario WHERE pk_id_funcionario = ?";
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                objModelFuncionario.setId(rs.getInt(1));
                
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao retornar lista de funcionario" + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conn, pstm, rs);
            
        }
        
        return objModelFuncionario;
        
    }
    
    public ArrayList<ModelFuncionario> returnListFuncionarioDAO() {
        
        ArrayList<ModelFuncionario> listModelFuncionario = new ArrayList<>();
        
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM FUNCIONARIO";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                ModelFuncionario objModelFuncionario = new ModelFuncionario();
                objModelFuncionario.setId(rs.getInt("pk_id_funcionario"));
                objModelFuncionario.setNome(rs.getString("nome"));
                objModelFuncionario.setCpf(rs.getString("cpf"));
                objModelFuncionario.setDataNascimento(rs.getString("data_nascimento"));
                objModelFuncionario.setGenero(rs.getString("genero"));
                objModelFuncionario.setRua(rs.getString("rua"));
                objModelFuncionario.setNumero(rs.getString("numero"));
                objModelFuncionario.setBairro(rs.getString("bairro"));
                objModelFuncionario.setCidade(rs.getString("cidade"));
                objModelFuncionario.setUf(rs.getString("uf"));
                objModelFuncionario.setTelefone(rs.getString("telefone"));
                objModelFuncionario.setEmail(rs.getString("email"));
                objModelFuncionario.setSalario(rs.getDouble("salario"));
                objModelFuncionario.setCargo(rs.getString("cargo"));
                objModelFuncionario.setCargaHorariaSemanal(rs.getInt("carga_horaria_semanal"));
                objModelFuncionario.setUsuario(rs.getString("usuario"));
                objModelFuncionario.setSenha(rs.getString("senha"));
                objModelFuncionario.setPermissao(rs.getString("permissao"));
                objModelFuncionario.setAtividade(rs.getString("atividade"));
                
                listModelFuncionario.add(objModelFuncionario);
            }
            
        } catch (SQLException e) {
            System.out.println("Erro na ArrayList<ModelFuncionario> " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conn, pstm, rs);
        }
        
        return listModelFuncionario;
    }
    
    public void updateFuncionario(ModelFuncionario objModelFuncionario) {
        
        conn = ConnectionFactory.getConnection();
        String sql = "UPDATE FUNCIONARIO SET nome = ?, cpf = ?, data_nascimento = ?, genero = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, telefone = ?, email = ?, salario = ?, cargo = ?, carga_horaria_semanal = ?, usuario = ?, senha = ?, permissao = ?, atividade = ? WHERE pk_id_funcionario = ?";
        
        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objModelFuncionario.getNome());
            pstm.setString(2, objModelFuncionario.getCpf());
            pstm.setString(3, objModelFuncionario.getDataNascimento());
            pstm.setString(4, objModelFuncionario.getGenero());
            pstm.setString(5, objModelFuncionario.getRua());
            pstm.setString(6, objModelFuncionario.getNumero());
            pstm.setString(7, objModelFuncionario.getBairro());
            pstm.setString(8, objModelFuncionario.getCidade());
            pstm.setString(9, objModelFuncionario.getUf());
            pstm.setString(10, objModelFuncionario.getTelefone());
            pstm.setString(11, objModelFuncionario.getEmail());
            pstm.setDouble(12, objModelFuncionario.getSalario());
            pstm.setString(13, objModelFuncionario.getCargo());
            pstm.setInt(14, objModelFuncionario.getCargaHorariaSemanal());
            pstm.setString(15, objModelFuncionario.getUsuario());
            pstm.setString(16, objModelFuncionario.getSenha());
            pstm.setString(17, objModelFuncionario.getPermissao());
            pstm.setString(18, objModelFuncionario.getAtividade());
            pstm.setInt(19, objModelFuncionario.getId());
            
            int update = pstm.executeUpdate();
            pstm.close();
            
            if (update > 0) {
                
                JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        } catch (HeadlessException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na alteração de funcionário.", "Erro", JOptionPane.ERROR_MESSAGE);
            //System.out.println(e.getMessage());
            
        } finally {
            ConnectionFactory.closeConnection(conn, pstm);
            
        }
        
    }
    
    public void deleteFuncionario(ModelFuncionario objModelFuncionario) {
        conn = ConnectionFactory.getConnection();
        String sql = "DELETE FROM FUNCIONARIO WHERE pk_id_funcionario = ?";
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objModelFuncionario.getId());
            
            int delete = pstm.executeUpdate();
            pstm.close();
            
            if (delete > 0) {
                
                JOptionPane.showMessageDialog(null, "Funcionário deletado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão de funcionário.", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            
        } finally {
            ConnectionFactory.closeConnection(conn, pstm);
        }
        
    }
    
}
