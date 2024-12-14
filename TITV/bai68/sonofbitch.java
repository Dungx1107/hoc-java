
public class sonofbitch {
    public static void main(String[] args) {
        MyInteger m = new MyInteger(10);
        MyInteger n = new MyInteger(20);
        m = n;
        n.setValue(50);
        System.out.print(m);
    }
}