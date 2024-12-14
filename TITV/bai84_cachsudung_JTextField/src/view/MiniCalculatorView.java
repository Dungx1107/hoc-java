package view;

import controller.MiniCalculatorListener;
import model.MiniCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorView extends JFrame {
    private MiniCalculator miniCalculatorModel;

    private JTextField jtf_firval;
    private JTextField jtf_secval;
    private JTextField jtf_ans;

    public MiniCalculatorView() throws HeadlessException {
        miniCalculatorModel = new MiniCalculator();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Mini Calculator");
        this.setSize(600, 600);
        this.setLocation(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel firValue = new JLabel("1st Value");
        JLabel secValue = new JLabel("2nd Value");
        JLabel ans = new JLabel("answer");

        Font font = new Font("Time New Roman", Font.BOLD, 50);
        firValue.setFont(font);
        secValue.setFont(font);
        ans.setFont(font);

        jtf_firval = new JTextField(50);
        jtf_secval = new JTextField(50);
        jtf_ans = new JTextField(50);

        jtf_firval.setFont(font);
        jtf_secval.setFont(font);
        jtf_ans.setFont(font);

        JPanel jpanl_io = new JPanel();
        jpanl_io.setLayout(new GridLayout(3, 2, 10, 10));

        jpanl_io.add(firValue);
        jpanl_io.add(jtf_firval);
        jpanl_io.add(secValue);
        jpanl_io.add(jtf_secval);
        jpanl_io.add(ans);
        jpanl_io.add(jtf_ans);

        JButton jb_plus = new JButton("+");
        JButton jb_minus = new JButton("-");
        JButton jb_multiply = new JButton("*");
        JButton jb_divide = new JButton("/");
        JButton jb_mod = new JButton("%");
        JButton jb_pow = new JButton("^");

        jb_plus.setFont(font);
        jb_minus.setFont(font);
        jb_multiply.setFont(font);
        jb_divide.setFont(font);
        jb_mod.setFont(font);
        jb_pow.setFont(font);

        ActionListener ac = new MiniCalculatorListener(this);
        jb_plus.addActionListener(ac);
        jb_minus.addActionListener(ac);
        jb_multiply.addActionListener(ac);
        jb_divide.addActionListener(ac);
        jb_mod.addActionListener(ac);
        jb_pow.addActionListener(ac);

        JPanel jpanel_buttons = new JPanel();
        jpanel_buttons.setLayout(new GridLayout(2, 3, 5, 5));
        jpanel_buttons.add(jb_plus);
        jpanel_buttons.add(jb_minus);
        jpanel_buttons.add(jb_multiply);
        jpanel_buttons.add(jb_divide);
        jpanel_buttons.add(jb_mod);
        jpanel_buttons.add(jb_pow);


        this.setLayout(new BorderLayout());
        this.add(jpanl_io, BorderLayout.CENTER);
        this.add(jpanel_buttons, BorderLayout.SOUTH);
    }

    public void plus() {
        double fir = Double.valueOf(jtf_firval.getText());
        double sec = Double.valueOf(jtf_secval.getText());

        this.miniCalculatorModel.setFirstvalue(fir);
        this.miniCalculatorModel.setSecondvalue(sec);
        this.miniCalculatorModel.plus();

        this.jtf_ans.setText(this.miniCalculatorModel.getAnswer()+"");
    }

    public void minus() {
        double fir = Double.valueOf(jtf_firval.getText());
        double sec = Double.valueOf(jtf_secval.getText());

        this.miniCalculatorModel.setFirstvalue(fir);
        this.miniCalculatorModel.setSecondvalue(sec);
        this.miniCalculatorModel.minus();
        this.jtf_ans.setText(this.miniCalculatorModel.getAnswer()+"");
    }

    public void multiply() {
        double fir = Double.valueOf(jtf_firval.getText());
        double sec = Double.valueOf(jtf_secval.getText());

        this.miniCalculatorModel.setFirstvalue(fir);
        this.miniCalculatorModel.setSecondvalue(sec);
        this.miniCalculatorModel.multiply();
        this.jtf_ans.setText(this.miniCalculatorModel.getAnswer()+"");
    }

    public void devide() {
        double fir = Double.valueOf(jtf_firval.getText());
        double sec = Double.valueOf(jtf_secval.getText());

        this.miniCalculatorModel.setFirstvalue(fir);
        this.miniCalculatorModel.setSecondvalue(sec);
        this.miniCalculatorModel.devide();
        this.jtf_ans.setText(this.miniCalculatorModel.getAnswer()+"");
    }

    public void pow() {
        double fir = Double.valueOf(jtf_firval.getText());
        double sec = Double.valueOf(jtf_secval.getText());

        this.miniCalculatorModel.setFirstvalue(fir);
        this.miniCalculatorModel.setSecondvalue(sec);
        this.miniCalculatorModel.pow();
        this.jtf_ans.setText(this.miniCalculatorModel.getAnswer()+"");
    }

    public void mod() {
        double fir = Double.valueOf(jtf_firval.getText());
        double sec = Double.valueOf(jtf_secval.getText());

        this.miniCalculatorModel.setFirstvalue(fir);
        this.miniCalculatorModel.setSecondvalue(sec);
        this.miniCalculatorModel.mod();
        this.jtf_ans.setText(this.miniCalculatorModel.getAnswer()+"");
    }


    public static void main(String[] args) {
        new MiniCalculatorView();
    }
}
