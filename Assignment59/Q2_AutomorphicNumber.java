/*
Q2 — Automorphic Number

Write a program to check whether a given number is an Automorphic Number or not.

A number is called an Automorphic Number if its square ends with the same digits as the number itself.

Input: One integer num

Output: Automorphic Number
*/
import java.util.*;

class AutomorphicNumber
{
    public static boolean CheckAutomorphic(int No)
    {
        int Square = 0;
        int Temp = No;
        int Digits = 0;
        int Divisor = 1;

        Square = No * No;

        while(Temp != 0)
        {
            Digits++;
            Temp = Temp / 10;
        }

        for(int i = 1; i <= Digits; i++)
        {
            Divisor = Divisor * 10;
        }

        if(Square % Divisor == No)
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
            Ret = CheckAutomorphic(Num);

            if(Ret == true)
            {
                System.out.println("Automorphic Number");
            }
            else
            {
                System.out.println("Not Automorphic Number");
            }
        }
    }
}
