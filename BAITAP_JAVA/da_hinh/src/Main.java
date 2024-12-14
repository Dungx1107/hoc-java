import ConNguoi.Employee;
import ConNguoi.Person;
import date.Date;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
//        main.phan1_upcasting();
        main.phan2_downcasting();
    }

    public void phan1_upcasting() {
        Employee con = new Employee("Nguyễn Xuân Dũng", 19, new Date(11, 7, 2005), 5000000);
        con.inthongtin();

        Person bo = con;
        bo.inthongtin();

        Person ll = new Employee();
        ll.say();
    }

    public void phan2_downcasting() {
        Employee k1 = (Employee) (Person) new Employee();
        k1.inthongtin();

        Person k2 = new Employee();
        k2.say();

        if (k2 instanceof Employee) {
            Employee kk = (Employee) k2;
            kk.say();
        } else {
            System.out.println("ricardo kaka");
        }
        System.out.println("thong tin cua k2");
        k2.inthongtin();
    }
}