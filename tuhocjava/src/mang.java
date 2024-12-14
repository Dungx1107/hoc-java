import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mang {
    public static void main(String[] args) {
        mang mang1 = new mang();
        mang1.phan3();
//        mang1.sapxepmang();
//        mang1.phan2();
//        mang1.phan1();
    }

    public void phan3()
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("nhap so phan tu cua mang");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= rd.nextInt(20,500);
        }
        System.out.println(Arrays.toString(a));

        //reverse mang
        int []b =a;
        System.out.println(Arrays.toString(b));
        for(int i=0;i<n;i++)
        {
            a[i]=b[n-1-i];
        }
        System.out.println(Arrays.toString(a));
    }
    public void sapxepmang(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        Arrays.sort(a);

        for(int i:a) System.out.println(i);

    }
    public void phan2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public void phan1() {
        //1.khoi tao mang
        String[] mangstr;
        int[] mangsonguyen;
        boolean mangbool;
        //2. khoi tao mang kem kich thuoc
        String[] mangstr2 = new String[15];
        int[] mangnguyen2 = new int[20];

        //3.khoitao mang kem gia tri ban dau
        String[] mangstr3 = new String[]{"chi pheo", "thi no", "ong giao"};
        String[] mangstr4 = {"duong van chien", "nguyen hoanh son ", "tran thanh tung"};
        for (int i = 0; i < 3; i++) System.out.println(mangstr3[i]);
        System.out.println(mangstr3.length);
        System.out.println(mangstr3);
        System.out.println(mangstr4);

        for (int i = 0; i < mangstr4.length; i++) System.out.println(mangstr4[i]);
    }

}

