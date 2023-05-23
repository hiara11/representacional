package dao;

import Util.ConnectionFactory;
import model.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static Util.ConnectionFactory.getConexao;

public class LoginDao {
    public static ArrayList<Login>buscarLogin() throws SQLException {
        ArrayList<Login>loginAux = new ArrayList<>();
        String sql = "INSERT INTO cliente (cli_cod, cli_nome, cli_dt_nasc, cli_curso, cli_fase, cli_senha) VALUES (?, ?,?,?,?,?)";
        Connection conn = getConexao();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Login login = new Login();
                login.setLogin(rs.getString("log_nome"));
                login.setSenha(rs.getString("log_senha"));
                loginAux.add(login);
            }
        return loginAux;
    }
}
