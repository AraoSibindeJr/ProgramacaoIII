package Aulas.Aula04.Teorica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Layouts implements ActionListener {
    //tela principal
    private JFrame tela;

    //butoes
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;

    //Paneis
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JPanel panel_card;

    // Label
    private JLabel sep1;
    private JLabel sep2;
    private JLabel sep3;

    public Layouts() {
        instanciar();
        propriedadesTela();
        definirLayout();
        adicionarElementos();
        darAccao();
        tela.setVisible(true);
    }

    private void instanciar() {
        tela = new JFrame();

        bt1 = new JButton("BT 1");
        bt2 = new JButton("BT 2");
        bt3 = new JButton("BT 3");
        sep1 = new JLabel("tela_1");
        sep2 = new JLabel("tela_2");
        sep3 = new JLabel("tela_3");
        panel =new JPanel();
        panel_1 = new JPanel();
        panel_2 = new JPanel();
        panel_3 = new JPanel();
        panel_card = new JPanel();
    }

    private void propriedadesTela() {
        tela.setSize(800,600);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void definirLayout() {
        BorderLayout border = new BorderLayout();
        tela.setLayout(border);

        GridLayout grid = new GridLayout(1,3);
        panel.setLayout(grid);
        panel_1.setLayout(new BorderLayout());
        panel_2.setLayout(new BorderLayout());
        panel_3.setLayout(new BorderLayout());
        panel_card.setLayout(new CardLayout());
    }

    private void adicionarElementos() {
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);

        tela.add(panel,BorderLayout.NORTH);
        panel_1.add(sep1);
        panel_2.add(sep2);
        panel_3.add(sep3);

        tela.add(panel_1, BorderLayout.CENTER);
        tela.add(panel_2, BorderLayout.CENTER);
        tela.add(panel_3, BorderLayout.CENTER);

        panel_card.add(panel_1, BorderLayout.CENTER);
        panel_card.add(panel_2, BorderLayout.CENTER);
        panel_card.add(panel_3, BorderLayout.CENTER);

    }

    private void darAccao() {
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout card =(CardLayout)panel_card.getLayout();
        if (bt1 == e.getSource()){
            card.show(panel_card, "bt1");
        }

        System.out.println("BT");
        JOptionPane.showMessageDialog(tela, "BT");
        if(bt1 == e.getSource()) {
            JOptionPane.showMessageDialog(tela, "BT 01");
        }else if (bt2 == e.getSource()){
            JOptionPane.showMessageDialog(tela, "BT 02");

        }else {
            JOptionPane.showMessageDialog(tela, "BT 03");
        }
    }
}
