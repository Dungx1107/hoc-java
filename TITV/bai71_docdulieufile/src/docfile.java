import java.io.BufferedReader;
import java.io.File;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;


public class docfile {
    public static void main(String[] args) {

        docfile df = new docfile();
//        df.cach1();
        df.cach2();
    }

    public void cach2(){

        Scanner sc = new Scanner(System.in);
        String tt = sc.nextLine();
        File file = new File(tt);
        try{
            List<String>allText = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
            for(String t :allText){
                System.out.println(t);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void cach1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("nhập tên file cần đọc: ");
            String tenfile = sc.nextLine();
            File ff = new File(tenfile);
            try {
                BufferedReader docfile = Files.newBufferedReader(ff.toPath(), StandardCharsets.UTF_8);
                String line = null;
                while (true) {
                    line = docfile.readLine();
                    if (line == null) {
                        break;
                    } else System.out.println(line);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Có đọc tiếp hay không (nhập 1 để tiếp tục, bất kỳ số nào khác để dừng): ");
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                sc.nextLine(); // Tiêu thụ ký tự newline còn lại sau khi đọc số nguyên
                if (a != 1) break;
            } else {
                System.out.println("Đầu vào không hợp lệ, chương trình sẽ dừng lại.");
                break;
            }
        }
        sc.close();
    }
}

