import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double a = Math.sin(x);
        double b = Math.cos(x);

        double c = a * a + b * b;
        System.out.println(c);
    }

}
