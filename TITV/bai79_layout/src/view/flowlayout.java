package view;

import javax.swing.*;
import java.awt.*;

public class flowlayout extends JFrame {
    public flowlayout() {
        this.setTitle("ha phuong");
        this.setSize(960, 640);
        this.setLocationRelativeTo(null);

        //set layout
        FlowLayout flow = new FlowLayout();
//        FlowLayout flow1 = new FlowLayout(FlowLayout.RIGHT);
//        FlowLayout flow2 = new FlowLayout(FlowLayout.CENTER,50,20);

        this.setLayout(flow);
//        this.setLayout(flow1);
//        this.setLayout(flow2);

        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");

        //add thanh phan
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new flowlayout();
    }
}
