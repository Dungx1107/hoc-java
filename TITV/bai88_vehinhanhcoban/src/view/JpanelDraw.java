package view;

import javax.swing.*;
import java.awt.*;

public class JpanelDraw extends JPanel {

    public JpanelDraw(){
        this.setBackground(Color.white);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.blue);
        g.drawLine(15,15,50,150);

        g.setColor(Color.red);
        g.drawOval(255,255,50,50);

        g.setColor(Color.green);
        g.drawRect(45,150,30,90);

        g.setColor(Color.pink);
        g.fillOval(400,300,50,50);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(100,100,100,100);

        g.setColor(Color.yellow);
        g.drawString("what is up",350,300);
    }
}
