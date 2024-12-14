package controller;

import view.MiniCalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorListener implements ActionListener {

    public MiniCalculatorView mi;

    public MiniCalculatorListener(MiniCalculatorView mi) {
        this.mi = mi;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String nut = e.getActionCommand();
        if (nut.equals("+")) {
            this.mi.plus();
        }
        if (nut.equals("-")) {
            this.mi.minus();
        }
        if (nut.equals("*")) {
            this.mi.multiply();
        }
        if (nut.equals("/")) {
            this.mi.devide();
        }
        if (nut.equals("%")) {
            this.mi.mod();
        }
        if (nut.equals("^")) {
            this.mi.pow();
        }
    }
}
