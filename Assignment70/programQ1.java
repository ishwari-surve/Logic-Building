/*
Find Two Transactions Matching a Target

A customer made transactions:
1200 500 700 300 1500

Find whether two transactions have a combined value of:
2000

Output:
500 + 1500 = 2000
*/

import java.util.*;

class programQ1
{
    public static void main(String A[])
    {
        int Arr[] = {1200, 500, 700, 300, 1500};
        int iTarget = 2000;

        boolean bFound = false;

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = i + 1; j < Arr.length; j++)
            {
                if((Arr[i] + Arr[j]) == iTarget)
                {
                    System.out.println(Arr[i] + " + " + Arr[j] + " = " + iTarget);

                    bFound = true;
                    break;
                }
            }

            if(bFound == true)
            {
                break;
            }
        }

        if(bFound == false)
        {
            System.out.println("No two transactions found");
        }
    }
}
