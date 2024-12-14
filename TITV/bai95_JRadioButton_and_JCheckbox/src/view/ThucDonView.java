package view;

import controll.ThucDonController;
import model.ThucDonModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;

public class ThucDonView extends JFrame {

    public ThucDonModel thucDonModel;

    //cac phong chu
    public Font font1;
    public Font font2;
    public Font font3;

    //radiobutton
    public JRadioButton jRadioButton_com;
    public JRadioButton jRadioButton_pho;
    public JRadioButton jRadioButton_banhmi;

    //jcheckbox
    public JCheckBox jCheckBox_trasua;
    public JCheckBox jCheckBox_coca;
    public JCheckBox jCheckBox_banhngot;
    public JCheckBox jCheckBox_nem;

    //jlaybel
    public JLabel jLabel_thongtin;

    //buttongroup
    public ButtonGroup buttonGroup_monchinh;
    public ArrayList<JCheckBox> buttonGroup_monphu;

    public ThucDonView() {
        thucDonModel = new ThucDonModel();
        chaychuongtrinh();
    }

    public void chaychuongtrinh() {
        init1();
        danhsachmonan();
        this.setVisible(true);
    }

    public void init1() {
        this.setTitle("Thực đơn nhà hàng");
        this.setSize(1000, 500);
        this.setLocation(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        taophongchu();
        this.setLayout(new BorderLayout());
    }

    public void danhsachmonan() {
        JLabel header = new JLabel("Thực đơn nhà hàng ");
        header.setFont(font1);
        JPanel jPanel_tieude = new JPanel();
        jPanel_tieude.add(header);
        this.add(jPanel_tieude, BorderLayout.NORTH);

        JPanel cacmonchinh = new JPanel();
        cacmonchinh.setLayout(new BorderLayout());

        JLabel tieudemonchinh = new JLabel("Các món chính của nhà hàng");
        tieudemonchinh.setFont(font2);
        tieudemonchinh.setForeground(Color.RED);
        cacmonchinh.add(tieudemonchinh, BorderLayout.NORTH);

        JPanel monchinh = new JPanel();
        monchinh.setLayout(new GridLayout(1, 3));

        //jradiobutton
        jRadioButton_com = new JRadioButton("Cơm");
        jRadioButton_pho = new JRadioButton("Phở");
        jRadioButton_banhmi = new JRadioButton("Bánh Mì");

        buttonGroup_monchinh = new ButtonGroup();
        buttonGroup_monchinh.add(jRadioButton_com);
        buttonGroup_monchinh.add(jRadioButton_pho);
        buttonGroup_monchinh.add(jRadioButton_banhmi);

        monchinh.add(jRadioButton_com);
        monchinh.add(jRadioButton_pho);
        monchinh.add(jRadioButton_banhmi);


        jRadioButton_com.setFont(font2);
        jRadioButton_pho.setFont(font2);
        jRadioButton_banhmi.setFont(font2);

        cacmonchinh.add(monchinh, BorderLayout.CENTER);

        JPanel cacmonphu = new JPanel();
        cacmonphu.setLayout(new BorderLayout());

        JLabel tieudemonphu = new JLabel("Các món phụ của nhà hàng");
        tieudemonphu.setFont(font2);
        tieudemonphu.setForeground(Color.RED);
        cacmonphu.add(tieudemonphu, BorderLayout.NORTH);

        JPanel monphu = new JPanel();
        jCheckBox_trasua = new JCheckBox("Trà sữa");
        jCheckBox_trasua.setFont(font3);
        jCheckBox_coca = new JCheckBox("Cocacola");
        jCheckBox_coca.setFont(font3);
        jCheckBox_banhngot = new JCheckBox("Bánh ngọt");
        jCheckBox_banhngot.setFont(font3);
        jCheckBox_nem = new JCheckBox("Nem");
        jCheckBox_nem.setFont(font3);

        buttonGroup_monphu = new ArrayList<JCheckBox>();
        buttonGroup_monphu.add(jCheckBox_trasua);
        buttonGroup_monphu.add(jCheckBox_coca);
        buttonGroup_monphu.add(jCheckBox_banhngot);
        buttonGroup_monphu.add(jCheckBox_nem);

        monphu.setLayout(new GridLayout(2, 2));
        monphu.add(jCheckBox_trasua);
        monphu.add(jCheckBox_coca);
        monphu.add(jCheckBox_banhngot);
        monphu.add(jCheckBox_nem);

        cacmonphu.add(monphu, BorderLayout.CENTER);

        JPanel jPanel_luachon = new JPanel();
        jPanel_luachon.setLayout(new GridLayout(2, 1));

        jPanel_luachon.add(cacmonchinh);
        jPanel_luachon.add(cacmonphu);

        this.add(jPanel_luachon, BorderLayout.CENTER);

        JPanel thanhtoan = new JPanel();
        thanhtoan.setLayout(new GridLayout(1, 2));
        jLabel_thongtin = new JLabel();
        JButton jButton_thanhtoan = new JButton("Thanh Toán");
        jButton_thanhtoan.setFont(font2);
        jButton_thanhtoan.setBackground(Color.yellow);

        thanhtoan.add(jButton_thanhtoan);
        thanhtoan.add(jLabel_thongtin);

        ActionListener thucdoncontroll = new ThucDonController(this);
        jButton_thanhtoan.addActionListener(thucdoncontroll);

        this.add(thanhtoan, BorderLayout.SOUTH);
    }

    public void taophongchu() {
        font1 = new Font("Time New Roman", Font.BOLD, 40);
        font2 = new Font("Time New Roman", Font.BOLD, 30);
        font3 = new Font("Time New Roman", Font.BOLD, 20);
    }

    public void hienthiketqua() {
        String kq = "Mon chinh:  " + this.thucDonModel.getLuaChon_monchinh() + " ; " +
                "Mon phu: " + this.thucDonModel.getLuaChon_monphu() + " ; " +
                "Tong tien: " + this.thucDonModel.getTongtien();
        this.jLabel_thongtin.setText(kq);
    }

    public static void main(String[] args) {
        new ThucDonView();
    }
}
