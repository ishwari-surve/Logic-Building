/*
Given:

java python java c java python cpp

Generate:
java -> 3
python -> 2
c -> 1
cpp -> 1

Then find the most frequently occurring word.

Expected:
Most frequent word : java
Frequency : 3
*/
import java.util.*;

class programQ4
{
    public static void main(String A[])
    {
        String str = "java python java c java python cpp";

        String Arr[] = str.split(" ");

        LinkedHashMap<String, Integer> frequency =
            new LinkedHashMap<String, Integer>();

        for(String word : Arr)
        {
            if(frequency.containsKey(word))
            {
                frequency.put(word, frequency.get(word) + 1);
            }
            else
            {
                frequency.put(word, 1);
            }
        }

        System.out.println("Word Frequency :");

        for(String word : frequency.keySet())
        {
            System.out.println(word + " -> " + frequency.get(word));
        }

        String mostFrequent = "";
        int maxFrequency = 0;

        for(String word : frequency.keySet())
        {
            if(frequency.get(word) > maxFrequency)
            {
                maxFrequency = frequency.get(word);
                mostFrequent = word;
            }
        }

        System.out.println();
        System.out.println("Most frequent word : " + mostFrequent);
        System.out.println("Frequency : " + maxFrequency);
    }
}
