import truongdaihoc.SinhVien;

public class oop1 {
    public static void main(String[] args) {
        oop1 oop = new oop1();
//        oop.phan1();
        oop.phan2();

    }
    public void phan2(){
        SinhVien sv4 = new SinhVien();
        double dtb1 = sv4.tongdiem(1,2,3,4,5,6,7,8,9);
        System.out.println(dtb1);
    }
    public void phan1() {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        SinhVien sv3 = new SinhVien("kaka kak ak k ak ", 9.0);

        sv1.hienthithongtin();
        sv2.hienthithongtin();
        sv3.hienthithongtin();

        System.out.println(sv3.getHoten());
        System.out.println(sv3.getDiem());

        sv2.setHoten("pennaldo");
        sv2.setDiem(0.3);
        sv2.hienthithongtin();
        System.out.println(sv2.dtb(1.5, 6.0));
        System.out.println(sv2);

        sv3.hople();
        System.out.println(sv3.dtb(9.2, 9.75, 9.5));

    }
}
