

import ConNguoi.Employee;

import java.io.*;

public class DocDoituong {
    public static void main(String[] args) {
        File file =
                new File("E:\\OneDrive\\TITV\\bai73_ghidoituongvaoteptin\\ghitep\\ghitepfile.txt");

        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            // Đọc các đối tượng từ tệp
            Employee ep = (Employee) ois.readObject();
            Employee ep1 = (Employee) ois.readObject();

            ep.inthongtin();
            ep1.inthongtin();

            ois.close();
        } catch (FileNotFoundException e) {
            System.err.println("Tệp không tìm thấy: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Lỗi I/O: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Lớp không tìm thấy: " + e.getMessage());
        }
    }
}
