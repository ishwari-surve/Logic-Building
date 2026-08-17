/*
Q1 — Neon Number

Write a program to check whether a given number is a Neon Number or not.

A number is called a Neon Number if the sum of the digits 
of its square is equal to the original number.

Input: One integer num

Output: Neon Number
*/

import java.util.*;

class NeonNumber
{
    public static int SumDigits(int No)
    {
        int Sum = 0;
        int Digit = 0;

        while(No != 0)
        {
            Digit = No % 10;
            Sum = Sum + Digit;
            No = No / 10;
        }

        return Sum;
    }

    public static boolean CheckNeon(int No)
    {
        int Square = 0;
        int Sum = 0;

        Square = No * No;

        Sum = SumDigits(Square);

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
            Ret = CheckNeon(Num);

            if(Ret == true)
            {
                System.out.println("Neon Number");
            }
            else
            {
                System.out.println("Not Neon Number");
            }
        }
    }
}
