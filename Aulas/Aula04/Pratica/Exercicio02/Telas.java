package Aulas.Aula04.Pratica.Exercicio02;
import javax.swing.*;
import java.awt.*;
public class Telas extends JFrame{

            public Telas() {
            // Define o título da janela

            // Define o layout da janela como uma grade de 4 linhas e 3 colunas
            setLayout(new GridLayout(4, 3, 5, 5));
            // 4 linhas, 3 colunas, 5px de espaçamento horizontal e vertical

            // Adiciona os botões numerados de 1 a 12
            for (int i = 1; i <= 12; i++) {
                JButton button = new JButton("Botao" + i);
                add(button);
            }

            // Configurações da janela
            setSize(600, 400);  // Largura x Altura
            setLocationRelativeTo(null); // Centraliza a janela
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

        public static void main(String[] args) {
            // Executa a aplicação
            SwingUtilities.invokeLater(Telas::new);
        }

}
