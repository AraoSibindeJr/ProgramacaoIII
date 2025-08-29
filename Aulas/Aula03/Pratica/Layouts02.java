package Aulas.Aula03.Pratica;
import javax.swing.JButton;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Layouts02 {
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

    }
    public static void propriedadesTela(){
        tela.setSize(5500, 300);
        tela.setVisible(true);
    }

    public static void definicaoLayout(){
        GridLayout flow = new GridLayout(2,2,3,3);
        tela.setLayout(flow);
    }

    public static void addElemntos(){
        tela.add(bt);
        tela.add(bt2);
        tela.add(bt3);
    }
}
