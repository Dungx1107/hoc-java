package model;

public class TimkiemModel {
    private String tukhoa;
    private String vanban;
    private String ketqua;

    public TimkiemModel() {
        this.ketqua = "";
        this.tukhoa = "";
        this.vanban = "";
    }

    public void setTukhoa(String tukhoa) {
        this.tukhoa = tukhoa;
    }

    public void setVanban(String vanban) {
        this.vanban = vanban;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }


    public String getKetqua() {
        return ketqua;
    }

    public String getTukhoa() {
        return tukhoa;
    }

    public String getVanban() {
        return vanban;
    }

    public void timkiem() {
        int dem = 0;
        int vitri = 0;
        while (true) {
            int i = this.vanban.indexOf(this.tukhoa, vitri);
            if (i == -1) {
                break;
            } else {
                dem++;
                vitri = i + 1;
            }
        }
        this.ketqua = "Ket qua : co " + dem + this.tukhoa;
//        System.out.println(ketqua);
    }

}
