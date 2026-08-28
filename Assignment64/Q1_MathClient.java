import java.io.*;
import java.net.*;
import java.util.*;

public class MathClient
{
    public static void main(String A[])
    {
        try
        {
            String sServerIP = "localhost";
            int    iPort     = 1234;

            Socket s = new Socket(sServerIP, iPort);
            System.out.println("Connected to Math Server");

            BufferedReader  brInput  = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter     pwOutput = new PrintWriter(s.getOutputStream(), true);
            Scanner         scanner  = new Scanner(System.in);

            String sCommand = "";

            while(true)
            {
                System.out.print("Enter command : ");
                sCommand = scanner.nextLine();

                pwOutput.println(sCommand);         

                String sResponse = brInput.readLine(); 
                System.out.println("Server: " + sResponse);

                if(sCommand.trim().toUpperCase().equals("QUIT"))
                {
                    break;
                }
            }

            s.close();
            System.out.println("Disconnected from server");
        }
        catch(Exception e)
        {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
