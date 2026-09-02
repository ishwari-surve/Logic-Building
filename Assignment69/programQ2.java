/*
Customers submit support requests:
R101
R102
R103
R104

Requests must normally be handled in the same order in which they arrive.

Implement:
addRequest()
processRequest()
showPendingRequests()
*/
import java.util.*;

class SupportQueue
{
    Queue<String> requests = new LinkedList<String>();

    public void addRequest(String request)
    {
        requests.add(request);
    }

    public void processRequest()
    {
        if(requests.isEmpty())
        {
            System.out.println("No pending requests");
        }
        else
        {
            System.out.println("Processing request : " + requests.remove());
        }
    }

    public void showPendingRequests()
    {
        if(requests.isEmpty())
        {
            System.out.println("No pending requests");
        }
        else
        {
            System.out.println("Pending Requests :");

            for(String request : requests)
            {
                System.out.println(request);
            }
        }
    }
}

class programQ2
{
    public static void main(String A[])
    {
        SupportQueue obj = new SupportQueue();

        obj.addRequest("R101");
        obj.addRequest("R102");
        obj.addRequest("R103");
        obj.addRequest("R104");

        obj.showPendingRequests();

        obj.processRequest();

        obj.showPendingRequests();
    }
}
