package Aulas.Aula03.Pratica;
import javax.swing.JButton;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Layouts03 {
    private static JFrame tela;
    private static JButton bt;
    private static JButton bt2 ;
    private static JButton bt3 ;
    public static void main(String[] args) {
        tela = new JFrame();
        bt = new JButton("Botao 1");
        bt2 = new JButton("Botao 2");
        bt3 = new JButton("Botao 3");

        tela.setVisible(true);
        propriedadesTela();
        definicaoLayout();
        addElemntos();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ao fechar a janela, para execucao do programa
    }
    public static void propriedadesTela(){
        tela.setSize(5500, 300);
        tela.setVisible(true);
    }

    public static void definicaoLayout(){
        BorderLayout border = new BorderLayout();
        tela.setLayout(border);
    }

    public static void addElemntos(){
        tela.add(bt,BorderLayout.NORTH);
        tela.add(bt2,BorderLayout.SOUTH);
        tela.add(bt3,BorderLayout.CENTER);
    }
}
