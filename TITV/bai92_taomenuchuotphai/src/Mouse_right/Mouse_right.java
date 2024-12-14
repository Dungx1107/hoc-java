package Mouse_right;

import view.MenuExampleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.MenuExampleView;


public class Mouse_right implements MouseListener {

    MenuExampleView menuExampleView;

    public Mouse_right(MenuExampleView k) {
        menuExampleView = k;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            System.out.println("son of bitch");
            this.menuExampleView.chuotphai.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            System.out.println("Popup Trigger");
            this.menuExampleView.chuotphai.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
