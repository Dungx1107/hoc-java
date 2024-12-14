import java.io.File;

public class vidufile {
    private File file;

    public vidufile(String tenfile) {
        this.file = new File(tenfile);
    }

    public boolean kiemtrathucthi() {
        return file.canExecute();
    }

    public boolean kiemtradoc() {
        return file.canRead();
    }

    public boolean kiemtraghi() {
        return file.canWrite();
    }

    public void induongdan() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void inten() {
        System.out.println(file.getName());
    }

    public void thumuchayteptin() {
        if (file.isDirectory()) {
            System.out.println("Đây là thư mục.");
        } else if (file.isFile()) {
            System.out.println("Đây là tệp tin.");
        } else {
            System.out.println("Đây không phải là tệp tin hoặc thư mục.");
        }
    }

    public void inracacfilecon() {
        System.out.println("da goi vao cai so 8\n");
        if (file.isFile()) {
            System.out.println("Không có tệp con.");
        } else if (file.isDirectory()) {
            System.out.println("Các tệp con của thư mục là:");
            File[] mangcon = file.listFiles();
            if (mangcon != null) {
                for (File file : mangcon) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

    public void incaythumuc() {
        inchitietcaythumuc(file, 0);
    }

    public void inchitietcaythumuc(File f, int bac) {
        // In cấp độ của thư mục
        for (int i = 0; i < bac; i++) {
            System.out.print("\t"); // In tab cho các cấp độ
        }
        System.out.println(f.getName());

        if (f.isDirectory()) {
            File[] mangcon = f.listFiles();
            if (mangcon != null) {
                for (File fx : mangcon) {
                    inchitietcaythumuc(fx, bac + 1);
                }
            }
        }
    }
}
