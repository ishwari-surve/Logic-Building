/*
Software Dependency Resolver

A software project has dependencies:
Database → Backend
Backend → API
API → Frontend

Determine a valid order in which modules should be initialized.

Expected:
Database
Backend
API
Frontend

For a more complex input:
A → C
B → C
C → D
B → E
D → F
E → F

find a valid dependency order.
*/
import java.util.*;

class programQ4
{
    public static void main(String A[])
    {
        HashMap<String, ArrayList<String>> graph =
            new HashMap<String, ArrayList<String>>();

        graph.put("Database", new ArrayList<String>());
        graph.put("Backend", new ArrayList<String>());
        graph.put("API", new ArrayList<String>());
        graph.put("Frontend", new ArrayList<String>());

        graph.get("Database").add("Backend");
        graph.get("Backend").add("API");
        graph.get("API").add("Frontend");

        HashMap<String, Integer> indegree =
            new HashMap<String, Integer>();

        for(String module : graph.keySet())
        {
            indegree.put(module, 0);
        }

        for(String module : graph.keySet())
        {
            for(String dependency : graph.get(module))
            {
                indegree.put(dependency,
                            indegree.get(dependency) + 1);
            }
        }

        Queue<String> queue = new LinkedList<String>();

        for(String module : indegree.keySet())
        {
            if(indegree.get(module) == 0)
            {
                queue.add(module);
            }
        }

        System.out.println("Valid Dependency Order :");

        while(!queue.isEmpty())
        {
            String module = queue.remove();

            System.out.println(module);

            for(String dependency : graph.get(module))
            {
                indegree.put(dependency,indegree.get(dependency) - 1);

                if(indegree.get(dependency) == 0)
                {
                    queue.add(dependency);
                }
            }
        }
    }
}
