import java.io.File;
import java.io.IOException;

public class xoafile {

    public static void main(String[] args) throws IOException {
        File f0 = new File("E:\\OneDrive\\TITV\\bai69/bitch.txt");
        f0.delete();
//        File f1 = new File("E:\\OneDrive\\TITV\\bai69/bitch.txt");
//        f0.createNewFile();
        File f2 = new File("E:\\OneDrive\\TITV\\bai69\\an mup");
        f2.delete();
        File f3 = new File("E:\\OneDrive\\TITV\\bai69\\vu xuan dung");
        f3.delete();
        File f4 = new File("E:\\OneDrive\\TITV\\bai69\\son");
        f4.delete();
        File f5 = new File("D:\\Zalo Received Files/.rescache");
        f5.delete();
        File f6 = new File("E:\\OneDrive\\TITV\\bai69\\son");
        xoafile.xoanhieuthumuclongnhau(f6);
    }

    public static void xoanhieuthumuclongnhau(File f) {
        if (f.isFile()) {
            System.out.println("da xoa : " + f.getAbsolutePath());
            f.delete();
        } else {
            File[] mangcon = f.listFiles();
            for (File j : mangcon) {
                xoanhieuthumuclongnhau(j);
            }
            f.delete();
        }
    }
}
