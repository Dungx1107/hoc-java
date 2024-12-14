package org.example.javafxtutorials;

import org.example.MyNumber;

public class Main6_property {

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber();

        myNumber.numberProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(observable);
            System.out.println(oldValue);
            System.out.println(newValue);
        });
        myNumber.setNumber(100);
        myNumber.setNumber(999);
    }
}
