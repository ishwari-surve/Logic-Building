/*
A browser wants to store only the last 5 visited websites.
Visits:
google.com
github.com
openai.com
oracle.com
stackoverflow.com
youtube.com

After all visits, history should contain:
github.com
openai.com
oracle.com
stackoverflow.com
youtube.com
*/
import java.util.*;

class programQ1
{
    public static void main(String A[])
    {
        Queue<String> history = new LinkedList<String>();

        history.add("google.com");
        history.add("github.com");
        history.add("openai.com");
        history.add("oracle.com");
        history.add("stackoverflow.com");
        history.add("youtube.com");

        if(history.size() > 5)
        {
            history.remove();
        }

        System.out.println("Browser History :");

        for(String site : history)
        {
            System.out.println(site);
        }
    }
}
