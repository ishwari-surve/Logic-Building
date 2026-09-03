/*
An e-commerce application records product IDs:
101 102 101 103 101 102 104 105 102 102 103 

Find the top 2 most frequently purchased products.

Expected:
102 -> 4
101 -> 3
*/
import java.util.*;

class programQ5
{
    public static void main(String A[])
    {
        int Arr[] = {101,102,101,103,101,102,104,105,102,102,103};

        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();

        for(int id : Arr)
        {
            if(frequency.containsKey(id))
            {
                frequency.put(id, frequency.get(id) + 1);
            }
            else
            {
                frequency.put(id, 1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(frequency.entrySet());

        Collections.sort(list,
            new Comparator<Map.Entry<Integer, Integer>>()
            {
                public int compare(Map.Entry<Integer, Integer> e1,Map.Entry<Integer, Integer> e2)
                {
                    return e2.getValue() - e1.getValue();
                }
            });

        System.out.println("Top 2 Most Frequently Purchased Products :");

        for(int i = 0; i < 2; i++)
        {
            System.out.println(list.get(i).getKey() + " -> " + list.get(i).getValue());
        }
    }
}
