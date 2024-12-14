package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class SimpleCasio {
    private String pheptoancantinh;
    private String ketqua;
    private Vector<String> phimnhan;

    public SimpleCasio() {
        pheptoancantinh = "";
        ketqua = "";
        phimnhan = new Vector<>(Arrays.asList("1", "2", "3", "4", "5",
                "6", "7", "8", "9", "+", "-", "*", "/", "="
                , "sin", "cos", "tan", ".", "DEL", "AC"));
    }

    public void setPheptoancantinh(String c) {
        pheptoancantinh = c;
    }

    public void setKetqua(String c) {
        ketqua = c;
    }

    public String getPheptoancantinh() {
        return pheptoancantinh;
    }

    public String getKetqua() {
        return ketqua;
    }


    public Vector<String> getPhimnhan() {
        return phimnhan;
    }

    public void them(String c) {
        pheptoancantinh += c;
    }
}
