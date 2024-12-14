package controller;

import model.CounterModel;
import view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
    public CounterView ctm;

    public CounterListener(CounterView ctm){
        this.ctm = ctm;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nutan = e.getActionCommand();
        System.out.println("ban da an "+nutan);
        if(nutan.equals("UP")){
            this.ctm.tangbiendem1();
        }
        if(nutan.equals("DOWN")){
            this.ctm.giambiendem1();
        }
        if(nutan.equals("RESET")){
            this.ctm.resetbiendem1();
        }
    }
}
