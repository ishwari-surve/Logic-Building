// Q1 — String Operations Client-Server
import java.io.*;
import java.net.*;

class StringClientHandler extends Thread
{
    Socket ClientSocket;

    StringClientHandler(Socket s)
    {
        ClientSocket = s;
    }

    int GetLength(String Str)
    {
        return Str.length();
    }

    String ToUpper(String Str)
    {
        return Str.toUpperCase();
    }

    String ToLower(String Str)
    {
        return Str.toLowerCase();
    }

    String Reverse(String Str)
    {
        String sReverse = "";
        int    i        = 0;

        for(i = Str.length() - 1; i >= 0; i--)
        {
            sReverse = sReverse + Str.charAt(i);
        }

        return sReverse;
    }

    boolean IsPalindrome(String Str)
    {
        String sReverse = Reverse(Str);

        if(Str.equalsIgnoreCase(sReverse))
        {
            return true;
        }
        return false;
    }

 
    int CountVowels(String Str)
    {
        int    i      = 0;
        int    iCount = 0;
        char   cChar  = ' ';
        String sLower = Str.toLowerCase();

        for(i = 0; i < sLower.length(); i++)
        {
            cChar = sLower.charAt(i);

            if(cChar == 'a' || cChar == 'e' || cChar == 'i' ||
               cChar == 'o' || cChar == 'u')
            {
                iCount++;
            }
        }

        return iCount;
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

                String parts[] = sCommand.trim().split(" ", 2);
                String sOp     = parts[0].toUpperCase();

                if(sOp.equals("QUIT"))
                {
                    pwOutput.println("Goodbye!");
                    break;
                }

                if(parts.length < 2)
                {
                    pwOutput.println("Invalid command. Please provide a string.");
                    continue;
                }

                String sStr = parts[1];     

                if(sOp.equals("LENGTH"))
                {
                    int iLen = GetLength(sStr);
                    pwOutput.println("Length is : " + iLen);
                }
                else if(sOp.equals("UPPER"))
                {
                    pwOutput.println(ToUpper(sStr));
                }
                else if(sOp.equals("LOWER"))
                {
                    pwOutput.println(ToLower(sStr));
                }
                else if(sOp.equals("REVERSE"))
                {
                    pwOutput.println(Reverse(sStr));
                }
                else if(sOp.equals("PALINDROME"))
                {
                    if(IsPalindrome(sStr))
                        pwOutput.println(sStr + " is Palindrome");
                    else
                        pwOutput.println(sStr + " is Not Palindrome");
                }
                else if(sOp.equals("VOWELS"))
                {
                    int iCount = CountVowels(sStr);
                    pwOutput.println("Number of vowels : " + iCount);
                }
                else
                {
                    pwOutput.println("Invalid command : " + sOp);
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

public class StringServer
{
    public static void main(String A[])
    {
        try
        {
            int iPort = 9090;
            ServerSocket ss = new ServerSocket(iPort);

            System.out.println("String Server started on port : " + iPort);
            System.out.println("Waiting for clients...");

            while(true)
            {
                Socket ClientSocket = ss.accept();
                System.out.println("New client connected : " + ClientSocket.getInetAddress());

                StringClientHandler ch = new StringClientHandler(ClientSocket);
                ch.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Server Error : " + e.getMessage());
        }
    }
}
