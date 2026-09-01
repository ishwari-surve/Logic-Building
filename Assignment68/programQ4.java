/*
A banking application receives transaction IDs:

TX101
TX102
TX103
TX101
TX104
TX102

Identify duplicate transaction IDs.

Expected output:

Duplicate transactions:
TX101
TX102
*/
import java.util.*;

class programQ4
{
    public static void main(String A[])
    {
        String Arr[] = {"TX101","TX102","TX103","TX101","TX104","TX102"};

        HashSet<String> set = new HashSet<String>();
        HashSet<String> duplicate = new HashSet<String>();

        for(String id : Arr)
        {
            if(set.contains(id))
            {
                duplicate.add(id);
            }
            else
            {
                set.add(id);
            }
        }

        System.out.println("Duplicate transactions:");

        for(String id : Arr)
        {
            if(duplicate.contains(id))
            {
                System.out.println(id);
                duplicate.remove(id);
            }
        }
    }
}
