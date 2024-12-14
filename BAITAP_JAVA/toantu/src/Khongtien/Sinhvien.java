package Khongtien;

import MyDate.MyDate;
import Person.Person; // Nếu lớp Person không thuộc gói nào

public class Sinhvien extends Person {
    String mssv;
    double diem;

    public Sinhvien(String name, MyDate sinhnhat, String ms, double d) {
        super(sinhnhat, name);
        this.mssv = ms;
        this.diem = d;
    }

    public void inthongtinsinhvien() {
        System.out.println(name);
        birthday.in();
        System.out.println(mssv);
        System.out.println(diem);
    }

    public String toString() {
        String a = "ho va ten :" + this.name + '\n' + "ngay sinh : " + birthday.getngaysinh() + '\n' + "ma so sinh vien :" + mssv + '\n' + "diem : " + diem;
        return a;
    }
}
