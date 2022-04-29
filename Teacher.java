package com.company;
public class Teacher {
    private String firstName;
    private String lastName;
    private String idNum;
    private int age;
    private String password;
    public Teacher(String firstName, String lastName, String idNum, int age, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.age = age;
        this.password = password;
    }
    public Teacher() {}
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getIdNum() {
        return idNum;
    }
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}