import java.io.*;
import java.net.*;

class NumberClientHandler extends Thread
{
    Socket ClientSocket;

    NumberClientHandler(Socket s)
    {
        ClientSocket = s;
    }

     boolean isEven(int n)
    {
        return (n % 2 == 0);
    }
   
    boolean isOdd(int n)
    {
        return (n % 2 != 0);
    }

    boolean isPrime(int n)
  {
        int i      = 0;
        int iCount = 0;

        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
                iCount++;
        }
        return (iCount == 2);
    }

    boolean isPerfect(int n)
    {
        int i    = 0;
        int iSum = 0;

        for(i = 1; i < n; i++)
        {
            if(n % i == 0)
                iSum += i;
        }
        return (iSum == n);
    }

 
    int Factorial(int n)
    {
        if(n == 0) return 1;
        return n * Factorial(n - 1);
    }

    
    int Reverse(int n)
    {
        int iRev   = 0;
        int iDigit = 0;

        while(n > 0)
        {
            iDigit = n % 10;
            iRev   = iRev * 10 + iDigit;
            n      = n / 10;
        }
        return iRev;
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

                if(sCommand == null) break;

                String parts[] = sCommand.trim().split(" ");
                String sOp     = parts[0].toUpperCase();

                if(sOp.equals("QUIT"))
                {
                    pwOutput.println("Goodbye!");
                    break;
                }

                if(parts.length < 2)
                {
                    pwOutput.println("Invalid command format");
                    continue;
                }

                int iNo = Integer.parseInt(parts[1]);

                if(sOp.equals("EVEN"))
                {
                    if(isEven(iNo))
                        pwOutput.println(iNo + " is Even");
                    else
                        pwOutput.println(iNo + " is Not Even");
                }
                else if(sOp.equals("ODD"))
                {
                    if(isOdd(iNo))
                        pwOutput.println(iNo + " is Odd");
                    else
                        pwOutput.println(iNo + " is Not Odd");
                }
                else if(sOp.equals("PRIME"))
                {
                    if(isPrime(iNo))
                        pwOutput.println(iNo + " is a Prime Number");
                    else
                        pwOutput.println(iNo + " is Not a Prime Number");
                }
                else if(sOp.equals("PERFECT"))
                {
                    if(isPerfect(iNo))
                        pwOutput.println(iNo + " is a Perfect Number");
                    else
                        pwOutput.println(iNo + " is Not a Perfect Number");
                }
                else if(sOp.equals("FACTORIAL"))
                {
                    int iResult = Factorial(iNo);
                    pwOutput.println("Factorial is : " + iResult);
                }
                else if(sOp.equals("REVERSE"))
                {
                    int iResult = Reverse(iNo);
                    pwOutput.println("Reverse is : " + iResult);
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

public class NumberServer
{
    public static void main(String A[])
    {
        try
        {
            int iPort = 5678;
            ServerSocket ss = new ServerSocket(iPort);

            System.out.println("Number Server started on port : " + iPort);
            System.out.println("Waiting for clients...");

            while(true)
            {
                Socket ClientSocket = ss.accept();
                System.out.println("New client connected");

                NumberClientHandler ch = new NumberClientHandler(ClientSocket);
                ch.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}
