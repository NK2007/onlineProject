package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        boolean loggedInStudent = false, loggedInTeacher = false;
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> grades = new HashMap<>();
        while (true) {
            if (! loggedInStudent && ! loggedInTeacher) {
                System.out.println("1. Register student");
                System.out.println("2. Register teacher");
                System.out.println("3. Log in student");
                System.out.println("4. Log in teacher");
                System.out.println("5. Exit");
                choice = in.nextInt();
                if (choice == 5) {
                    System.exit(0);
                } else if (choice == 1) {
                    System.out.print("firstName : ");
                    String firstName = in.next();
                    System.out.print("lastName : ");
                    String lastName = in.next();
                    System.out.print("idNum : ");
                    String idNum = in.next();
                    System.out.print("age : ");
                    int age = in.nextInt();
                    System.out.print("password : ");
                    String password = in.next();
                    HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
                    Student student = new Student(firstName, lastName, idNum, age, hashMap, password);
                    students.add(student);
                    ArrayList<Integer> list = new ArrayList<>();
                    grades.put(idNum, list);
                } else if (choice == 2) {
                    System.out.print("firstName : ");
                    String firstName = in.next();
                    System.out.print("lastName : ");
                    String lastName = in.next();
                    System.out.print("idNum : ");
                    String idNum = in.next();
                    System.out.print("age : ");
                    int age = in.nextInt();
                    System.out.print("password : ");
                    String password = in.next();
                    Teacher teacher = new Teacher(firstName, lastName, idNum, age, password);
                    teachers.add(teacher);
                } else if (choice == 3) {
                    System.out.print("idNum : ");
                    String idNum = in.next();
                    System.out.print("password : ");
                    String password = in.next();
                    boolean studentFound = false;
                    for (Student i : students) {
                        if (i.getIdNum().equals(idNum) && i.getPassword().equals(password)) {
                            studentFound = true;
                            break;
                        }
                    }
                    if (studentFound) {
                        System.out.println("Successfully logged in!!!");
                        loggedInStudent = true;
                    } else {
                        System.out.println("There was an error. Please try again!!!");
                    }
                } else {
                    System.out.print("idNum : ");
                    String idNum = in.next();
                    System.out.print("password : ");
                    String password = in.next();
                    boolean teacherFound = false;
                    for (Teacher i : teachers) {
                        if (i.getIdNum().equals(idNum) && i.getPassword().equals(password)) {
                            teacherFound = true;
                            break;
                        }
                    }
                    if (teacherFound) {
                        System.out.println("Successfully logged in!!!");
                        loggedInTeacher = true;
                    } else {
                        System.out.println("There was an error. Please try again!!!");
                    }
                }
            } else {
                if (loggedInStudent) {
                    System.out.println("1. Log out");
                    System.out.println("2. View grades");
                    System.out.println("3. Exit");
                    choice = in.nextInt();
                    if (choice == 3) {
                        System.exit(0);
                    } else if (choice == 1) {
                        loggedInStudent = false;
                    } else {
                        System.out.print("Your idNum : ");
                        String idNum = in.next();
                        System.out.println("Your grades : ");
                        System.out.println(grades.get(idNum));
                    }
                } else {
                    System.out.println("1. Log out");
                    System.out.println("2. Grade somebody");
                    System.out.println("3. Exit");
                    choice = in.nextInt();
                    if (choice == 3) {
                        System.exit(0);
                    } else if (choice == 1) {
                        loggedInTeacher = false;
                    } else {
                        System.out.print("Who do you want to grade ? (enter idNum) ");
                        String idNum = in.next();
                        System.out.print("Grade : ");
                        int grade = in.nextInt();
                        grades.get(idNum).add(grade);
                    }
                }
            }
        }
    }
}