/*
Q4 — Harshad Number

Write a program to check whether a given number is a Harshad Number or not.

A number is called a Harshad Number if it is divisible by the sum of its digits.

Input: One integer num

Output: Harshad Number
*/
import java.util.*;

class HarshadNumber
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

    public static boolean CheckHarshad(int No)
    {
        int Sum = 0;

        Sum = SumDigits(No);

        if(No % Sum == 0)
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
            Ret = CheckHarshad(Num);

            if(Ret == true)
            {
                System.out.println("Harshad Number");
            }
            else
            {
                System.out.println("Not Harshad Number");
            }
        }
    }
}
