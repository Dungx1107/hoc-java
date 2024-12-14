import java.lang.foreign.SymbolLookup;
import java.util.Calendar;
import java.util.Scanner;

public class bai2_nhapxuatdulieu {
    public static void main(String[] args) {
        // bai2_nhapxuatdulieu obj = new bai2_nhapxuatdulieu();
        // obj.nhapxuat();
        // bai2_nhapxuatdulieu duong = new bai2_nhapxuatdulieu();
        // duong.kieudulieu();
        bai2_nhapxuatdulieu duong = new bai2_nhapxuatdulieu();
        duong.date_time();
        // duong.ngoaile();
        // duong.do_while();
        // duong.vonglapwhile();
        // duong.bai10_scaner();
        // duong.pheptoan();
        // duong.bien();

    }

    public void nhapxuat() {
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        // println : con tro tu dong xuong dong
        System.out.print("line 1");
        System.out.print("line 1");
        System.out.print("line 1");
        // print : con tro ko xuong dong

        //
    }

    public void kieudulieu() {
        System.out.println("min of kieu int: " + Integer.MAX_VALUE);
        System.out.println("min of kieu int: " + Integer.MIN_VALUE);

        System.out.println("min of kieu int: " + Byte.MAX_VALUE);
        System.out.println("min of kieu int: " + Byte.MIN_VALUE);
    }

    public void bien() {
        // khai bao bien
        int a;
        byte b;
        float x1, x2, x3;
        // khoi tao bien
        long kk = 9;
        float diem = 7.5f;
        double k1 = 9.0;
        System.out.println(kk);
        System.out.println(diem);
    }

    public void pheptoan() {
        int a = 20, b = 40;
        int x = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("b + a = " + (b + a));
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a == b);
        // System.out.println(x = a++);
        System.out.println(x = ++a);
    }

    public void bai10_scaner() {
        Scanner sc = new Scanner(System.in);
        // String mk1 = sc.nextLine();
        // System.out.println("mk muc 1 la :"+mk1);
        // String mk2 = sc.nextLine();
        // System.out.println("mk cap 2: "+mk2);
        // int duongvan = sc.nextInt();
        // System.out.println("so= "+duongvan);
        float giang = sc.nextFloat();
        System.out.println(giang);
    }

    public void vonglapwhile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so co 3 chu so ");
        int kk = sc.nextInt();
        while (kk >= 1000 || kk < 100) {
            System.out.println("nhập lại co=ho tao ");
            kk = sc.nextInt();
        }
        while (kk > 0) {
            int f = kk % 10;
            System.out.println(f);
            kk /= 10;
        }
    }

    public void do_while() {
        int a = 100, b = 100;
        do {
            a += 1;
            System.out.println(a);

        } while (a <= 110);

        while (true) {
            b--;
            if (b == 95) {
                System.out.println(b);
                break;
            }

        }
    }

    public void ngoaile() {

        int a = 10;
        int b = 8;
        String c1 = new String("ha phuong");

        try {
            int c = a / b;
            System.out.println("\"son of bitch\" = " + c);
        } catch (Exception ex) {
            System.out.println("loi roi do e oi");
            ex.printStackTrace();
        }
        System.out.println("son of bitch");
        System.out.println(c1);
    }

    public void date_time()
    {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(ngay);
        System.out.println(thang);
        System.out.println(nam);
    }
}
// muon go dau kep thi sai \".....\"
