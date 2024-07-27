package org.Learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.gson.Gson;

public class LearnComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(56);
        list.add(13);
        list.add(34);
        list.add(95);
        list.add(26);

        Comparator<Integer> comparebyLastDigit = new Comparator<Integer>() {
            @Override//writing not required
            public int compare(Integer i, Integer j) {
                if(i%10>j%10) return 1;
                else return -1;
            }
        };

        Collections.sort(list, comparebyLastDigit);
        System.out.println(list);

        Student s1 = new Student(25, "Kahi");
        Student s2 = new Student(2, "sdfssfd");
        Student s3 = new Student(65, "Ksdfgahi");
        Student s4 = new Student(34, "fdsfsa");

        List<Student> sList = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
        Collections.sort(sList);
        for (Student elem : sList) {
            System.out.println(new Gson().toJson(elem));
        }
    }
}

class Student implements Comparable<Student>{
    int age;
    String address;
    public Student(int age, String address) {
        this.age = age;
        this.address = address;
    }
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }
}
