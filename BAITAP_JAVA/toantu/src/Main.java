import MyDate.MyDate;
import Khongtien.Sinhvien;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sinhvien sv1 = new Sinhvien("Nguyễn Xuân Dũng", new MyDate(11, 7, 2005), "23020028", 3);
        sv1.inthongtinsinhvien();
        System.out.println(sv1);
    }
}
