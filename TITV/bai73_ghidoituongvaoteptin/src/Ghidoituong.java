import ConNguoi.Employee;
import date.Date;

import java.io.*;

public class Ghidoituong {
    public static void main(String[] args) {
        File file = new File("E:\\OneDrive\\TITV\\bai73_ghidoituongvaoteptin\\ghitep\\ghitepfile.txt");
        file.getParentFile().mkdirs(); // Đảm bảo thư mục tồn tại

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            Employee ep = new Employee("nxd", 20, new Date(11, 7, 2005), 90);
            Employee ep1 = new Employee("nhp", 20, new Date(24, 12, 2004), 90);
            oos.writeObject(ep);
            oos.writeObject(ep1);
        } catch (IOException e) {
            System.err.println("Lỗi I/O: " + e.getMessage());
        }
    }
}
