/*
2. Write a program to find the longest word in a sentence.
Description:
Identify the word having maximum length.

Input Format: One sentence
Output Format: Longest word
*/

import java.util.*;

class LongestWord
{
    public static String FindLongest(String Str)
    {
        String Arr[] = Str.split(" ");

        String Longest = Arr[0];

        for(int i = 1; i < Arr.length; i++)
        {
            if(Arr[i].length() > Longest.length())
            {
                Longest = Arr[i];
            }
        }

        return Longest;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = null;
        String Ret = null;

        System.out.println("Enter sentence :");
        Str = sobj.nextLine();

        Ret = FindLongest(Str);

        System.out.println("Longest word is : " + Ret);
    }
}
