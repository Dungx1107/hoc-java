package saochepdoituong;

public class chay4 {
    public static void main(String[] args) {
        chay4 ma = new chay4();
//        ma.copy1();
        ma.copy2();
    }

    public void copy1() {
        nu n = new nu("nguyrn thi", "0123");
        n.in();
        nu n2 = new nu(n);
        n2.in();

    }

    public void copy2() {
        nu n = new nu("nguyen thi", "0123");
        n.in();
        nu n2 = n.clone();
        n2.in();
    }
}
