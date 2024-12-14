package CongTy;

public abstract class NhanVien {
    // phai de protected thi moi ke thua dc
    protected String ten;
    protected String que;
    protected String cccd;
    protected int luongcoban;

    public abstract double tinhluong();

    public NhanVien(String ten, String que, String cccd, int luongcoban) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
        this.luongcoban = luongcoban;
    }


}
