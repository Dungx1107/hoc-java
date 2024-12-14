package view;

import controller.CounterListener;
import model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {

    private CounterModel counterModel;
    private JButton jbutton_down;
    private JButton jButton_up;
    private JLabel jlaybel_value;

    public CounterView() {
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("nguyen ha phuong");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new CounterListener(this);

        jbutton_down = new JButton("DOWN");
        jButton_up = new JButton("UP");
        jlaybel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);

        jButton_up.addActionListener(ac);
        jbutton_down.addActionListener(ac);

        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BorderLayout());
        jpanel.add(jButton_up, BorderLayout.EAST);
        jpanel.add(jbutton_down, BorderLayout.WEST);
        jpanel.add(jlaybel_value, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(jpanel);
    }

    public void increment() {
        this.counterModel.increasement();
        this.jlaybel_value.setText(this.counterModel.getValue() + "");
    }

    public void decrease() {
        this.counterModel.decreasement();
        this.jlaybel_value.setText(this.counterModel.getValue() + "");
    }

    public static void main(String[] args) {
        new CounterView();
    }
}
