/*
A messaging application wants to identify the first character in a message that occurs only once.

Input: programming

Output: First non-repeating character : p

The solution should preserve the original character order.
*/

import java.util.*;

class programQ2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";
        char ch = '\0';

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        HashMap<Character,Integer> frequency = new HashMap<Character,Integer>();

        for(int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);

            if(frequency.containsKey(ch))
            {
                frequency.put(ch,frequency.get(ch) + 1);
            }
            else
            {
                frequency.put(ch,1);
            }
        }

        for(int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);

            if(frequency.get(ch) == 1)
            {
                System.out.println("First non-repeating character : " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
