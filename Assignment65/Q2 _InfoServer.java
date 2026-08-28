import java.io.*;
import java.net.*;
import java.time.*;
import java.time.format.*;

class InfoClientHandler extends Thread 
{
    Socket ClientSocket;

    InfoClientHandler(Socket s)
    {
        ClientSocket = s;
    }

    // DATE
    String GetDate()
    {
        LocalDate       ldDate      = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return ldDate.format(formatter);
    }

    // TIME
    String GetTime()
    {
        LocalTime         ltTime    = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return ltTime.format(formatter);
    }

    // SERVERNAME
    String GetServerName()
    {
        try
        {
            return InetAddress.getLocalHost().getHostName();
        }
        catch(Exception e)
        {
            return "Unknown Server";
        }
    }

    // HELP
    String GetHelp()
    {
        String sHelp = "Available Commands:\n" +
                       "DATE\n"                 +
                       "TIME\n"                 +
                       "SERVERNAME\n"           +
                       "HELP\n"                 +
                       "QUIT";
        return sHelp;
    }

    public void run()
    {
        try
        {
            BufferedReader brInput  = new BufferedReader(new InputStreamReader(ClientSocket.getInputStream()));
            PrintWriter    pwOutput = new PrintWriter(ClientSocket.getOutputStream(), true);

            String sCommand = "";

            while(true)
            {
                sCommand = brInput.readLine();

                if(sCommand == null)
                {
                    break;
                }

                String sOp = sCommand.trim().toUpperCase();

                if(sOp.equals("DATE"))
                {
                    pwOutput.println(GetDate());
                }
                else if(sOp.equals("TIME"))
                {
                    pwOutput.println(GetTime());
                }
                else if(sOp.equals("SERVERNAME"))
                {
                    pwOutput.println(GetServerName());
                }
                else if(sOp.equals("HELP"))
                {
                    pwOutput.println(GetHelp());
                }
                else if(sOp.equals("QUIT"))
                {
                    pwOutput.println("Goodbye!");
                    break;                      // disconnect ONLY this client
                }
                else
                {
                    pwOutput.println("Invalid command : " + sOp);
                    pwOutput.println("Type HELP to see available commands");
                }
            }

            ClientSocket.close();
            System.out.println("Client disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

public class Q2_InfoServer
{
    public static void main(String A[])
    {
        try
        {
            int iPort = 8080;
            ServerSocket ss = new ServerSocket(iPort);

            System.out.println("Info Server started on port : " + iPort);
            System.out.println("Waiting for clients...");

            while(true)
            {
                Socket ClientSocket = ss.accept();
                System.out.println("New client connected : " + ClientSocket.getInetAddress());

                InfoClientHandler ch = new InfoClientHandler(ClientSocket);
                ch.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Server Error : " + e.getMessage());
        }
    }
}
