/*
3. Write a program to remove duplicate characters from a string.
Description:
-Remove repeated characters while keeping first occurrence.

Input Format: One string
Output Format: String without duplicate characters
*/

import java.util.*;

class RemoveDuplicateCharacters
{
    public static String RemoveDuplicates(String Str)
    {
        String Result = "";

        for(int i = 0; i < Str.length(); i++)
        {
            char ch = Str.charAt(i);

            if(Result.indexOf(ch) == -1)
            {
                Result = Result + ch;
            }
        }

        return Result;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = null;
        String Ret = null;

        System.out.println("Enter string :");
        Str = sobj.nextLine();

        Ret = RemoveDuplicates(Str);

        System.out.println("String after removing duplicate characters : " + Ret);
    }
}
