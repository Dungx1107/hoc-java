package controller;

import view.MenuExampleView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {
    private MenuExampleView mev;

    public MenuController(MenuExampleView mn) {
        mev = mn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nut = e.getActionCommand();

        if (nut.equals("Open")) {
            this.mev.setjLabel("ban da click OPEN");
        } else if (nut.equals("Exit")) {
            this.mev.setjLabel("ban da click Exit");
        } else if (nut.equals("Help")) {
            this.mev.setjLabel("ban da click Help");
        } else if (nut.equals("Welcome")) {
            this.mev.setjLabel("ban da click Welcome");
        } else if (nut.equals("New")) {
            this.mev.setjLabel("ban da click New");
        } else if (nut.equals("toolbar")) {

            System.out.println("nguyen ha phuong");
            System.out.println("kakak");

            AbstractButton checkBox = (AbstractButton) e.getSource();
            boolean check = checkBox.getModel().isSelected();
            if (check) {
                this.mev.enableToolbar();
            } else {
                mev.disableToolbar();
                System.out.println("khong nhan dc cai me j ca");
            }
        } else {
            System.out.println("khong nhan dc cai j ca");
        }
    }
}
