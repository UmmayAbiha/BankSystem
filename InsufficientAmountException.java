package com.company;

class InsufficientAmountException extends Exception{

    InsufficientAmountException(){
        super("Insufficient Balance to withdraw this amount");
    }
}
