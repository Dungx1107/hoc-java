package truutuongcaidatgiaodien;

import java.util.Scanner;

abstract class nam implements connguoi {
    public nam(String name, boolean gt) {
        name = "duc rua";
        gt = true;
    }

    @Override
    public void khauhieu() {
        System.out.println("dan ong gia truong");
    }

    @Override
    public String whatisyourname() {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        return ten;
    }
}
