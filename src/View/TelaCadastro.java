package View;

import View.Questionario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class TelaCadastro extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton btnEnviar;
    private JLabel txtNome;
    private JLabel txtDataNasc;
    private JLabel txtCurso;
    private JLabel txtFase;
    private JPanel PNLTelaCadastro;
    private JTextField txtSenha;
public TelaCadastro(){
    //Conecta();
    AddListeners();
    IniciarComponentes();
}
    /*
    public void Conecta(){
        this.bd = new Util.Bd();
        this.conn = this.bd.getConexao();
    }*/
public void AddListeners(){
    btnEnviar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = txtNome.getText();
            String dataNasc = txtDataNasc.getText();
            String curso = txtCurso.getText();
            String fase = txtFase.getText();
            String senha = txtSenha.getText();

            Questionario questionario = new Questionario();
            questionario.setVisible(true);
            dispose();
        }
    });
}
    public void IniciarComponentes () {
        JPanel TelaCadastro = new JPanel();
        setExtendedState(MAXIMIZED_BOTH);
        setContentPane(PNLTelaCadastro);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setVisible(true);
    }
}