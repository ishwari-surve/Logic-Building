/*
Q2 — Armstrong Number

Write a program to check whether a given number is an Armstrong Number or not.

A number is called an Armstrong Number if the sum of the powers of its digits, 
where the power is equal to the number of digits, is equal to the original number.

Input:One integer num

Output: Armstrong Number
*/

import java.util.*;

class ArmstrongNumber
{
    public static int CountDigits(int No)
    {
        int Count = 0;

        while(No != 0)
        {
            Count++;
            No = No / 10;
        }

        return Count;
    }

    public static int Power(int Base, int Exponent)
    {
        int Result = 1;

        for(int i = 1; i <= Exponent; i++)
        {
            Result = Result * Base;
        }

        return Result;
    }

    public static boolean CheckArmstrong(int No)
    {
        int Temp = No;
        int Digit = 0;
        int Sum = 0;
        int Count = 0;

        Count = CountDigits(No);

        while(Temp != 0)
        {
            Digit = Temp % 10;

            Sum = Sum + Power(Digit, Count);

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
            Ret = CheckArmstrong(Num);

            if(Ret == true)
            {
                System.out.println("Armstrong Number");
            }
            else
            {
                System.out.println("Not Armstrong Number");
            }
        }
    }
}
