public class vidufile {import java.io.File;
import java.util.Scanner;

    public class vidufile {
        File file;

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
            System.out.println(this.file.getAbsoluteFile());
        }

        public void inten() {
            System.out.println(file.getName());
        }

        public void thumuchayteptin() {
            if (file.isDirectory()) {
                System.out.println("day la thu muc");
            } else System.out.println("day la file");
        }
    }

}
