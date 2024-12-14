package CasioView;

import CasioController.CasioController;
import model.SimpleCasio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Vector;

import static tinhTrungTo.InfixEvaluator.evaluateInfix;

public class CasioView extends JFrame {

    private SimpleCasio simpleCasio;
    private JTextArea nhapvao;
    private JTextField dapan;
    private JLabel answer;
    private Vector<JButton> banphim1;


    public CasioView() {
        this.init();
        this.layoutCasio_cacphim();
        this.action();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("My Casio");
        this.setSize(500, 600);
        this.setLocation(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simpleCasio = new SimpleCasio();
    }

    private void action() {
        CasioController chuot = new CasioController(this);
        for (JButton jb : banphim1) {
            jb.addActionListener(chuot);
        }
    }
//    private void setphimtatchodaubang(){
//        phim_bang.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.ALT_DOWN_MASK,KeyEvent.VK_ENTER),"enter");
//        phim_bang.getActionMap().put("enter", new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                inketqua();
//            }
//        });
//    }

    private void layoutCasio_cacphim() {

        // cac phim
        JButton phim0 = new JButton("0");
        JButton phim1 = new JButton("1");
        JButton phim2 = new JButton("2");
        JButton phim3 = new JButton("3");
        JButton phim4 = new JButton("4");
        JButton phim5 = new JButton("5");
        JButton phim6 = new JButton("6");
        JButton phim7 = new JButton("7");
        JButton phim8 = new JButton("8");
        JButton phim9 = new JButton("9");
        JButton phimDEL = new JButton("DEL");
        JButton phimAC = new JButton("AC");
        JButton phim_cong = new JButton("+");
        JButton phim_tru = new JButton("-");
        JButton phim_nhan = new JButton("*");
        JButton phim_chia = new JButton("/");
        JButton phim_cham = new JButton(".");
        JButton phim_bang = new JButton("=");
        JButton phimAns = new JButton("Ans");
        JButton phim_pow = new JButton("^");
        JButton phim_mongoac = new JButton("(");
        JButton phim_dongngoac = new JButton(")");
        JButton phim_sin = new JButton("sin");
        JButton phim_cos = new JButton("cos");
        JButton phim_tan = new JButton("tan");

        banphim1 = new Vector<>();
        banphim1.add(phim0);
        banphim1.add(phim2);
        banphim1.add(phim3);
        banphim1.add(phim4);
        banphim1.add(phim5);
        banphim1.add(phim6);
        banphim1.add(phim7);
        banphim1.add(phim8);
        banphim1.add(phim9);
        banphim1.add(phimAC);
        banphim1.add(phimAns);
        banphim1.add(phim_cong);
        banphim1.add(phim_tru);
        banphim1.add(phim_nhan);
        banphim1.add(phim_cham);
        banphim1.add(phim_chia);
        banphim1.add(phim_bang);
        banphim1.add(phim_pow);
        banphim1.add(phim1);
        banphim1.add(phimDEL);
        banphim1.add(phim_mongoac);
        banphim1.add(phim_dongngoac);
        banphim1.add(phim_sin);
        banphim1.add(phim_cos);
        banphim1.add(phim_tan);

        JPanel banphim = new JPanel();
        banphim.setLayout(new GridLayout(5, 5, 5, 5));

        // add cac phim vao trong JPanl banphim
        banphim.add(phim_mongoac);
        banphim.add(phim_dongngoac);
        banphim.add(phim_sin);
        banphim.add(phim_cos);
        banphim.add(phim_tan);
        banphim.add(phim7);
        banphim.add(phim8);
        banphim.add(phim9);
        banphim.add(phimDEL);
        banphim.add(phimAC);
        banphim.add(phim4);
        banphim.add(phim5);
        banphim.add(phim6);
        banphim.add(phim_nhan);
        banphim.add(phim_chia);
        banphim.add(phim1);
        banphim.add(phim2);
        banphim.add(phim3);
        banphim.add(phim_cong);
        banphim.add(phim_tru);
        banphim.add(phim0);
        banphim.add(phim_cham);
        banphim.add(phim_pow);
        banphim.add(phimAns);
        banphim.add(phim_bang);

        //set phim tat cho dau =
        phim_bang.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,KeyEvent.ALT_DOWN_MASK)
                        ,"enter");
        phim_bang.getActionMap().put("enter", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inketqua();
            }
        });

        Font font1 = new Font("Time New Roman", Font.BOLD, 30);// xet Font chu
        Font font2 = new Font("Time New Roman", Font.BOLD, 20);

        for (int i = 0; i < banphim1.size(); i++) {
            banphim1.get(i).setFont(font2);
            banphim1.get(i).setBackground(new Color(0x00E1FF));
        }

        nhapvao = new JTextArea();
        nhapvao.setFont(font1);
        dapan = new JTextField();
        dapan.setFont(font1);
        answer = new JLabel("ANSWER: ");
        answer.setFont(font1);
        answer.setOpaque(true); // Bắt buộc phải đặt thuộc tính này để màu nền có hiệu lực
        answer.setBackground(Color.yellow);
        answer.setPreferredSize(new Dimension(50, 50));

        //thanh cuon
        JScrollPane thanhcuon = new JScrollPane(nhapvao);

        //dieu chinh kich thuoc cac thanh phan
        nhapvao.setPreferredSize(new Dimension(500, 150));
        dapan.setPreferredSize(new Dimension(500, 50));
        JScrollPane thanhcuon2 = new JScrollPane(dapan);
        banphim.setPreferredSize(new Dimension(500, 200));

        JPanel jPanel_dapan = new JPanel();
        jPanel_dapan.setLayout(new GridLayout(1, 2, 10, 5));

        jPanel_dapan.add(answer);
        jPanel_dapan.add(thanhcuon2);
        jPanel_dapan.setPreferredSize(new Dimension(500, 100));


        simpleCasio.setPheptoancantinh(nhapvao.getText());

        this.setLayout(new BorderLayout(30, 5));
        this.add(thanhcuon, BorderLayout.NORTH);
        this.add(jPanel_dapan, BorderLayout.CENTER);
        this.add(banphim, BorderLayout.SOUTH);
    }

    public void inketqua() {
        String c = nhapvao.getText();
        double kq = evaluateInfix(c);
        c = String.valueOf(kq);
        dapan.setText(c);
        simpleCasio.setPheptoancantinh(c);
    }

    public void setSimpleCasio(String c) {
        this.simpleCasio.setPheptoancantinh(c);
    }

    public SimpleCasio getSimpleCasio() {
        return simpleCasio;
    }

    public void capNhatNhapVao() {
        nhapvao.setText(simpleCasio.getPheptoancantinh());
    }

    public String getNhapvao() {
        return nhapvao.getText();
    }


    public static void main(String[] args) {
        new CasioView();
    }

    public void xoaTatCa() {
        nhapvao.setText("");
        dapan.setText("");
        simpleCasio.setPheptoancantinh("");

    }

    public void xoaKyTuCuoi() {
        int l = nhapvao.getText().length();
        nhapvao.setText(nhapvao.getText().substring(0, l - 1));
        simpleCasio.setPheptoancantinh(nhapvao.getText());
    }
}






































