package model;

public class CounterModel {
    private int value;

    public CounterModel() {
        value = 0;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increasement() {
        value++;
    }

    public void decreasement() {
        value--;
    }

    public void resetcounter() {
        this.value = 0;
    }

}
