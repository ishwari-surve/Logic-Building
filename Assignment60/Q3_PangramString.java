/*
Q3 — Pangram String

Write a program to check whether a given string is a Pangram or not.

A string is called a Pangram if it contains all alphabets from a to z at least once.

Input: One sentence str

Output: Pangram
*/

import java.util.*;

class PangramString
{
    public static boolean CheckPangram(String Str)
    {
        Str = Str.toLowerCase();

        for(char Ch = 'a'; Ch <= 'z'; Ch++)
        {
            if(Str.indexOf(Ch) == -1)
            {
                return false;
            }
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

        Ret = CheckPangram(Str);

        if(Ret == true)
        {
            System.out.println("Pangram");
        }
        else
        {
            System.out.println("Not Pangram");
        }
    }
}
