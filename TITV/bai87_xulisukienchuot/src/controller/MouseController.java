package controller;

import view.MouseExampleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseController implements MouseListener , MouseMotionListener {

    private MouseExampleView mouseExampleView;

    public MouseController(MouseExampleView a) {
        mouseExampleView = a;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouseExampleView.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouseExampleView.entered();
        int x = mouseExampleView.getX();
        int y = mouseExampleView.getY();
        this.mouseExampleView.updateXY(x, y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouseExampleView.exited();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mouseExampleView.updateXY(x, y);
    }
}
