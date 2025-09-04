package Aulas.Aula04.Pratica.Exercicio01;
import javax.swing.*;
import java.awt.*;
public class Tela {
    public static class tela {
        public static void main(String[] args) {
            JFrame frame = new JFrame("O gerenciador FlowLayout");
            frame.setLayout(new FlowLayout());

            JButton btnVoltar = new JButton("Voltar");
            JButton btnProximo = new JButton("Próximo");
            JButton btnCancelar = new JButton("Cancelar");

            frame.add(btnVoltar);
            frame.add(btnProximo);
            frame.add(btnCancelar);

            frame.setSize(400, 200); // largura, altura
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null); // centralizar a janela
            frame.setVisible(true);
        }
    }
}
