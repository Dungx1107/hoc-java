import vector.simple.MyVector;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hi" + args[0]);

        MyVector v1 = new MyVector(2,3);
        System.out.println(v1.x);
        v1.print();
        System.out.println(v1);
    }
}
 /*
        chạy trên cmd


E:\OneDrive\hoccogiao_thamsodonglenh\src>javac HelloWorld.java
E:\OneDrive\hoccogiao_thamsodonglenh\src>dir
 Volume in drive E is New Volume
 Volume Serial Number is CE2A-ED2B

 Directory of E:\OneDrive\hoccogiao_thamsodonglenh\src

04/09/2024  07:14 CH    <DIR>          .
04/09/2024  07:12 CH    <DIR>          ..
04/09/2024  07:14 CH               863 HelloWorld.class
04/09/2024  07:12 CH               126 HelloWorld.java
04/09/2024  07:10 CH               116 Main.java
               3 File(s)          1.105 bytes
               2 Dir(s)  141.849.571.328 bytes free

E:\OneDrive\hoccogiao_thamsodonglenh\src>java HelloWorld
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at HelloWorld.main(HelloWorld.java:3)

E:\OneDrive\hoccogiao_thamsodonglenh\src>java HelloWorld Sồ
HiS?

E:\OneDrive\hoccogiao_thamsodonglenh\src>java HelloWorld Sonofbitch
HiSonofbitch

E:\OneDrive\hoccogiao_thamsodonglenh\src>
         */