package com.crio.session5.activity1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(1, "Aditya", "Sharma"));
        studentList.add(new Student(2, "Beena", "Mishra"));
        studentList.add(new Student(3, "Priyanka", "Pandey"));
        studentList.add(new Student(4, "Vikas", "Jain"));
        studentList.add(new Student(5, "Rose", "Marlo"));

        Comparator<Student> comparasionStrategy = new Comparator<Student>() {

              @Override
              public int compare(Student arg0, Student arg1) {

                    return arg0.getFname().compareTo(arg1.getFname());

              }
        };
 
        Collections.sort(studentList,comparasionStrategy);
       
        for (Student student : studentList) {
              System.err.println(student.toString());
        }
       
        Collections.sort(studentList, new Comparator<Student>() {

              @Override
              public int compare(Student arg0, Student arg1) {
                    return arg1.getRollNo() - arg0.getRollNo();
              }

        });
        System.out.println();

        for (Student student : studentList) {
              System.out.println(student.toString());
        }
    }
}
