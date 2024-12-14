package view;

import javax.swing.*;
import java.awt.*;

public class DrawExample extends JFrame {

    public DrawExample(){
        this.setTitle("ve hinh");
        this.setSize(500,500);
        this.setLocation(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JpanelDraw jpanelDraw = new JpanelDraw();
        this.setLayout(new BorderLayout());
        this.add(jpanelDraw,BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawExample();
    }
}
