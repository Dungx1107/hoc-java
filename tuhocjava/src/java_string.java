public class java_string {
    public static void main(String[] args) {
//        String s = "duong van chien";
//        s = s + "123456";
//        System.out.println(s);
        java_string ans = new java_string();
        ans.sosanh_xau();
//        ans.buoi3();
//        ans.buoi2();
//        ans.buoi1();
    }

    public void sosanh_xau() {
        // compareTo. compareToIgnoreCase
        String a1 = "abcdef";
        String a2 = "AbcdeF";
        int x = a1.compareTo(a2);
        System.out.println(x);
        int y = a1.compareToIgnoreCase(a2);
        System.out.println(y);
    }

    public void buoi3() {
        // trim(0 xoa toan bo khoang trang dau va cuoi
        String ansmup = "    an mup ";
        String vanchien = ansmup.trim();
        System.out.println(vanchien);
        System.out.println(ansmup);
    }

    public void buoi2() {
        //indexOf : kiem tra vi tri xuat hien dau tien cua ki tu hoac
        //chuoi . tra ve -1 neu ko tim thay
        //lastIndexOf
        //contains: kiem tra chuoi con
        //substring :
//        String s = "duong be de";
//        System.out.println(s.indexOf("duong"));
//        System.out.println(s.indexOf("vu"));
//
//        System.out.println(s.lastIndexOf("de"));
//        System.out.println(s.lastIndexOf("son"));
//        String m3p = "ronaldo";
//        System.out.println(m3p.contains("do"));
//        System.out.println(m3p.contains("messi"));
//        boolean check = m3p.contains("kaka");
//        if (check) System.out.println("ricacdokkaa");
//        else System.out.println("penaldo");

//        String s11 = s.substring(3);
//        System.out.println(s11);
//        String s22 = s.substring(2,7);
//        System.out.println(s22);

        // replace : thay the toan bo chu cu bang chu moi
        String s1 = "hoc hoc nua hoc mai";
        String s2 = s1.replace("hoc", "ngu");
        System.out.println(s2);

        //replaceFirst : thay the chu cu dau tien
        String s3 = s1.replaceFirst("hoc", "ngu");
        System.out.println(s3);
    }

    public void buoi1() {
        StringBuilder chuoi = new StringBuilder();

        // them chuoi vao cuoi
        chuoi.append("duoong");
        chuoi.append("\nvan");
        System.out.println(chuoi);

        //insert(vi tri chen, chuoi can chen)
        chuoi.insert(2, "\tson of bitch");
        System.out.println(chuoi);

        //delete(start,end)
        chuoi.delete(2, 7);
        System.out.println(chuoi);

        // do dai
        int l = chuoi.length();
        System.out.println(l);
    }
}

