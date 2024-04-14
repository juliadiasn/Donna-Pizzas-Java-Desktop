package utils;

import java.sql.*;

public class VerificarCpf {

    // Método para verificar se um CPF existe no banco de dados
    public static boolean verificarCPF(String cpf, Connection conn) {
        try ( PreparedStatement stmt = conn.prepareStatement(
                "SELECT cpf FROM cliente WHERE cpf = ? UNION SELECT cpf FROM funcionario WHERE cpf = ?")) {
            // Define o valor do parâmetro do CPF nas duas consultas preparadas
            stmt.setString(1, cpf);
            stmt.setString(2, cpf);

            // Executa a consulta preparada
            ResultSet rs = stmt.executeQuery();

            // Verifica se o resultado da consulta retornou alguma linha
            return rs.next(); // Retorna true se o CPF existe, false caso contrário
        } catch (SQLException e) {
            // Tratar exceções, se necessário
            System.out.println(e.getMessage());
            return false;
        }
    }
}
