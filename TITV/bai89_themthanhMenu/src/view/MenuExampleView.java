package view;

import controller.MenuController;

import javax.swing.*;
import java.awt.*;

public class MenuExampleView extends JFrame {

    private JLabel jLabel;

    public void setjLabel(String c) {
        this.jLabel.setText(c);
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    public MenuExampleView() {
        this.setTitle("Menu");
        this.setSize(500, 500);
        this.setLocation(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //tao controller
        MenuController me = new MenuController(this);

        // tao thanh menu
        JMenuBar jMenuBar = new JMenuBar();
        // tao 1 menu
        JMenu jMenu_file = new JMenu("File");

        //tao cac menu con
        JMenuItem jMenuItem_open = new JMenuItem("Open");
        jMenuItem_open.addActionListener(me);

        JMenuItem jMenuItem_exit = new JMenuItem("Exit");
        jMenuItem_exit.addActionListener(me);

        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);

        JMenu jMenu_help = new JMenu("Help");

        JMenuItem jMenuItem_item = new JMenuItem("Welcome");
        jMenuItem_item.addActionListener(me);
        jMenu_help.add(jMenuItem_item);

        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);

        //them thanh menu vao chuong trinh
        this.setJMenuBar(jMenuBar);

        //tao label hien thi
        Font font = new Font("Time New Roman", Font.BOLD, 40);
        jLabel = new JLabel();
        jLabel.setFont(font);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.CENTER);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        try {

            new MenuExampleView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
