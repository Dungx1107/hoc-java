package bai3_2_sum;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;

import java.util.HashSet;
import java.util.Scanner;

public class Sum {

    // Phương pháp sử dụng HashSet để tìm các cặp có tổng bằng 0
    public static void tinhsocapdoi(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        int dem = 0;
        for (int j : a) {
            int g = -j;
            if (set.contains(g)) {
                dem++;
                System.out.println("Cặp thứ " + dem + " : " + j + " " + g);
            }
            set.add(j);
        }
    }

    public void cach2(String filePath) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean kk = true;
//            while (kk) {
            // Đọc tất cả số nguyên từ tệp
            In in = new In(filePath);
            int[] a = in.readAllInts();

            int l = a.length;

//            StdArrayIO.print(a);

            long startTime = System.nanoTime();
            System.out.println("starttime2 = " + startTime);
            for (int i = 0; i < l - 1; i++) {
                for (int j = i + 1; j < l; j++) {
                    if (a[i] + a[j] == 0) {
                        System.out.println(a[i] + " -- " + a[j]);
                    }
                }
            }
            long endTime = System.nanoTime();
            System.out.println("endtime2 = " + endTime);
            long duration = endTime - startTime;
            double durationInMillis = duration / 1_000_000.0; // Chia cho 1_000_000.0 để chuyển đổi sang mili giây
            System.out.println("Thời gian thực thi cach 2: " + durationInMillis + " mili giây");

//                System.out.println("Nhấn 1 để tiếp tục, nhấn 0 để hủy bỏ");
//                int chon = sc.nextInt();
//                sc.nextLine();
//                if (chon == 0) {
//                    kk = false;
//                }
//            }
        }
    }

    public void cach1(String filePath) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean kk = true;
//            while (kk) {
            In in = new In(filePath);
            int[] a = in.readAllInts();

//            StdArrayIO.print(a);
            long startTime = System.nanoTime();
            System.out.println("starttime1 = " + startTime);
            tinhsocapdoi(a);
            long endTime = System.nanoTime();
            System.out.println("endtime1 = " + endTime);
            long duration = endTime - startTime;
            double durationInMillis = duration / 1_000_000.0;
            System.out.println("Thời gian thực thi cach 1: " + durationInMillis + " mili giây");

//
//                System.out.println("Nhấn 1 để tiếp tục, nhấn 0 để hủy bỏ");
//                int chon = sc.nextInt();
//                sc.nextLine();
//                if (chon == 0) {
//                    kk = false;
//                }
//            }
        }
    }

    public static void main(String[] args) {
        Sum sum1 = new Sum();
        String filePath = "D:\\Zalo Received Files\\2nd year college\\semester 1\\cautrucdulieuvagiaithuat\\algs4-data\\16Kints.txt";
        sum1.cach1(filePath);
        sum1.cach2(filePath);
    }
}
