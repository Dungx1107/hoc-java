package vector.simple;

public class MyVector extends Object{
    public double x, y;

    public MyVector(double x_, double y_) {
        x = x_;
        y = y_;
    }

    MyVector() {
        x = 0;
        y = 0;
    }

    public void print() {
        System.out.println("(" + this.x + " , " + this.y + ')');
//        System.out.println('(' + this.x + " , " + this.y + ')');
    }
    public String  toString()
    {
//        return "son of bitch";
        return x+" , "+y;
    }
}
