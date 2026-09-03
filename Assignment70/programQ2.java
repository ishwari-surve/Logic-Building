/*
Longest Consecutive Employee ID Sequence

Given IDs:100 4 200 1 3 2 5

Find the longest consecutive sequence.

Output:
1 2 3 4 5

Length : 5
*/
import java.util.*;

class programQ2
{
    public static void main(String A[])
    {
        int Arr[] = {100, 4, 200, 1, 3, 2, 5};

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < Arr.length; i++)
        {
            set.add(Arr[i]);
        }

        int iLongest = 0;
        int iStart = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(!set.contains(Arr[i] - 1))
            {
                int iCurrent = Arr[i];
                int iLength = 1;

                while(set.contains(iCurrent + 1))
                {
                    iCurrent++;
                    iLength++;
                }

                if(iLength > iLongest)
                {
                    iLongest = iLength;
                    iStart = Arr[i];
                }
            }
        }

        System.out.println("Longest Consecutive Sequence :");

        for(int i = iStart; i < iStart + iLongest; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Length : " + iLongest);
    }
}
