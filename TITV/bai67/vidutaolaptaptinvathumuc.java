import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class vidutaolaptaptinvathumuc {
    public static void main(String[] args) {
        vidutaolaptaptinvathumuc bai68 = new vidutaolaptaptinvathumuc();
        bai68.kiemtratepcotontaiko();
        bai68.taothumuc();
        bai68.taoteptin();
    }

    public void taoteptin() {
        //co phan mo rong (.txt, .doc, .xls, ... )
        File file1 = new File("E:\\OneDrive\\TITV\\bai68\\dir1\\vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IIOException e) {
            //khong co quyen tao tep tin
            //ko con dung luong ... .. .
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file2 = new File("E:\\OneDrive\\TITV\\bai68\\dir1\\dir2\\sonofbitch.cpp");
        try {
            file2.createNewFile();
        } catch (IIOException e) {
            //khong co quyen tao tep tin
            //ko con dung luong ... .. .
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void taothumuc() {
        // phuong thuc mkdir -> tao 1 thu muc
        File folder1 = new File("E:\\OneDrive\\TITV\\bai68\\dir1");
        folder1.mkdir();

        //phuong thuc mkdirs ->tao nhieu thu muc cung luc
        File folder2 = new File("E:\\OneDrive\\TITV\\bai68\\dir1\\dir2\\dir3\\dir4");
        folder2.mkdirs();
    }

    public void kiemtratepcotontaiko() {
        // kiem tra thu muc hoac tep tin co ton tai hay khong
        File folder1 = new File("E:\\OneDrive\\TITV\\bai68");
        File folder2 = new File("E:\\OneDrive\\TITV\\bai69");

        System.out.println("folder1 có tồn tại ko : " + folder1.exists());
        System.out.println("folder2 có tồn tại ko : " + folder2.exists());

    }
}
