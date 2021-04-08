package com.company;
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
public class RuntimeExceptions {
    public static void main(String[] args){
        System.out.println(10/0);
        int[] a={1,2,3,4};
        System.out.println(a[4]);
        Student s=null;
        System.out.println(s.name);
    }
}
