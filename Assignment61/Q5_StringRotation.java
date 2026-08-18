/*
Write a program to check whether one string is rotation of another.
Description:
String B is rotation of String A if it can be obtained by shifting characters.

Input Format:
-String1
-String2

Output Format: Rotation
*/

import java.util.*;

class StringRotation
{
    public static boolean CheckRotation(String Str1, String Str2)
    {
        if(Str1.length() != Str2.length())
        {
            return false;
        }

        String Temp = Str1 + Str1;

        if(Temp.contains(Str2))
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

        Ret = CheckRotation(Str1, Str2);

        if(Ret == true)
        {
            System.out.println("Rotation");
        }
        else
        {
            System.out.println("Not Rotation");
        }
    }
}
