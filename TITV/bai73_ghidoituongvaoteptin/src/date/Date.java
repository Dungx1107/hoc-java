package date;

public class Date {
    private int day, month, year;

    public Date(int a, int b, int c) {
        day = a;
        month = b;
        year = c;
    }

    public void inDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
}
