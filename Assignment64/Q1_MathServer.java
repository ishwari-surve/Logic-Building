import java.io.*;
import java.net.*;

class ClientHandler extends Thread
{
    Socket ClientSocket;

    ClientHandler(Socket s)
    {
        ClientSocket = s;
    }

    public void run()
    {
        try
        {
            BufferedReader  brInput  = new BufferedReader(new InputStreamReader(ClientSocket.getInputStream()));
            PrintWriter     pwOutput = new PrintWriter(ClientSocket.getOutputStream(), true);

            String sCommand = "";

            while(true)
            {
                sCommand = brInput.readLine();

                if(sCommand == null)
                {
                    break;
                }

                
                String parts[] = sCommand.trim().split(" ");
                String sOp     = parts[0].toUpperCase();

                
                if(sOp.equals("QUIT"))
                {
                    pwOutput.println("Goodbye!");
                    break;
                }

                
                if(parts.length < 3)
                {
                    pwOutput.println("Invalid command format");
                    continue;
                }

                int iNo1 = Integer.parseInt(parts[1]);
                int iNo2 = Integer.parseInt(parts[2]);
                int iResult = 0;

               
                if(sOp.equals("ADD"))
                {
                    iResult = iNo1 + iNo2;
                    pwOutput.println("Result is : " + iResult);
                }
                else if(sOp.equals("SUB"))
                {
                    iResult = iNo1 - iNo2;
                    pwOutput.println("Result is : " + iResult);
                }
                else if(sOp.equals("MULT"))
                {
                    iResult = iNo1 * iNo2;
                    pwOutput.println("Result is : " + iResult);
                }
                else if(sOp.equals("DIV"))
                {
                    if(iNo2 == 0)
                    {
                        pwOutput.println("Error: Division by zero not allowed");
                    }
                    else
                    {
                        iResult = iNo1 / iNo2;
                        pwOutput.println("Result is : " + iResult);
                    }
                }
                else if(sOp.equals("MOD"))
                {
                    if(iNo2 == 0)
                    {
                        pwOutput.println("Error: Division by zero not allowed");
                    }
                    else
                    {
                        iResult = iNo1 % iNo2;
                        pwOutput.println("Result is : " + iResult);
                    }
                }
                else if(sOp.equals("MAX"))
                {
                    if(iNo1 > iNo2)
                        pwOutput.println("Maximum number is : " + iNo1);
                    else
                        pwOutput.println("Maximum number is : " + iNo2);
                }
                else if(sOp.equals("MIN"))
                {
                    if(iNo1 < iNo2)
                        pwOutput.println("Minimum number is : " + iNo1);
                    else
                        pwOutput.println("Minimum number is : " + iNo2);
                }
                else
                {
                    pwOutput.println("Invalid command: " + sOp);
                }
            }

            ClientSocket.close();
            System.out.println("Client disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class MathServer
{
    public static void main(String A[])
    {
        try
        {
            int iPort = 1234;
            ServerSocket ss = new ServerSocket(iPort);

            System.out.println("Math Server started on port : " + iPort);
            System.out.println("Waiting for clients...");

           
            while(true)
            {
                Socket ClientSocket = ss.accept();  
                System.out.println("New client connected: " + ClientSocket.getInetAddress());

             
                ClientHandler ch = new ClientHandler(ClientSocket);
                ch.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}
