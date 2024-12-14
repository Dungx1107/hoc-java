import java.util.Scanner;

public class b68laythongtincobancuacacteptin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int luachon = 0;
            System.out.println("Nhập tên file: ");
            String ten = sc.nextLine();
            vidufile vdf = new vidufile(ten);

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
                luachon = sc.nextInt();
                sc.nextLine(); // Tiêu thụ ký tự newline còn lại

                switch (luachon) {
                    case 1:
                        System.out.println(vdf.kiemtrathucthi());
                        break;
                    case 2:
                        System.out.println(vdf.kiemtradoc());
                        break;
                    case 3:
                        System.out.println(vdf.kiemtraghi());
                        break;
                    case 4:
                        vdf.induongdan();
                        break;
                    case 5:
                        vdf.inten();
                        break;
                    case 6:
                        vdf.thumuchayteptin();
                        break;
                    case 8:
                        vdf.inracacfilecon();
                        break;
                    case 9:
                        vdf.incaythumuc();
                        break;
                    default:
                        break;
                }
            } while (luachon != 0);

            System.out.println("Bạn có muốn làm tiếp không? (Nhập 1 để tiếp tục, 0 để thoát)");
            int cc = sc.nextInt();
            sc.nextLine(); // Tiêu thụ ký tự newline còn lại

            if (cc == 0) break;
        }

        sc.close(); // Đảm bảo đóng Scanner khi không còn sử dụng
    }
}
