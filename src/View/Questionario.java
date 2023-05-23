package View;

import javax.swing.*;

public class Questionario extends JFrame{
    private JComboBox resultC1;
    private JComboBox resultA1;
    private JComboBox resultV1;
    private JComboBox resultD1;
    private JComboBox resultA2;
    private JComboBox resultV2;
    private JComboBox resultD2;
    private JComboBox resultC2;
    private JComboBox resultV3;
    private JComboBox resultC3;
    private JComboBox resultD3;
    private JComboBox resultA3;
    private JComboBox resultA4;
    private JComboBox resultD4;
    private JComboBox resultC4;
    private JComboBox resultV4;
    private JComboBox resultA5;
    private JComboBox resultD5;
    private JComboBox resultC5;
    private JComboBox resultV5;
    private JScrollPane PNLQuestionario;

    public Questionario() {
        IniciarComponentes();
    }

    public void IniciarComponentes() {
        JPanel Questionario = new JPanel();
        setExtendedState(MAXIMIZED_BOTH);
        setContentPane(PNLQuestionario);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setVisible(true);
    }
}
