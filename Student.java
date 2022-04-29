package com.company;
import java.util.*;
public class Student {
    private String firstName;
    private String lastName;
    private String idNum;
    private int age;
    private HashMap<String, ArrayList<Integer>> hashMap;
    private String password;
    public Student(String firstName, String lastName, String idNum, int age, HashMap<String, ArrayList<Integer>> hashMap, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.age = age;
        this.hashMap = hashMap;
        this.password = password;
    }
    public Student() {}
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
    public HashMap<String, ArrayList<Integer>> getHashMap() {
        return hashMap;
    }
    public void setHashMap(HashMap<String, ArrayList<Integer>> hashMap) {
        this.hashMap = hashMap;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}