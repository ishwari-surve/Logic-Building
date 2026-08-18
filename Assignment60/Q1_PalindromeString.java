/*
Q1 — Palindrome String

Write a program to check whether a given string is a Palindrome or not.

A string is called a Palindrome if it reads the same forward and backward.

Input: One string str

Output: Palindrome String
*/
import java.util.*;

class PalindromeString
{
    public static boolean CheckPalindrome(String Str)
    {
        int Start = 0;
        int End = Str.length() - 1;

        while(Start < End)
        {
            if(Str.charAt(Start) != Str.charAt(End))
            {
                return false;
            }

            Start++;
            End--;
        }

        return true;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = null;
        boolean Ret = false;

        System.out.println("Enter string :");
        Str = sobj.nextLine();

        Ret = CheckPalindrome(Str);

        if(Ret == true)
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }
    }
}
