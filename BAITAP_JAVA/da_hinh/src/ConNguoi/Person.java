package ConNguoi;

import date.Date;

public class Person {
    protected String hoten;
    protected int tuoi;
    protected Date ngaysinh;

    public Person(String t, int t1, Date t2) {
        hoten = t;
        tuoi = t1;
        ngaysinh = t2;
    }
    public Person(){
        hoten = "ko ten ko tuoi";
        tuoi = 0;
        ngaysinh = new Date(0,0,0);
    }

    public void inthongtin() {
        System.out.println(hoten);
        System.out.println(tuoi);
        ngaysinh.inDate();
    }

    public void say()
    {
        System.out.println("son of bitch");
    }
}
