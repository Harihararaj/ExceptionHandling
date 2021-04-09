package com.company;
public class ExceptionPropagation {
        public static void main(String[] args){
            try{
                m1();
            }
            catch (ArithmeticException e){
               System.out.println("There is a Exception in m3()");
            }
        }
        static void m1(){
            m2();
        }
        static void m2(){
            m3();
        }
        static void m3(){
            System.out.println(10/0);
        }
}
