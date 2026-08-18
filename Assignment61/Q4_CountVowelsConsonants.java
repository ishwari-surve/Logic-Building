/*
Write a program to count vowels and consonants in a string.
Description:
-Count total vowels (a,e,i,o,u) and consonants separately.

Input Format: One string
  
Output Format:
-Vowels: <count>
-Consonants: <count>
*/

import java.util.*;

class CountVowelsConsonants
{
    public static void Count(String Str)
    {
        int Vowels = 0;
        int Consonants = 0;

        Str = Str.toLowerCase();

        for(int i = 0; i < Str.length(); i++)
        {
            char ch = Str.charAt(i);

            if(Character.isLetter(ch))
            {
                if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
                {
                    Vowels++;
                }
                else
                {
                    Consonants++;
                }
            }
        }

        System.out.println("Vowels : " + Vowels);
        System.out.println("Consonants : " + Consonants);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = null;

        System.out.println("Enter string :");
        Str = sobj.nextLine();

        Count(Str);
    }
}
