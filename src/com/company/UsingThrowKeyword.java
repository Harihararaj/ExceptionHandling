package com.company;
//Customized Exception or User defined exception.
class enterValidAmount extends RuntimeException{
    enterValidAmount(String descriptionForException){
        super(descriptionForException);
    }
}
public class UsingThrowKeyword {
    public static void main(String[] args){
            throw new enterValidAmount("Enter the valid amount");//Throwing user defined exception

    }
}
