import java.util.Random;
import java.util.Scanner;

public class ham {
    public static void main(String[] args) {
        ham a = new ham();
//        int a = cong(19,10);
//        System.out.println(a);
//        Scanner a1 = new Scanner(System.in);
//        String a2 = a1.next();
//        a.xinchao(a2);
//        a.random_so();
        a.charchar();
    }

    public static int cong(int a, int b) {
        System.out.println("a + b = ");
        return a + b;
    }

    public static void xinchao(String gioitinh) {

        if (gioitinh.equals("female")) {
            System.out.println("đàn bà");
        } else System.out.println("đàn ông");
    }
    public static void random_so(){
        Random rd = new Random();
        int ngaunhien = rd.nextInt(-50,50);
        System.out.println("so ngau nhien 1");
        System.out.println(ngaunhien);
        int nn2 = rd.nextInt(50);// tu 0 ->50
        System.out.println("so ngau nhien 2");
        System.out.println(nn2);
    }
    public static void charchar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ki tu vao");
        String input = sc.nextLine();
        char ch4 = input.charAt(0);
        System.out.println("ki tu vua nhap : "+ch4);
    }
}
