package view;

import javax.swing.*;
import java.awt.*;

public class vidu_boderlayout extends JFrame {

    public vidu_boderlayout() {
        this.setTitle("ha phuong border");
        this.setSize(960, 640);
        this.setLocationRelativeTo(null);

        BorderLayout bl1 = new BorderLayout();
        BorderLayout bl2 = new BorderLayout(25, 25);
//        BorderLayout bl3 = new BorderLayout(

//        this.setLayout(bl1);
        this.setLayout(bl2);

        JButton jb1 = new JButton(1 + "");
        JButton jb2 = new JButton(2 + "");
        JButton jb3 = new JButton(3 + "");
        JButton jb4 = new JButton(4 + "");
        JButton jb5 = new JButton(5 + "");

        this.add(jb1, BorderLayout.NORTH);
        this.add(jb2, BorderLayout.CENTER);
        this.add(jb3, BorderLayout.SOUTH);
        this.add(jb4, BorderLayout.WEST);
        this.add(jb5, BorderLayout.EAST);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new vidu_boderlayout();
    }
}
