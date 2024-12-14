package loptruutuong;

public class contruutuong extends truutuong {

    public contruutuong(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    void in() {
        System.out.println(x + " - " + y);
    }

    @Override
    void son() {
        System.out.println(x / y);
    }
    @Override
    public int tong(){
        return x*y;
    }
}
