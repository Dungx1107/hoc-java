package model;

import java.util.StringTokenizer;

public class ThucDonModel {
    private String LuaChon_monchinh;
    private String LuaChon_monphu;
    private long tongtien;

    public void setLuaChon_monchinh(String luaChon_monchinh) {
        LuaChon_monchinh = luaChon_monchinh;
    }

    public void setLuaChon_monphu(String luaChon_monphu) {
        LuaChon_monphu = luaChon_monphu;
    }

    public ThucDonModel(String luaChon_monchinh, String luaChon_monphu, long tongtien) {
        LuaChon_monchinh = luaChon_monchinh;
        LuaChon_monphu = luaChon_monphu;
        this.tongtien = tongtien;
    }

    public ThucDonModel() {
        LuaChon_monchinh = "";
        LuaChon_monphu = "";
        this.tongtien = 0;
    }

    public String getLuaChon_monchinh() {
        return LuaChon_monchinh;
    }

    public String getLuaChon_monphu() {
        return LuaChon_monphu;
    }


    public void setTongtien(long tongtien) {
        this.tongtien = tongtien;
    }

    public long getTongtien() {
        return tongtien;
    }

    public void tinhtongtien() {
        long tong = 0;
        System.out.println("LuaChon_monchinh: '" + this.getLuaChon_monchinh() + "'");

        if (this.LuaChon_monchinh.equals("Cơm")) {
            System.out.println("son");
            tong += 20000;
        } else if (this.LuaChon_monchinh.equals("Phở")) {
            tong += 35000;
        } else if (this.LuaChon_monchinh.equals("Bánh mì")) {
            tong += 10000;
        }

        StringTokenizer stk = new StringTokenizer(this.getLuaChon_monphu());
        while (stk.hasMoreElements()) {
            String monphu = stk.nextToken();
            monphu = monphu.trim();
            if (monphu.equals("Trà sữa")) {
                tong += 30000;
            }
            if (monphu.equals("Nem")) {
                tong += 50000;
            }
            if (monphu.equals("Bánh ngọt")) {
                tong += 10000;
            }
            if (monphu.equals("Cocacola")) {
                tong += 20000;
            }
        }
        this.setTongtien(tong);
        System.out.println(tong);
        System.out.println(this.getTongtien());
    }

}
