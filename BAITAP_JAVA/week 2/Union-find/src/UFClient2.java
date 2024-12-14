import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.UF;

import java.util.Scanner;

public class UFClient2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = StdIn.readInt();
        UF uf = new UF(N);
        int dem = 0;
        while (!StdIn.isEmpty()) {

            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                dem++;
            }
        }
        if (uf.count() == 1) {
            System.out.println(dem);
        } else
            System.out.println("FAILED");
    }
}
//tôi gặp phải vấn đề này khi chạy ứng dụng dòng lệnh kotlin trong Intellij.
//những người khác nói rằng ctrl + D hoặc ^ đều có tác dụng,
//nhưng không có tác dụng nào với tôi.
//tôi nhận ra rằng đó là vì keymap của tôi
// (một phiên bản sửa đổi một chút của keymap vscode từ jetbrains)
//đã có ctrl + D được liên kết với một thứ khác.
//Tôi đã tìm kiếm các lệnh keymap cho "FOF" và
//hóa ra có một lệnh "gửi FOF" không có liên kết.
//Tôi đã đặt lệnh đó thành Ctrl + D trong khi thay thế các lệnh khác và
//lệnh đó hoạt động hoàn hảo