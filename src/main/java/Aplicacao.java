import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aplicacao {
    private JFrame frame;
    private JTextField txtNome, txtSobrenome, txtCPF, txtDataNasc, txtEndereco;
    private JTextArea textArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Aplicacao window = new Aplicacao();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Aplicacao() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

        JPanel panelCadastro = new JPanel();
        tabbedPane.addTab("Cadastro", null, panelCadastro, null);
        panelCadastro.setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 10, 80, 25);
        panelCadastro.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 10, 160, 25);
        panelCadastro.add(txtNome);

        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setBounds(10, 40, 80, 25); // Altere a posição y para 40
        panelCadastro.add(lblCPF);

        txtCPF = new JTextField();
        txtCPF.setBounds(100, 40, 160, 25); // Altere a posição y para 40
        panelCadastro.add(txtCPF);

        txtDataNasc = new JTextField();
        txtDataNasc.setBounds(100, 70, 160, 25); // Altere a posição y para 70
        panelCadastro.add(txtDataNasc);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(10, 70, 80, 25);
        panelCadastro.add(lblTelefone);

        JTextField txtTelefone = new JTextField();
        txtTelefone.setBounds(100, 70, 160, 25);
        panelCadastro.add(txtTelefone);

        JLabel lblEmail = new JLabel("E-mail:");
        lblEmail.setBounds(10, 100, 80, 25);
        panelCadastro.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(100, 100, 160, 25);
        panelCadastro.add(txtEmail);

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setBounds(10, 130, 80, 25);
        panelCadastro.add(lblEndereco);

        JTextField txtEndereco = new JTextField();
        txtEndereco.setBounds(100, 130, 160, 25);
        panelCadastro.add(txtEndereco);

        JLabel lblCEP = new JLabel("CEP:");
        lblCEP.setBounds(10, 160, 80, 25);
        panelCadastro.add(lblCEP);

        JTextField txtCEP = new JTextField();
        txtCEP.setBounds(100, 160, 160, 25);
        panelCadastro.add(txtCEP);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(10, 200, 150, 25);
        panelCadastro.add(btnCadastrar);

        JPanel panelExibicao = new JPanel();
        tabbedPane.addTab("Exibição", null, panelExibicao, null);
        panelExibicao.setLayout(new BorderLayout());

        textArea = new JTextArea();
        panelExibicao.add(textArea, BorderLayout.CENTER);

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(txtNome.getText() + "\n");
                textArea.append(txtCPF.getText() + "\n");
                textArea.append(txtTelefone.getText() + "\n");
                textArea.append(txtEmail.getText() + "\n");
                textArea.append(txtEndereco.getText() + "\n");
                textArea.append(txtCEP.getText() + "\n");
                textArea.append("- - - - - - - - - - - - - - -\n\n");

                txtNome.setText("");
                txtCPF.setText("");
                txtTelefone.setText("");
                txtEmail.setText("");
                txtEndereco.setText("");
                txtCEP.setText("");
                
                txtNome.requestFocus();

                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            }
        });
    }
}
