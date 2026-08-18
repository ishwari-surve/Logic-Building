/*
Q4. Write a program to print duplicate characters from a string.
Description:
Find and display characters that appear more than once.

Input Format: One string str
Output Format: Duplicate characters printed in one line.
*/

import java.util.*;

class DuplicateCharacters
{
    public static void FindDuplicates(String Str)
    {
        int iLen = Str.length();
        int i    = 0;
        int j    = 0;
        boolean bFound = false;

        for(i = 0; i < iLen; i++)
        {
            int iCount = 0;

            for(j = 0; j < iLen; j++)
            {
                if(Str.charAt(i) == Str.charAt(j))
                {
                    iCount++;
                }
            }

           
            if(iCount > 1)
            {
                
                boolean bAlreadyPrinted = false;

                for(j = 0; j < i; j++)
                {
                    if(Str.charAt(i) == Str.charAt(j))
                    {
                        bAlreadyPrinted = true;
                        break;
                    }
                }

                if(bAlreadyPrinted == false)
                {
                    System.out.print(Str.charAt(i) + " ");
                    bFound = true;
                }
            }
        }

        if(bFound == false)
        {
            System.out.println("No duplicate characters found");
        }
        else
        {
            System.out.println();
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Str   = null;

        System.out.println("Enter string :");
        Str = sobj.nextLine();

        FindDuplicates(Str);
    }
}
