package com.company;

public class ExceptionInInitializerError {
    //static int a=10/0;
    static{
        int a=100/0;
    }
    public static void main(String[] args){

    }
}
