package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    static int count;
    static int total;
    static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

    static void getChange(int amount)
    {
        if (amount / notes[count] != 0)
        {
            total += (amount / notes[count]);
            System.out.println(notes[count] + "rs notes :" + amount / notes[count]);
            amount = amount % notes[count];
        }
        count++;
        if (amount == 0)
        {
            System.out.println("Total notes :" + total);
            return;
        }
        getChange(amount);
    }
    //main method to test the class
    public static void main(String[] args)
    {
        try
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the amount");
            int value = s.nextInt();
            getChange(value);
            s.close();
        } catch (Exception e)
        {
            System.out.println("Enter value in integer");
        }
    }
}
