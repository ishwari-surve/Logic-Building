import java.io.*;
import java.net.*;
import java.util.*;

public class Q5_FileInfoClient
{
    public static void main(String A[])
    {
        try
        {
            Socket         s        = new Socket("localhost", 6060);
            BufferedReader brInput  = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter    pwOutput = new PrintWriter(s.getOutputStream(), true);
            Scanner        scanner  = new Scanner(System.in);

            System.out.println("Connected to File Info Server");
            System.out.println("Usage : INFO <filename> or QUIT");
            System.out.println("-------------------------------------------");

            String sCommand  = "";
            String sResponse = "";

            while(true)
            {
                System.out.print("Enter command : ");
                sCommand = scanner.nextLine();

                pwOutput.println(sCommand);

                if(sCommand.trim().toUpperCase().equals("QUIT"))
                {
                    sResponse = brInput.readLine();
                    System.out.println("Server : " + sResponse);
                    break;
                }

                // Read multi-line response until END
                while((sResponse = brInput.readLine()) != null)
                {
                    if(sResponse.equals("END")) break;
                    System.out.println(sResponse);
                }
            }

            s.close();
        }
        catch(Exception e)
        {
            System.out.println("Client Error : " + e.getMessage());
        }
    }
}
