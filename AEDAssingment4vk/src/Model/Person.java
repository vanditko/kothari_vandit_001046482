package Model;

import java.util.Date;

public class Person {

    private String fullName;
    private House residence;
    private String gender;
    private Date dob;
    private int id;

    public Person(String fullName,
            House residence,
            String gender,
            Date dob,
            int id) {

        this.fullName = fullName;
        this.residence = residence;
        this.gender = gender;
        this.dob = dob;
        this.id = id;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
