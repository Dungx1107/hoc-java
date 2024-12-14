package controll;

import view.ThucDonView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class ThucDonController implements ActionListener {

    private ThucDonView thucDonView;

    public ThucDonController(ThucDonView f) {
        thucDonView = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String monchinh = "";
        Enumeration<AbstractButton> buttons_monchinh = thucDonView.buttonGroup_monchinh.getElements();
        while (buttons_monchinh.hasMoreElements()) {
            AbstractButton b = buttons_monchinh.nextElement();
            if (b.isSelected()) {
                monchinh = b.getText();
            }
        }

        String monphu = "";
        for (AbstractButton b : thucDonView.buttonGroup_monphu) {
            if (b.isSelected()) {
                monphu = monphu + b.getText() + " ; ";
            }
        }

        thucDonView.thucDonModel.setLuaChon_monchinh(monchinh);
        thucDonView.thucDonModel.setLuaChon_monphu(monphu);
        thucDonView.thucDonModel.tinhtongtien();
        thucDonView.hienthiketqua();

        String sotiendanhan = (String) JOptionPane.showInputDialog(thucDonView,
                thucDonView.jLabel_thongtin.getText() +
                        "nhap so tien : ",
                "thong bao",
                JOptionPane.PLAIN_MESSAGE);

        try {
            double sotien = Double.valueOf(sotiendanhan);
            JOptionPane.showInputDialog(thucDonView,
                    "thoi tien lai cho khach: " + (sotien - thucDonView.thucDonModel.getTongtien()),
                    "error",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e2) {
            JOptionPane.showInputDialog(thucDonView,
                    "Nhap du lieu sai",
                    "error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }
}
