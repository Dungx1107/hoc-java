public class b68laythongtincobancuacacteptin {import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

    public class b68laythongtincobancuacacteptin {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int luachon = 0;
            System.out.println("nhap ten file: ");
            String ten = sc.nextLine();
            vidufile vdf = new vidufile(ten);
            do {
                System.out.println("1.kiem tra file co the thuc thi : ");
                System.out.println("2.kiem tra file co the doc : ");
                System.out.println("3.kiem tra file co the ghi : ");
                System.out.println("4.in duong dan : ");
                System.out.println("5.in ten file : ");
                System.out.println("6.kiem tra file la thu muc : ");
                System.out.println("7.kiem tra file la tep tin : ");
                System.out.println("8.in ra danh sach file con : ");
                System.out.println("9.in ra cay thu muc : ");
                System.out.println("0.thoat chuong trinh.");
                luachon = sc.nextInt();
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

                    default:
                        break;
                }
            } while (luachon != 0);
        }
    }

}
