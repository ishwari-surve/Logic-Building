/*
Q2 — Anagram Strings

Write a program to check whether two given strings are Anagrams or not.

Two strings are Anagrams if they contain the same characters with the same frequency, regardless of their order.

Input:
-First string str1
-Second string str2

Output: Anagram
*/

import java.util.*;

class AnagramString
{
    public static boolean CheckAnagram(String Str1, String Str2)
    {
        if(Str1.length() != Str2.length())
        {
            return false;
        }

        char Arr1[] = Str1.toLowerCase().toCharArray();
        char Arr2[] = Str2.toLowerCase().toCharArray();

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        if(Arrays.equals(Arr1, Arr2))
        {
            return true;
        }

        return false;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str1 = null;
        String Str2 = null;
        boolean Ret = false;

        System.out.println("Enter first string :");
        Str1 = sobj.nextLine();

        System.out.println("Enter second string :");
        Str2 = sobj.nextLine();

        Ret = CheckAnagram(Str1, Str2);

        if(Ret == true)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}
