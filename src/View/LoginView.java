package View;

import controller.LoginController;
import model.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

public class LoginView extends JFrame{
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton btnLogin;
    private JButton btnLimpar;
    private JPanel PNLTelaLogin;
    private JButton btnCadastrar;

    public LoginView(){
        initComponents();
        listeners();
    }
    public void listeners() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = txtLogin.getText();
                char[] senha = txtSenha.getPassword();
                try{
                    LoginController lc = new LoginController();
                    ArrayList<Login> loginsList = lc.buscarLoginSenha();
                    for (Login l: loginsList){
                        if(l.getLogin().equalsIgnoreCase(new String(senha))){
                            System.out.println("Login validado");
                            Questionario q = new Questionario();
                            dispose();
                        }else{
                            showMessageDialog(null,
                                    "Senha inválida",
                                    "ERRO",
                                    JOptionPane.ERROR_MESSAGE);
                            txtSenha.setBackground(Color.RED);
                        }
                    }
                }catch (SQLException ex) {
                    showMessageDialog(null,
                            "Erro na conexão: " + ex.getMessage(),
                            "Erro 46",
                            JOptionPane.ERROR_MESSAGE);
                }catch (ClassNotFoundException ex){
                    showMessageDialog(null,
                            "Erro: Classe não encontrada",
                            "ERRO",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLogin.setText("");
                txtSenha.setText("");
            }
        });
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadastro tc = new TelaCadastro();
                dispose();
            }
        });
    }

    private void initComponents(){
        setExtendedState(MAXIMIZED_BOTH);
        setContentPane(PNLTelaLogin);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        setVisible(true);
    }
    public static void main(String[] args){
        LoginView telaLogin = new LoginView();
    }
    public void createUIComponents(){

    }
}
