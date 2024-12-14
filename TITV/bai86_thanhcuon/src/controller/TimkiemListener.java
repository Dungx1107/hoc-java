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
        if (nut.equals("Thong ke")) {
            System.out.println("nhan chuot");
            System.out.println(nut);
            this.tkv.timkiem();
        }else{
            System.out.println("khong co j ca");
        }
    }
}
