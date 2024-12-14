package view;

import controller.TimkiemListener;
import model.TimkiemModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimkiemView extends JFrame {
    private TimkiemModel timkiemModel;
    private JTextArea jTextArea_vanban;
    private JTextField jTextField_tukhoa;
    private JTextField jTextField_thongke;
    private JLabel ketqua;

    public TimkiemView() {
        this.timkiemModel = new TimkiemModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Tìm Kiếm");
        this.setSize(960, 640);
        this.setLocation(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel vanban = new JLabel("Văn bản");
        JLabel timkiem = new JLabel("Tìm kiếm");
        JLabel thongke = new JLabel("Thống kê");

        vanban.setBackground(Color.yellow);
        timkiem.setBackground(Color.red);
        thongke.setBackground(Color.blue);

        Font font = new Font("Time New Roman", Font.BOLD, 40);
        Font font1 = new Font("Time New Roman", Font.BOLD, 30);
        vanban.setFont(font);
        timkiem.setFont(font);
        thongke.setFont(font);

        jTextArea_vanban = new JTextArea(100, 100);
        jTextArea_vanban.setFont(font1);

        jTextField_tukhoa = new JTextField();
        jTextField_tukhoa.setFont(font1);
        jTextField_thongke = new JTextField();
        jTextField_thongke.setFont(font1);


        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(4, 1, 10, 10));
        jPanel_center.add(vanban);
        jPanel_center.add(jTextArea_vanban);
        jPanel_center.add(timkiem);
        jPanel_center.add(jTextField_tukhoa);

//        ActionListener ac = new Ac

        TimkiemListener tkl = new TimkiemListener(this);

        JButton jb_thongke = new JButton("thong ke");
        jb_thongke.setFont(font);
        jb_thongke.addActionListener(tkl);
        jb_thongke.setBackground(Color.green);

        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2, 10, 10));
        ketqua = new JLabel();
        ketqua.setFont(font1);
//        jPanel_footer.add(thongke);
        jPanel_footer.add(jb_thongke);
        jPanel_footer.add(jTextField_thongke);
        jPanel_footer.add(ketqua);


        this.setLayout(new BorderLayout());
        this.add(jPanel_center, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);

    }
public void timkiem(){
        this.timkiemModel.setVanban(jTextArea_vanban.getText());
        this.timkiemModel.setTukhoa(jTextField_tukhoa.getText());
        this.timkiemModel.timkiem();
        this.ketqua.setText(this.timkiemModel.getKetqua());
}

    public static void main(String[] args) {
        new TimkiemView();
    }
}
