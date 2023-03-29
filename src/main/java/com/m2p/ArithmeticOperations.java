package com.m2p;

public class ArithmeticOperations {

    int add(int firstInputNumber, int secondInputNumber){
        return firstInputNumber+secondInputNumber;
    }
    int subtract(int firstInputNumber, int secondInputNumber){
        return firstInputNumber-secondInputNumber;
    }

    int multiply(int firstInputNumber, int secondInputNumber){

        return firstInputNumber*secondInputNumber;
    }

    int divide(int firstInputNumber, int secondInputNumber){
        if(secondInputNumber == 0) {
            throw new ArithmeticException();
        }
        return firstInputNumber/secondInputNumber;
    }
}
