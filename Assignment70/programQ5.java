/*
Social Network Shortest Connection

A social networking application contains friendships: 
Amit -> Rahul, Pooja
Rahul -> Neha
Pooja -> Kiran
Neha -> Riya
Kiran -> Riya

Find the minimum number of connections required to reach from: Amit → Riya

One possible path: Amit → Rahul → Neha → Riya

Number of connections: 3
*/

import java.util.*;

class programQ5
{
    public static void main(String A[])
    {
        HashMap<String, ArrayList<String>> graph =
            new HashMap<String, ArrayList<String>>();

        graph.put("Amit", new ArrayList<String>());
        graph.put("Rahul", new ArrayList<String>());
        graph.put("Pooja", new ArrayList<String>());
        graph.put("Neha", new ArrayList<String>());
        graph.put("Kiran", new ArrayList<String>());
        graph.put("Riya", new ArrayList<String>());

        graph.get("Amit").add("Rahul");
        graph.get("Amit").add("Pooja");

        graph.get("Rahul").add("Neha");

        graph.get("Pooja").add("Kiran");

        graph.get("Neha").add("Riya");

        graph.get("Kiran").add("Riya");

        Queue<String> queue = new LinkedList<String>();
        HashMap<String, Integer> distance =
            new HashMap<String, Integer>();

        queue.add("Amit");
        distance.put("Amit", 0);

        while(!queue.isEmpty())
        {
            String current = queue.remove();

            for(String friend : graph.get(current))
            {
                if(!distance.containsKey(friend))
                {
                    distance.put(friend, distance.get(current) + 1);
                    queue.add(friend);
                }
            }
        }

        System.out.println("Minimum Connections from Amit to Riya : " + distance.get("Riya"));
    }
}
