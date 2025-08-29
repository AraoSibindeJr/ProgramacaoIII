package Aulas.Aula04.VibeCode;

import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame {
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    public LabelFrame(){
        super("Testando Label ");
        setLayout(new FlowLayout());
        label1 = new JLabel("Label com texto");
        label1.setToolTipText("Este e o label1");
        add(label1);
        Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
        label2 = new JLabel("Label co  texto e Icone", SwingConstants.LEFT);
        label2.setToolTipText("Este e o label2");
        add(label2);
        label3 = new JLabel();
        label3.setText("Label com icone e botao");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);// Return
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);// Return
        label3.setToolTipText("Este e o label3");
        add(label3);



    }
}
