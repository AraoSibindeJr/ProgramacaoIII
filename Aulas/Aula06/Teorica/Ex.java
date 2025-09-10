package Aulas.Aula06.Teorica;

import javax.swing.*;
import java.awt.*;

public class Ex {
    public static void main(String[] args) {
        // Criar janela
        JFrame frame = new JFrame("Tela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(1, 2)); // dividir em 2 colunas (imagem | botões)

        // Painel da esquerda (imagem)
        JPanel painelEsquerda = new JPanel();
        painelEsquerda.setBackground(Color.LIGHT_GRAY);

        // Adicionar imagem
        JLabel logo = new JLabel(new ImageIcon("Aulas/Aula06/Teorica/1 ano (29).jpg"));
        painelEsquerda.add(logo);

        // Painel da direita (botoes)
        JPanel painelDireita = new JPanel();
        painelDireita.setBackground(Color.CYAN);
        painelDireita.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // Botao Cancelar (verde com borda)
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBackground(Color.GREEN);
        btnCancelar.setForeground(Color.BLACK);
        btnCancelar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Botão Submeter (cinzento)
        JButton btnSubmeter = new JButton("Submeter");
        btnSubmeter.setBackground(Color.GRAY);
        btnSubmeter.setForeground(Color.BLACK);

        // Botão Limpar (amarelo)
        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setBackground(Color.ORANGE);
        btnLimpar.setForeground(Color.BLACK);

        // Adicionar botões ao painel direito
        painelDireita.add(btnCancelar);
        painelDireita.add(btnSubmeter);
        painelDireita.add(btnLimpar);

        // Adicionar painéis à janela
        frame.add(painelEsquerda);
        frame.add(painelDireita);

        // Mostrar janela
        frame.setVisible(true);
    }
}