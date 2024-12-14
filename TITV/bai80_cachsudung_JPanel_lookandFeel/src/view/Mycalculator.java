package view;

import javax.swing.*;
import java.awt.*;

public class Mycalculator extends JFrame {
    public Mycalculator() {
        this.setTitle("My Calculator");
        this.setLocation(300, 300);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);

        JTextField jt = new JTextField(300);//dua du lieu vao
        JPanel jPanel1 = new JPanel();
        jPanel1.add(jt, BorderLayout.CENTER);
        JButton[] jb = new JButton[15];

        for (int i = 0; i < 10; i++) {
            jb[i] = new JButton(i + "");
        }
        jb[10] = new JButton("+");
        jb[11] = new JButton("-");
        jb[12] = new JButton("*");
        jb[13] = new JButton("/");
        jb[14] = new JButton("=");

        JPanel Jpanel_button = new JPanel(new GridLayout(5, 3, 10, 10));
        for (int i = 0; i < 15; i++) {
            Jpanel_button.add(jb[i]);
        }


        this.setLayout(new BorderLayout());
        this.add(jPanel1, BorderLayout.NORTH);
        this.add(Jpanel_button, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Mycalculator();

        } catch (Exception e) {
            e.printStackTrace();
        }
        new Mycalculator();
    }
}

//        JButton jb0 = new JButton("0");
//        JButton jb1 = new JButton("1");
//        JButton jb2 = new JButton("2");
//        JButton jb3 = new JButton("3");
//        JButton jb4 = new JButton("4");
//        JButton jb5 = new JButton("5");
//        JButton jb6 = new JButton("6");
//        JButton jb7 = new JButton("7");
//        JButton jb8 = new JButton("8");
//        JButton jb9 = new JButton("9");
//        JButton jb_cong = new JButton("+");
//        JButton jb_tru = new JButton("-");
//        JButton jb_nhan = new JButton("*");
//        JButton jb_chia = new JButton("/");
//        JButton jb_bang = new JButton("=");

//        this.setLayout(new FlowLayout());
//        this.setLayout(new FlowLayout());
//        this.setLayout(new GridLayout(5,3,15,10));

//        this.add(jt);
//        for (int i = 0; i < 15; i++) {
//            this.add(jb[i]);
//        }