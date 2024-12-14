package view;

import javax.swing.*;
import java.awt.*;

public class vd_gridlayout extends JFrame {
    public vd_gridlayout(){
        this.setTitle("ha phuong");
        this.setSize(960, 640);
        this.setLocationRelativeTo(null);

        GridLayout gr = new GridLayout();
        GridLayout gr1 = new GridLayout(4,4);
        GridLayout gr2 = new GridLayout(4,4,25,25);

//        this.setLayout(gr);
//        this.setLayout(gr1);
        this.setLayout(gr2);

        for(int i=0;i<16;i++)
        {
            JButton jb = new JButton(i+"");
            this.add(jb);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new vd_gridlayout();
    }

}
//JButton jb1 = new JButton("1");
//        JButton jb2 = new JButton("2");
//        JButton jb3 = new JButton("3");
//        JButton jb4 = new JButton("4");
//
//        //add thanh phan
//        this.add(jb1);
//        this.add(jb2);
//        this.add(jb3);
//        this.add(jb4);