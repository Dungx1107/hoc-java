package model;

public class MouseExampleModel {
    private int x;
    private int y;
    private int count_clickchuot;
    private String checkIn; // yes,no

    public MouseExampleModel() {
        x = 0;
        y = 0;
        count_clickchuot = 0;
        checkIn = "no";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCount_clickchuot() {
        return count_clickchuot;
    }

    public String getCheckIn() {
        return checkIn;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCount_clickchuot(int count_clickchuot) {
        this.count_clickchuot = count_clickchuot;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void click() {
        count_clickchuot++;
    }

    public void entered() {
        // chuot o trong chuong trinh
        this.checkIn = "yes";
    }

    public void exited() {
        this.checkIn = "no";
    }
}
