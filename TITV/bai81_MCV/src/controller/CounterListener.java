package controller;

import model.CounterModel;
import view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {

    private CounterView cv;

    public CounterListener(CounterView ctv) {
        cv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("UP")) {
            this.cv.increment();
        }
        if (src.equals("DOWN")) {
            this.cv.decrease();
        }
    }
}