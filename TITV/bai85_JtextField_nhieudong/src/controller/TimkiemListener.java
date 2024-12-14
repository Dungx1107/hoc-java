package controller;

import view.TimkiemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimkiemListener implements ActionListener {
    private TimkiemView tkv;

    public TimkiemListener(TimkiemView t) {
        tkv = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nut = e.getActionCommand();
        if (nut == "thong ke") {
            System.out.println("nhan chuot");
            this.tkv.timkiem();
        }
    }
}
