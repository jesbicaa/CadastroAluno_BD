package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static Connection getConexao(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/aula0308?serverTimezone=UTC", "root", "");
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
        return null;
    }
}
