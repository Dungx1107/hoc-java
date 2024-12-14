//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class hotrofile {
    public hotrofile() {

    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);

        int var5;
        do {
            boolean var2 = false;
            System.out.println("Nhập tên file: ");
            String var3 = var1.nextLine();
            Main var4 = new Main(var3);

            int var6;
            do {
                System.out.println("1. Kiểm tra file có thể thực thi : ");
                System.out.println("2. Kiểm tra file có thể đọc : ");
                System.out.println("3. Kiểm tra file có thể ghi : ");
                System.out.println("4. In đường dẫn : ");
                System.out.println("5. In tên file : ");
                System.out.println("6. Kiểm tra file là thư mục : ");
                System.out.println("7. Kiểm tra file là tệp tin : ");
                System.out.println("8. In ra danh sách file con : ");
                System.out.println("9. In ra cây thư mục : ");
                System.out.println("0. Thoát chương trình.");
                var6 = var1.nextInt();
                var1.nextLine();
                switch (var6) {
                    case 1:
                        System.out.println(var4.kiemtrathucthi());
                        break;
                    case 2:
                        System.out.println(var4.kiemtradoc());
                        break;
                    case 3:
                        System.out.println(var4.kiemtraghi());
                        break;
                    case 4:
                        var4.induongdan();
                        break;
                    case 5:
                        var4.inten();
                        break;
                    case 6:
                        var4.thumuchayteptin();
                    case 7:
                    default:
                        break;
                    case 8:
                        var4.inracacfilecon();
                        break;
                    case 9:
                        var4.incaythumuc();
                }
            } while(var6 != 0);

            System.out.println("Bạn có muốn làm tiếp không? (Nhập 1 để tiếp tục, 0 để thoát)");
            var5 = var1.nextInt();
            var1.nextLine();
        } while(var5 != 0);

        var1.close();
    }
}
