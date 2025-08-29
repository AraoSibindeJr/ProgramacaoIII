package Aulas.Aula03.Teorica;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PrimeiraTela {
    public static void main(String args []) {
        JFrame tela01 = new JFrame();
        JFrame tela02 = new JFrame();
        JButton bt = new JButton("B1");
        // Alteracoes da Tela 01
        //tela01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //tela01.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela01.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela01.setTitle("Tela 01");
        tela01.setSize(450,450);
        tela01.setLocation(50,50);
        tela01.add(bt);
        tela01.setVisible(true); // Recomendavel a esstar no fim das instrucoes

        // Alteracoes na Tela02
        //tela02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela02.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //tela02.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela02.setTitle("Tela 02");
        tela02.setSize(450,450);
        tela02.setVisible(true);
    }
}
