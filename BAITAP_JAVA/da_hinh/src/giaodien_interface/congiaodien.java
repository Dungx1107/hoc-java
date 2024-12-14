package giaodien_interface;

import java.util.Scanner;

class congiaodien implements giaodien {

    public congiaodien(){

    }
    @Override
    public void in() {
        System.out.println("hello bro");
    }

    @Override
    public void helloguy() {
        System.out.println("what's up, lisa");
    }

    @Override
    public void tinhtong() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
    @Override
    public void sonofbitch(){
        System.out.println("you are gay");
    }
}
