package view;

import controller.TimkiemListener;
import model.TimkiemModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimkiemView extends JFrame {

    private TimkiemModel timkiemModel;
    private JTextArea jTextArea_vanban;//cho phep ghi xuong dong
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
        this.setSize(600, 640);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel vanban = new JLabel("Văn bản");
        JLabel timkiem = new JLabel("Tìm kiếm");

        vanban.setForeground(new Color(42, 165, 101)); // Đặt màu chữ của JLabel 'vanban'
        timkiem.setForeground(Color.red);   // Đặt màu chữ của JLabel 'timkiem'

        Font font = new Font("Times New Roman", Font.BOLD, 40);
        Font font1 = new Font("Times New Roman", Font.BOLD, 30);
        vanban.setFont(font);
        timkiem.setFont(font);

        jTextArea_vanban = new JTextArea(50, 50);
        jTextArea_vanban.setFont(font1);

        //thanh cuon
        JScrollPane jScrollPane = new JScrollPane(jTextArea_vanban);

        jTextField_tukhoa = new JTextField();
        jTextField_tukhoa.setFont(font1);
        jTextField_thongke = new JTextField();
        jTextField_thongke.setFont(font1);

        TimkiemListener tkl = new TimkiemListener(this);

        JButton jb_thongke = new JButton("Thong ke"); // Đảm bảo tên nút khớp với tên trong listener
        jb_thongke.setFont(font);
        jb_thongke.addActionListener(tkl);
        jb_thongke.setBackground(Color.green);

        // Footer panel
        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2, 10, 10));
        jPanel_footer.add(timkiem);
        jPanel_footer.add(jTextField_tukhoa);
        jPanel_footer.add(jb_thongke);
        jPanel_footer.add(jTextField_thongke);

        ketqua = new JLabel("Kết quả: ");
        ketqua.setFont(font1);

        this.setLayout(new BorderLayout(10, 10));
        this.add(vanban, BorderLayout.NORTH);
        this.add(jScrollPane, BorderLayout.CENTER); // Sử dụng JScrollPane để cuộn văn bản
        this.add(jPanel_footer, BorderLayout.SOUTH);
    }

    public void timkiem() {
        this.timkiemModel.setVanban(jTextArea_vanban.getText());
        this.timkiemModel.setTukhoa(jTextField_tukhoa.getText());
        this.timkiemModel.timkiem();
        this.jTextField_thongke.setText(this.timkiemModel.getKetqua()); // Ghi kết quả vào jTextField_thongke
    }

    public static void main(String[] args) {
        new TimkiemView();
    }
}
