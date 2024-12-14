package view;

import controller.MenuController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

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
        JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
        jMenuItem_new.addActionListener(me);
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
        jMenuItem_open.addActionListener(me);
        jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));

        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_E);
        jMenuItem_exit.addActionListener(me);
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,KeyEvent.CTRL_DOWN_MASK));

        jMenu_file.add(jMenuItem_new);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);

        JMenu jMenu_help = new JMenu("Help");
        jMenu_help.setMnemonic(KeyEvent.VK_L);
        jMenu_help.setDisplayedMnemonicIndex(0);

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
