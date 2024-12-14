package CongTy;

public class NhanVienDica extends NhanVien {
    protected int ca;
    @Override
    public double tinhluong() {
        return luongcoban * 1.5;
    }

    public NhanVienDica(String ten, String que, String cccd, int luongcoban) {
        super(ten, que, cccd, luongcoban);
    }
    public NhanVienDica(String ten, String que, String cccd, int luongcoban, int ca) {
        super(ten, que, cccd, luongcoban);
        this.ca = ca;
    }
}
