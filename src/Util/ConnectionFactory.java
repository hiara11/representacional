package Util;
        import javax.swing.*;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/Representacional";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    public static Connection getConexao() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);

            if (conexao != null) {
                System.out.println("Conexão estabelecida!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na conexão: " + e.getMessage(),
                    "Erro 46", JOptionPane.ERROR_MESSAGE);
        }
        return conexao;
    }
    public static void main(String[] args) {
        //Util.ConnectionFactory connectionFactory = new Util.ConnectionFactory();
        getConexao();
    }
}