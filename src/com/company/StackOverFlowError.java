package com.company;

public class StackOverFlowError {
    public static void main(String[] args){
        m1();
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        m1();
    }
}
