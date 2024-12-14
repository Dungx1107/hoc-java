import MyDate.MyDate;
import MyInterger.MyInteger;
import Person.Person;

public class DoubleOps {
    public static void main(String[] args) {
        DoubleOps kk = new DoubleOps();
//        kk.bai1();
//        kk.bai2();
        kk.bai3();
    }

    public void bai3() {
        Person vxd = new Person((new MyDate(1, 2, 2005)), "vu xuan dung");
        System.out.println(vxd.getBirthday());
        System.out.println(vxd.getName());
        vxd.in();

        usestatic.sonof();
    }

    public void bai2() {
        MyInteger m = new MyInteger(10);
        MyInteger n = new MyInteger(20);
        m = n;
        n.setValue(50);

        System.out.println(m);
        MyInteger n1 = new MyInteger(47);
        MyInteger n2 = new MyInteger(47);
        MyInteger n3 = n2;
        //n1,n2 khac noi dung tham so(dia chi) -> khac nhau theo "=="
        //n2,n3 cung noi dung tham so
        System.out.println(n1 == n2); //???
        System.out.println(n2 == n3); //???

        MyDate d1 = new MyDate(10, 10, 1954);
        MyDate d2 = new MyDate(d1);
        MyDate d3 = new MyDate(10, 10, 1954);
        System.out.println("so sanh noi dung doi tuong");
        d1.in();
        d2.in();
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));

        System.out.println("\n");
        MyDate d11 = new MyDate(2005, 9, 26);
        MyDate d22 = new MyDate(2000, 1, 1);
        d11.copyTo(d22);

        d11.in();
        d11 = d22;
        d11.in();

        MyDate d33 = new MyDate();
        System.out.println("d33 : ");
        d33 = d11.copy();
        d33.in();
        System.out.println("d11 : ");
        d11.copyTo(d33);
        d11.in();
    }

    public void bai1() {
//        String[] args = new String[0];
        String[] args = {"3.0", "4.0"};
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double sum = a + b;
        double prod = a * b;
        double quot = a / b;
        double rem = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);

        System.out.println();
        System.out.println("sin(pi/2) = " + Math.sin(Math.PI / 2));
        System.out.println("log(e) = " + Math.log(Math.E));
    }

}
