package view;

import javax.swing.*;
//import javax.swing.JFrame;

import static javax.swing.JFrame.*;

public class ViDu {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setSize(960, 640);
        jf.setTitle("Nguyen Xuan Dung");
        jf.setLocation(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sửa để sử dụng JFrame.EXIT_ON_CLOSE
        jf.setVisible(true); // co hien hay ko

    }
}
