// Q4 File Exists Check (Client-Server)

import java.io.*;
import java.net.*;

class FileExistsHandler extends Thread
{
    Socket ClientSocket;
    String sServerDirectory = "ServerData";     

    FileExistsHandler(Socket s)
    {
        ClientSocket = s;
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

                if(sCommand == null) break;

                String parts[] = sCommand.trim().split(" ", 2);
                String sOp     = parts[0].toUpperCase();

                if(sOp.equals("QUIT"))
                {
                    pwOutput.println("Goodbye!");
                    break;
                }

                if(sOp.equals("EXISTS"))
                {
                    if(parts.length < 2)
                    {
                        pwOutput.println("Invalid command. Usage : EXISTS <filename>");
                        continue;
                    }

                    String sFileName = parts[1];
                    File   fObj      = new File(sServerDirectory + File.separator + sFileName);

                    if(fObj.exists() && fObj.isFile())
                    {
                        pwOutput.println(sFileName + " exists on server");
                    }
                    else
                    {
                        pwOutput.println(sFileName + " does not exist");
                    }
                }
                else
                {
                    pwOutput.println("Invalid command : " + sOp);
                }
            }

            ClientSocket.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

public class Q4_FileExistsServer
{
    public static void main(String A[])
    {
        try
        {
            int iPort = 7070;
            ServerSocket ss = new ServerSocket(iPort);

            System.out.println("File Exists Server started on port : " + iPort);

            while(true)
            {
                Socket ClientSocket = ss.accept();
                System.out.println("Client connected : " + ClientSocket.getInetAddress());

                FileExistsHandler feh = new FileExistsHandler(ClientSocket);
                feh.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Server Error : " + e.getMessage());
        }
    }
}
