/*
Q1 — Strong Number

Write a program to check whether a given number is a Strong Number or not.

A number is called a Strong Number if the sum of the factorials of each digit is equal to the number itself.

Input: One integer num

Output: Strong Number
*/

import java.util.*;

class StrongNumber
{
    public static int Factorial(int No)
    {
        int Fact = 1;

        for(int i = 1; i <= No; i++)
        {
            Fact = Fact * i;
        }

        return Fact;
    }

    public static boolean CheckStrong(int No)
    {
        int Temp = No;
        int Digit = 0;
        int Sum = 0;

        while(Temp != 0)
        {
            Digit = Temp % 10;

            Sum = Sum + Factorial(Digit);

            Temp = Temp / 10;
        }

        if(Sum == No)
        {
            return true;
        }

        return false;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Num = 0;
        boolean Ret = false;

        System.out.println("Enter number :");
        Num = sobj.nextInt();

        if(Num < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            Ret = CheckStrong(Num);

            if(Ret == true)
            {
                System.out.println("Strong Number");
            }
            else
            {
                System.out.println("Not Strong Number");
            }
        }
    }
}
