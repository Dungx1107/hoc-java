package bai4_3;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class bai4_3 {
    private String[] tencacfilecandoc = new String[]{
            "D:\\Zalo Received Files\\2nd year college\\semester 1\\cautrucdulieuvagiaithuat\\algs4-data\\1Kints.txt",
            "D:\\Zalo Received Files\\2nd year college\\semester 1\\cautrucdulieuvagiaithuat\\algs4-data\\2Kints.txt",
            "D:\\Zalo Received Files\\2nd year college\\semester 1\\cautrucdulieuvagiaithuat\\algs4-data\\4Kints.txt",
            "D:\\Zalo Received Files\\2nd year college\\semester 1\\cautrucdulieuvagiaithuat\\algs4-data\\8Kints.txt"
    };

    public void demsophatukhacnhau() {

        String tenfile = "D:\\Zalo Received Files\\2nd year college\\semester 1\\cautrucdulieuvagiaithuat\\algs4-data\\4Kints.txt";//thoi gian chay : 10.4363374 s
        In file = new In(tenfile);
        int[] a = file.readAllInts();
        StdArrayIO.print(a);
        HashSet<Integer> son = new HashSet<>();
        for (int i : a) son.add(i);

        System.out.println(son.size());
        System.out.println(son);

    }

    public void phan1_cach1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten file can doc");
        //doc file du lieu
        String tenfile = "D:\\Zalo Received Files\\2nd year college\\semester 1\\cautrucdulieuvagiaithuat\\algs4-data\\8Kints.txt";//thoi gian chay : 10.4363374 s
//        String tenfile = sc.nextLine();

        In file = new In(tenfile);
        int[] a = file.readAllInts();

        StdArrayIO.print(a);

        //so cap 3 so co tong bang 0
        long starttime = System.nanoTime();
        int dem = 0;
        int l = a.length;
        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        dem++;
                        System.out.println("cap " + dem + " : " + a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
        long endtime = System.nanoTime();
        System.out.println("thoi gian chay : " + 1.0 * (endtime - starttime) / 1000000000 + " s");

    }

    public void cach1_cobap() {
        System.out.println("\n tep thu 1" + "\n");
        for (int i1 = 0; i1 < (int) tencacfilecandoc.length; i1++) {
            //doc file du lieu
            String tenfile = tencacfilecandoc[i1];
            In file = new In(tenfile);
            int[] a = file.readAllInts();

            StdArrayIO.print(a);

            //so cap 3 so co tong bang 0
            long starttime = System.nanoTime();
            int dem = 0;
            int l = a.length;
            for (int i = 0; i < l - 2; i++) {
                for (int j = i + 1; j < l - 1; j++) {
                    for (int k = j + 1; k < l; k++) {
                        if (a[i] + a[j] + a[k] == 0) {
                            dem++;
                            System.out.println("cap " + dem + 1 + " : " + a[i] + " " + a[j] + " " + a[k]);
                        }
                    }
                }
            }
            long endtime = System.nanoTime();
            System.out.println("thoi gian chay : " + 1.0 * (endtime - starttime) / 1000000000 + " s");
            int cap = i1 + 2;
            System.out.println("\n tep thu " + cap + "\n");
        }
    }

    public void cach2_toiuuthoigian() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap ten file can doc");
        //doc file du lieu
        String tenfile = "D:\\Zalo Received Files\\2nd year college\\semester 1\\cautrucdulieuvagiaithuat\\algs4-data\\8Kints.txt";
//        String tenfile = sc.nextLine();
        In file = new In(tenfile);
        int[] a = file.readAllInts();

        StdArrayIO.print(a);

        //so cap 3 so co tong bang 0
        long starttime = System.nanoTime();
        int dem = 0;
        int l = a.length;
        Arrays.sort(a);

        for (int i = 0; i < l; i++) {
            int codinh = i;
            int bd = i + 1, kt = l - 1;
            while (bd < kt) {
                long hang1 = a[bd] + a[kt];
                if (hang1 == -a[codinh]) {
                    dem++;
                    System.out.println("cap so thu " + dem + " : { " + a[codinh] + " " + a[bd] + " " + a[kt] + " }");
                    bd++;
                    kt--;
                } else if (hang1 + a[codinh] < 0) {
                    bd++;
                } else {
                    kt--;
                }
            }
        }


        long endtime = System.nanoTime();
        System.out.println("thoi gian chay : " + 1.0 * (endtime - starttime) / 1000000000 + " s");

    }

    public static void main(String[] args) {
        bai4_3 bai = new bai4_3();
//        bai.demsophatukhacnhau();
        bai.cach2_toiuuthoigian();
//        bai.phan1_cach1();
//        bai.cach1_cobap();
    }
}

