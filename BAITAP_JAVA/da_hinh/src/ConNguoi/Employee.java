package ConNguoi;

import date.Date;

public class Employee extends Person {
    private int luong;

    public Employee(String t, int t1, Date t2, int l) {
        super(t, t1, t2);
        luong = l;
    }

    public Employee() {
        super();
        hoten = "ko ten ko tuoi";
        tuoi = 1;
        ngaysinh = new Date(0, 0, 0);
        luong = 5000000;
    }

    @Override
    public void inthongtin() {
        System.out.println(hoten);
        System.out.println("Age : " + tuoi);
        ngaysinh.inDate();
        System.out.println("luong :" + luong);
    }

    public void say() {
        System.out.println("shut up Employee");
    }
}
