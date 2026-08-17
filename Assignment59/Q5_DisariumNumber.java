/*
Q5 — Disarium Number

Write a program to check whether a given number is a Disarium Number or not.

A number is called a Disarium Number if the sum of its digits 
powered to their respective positions is equal to the original number.
*/
import java.util.*;

class DisariumNumber
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

    public static boolean CheckDisarium(int No)
    {
        int Temp = No;
        int Digit = 0;
        int Sum = 0;
        int Position = 0;
        int Count = 0;

        Count = CountDigits(No);
        Position = Count;

        while(Temp != 0)
        {
            Digit = Temp % 10;

            Sum = Sum + Power(Digit, Position);

            Position--;
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
            Ret = CheckDisarium(Num);

            if(Ret == true)
            {
                System.out.println("Disarium Number");
            }
            else
            {
                System.out.println("Not Disarium Number");
            }
        }
    }
}
