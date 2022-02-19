package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankMain {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        SBI ob=new SBI();
        BOI ob1=new BOI();
        ICICI ob2=new ICICI();

        ob.getDetails("SBI","Lucknow Branch",6);
        ob.printDetails("SBI","Lucknow Branch",6);
        ob.account(1800101001,1800,80);

        ob1.getDetails("BOI","Mumbai Branch",8);
        ob1.printDetails("BOI","Mumbai Branch",8);
        ob1.account(1400101001,1800,180000);

        ob2.getDetails("ICICI","Delhi Branch",7);
        ob2.printDetails("ICICI","Delhi Branch",7);
        ob2.account(1300302001,500,70);


    }
}
