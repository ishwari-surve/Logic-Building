/*
Q3 — Perfect Number

Write a program to check whether a given number is a Perfect Number or not.

A number is called a Perfect Number if the sum of all its proper divisors, 
excluding the number itself, is equal to the number.

Input: One integer num

Output: Perfect Number
*/

import java.util.*;

class PerfectNumber
{
    public static int SumDivisors(int No)
    {
        int Sum = 0;

        for(int i = 1; i <= No / 2; i++)
        {
            if(No % i == 0)
            {
                Sum = Sum + i;
            }
        }

        return Sum;
    }

    public static boolean CheckPerfect(int No)
    {
        int Sum = 0;

        Sum = SumDivisors(No);

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

        if(Num <= 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            Ret = CheckPerfect(Num);

            if(Ret == true)
            {
                System.out.println("Perfect Number");
            }
            else
            {
                System.out.println("Not Perfect Number");
            }
        }
    }
}
