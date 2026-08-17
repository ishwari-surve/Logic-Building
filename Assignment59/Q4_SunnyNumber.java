/*
Q4 — Sunny Number

Write a program to check whether a given number is a Sunny Number or not.

A number is called a Sunny Number if num + 1 is a perfect square.

Input: One integer num

Output: Sunny Number
*/
import java.util.*;

class SunnyNumber
{
    public static boolean CheckPerfectSquare(int No)
    {
        int i = 0;

        for(i = 1; i * i <= No; i++)
        {
            if(i * i == No)
            {
                return true;
            }
        }

        return false;
    }

    public static boolean CheckSunny(int No)
    {
        int Result = 0;

        Result = No + 1;

        if(CheckPerfectSquare(Result) == true)
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
            Ret = CheckSunny(Num);

            if(Ret == true)
            {
                System.out.println("Sunny Number");
            }
            else
            {
                System.out.println("Not Sunny Number");
            }
        }
    }
}
