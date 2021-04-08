package com.company;
class Mythread1 implements Runnable{
    public void run(){
        try {
            Thread.sleep(10000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class InterruptedException {
    public static void main(String[] args) {
        Mythread1 mythread1 = new Mythread1();
        Thread thread = new Thread(mythread1);
        thread.start();
        thread.interrupt();
    }
}
