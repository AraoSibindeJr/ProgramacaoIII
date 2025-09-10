package Aulas.Aula05.TPC;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Telas implements ActionListener {
    private JFrame tela;

    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;

    //tela centro
    private JPanel panel_centro;

    //tela 1
    private JPanel panel_tela_1;
    private JLabel lable_tela_1;

    //tela 2
    private JPanel panel_tela_2;
    private JButton button_tela_2;

    //tela 3
    private JPanel panel_tela_3;
    private JTextField textfield_tela_3;

    //tela 4
    private JPanel panel_tela_4;
    private JComboBox combo_box_tela_4;

    public Telas() {
        instanciar();
        propriedadesTela();
        definirLayout();
        adicionarElementos();
        darAccao();
        tela.setVisible(true);
    }

    private void darAccao() {
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
    }

    private void instanciar() {
        tela= new JFrame("Card Layout");
        bt1 = new JButton("BUTTON 1");
        bt2 = new JButton("BUTTON 2");
        bt3 = new JButton("BUTTON 3");
        bt4 = new JButton("BUTTON 4");

        //tela centro
        panel_centro=new JPanel();

        //tela 1
        panel_tela_1= new JPanel();
        lable_tela_1 = new JLabel("LABEL");

        //tela 2
        panel_tela_2= new JPanel();
        button_tela_2 = new JButton("BUTTON");

        //tela 3
        panel_tela_3= new JPanel();
        textfield_tela_3 = new JTextField(14);

        //tela 4
        panel_tela_4= new JPanel();
        String [] cores = {"Amarelo","Verde"};
        combo_box_tela_4 = new JComboBox(cores);

    }

    private void definirLayout() {

        //tela centro
        panel_centro.setLayout(new CardLayout());

        //tela 1
        panel_tela_1.setLayout(new FlowLayout());

        //tela 2
        panel_tela_2.setLayout(new FlowLayout());

        //tela 3
        panel_tela_3.setLayout(new FlowLayout());

        //tela 4
        panel_tela_4.setLayout(new FlowLayout());
    }

    private void propriedadesTela(){
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(800,600);
    }

    private void adicionarElementos() {
        tela.add(bt1,BorderLayout.NORTH);
        tela.add(bt2,BorderLayout.SOUTH);
        tela.add(bt3,BorderLayout.WEST);
        tela.add(bt4,BorderLayout.EAST);
        tela.add(panel_centro,BorderLayout.CENTER);

        //tela 1
        panel_tela_1.add(lable_tela_1);
        panel_centro.add(panel_tela_1,"tela1");


        //tela 2
        panel_tela_2.add(button_tela_2);
        panel_centro.add(panel_tela_2,"tela2");

        //tela 3
        panel_tela_3.add(textfield_tela_3);
        panel_centro.add(panel_tela_3,"tela3");

        //tela 4
        panel_tela_4.add(combo_box_tela_4);
        panel_centro.add(panel_tela_4,"tela4");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout card = (CardLayout)panel_centro.getLayout();

        if(e.getSource()==bt1) {
            System.out.println("BT 1");
            card.show(panel_centro, "tela1");
        }else
        if(e.getSource()==bt2) {
            System.out.println("BT 2");
            card.show(panel_centro, "tela2");
        }else
        if(e.getSource()==bt3) {
            System.out.println("BT 3");
            card.show(panel_centro, "tela3");
        }else
        if(e.getSource()==bt4) {
            System.out.println("BT 4");
            card.show(panel_centro, "tela4");
        }
    }
}

