/*
5. Write a program to count frequency of each character.
Description:
Display each character along with its count.
  
Input Format: One string str
Output Format: Character → Count
*/
import java.util.*;

class CharacterFrequency
{
    public static void CountFrequency(String Str)
    {
        int iLen = Str.length();
        int i    = 0;
        int j    = 0;

        for(i = 0; i < iLen; i++)
        {
            int iCount = 0;

           boolean bAlreadyProcessed = false;

            for(j = 0; j < i; j++)
            {
                if(Str.charAt(i) == Str.charAt(j))
                {
                    bAlreadyProcessed = true;
                    break;
                }
            }

           
            if(bAlreadyProcessed == false)
            {
                for(j = 0; j < iLen; j++)
                {
                    if(Str.charAt(i) == Str.charAt(j))
                    {
                        iCount++;
                    }
                }

                System.out.println(Str.charAt(i) + " -> " + iCount);
            }
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Str   = null;

        System.out.println("Enter string :");
        Str = sobj.nextLine();

        CountFrequency(Str);
    }
}
