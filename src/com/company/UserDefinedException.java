package com.company;

import java.util.Scanner;

class YourAgeIsLowToApply extends RuntimeException{
    YourAgeIsLowToApply(String description){
        super(description);
    }
}
class YourAgeIsHighToApply extends RuntimeException{
    YourAgeIsHighToApply(String description){
        super(description);
    }
}
public class UserDefinedException {
    public static void main(String[] args){
        System.out.println("Enter the age for Matrimony");
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        if(age<22){
            throw new YourAgeIsLowToApply("Please Apply once you are 22");
        }
        else if(age>60){
            throw new YourAgeIsHighToApply("You cannot Apply");
        }
        else{
            System.out.println("Thanks for applying");
        }
    }
}
