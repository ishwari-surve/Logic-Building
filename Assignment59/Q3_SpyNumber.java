/*
Q3 — Spy Number

Write a program to check whether a given number is a Spy Number or not.

A number is called a Spy Number if the sum of its digits is equal to the product of its digits.

Input: One integer num

Output: Spy Number
*/
import java.util.*;

class SpyNumber
{
    public static boolean CheckSpy(int No)
    {
        int Sum = 0;
        int Product = 1;
        int Digit = 0;

        while(No != 0)
        {
            Digit = No % 10;

            Sum = Sum + Digit;
            Product = Product * Digit;

            No = No / 10;
        }

        if(Sum == Product)
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
            Ret = CheckSpy(Num);

            if(Ret == true)
            {
                System.out.println("Spy Number");
            }
            else
            {
                System.out.println("Not Spy Number");
            }
        }
    }
}
