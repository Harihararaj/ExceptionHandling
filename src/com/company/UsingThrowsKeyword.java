package com.company;

public class UsingThrowsKeyword {
    public static void main(String[] args){
        try{
            printSomeData();
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
        System.out.println("Hiiii");
    }
    static void printSomeData() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
    }
}
