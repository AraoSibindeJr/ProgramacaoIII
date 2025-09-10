package Aulas.Aula05.Teorica;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageIcone {

    private JFrame frame;
    private  javax.swing.ImageIcon image;
    private JLabel titulo;

    public ImageIcone() {
        frame = new JFrame();
        frame.setTitle("Imagem");
        frame.setSize(800,600);
        frame.setLocation(50,50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());


        image = new ImageIcon("C:/Users/Araozinho/Documents/ISUTC/EngenhariaeCienciadeComputadores/2Ano/IISemestre/ProgramacaoIII/Materialdeapoio/Aula05/javaLogo.jpg");


        titulo = new JLabel(image);
        frame.add(titulo);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageIcone();
    }
}