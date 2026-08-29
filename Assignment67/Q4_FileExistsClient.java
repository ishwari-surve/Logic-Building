import java.io.*;
import java.net.*;
import java.util.*;

public class Q4_FileExistsClient
{
    public static void main(String A[])
    {
        try
        {
            Socket         s        = new Socket("localhost", 7070);
            BufferedReader brInput  = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter    pwOutput = new PrintWriter(s.getOutputStream(), true);
            Scanner        scanner  = new Scanner(System.in);

            System.out.println("Connected to File Exists Server");
            System.out.println("Usage : EXISTS <filename> or QUIT");
            System.out.println("-------------------------------------------");

            String sCommand = "";

            while(true)
            {
                System.out.print("Enter command : ");
                sCommand = scanner.nextLine();

                pwOutput.println(sCommand);

                String sResponse = brInput.readLine();
                System.out.println("Server : " + sResponse);

                if(sCommand.trim().toUpperCase().equals("QUIT")) break;
            }

            s.close();
        }
        catch(Exception e)
        {
            System.out.println("Client Error : " + e.getMessage());
        }
    }
}
