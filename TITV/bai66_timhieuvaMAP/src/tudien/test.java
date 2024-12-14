package tudien;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng từ muốn nhập vào:");
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng mới sau khi nhập số nguyên

        while (t > 0) {
            System.out.println("Nhập từ:");
            String tanh = sc.nextLine(); // Nhập từ
            System.out.println("Nhập nghĩa:");
            String nghia = sc.nextLine(); // Nhập nghĩa

            tuDien.ThemTu(tanh, nghia);
            t--;
        }

        int luachon = 0;
        do {
            System.out.println("Chọn tùy chọn (1: tra từ, 2: in ra từ điển, 0: thoát):");
            luachon = sc.nextInt();
            sc.nextLine(); // Đọc dòng mới sau khi nhập số nguyên

            if (luachon == 1) {
                System.out.println("Nhập từ cần tìm:");
                String timtu = sc.nextLine();
                tuDien.tratu(timtu);
            } else if (luachon == 2) {
                tuDien.inratudien();
            }

        } while (luachon != 0);

        sc.close();
    }
}
