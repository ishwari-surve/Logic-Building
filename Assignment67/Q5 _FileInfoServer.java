// Q5_FileInfoServer.java

import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

class FileInfoHandler extends Thread
{
    Socket ClientSocket;
    String sServerDirectory = "ServerData";

    FileInfoHandler(Socket s)
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

                if(sOp.equals("INFO"))
                {
                    if(parts.length < 2)
                    {
                        pwOutput.println("Invalid command. Usage : INFO <filename>");
                        continue;
                    }

                    String sFileName = parts[1];
                    File   fObj      = new File(sServerDirectory + File.separator + sFileName);

                    if(fObj.exists() == false || fObj.isFile() == false)
                    {
                        pwOutput.println(sFileName + " not found on server");
                        continue;
                    }

                    long             lLastMod  = fObj.lastModified();
                    Date             dDate     = new Date(lLastMod);
                    SimpleDateFormat sdf       = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

                    pwOutput.println("File Name     : " + fObj.getName());
                    pwOutput.println("Size          : " + fObj.length() + " bytes");
                    pwOutput.println("Readable      : " + fObj.canRead());
                    pwOutput.println("Writable      : " + fObj.canWrite());
                    pwOutput.println("Absolute Path : " + fObj.getAbsolutePath());
                    pwOutput.println("Last Modified : " + sdf.format(dDate));
                    pwOutput.println("END");
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

public class Q5_FileInfoServer
{
    public static void main(String A[])
    {
        try
        {
            int iPort = 6060;
            ServerSocket ss = new ServerSocket(iPort);

            System.out.println("File Info Server started on port : " + iPort);

            while(true)
            {
                Socket ClientSocket = ss.accept();
                System.out.println("Client connected : " + ClientSocket.getInetAddress());

                FileInfoHandler fih = new FileInfoHandler(ClientSocket);
                fih.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Server Error : " + e.getMessage());
        }
    }
}
