import java.io.*;
import java.net.*;
import java.util.*;

public class Q2_InfoClient
{
    public static void main(String A[])
    {
        try
        {
            String sServerIP = "localhost";
            int    iPort     = 8080;

            Socket s = new Socket(sServerIP, iPort);
            System.out.println("Connected to Info Server");
            System.out.println("Type HELP to see all commands");
            System.out.println("-------------------------------------------");

            BufferedReader brInput  = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter    pwOutput = new PrintWriter(s.getOutputStream(), true);
            Scanner        scanner  = new Scanner(System.in);

            String sCommand  = "";
            String sResponse = "";

            while(true)
            {
                System.out.print("Enter command : ");
                sCommand = scanner.nextLine();

                pwOutput.println(sCommand);

                // HELP returns multiple lines → read until empty line
                if(sCommand.trim().toUpperCase().equals("HELP"))
                {
                    while((sResponse = brInput.readLine()) != null)
                    {
                        System.out.println(sResponse);
                        if(sResponse.equals("QUIT"))    
                        {
                            break;
                        }
                    }
                }
                else
                {
                    sResponse = brInput.readLine();
                    System.out.println("Server : " + sResponse);
                }

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
            System.out.println("Client Error : " + e.getMessage());
        }
    }
}
