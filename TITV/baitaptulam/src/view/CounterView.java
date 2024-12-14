package view;

import controller.CounterListener;
import model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {

    private CounterModel so;
    private JButton jButton_up;
    private JButton jButton_down;
    private JButton nutreset;
    private JLabel sobiendoi;
    private JLabel tile;

    public CounterView() {
        so = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {

        this.setTitle("Nguyen Ha Phuong");
        this.setLocationRelativeTo(null);
        this.setSize(300, 300);
        this.setLocation(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //font chu
        Font font = new Font("Time New Roman",Font.BOLD,60);

        //cac nut
        jButton_up = new JButton("UP");
        jButton_down = new JButton("DOWN");
        nutreset = new JButton("RESET");
        sobiendoi = new JLabel(so.getBiendem() + "", JLabel.CENTER);
        tile = new JLabel("NGUYEN HA PHUONG");

        //set font chu
        sobiendoi.setFont(font);

        // gop
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BorderLayout());
        jpanel.add(jButton_up, BorderLayout.EAST);
        jpanel.add(jButton_down, BorderLayout.WEST);
        jpanel.add(sobiendoi, BorderLayout.CENTER);

        ActionListener ac = new CounterListener(this);
        jButton_down.addActionListener(ac);
        jButton_up.addActionListener(ac);
        nutreset.addActionListener(ac);


        this.setLayout(new GridLayout(3, 1));
        this.add(tile);
        this.add(jpanel);
        this.add(nutreset);

    }

    public void tangbiendem1() {
        this.so.tangbiendem();
        this.sobiendoi.setText(so.getBiendem() + "");
    }

    public void giambiendem1() {
        this.so.giambiendem();
        this.sobiendoi.setText(so.getBiendem() + "");
    }

    public void resetbiendem1() {
        this.so.resetbiendem();
        this.sobiendoi.setText(so.getBiendem() + "");
    }

    public static void main(String[] args) {
        new CounterView();
    }
}
