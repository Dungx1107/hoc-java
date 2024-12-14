package truongdaihoc;

import javax.security.auth.callback.ChoiceCallback;

public class SinhVien {
    private String hoten;
    private double diem;

    public SinhVien() {
        hoten = "son of bitch";
        diem = 0.0;
    }

    public SinhVien(String ho, double di) {
        hoten = ho;
        diem = di;
    }

    public void hienthithongtin() {
        System.out.println(hoten + " : " + diem);
    }

    public double dtb(double a, double b) {
        return (a + b) / 2;
    }

    public double dtb(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // alt + fn + insert
    public String getHoten() {
        return hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String toString() {
        return hoten + " : " + diem;
    }

    //support method
    private boolean checkdiem() {
        return this.diem >= 24;
    }

    //service method
    public void hople() {
        if (checkdiem()) System.out.println("qua mon");
        else System.out.println("hocj lkaijk");
    }

    //parametter list method
    //truong hop khong the nam dc so luong doi so vao, hoac so luong so qua lon
    public double tongdiem(double... arr) {
        double tong = 0.0;
        for (double x : arr) tong += x;
        return tong;
    }

}
