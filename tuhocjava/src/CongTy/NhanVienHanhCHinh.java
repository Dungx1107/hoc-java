package CongTy;

public class NhanVienHanhCHinh extends NhanVien {

    @Override
    public double tinhluong() {
        return luongcoban;
    }

    public NhanVienHanhCHinh(String ten, String que, String cccd, int luongcoban) {
        super(ten, que, cccd, luongcoban);
    }
}