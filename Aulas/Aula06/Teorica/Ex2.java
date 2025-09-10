package Aulas.Aula06.Teorica;

import javax.swing.*;
import java.awt.*;

public class Ex2 {
    private JFrame tela;

    private JPanel panel_1;
    private JPanel panel_2;

    private JLabel label_image;

    private JButton jbt_cancelar;
    private JButton jbt_limpar;
    private JButton jbt_submeter;

    Ex2(){
        darLayout();
        addElementos();
        tela.setVisible(true);
    }

    private void addElementos(){
        panel_1.add(label_image);
        tela.add(panel_1);

        panel_2.add(jbt_cancelar);
        panel_2.add(jbt_limpar);
        panel_2.add(jbt_submeter);
        tela.add(panel_2);

    }

    private  void darLayout(){
        tela.setLayout(new GridLayout(1,2));

    }
}
