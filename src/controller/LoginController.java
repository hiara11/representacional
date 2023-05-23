package controller;
import dao.LoginDao;
import model.Login;

import java.sql.SQLException;
import java.util.ArrayList;

public class LoginController extends Exception{
    public ArrayList<Login>buscarLoginSenha() throws SQLException, ClassNotFoundException{
        return LoginDao.buscarLogin();
    }
}
