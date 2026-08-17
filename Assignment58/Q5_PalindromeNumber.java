/*
Q5 — Palindrome Number 

Write a program to check whether a given number is a Palindrome Number or not.

A number is called a Palindrome if it remains the same when reversed.

Input: One integer num

Output: Palindrome Number
*/
import java.util.*;

class PalindromeNumber
{
    public static int ReverseNumber(int No)
    {
        int Reverse = 0;
        int Digit = 0;

        while(No != 0)
        {
            Digit = No % 10;

            Reverse = (Reverse * 10) + Digit;

            No = No / 10;
        }

        return Reverse;
    }

    public static boolean CheckPalindrome(int No)
    {
        int Reverse = 0;

        Reverse = ReverseNumber(No);

        if(Reverse == No)
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
            Ret = CheckPalindrome(Num);

            if(Ret == true)
            {
                System.out.println("Palindrome Number");
            }
            else
            {
                System.out.println("Not Palindrome Number");
            }
        }
    }
}
