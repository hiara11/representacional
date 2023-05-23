package dao;

import model.Cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static Util.ConnectionFactory.getConexao;

public class CadastroDao {
    public static ArrayList<Cadastro> realizacadastros() throws SQLException {
        ArrayList<Cadastro>cadastroAux = new ArrayList<>();
        String sql1 = "select log_nome, log_senha from login";
        Connection conn = getConexao();
        PreparedStatement ps = conn.prepareStatement(sql1);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Cadastro cadastro = new Cadastro();
            cadastro.setNome(rs.getString("cli_nome"));
            cadastro.setNascimento(rs.getDate("cli_dt_nasc"));
            cadastroAux.add(cadastro);
        }
        return cadastroAux;
    }
}
