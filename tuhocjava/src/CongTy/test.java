package CongTy;

public class test {
    public static void main(String[] args) {
        test te = new test();
        te.phan1();
        te.loptruutuong();
    }

    public void loptruutuong(){

    }
    public void phan1() {
//        NhanVien nv1 = new NhanVien("son of bitch", "cali", "0321546789", 0);
//        System.out.println(nv1.tinhluong());

        NhanVienHanhCHinh hc1 = new NhanVienHanhCHinh("kaka", "thai binh", "032146232", 100);
        System.out.println("luong hanh chinh : " + hc1.tinhluong());
        NhanVienDica dc1 = new NhanVienDica("hong nhung","thai nguyen","0987565656",100);
        System.out.println("luong di ca : "+dc1.tinhluong());
        NhanVienDica dc2 = new NhanVienDica("duong van chien", "thanh hoa","98989777",90000000,6);
        System.out.println(dc2.ca);
    }
}
