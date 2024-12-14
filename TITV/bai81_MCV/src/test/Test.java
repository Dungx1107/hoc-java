package test;

import model.CounterModel;

public class Test {
    public static void main(String[] args) {
        CounterModel ct = new CounterModel();
        ct.increasement();
        ct.increasement();
        ct.increasement();
        System.out.println(ct.getValue());
        ct.decreasement();
        System.out.println(ct.getValue());
    }
}
