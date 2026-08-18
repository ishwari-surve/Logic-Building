/*
Question 1: Write a program to reverse each word of a sentence.

Description:
Reverse individual words but keep the word order the same.

Input Format:
One sentence

Output Format:
Sentence with reversed words
*/
import java.util.*;

class ReverseWords
{
    public static void Reverse(String Str)
    {
        String Arr[] = Str.split(" ");

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = Arr[i].length() - 1; j >= 0; j--)
            {
                System.out.print(Arr[i].charAt(j));
            }

            System.out.print(" ");
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = null;

        System.out.println("Enter sentence :");
        Str = sobj.nextLine();

        Reverse(Str);
    }
}
