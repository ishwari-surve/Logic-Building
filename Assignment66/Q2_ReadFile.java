// Q2 — Read File using FileInputStream

import java.io.*;
import java.util.*;

public class Q2_ReadFile
{
    public static void ReadFromFile(String sFileName)
    {
        FileInputStream fis  = null;

        try
        {
            File fObj = new File(sFileName);

            // Check if file exists
            if(fis == null && !fObj.exists())
            {
                System.out.println("Error : " + sFileName + " does not exist");
                return;
            }

            fis = new FileInputStream(sFileName);   
            System.out.println("File contents : ");

            int iData = 0;

            while((iData = fis.read()) != -1)
            {
                System.out.print((char) iData);     
            }

            System.out.println();
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        finally
        {
            try
            {
                if(fis != null)
                {
                    fis.close();                    
                }
            }
            catch(Exception e)
            {
                System.out.println("Error closing file : " + e.getMessage());
            }
        }
    }

    public static void main(String A[])
    {
        Scanner scanner   = new Scanner(System.in);
        String  sFileName = "";

        System.out.println("Enter file name : ");
        sFileName = scanner.nextLine();

        ReadFromFile(sFileName);
    }
}
