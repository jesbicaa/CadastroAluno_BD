package aula0308b;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ListarAlunos {
    public static void main(String[] args){
        Connection conn = Conexao.getConexao();
        String sql = "SELECT * FROM aluno";
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String ra = rs.getString("ra");
                
                System.out.println("Id: " + id 
                                 + "\nNome: " + nome
                                 + "\nRA: " + ra
                                 + "\n*************************\n");
            }
            
        } catch (Exception e) {
            System.out.println("Erro buscar os alunos: " + e.getMessage());
        }
    }
}
