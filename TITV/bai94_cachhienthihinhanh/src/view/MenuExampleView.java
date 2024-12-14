package view;

import Mouse_right.Mouse_right;
import controller.MenuController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.net.URL;

public class MenuExampleView extends JFrame {

    private JToolBar thanhcongcu;
    private Font font;
    private Font font1;
    private JLabel jLabel;

    public JPopupMenu chuotphai;

    public void setjLabel(String c) {
        this.jLabel.setText(c);
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    public void init1() {
        this.setTitle("Menu");
        this.setSize(500, 500);
        this.setLocation(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public MenuExampleView() {
        init1();

        //tao controller
        MenuController me = new MenuController(this);

        // tao thanh menu
        JMenuBar jMenuBar = new JMenuBar();
        // tao 1 menu
        JMenu jMenu_file = new JMenu("File");

        //tao cac menu con
        JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
        jMenuItem_new.addActionListener(me);
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
        jMenuItem_open.addActionListener(me);
        jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_E);
        jMenuItem_exit.addActionListener(me);
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));

        //set hinh anh cho cac item
//        URL u1 = getClass().getResource("/view/new.jpg");
//        ImageIcon icon1 = new ImageIcon(u1);
//        this.setIconImage(icon1.getImage());
//        jMenuItem_new.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/view/new.jpg"))));

        // Đọc hình ảnh từ tài nguyên và điều chỉnh kích thước
        URL iconURL = getClass().getResource("/view/new.jpg");
        if (iconURL != null) {
            ImageIcon icon = new ImageIcon(iconURL);
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH); // Kích thước mong muốn
            icon = new ImageIcon(scaledImg);
            jMenuItem_new.setIcon(icon);
        } else {
            System.err.println("Hình ảnh không tìm thấy!");
        }


        jMenu_file.add(jMenuItem_new);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);

        JMenu jMenu_help = new JMenu("Help");
        jMenu_help.setMnemonic(KeyEvent.VK_L);
        jMenu_help.setDisplayedMnemonicIndex(0);

        JMenuItem jMenuItem_item = new JMenuItem("Welcome");
        jMenuItem_item.addActionListener(me);
        jMenu_help.add(jMenuItem_item);

        //them phan check box
        JMenu view = new JMenu("View");
        JCheckBoxMenuItem jCheckBoxMenuItem_toolbar = new JCheckBoxMenuItem("toolbar");
        jCheckBoxMenuItem_toolbar.setActionCommand("toolbar");
        jCheckBoxMenuItem_toolbar.addActionListener(me);
        view.add(jCheckBoxMenuItem_toolbar);

        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);
        jMenuBar.add(view);

        //them thanh menu vao chuong trinh
        this.setJMenuBar(jMenuBar);

        //tao label hien thi
        khoitaophongchu();
        jLabel = new JLabel();
        jLabel.setFont(font);

        //them thanh cong cu
        thanhcongcu = new JToolBar();

        JButton undo = new JButton("Undo");
        JButton redo = new JButton("Redo");
        JButton copy = new JButton("Copy");
        JButton cut = new JButton("Cut");
        JButton paste = new JButton("Paste");

        undo.setToolTipText("quay lai");
        copy.setToolTipText("sao chep");
        paste.setToolTipText("dan du lieu");
        redo.setToolTipText("son of bitch");
        cut.setToolTipText("cat doan du lieu");

        undo.setFont(font1);
        redo.setFont(font1);
        cut.setFont(font1);
        copy.setFont(font1);
        paste.setFont(font1);

        thanhcongcu.add(undo);
        thanhcongcu.add(redo);
        thanhcongcu.add(copy);
        thanhcongcu.add(cut);
        thanhcongcu.add(paste);


        ToolTipManager.sharedInstance().setInitialDelay(0); // Hiển thị tooltip ngay lập tức
        thanhcongcu.addSeparator();

        //menu chuot phai
        chuotphai = new JPopupMenu();

        JMenu phong = new JMenu("FONT");
        JMenuItem type = new JMenuItem("TYPE");
        JMenuItem size = new JMenuItem("SIZE");
        phong.add(type);
        phong.add(size);

        JMenu vuxuandung = new JMenu("Vu Xuan Dung");
        JMenu haphuong = new JMenu("nguyen ha phuong");

        chuotphai.add(phong);
        chuotphai.add(vuxuandung);
        chuotphai.add(haphuong);

        this.add(chuotphai);

        //them su kien chuot phai
        Mouse_right mophai = new Mouse_right(this);
        this.addMouseListener(mophai);

        // Hình ảnh
        URL iconURL1 = getClass().getResource("/view/dung.jpg");
        if (iconURL1 != null) {
            ImageIcon icon = new ImageIcon(iconURL1);
            this.setIconImage(icon.getImage());
        } else {
            System.err.println("Hình ảnh không tìm thấy!");
        }


        //tao phim tat cho JButton
//        undo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_1,KeyEvent.VK_F2),"undo");
//        undo.getActionMap().put("undo", new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });


        this.setLayout(new BorderLayout());

        this.add(jLabel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void khoitaophongchu() {
        font = new Font("Time New Roman", Font.BOLD, 40);
        font1 = new Font("Time New Roman", Font.BOLD, 30);
    }

    public void enableToolbar() {
        this.add(thanhcongcu, BorderLayout.NORTH);
        this.refresh();
    }

    public void disableToolbar() {
        this.remove(thanhcongcu);
        this.refresh();
    }

    public void refresh() {
        this.revalidate();  // Làm mới bố cục
        this.repaint();     // Vẽ lại giao diện
//        this.pack();
//        this.setSize(500, 500);

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            new MenuExampleView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
