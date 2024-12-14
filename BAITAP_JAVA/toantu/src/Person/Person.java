package Person;

import MyDate.MyDate;

public class Person {
    protected String name;
    protected MyDate birthday;

    public Person(MyDate birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public void in() {
        System.out.print(name + " : ");
        birthday.in();
    }
}
