import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        arraylist ar = new arraylist();
        ar.phan3();
//        ar.phan2();
//        ar.phan1();
    }

    public void phan3() {

    }

    public void phan2() {
        ArrayList<Integer> son = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //xem phan tu co o trong mang ko
        if (son.contains(20)) System.out.println("son of bitch");
        else System.out.println("vu ");
        if (son.contains(10)) System.out.println("son of bitch");
        else System.out.println("vu ");

        //sap xep
        Scanner t = new Scanner(System.in);
        System.out.println("so phan tu cua mang la ");
        int so = t.nextInt();
        ArrayList<Integer> b = new ArrayList<>(so);
        Random rd = new Random();
        for (int i = 0; i < so; i++) {
            b.add(rd.nextInt(-50, 50));
        }
        System.out.println(b);
        System.out.println("sau khi sap xep");
        Collections.sort(b);
        System.out.println(b);
        // vi tri dau tien
        ArrayList<Integer> kaka = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 4));
        System.out.println(kaka.indexOf(4));
        for (int i : kaka) {
            System.out.println(i);
        }
    }

    public void phan1() {
        //1.khai bao list
        ArrayList<Integer> a = new ArrayList<>();
        //2.khai bao voi so phan tu ban dau
        ArrayList<Integer> b = new ArrayList<>(20);
        //3.gia tri ban dau
        ArrayList<Integer> c = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        //4.xuat list
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //5.them phan tu
        ArrayList<Integer> d = new ArrayList<>();
        d.add(12);
        d.add(11);
        d.add(13);
        d.add(121);
        d.add(123);
        d.add(1265);
        System.out.println(d);
        //6. them vao vi tri
        d.add(0, 9000);
        d.add(3, 10000);
        System.out.println(d);
        //7. so phan tu
        System.out.println(d.size());
        //8. lay 1 phan tu
        System.out.println(d.get(3));
        //9.remove(index)
        d.remove(3);
        System.out.println(d);
        //.10 thay doi thong tin
        d.set(0, 99999);
        System.out.println("d sau khi thay: " + d);
    }
}

