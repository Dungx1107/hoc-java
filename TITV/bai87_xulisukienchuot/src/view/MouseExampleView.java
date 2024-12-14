package view;

import controller.MouseController;
import model.MouseExampleModel;

import javax.swing.*;
import java.awt.*;

public class MouseExampleView extends JFrame {

    private MouseExampleModel mouse_model;
    private JPanel jPanel_mouse;
    private JPanel jPanel_info;
    private JLabel jLabel_position;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_count;
    private JLabel jLabel_count_value;
    private JLabel jLabel_empty1;
    private JLabel jLabel_checkin;
    private JLabel jLabel_checkin_value;
    private JLabel jLabel_empty2;

    public MouseExampleView() {

        this.mouse_model = new MouseExampleModel();
        this.init();
        this.init2();
    }

    private void init() {
        this.setTitle("chuot");
        this.setLocationRelativeTo(null);
        this.setLocation(300, 300);
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MouseController mouse = new MouseController(this);

        jPanel_mouse = new JPanel();
        jPanel_mouse.setBackground(Color.cyan);
        jPanel_mouse.addMouseListener(mouse);
        jPanel_mouse.addMouseMotionListener(mouse);

        jPanel_info = new JPanel();
        jPanel_info.setLayout(new GridLayout(3, 3));

        jLabel_position = new JLabel("Position: ");
        jLabel_x = new JLabel("x = ");
        jLabel_y = new JLabel("y = ");
        jLabel_count = new JLabel("Numbe of click: ");
        jLabel_count_value = new JLabel("n");
        jLabel_empty1 = new JLabel();
        jLabel_checkin = new JLabel("Mouse is in component: ");
        jLabel_checkin_value = new JLabel("no");
        jLabel_empty2 = new JLabel();

        jPanel_info.add(jLabel_position);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_count);
        jPanel_info.add(jLabel_count_value);
        jPanel_info.add(jLabel_empty1);
        jPanel_info.add(jLabel_checkin);
        jPanel_info.add(jLabel_checkin_value);
        jPanel_info.add(jLabel_empty2);

        this.setLayout(new BorderLayout());
        this.add(jPanel_mouse, BorderLayout.CENTER);
        this.add(jPanel_info, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void init2() {

    }

    public static void main(String[] args) {
        new MouseExampleView();
    }

    public void click() {
        this.mouse_model.click();
        this.jLabel_count_value.setText(this.mouse_model.getCount_clickchuot() + "");
    }

    public void entered() {
        // chuot o trong chuong trinh
        this.mouse_model.entered();
        this.jLabel_checkin_value.setText(this.mouse_model.getCheckIn());
    }

    public void exited() {
        this.mouse_model.exited();
        this.jLabel_checkin_value.setText(this.mouse_model.getCheckIn());
    }

    public void updateXY(int x,int y){
        this.mouse_model.setX(x);
        this.mouse_model.setY(y);
        this.jLabel_x.setText(this.mouse_model.getX()+"");
        this.jLabel_y.setText(this.mouse_model.getY()+"");
    }


}
