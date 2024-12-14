package MyInterger;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
    public void indiachi(){
        System.out.println(System.identityHashCode(value));;
    }
}
