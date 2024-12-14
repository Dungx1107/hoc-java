package MyDate;

public class MyDate {
    private int ngay, thang, nam;

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public MyDate() {
        ngay = thang = nam = 1;
    }

    public MyDate(int a, int b, int c) {
        ngay = a;
        thang = b;
        nam = c;
    }

    public MyDate(MyDate d) {
        ngay = d.ngay;
        thang = d.thang;
        nam = d.nam;
    }

    public boolean equals(MyDate d) {
        System.out.println("son of bitch");
        if (ngay == d.ngay && thang == d.thang && nam == d.nam) return true;
        return false;
    }

    public void in() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }

    public void copyTo(MyDate d) {
        d.ngay = ngay;
        d.thang = thang;
        d.nam = nam;
    }

    public MyDate copy() {
        return new MyDate(ngay, thang, nam);
    }
    public String getngaysinh(){
        String a = ngay + "/"+thang+"/"+nam;
        return a;
    }
}
