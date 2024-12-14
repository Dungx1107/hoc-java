package org.example.javafxtutorials.main21TableView;

/*
Person
    person_name
    person_age
 */

import java.util.Date;

public class Person {
    protected String personName;
    protected int personAge;
    protected String personAddress;
    protected String personGmail;
    protected String personPhone;
    protected boolean personSex;
    protected Date personDateBirth;

    public Person(String personName, int personAge,
                  String personAddress, String personGmail,
                  String personPhone, boolean personSex, Date personDateBirth) {
        this.personName = personName;
        this.personAge = personAge;
        this.personAddress = personAddress;
        this.personGmail = personGmail;
        this.personPhone = personPhone;
        this.personSex = personSex;
        this.personDateBirth = personDateBirth;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getPersonGmail() {
        return personGmail;
    }

    public void setPersonGmail(String personGmail) {
        this.personGmail = personGmail;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    public String getPersonDateBirth() {
        return personDateBirth.getDay() + "/"
                + personDateBirth.getMonth() + "/"
                + personDateBirth.getYear();
    }

    public void setPersonDateBirth(Date personDateBirth) {
        this.personDateBirth = personDateBirth;
    }


    public Date getPersonDatebirth() {
        return personDateBirth;
    }

    public void setPersonDatebirth(Date personDatebirth) {
        this.personDateBirth = personDatebirth;
    }

    public boolean isPersonSex() {
        return personSex;
    }

    public void setPersonSex(boolean personSex) {
        this.personSex = personSex;
    }

    public String getPersonSex() {
        if (personSex) return "Nam";
        return "Nữ";
    }


    public Person() {
    }


}




