package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class BOI extends Bank{
    void getDetails(String name,String B_name,double roi){

        Name=name;
        Branch_name=B_name;
        R_O_I=roi;

    }

    void printDetails(String name,String B_name,double roi)
    {
        System.out.println("Name of the bank is : "+name  +".  Branch name is: "+B_name +". It provides the Rate of Interest of "+roi +"%" );
    }

    void account(int acc_no,double amt,double amt_withdrawn ){
        int k=0;
        try{

            if(amt<amt_withdrawn){
                throw new InsufficientAmountException();
            }

        }
        catch(InsufficientAmountException e){
            k=-1;
            System.out.println(e.getMessage());

        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        try{
            FileWriter fw=new FileWriter("BOITransaction.txt");
            fw.write("The account number is:"+acc_no +"\n");
            fw.write("The amount in the account :"+amt+"\n");
            fw.write("The amount withdrawn is :"+amt_withdrawn+"\n");
            if(k==0){
                fw.write("The available amount in the account is :"+(amt-amt_withdrawn)+"\n");
                fw.write("Transaction successful"+"\n");
                fw.write("Transaction time  and date:"+now+"\n");


            }
            else
                fw.write("Transaction cancelled");
            fw.close();


        }
        catch(IOException e){
            System.out.println("An error occured");
        }


    }

}
