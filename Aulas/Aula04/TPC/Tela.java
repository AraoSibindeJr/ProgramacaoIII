package Aulas.Aula04.TPC;

import javax.swing.*;
import java.awt.*;

public class Tela extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnLogin;

    public Tela() {
        setTitle("Tela de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null); // Centraliza na tela

        // Inicializa os componentes
        initComponents();

        // Monta o layout
        setupLayout();

        // Mostra a janela
        setVisible(true);
        addEventos();
    }

    private void initComponents() {
        txtUsuario = new JTextField();
        txtSenha = new JPasswordField();
        btnLogin = new JButton("Entrar");

        // Melhorando aparência do botão
        btnLogin.setFocusPainted(false);
        btnLogin.setBackground(new Color(70, 130, 180));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFont(new Font("Arial", Font.BOLD, 14));

        // Campos de texto
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
        txtSenha.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    private void setupLayout() {
        JPanel painelCampos = new JPanel(new GridLayout(2, 2, 10, 10));
        painelCampos.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        painelCampos.add(new JLabel("Usuario:"));
        painelCampos.add(txtUsuario);
        painelCampos.add(new JLabel("Senha:"));
        painelCampos.add(txtSenha);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelBotoes.add(btnLogin);

        getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().add(painelCampos, BorderLayout.CENTER);
        getContentPane().add(painelBotoes, BorderLayout.SOUTH);
    }

    private void addEventos() {
        // Funcao Lambda
        btnLogin.addActionListener(e -> {
            // Fecha a janela
            dispose();
            // Encerra o programa
            System.exit(0);
        });
    }
}
