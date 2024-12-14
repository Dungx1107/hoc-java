import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ghivaotep {
    public static void main(String[] args) throws IOException {
//        File son = new File("E:\\OneDrive\\TITV\\bai72\\ghitep.txt");
//        son.createNewFile();
//        System.out.println("co ghi dc ko");
//        System.out.println(son.canWrite());

        //ghi
        try {
            PrintWriter ghitep = new PrintWriter("E:\\OneDrive\\TITV\\bai72\\ghitep.txt","UTF-8");
            ghitep.println("hello son of bitch");
            ghitep.println("ricacdo kaka");
            ghitep.flush();
            ghitep.close();// khong dong thi cac chuong trinh khac ko mo ra dc
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
