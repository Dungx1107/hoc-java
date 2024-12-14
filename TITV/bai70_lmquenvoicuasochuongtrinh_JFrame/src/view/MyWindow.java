package view;

import javax.swing.*;
import java.awt.event.HierarchyBoundsListener;

public class MyWindow extends JFrame {
   public MyWindow(){

   }

   public void showIT(){
       this.setVisible(true);

   }
   public void showIT(String tile){
       this.setTitle(tile);
   }
   public void showIT(String tile,int width, int height){
       this.setTitle(tile);
       this.setSize(width,height);
       this.setVisible(true);
   }

    public static void main(String[] args) {
        MyWindow m1 = new MyWindow();
        m1.showIT();
        MyWindow m2 = new MyWindow();
        m2.showIT("nxd");
        MyWindow m3 = new MyWindow();
        m3.showIT("nxd",960,640);
    }
}
