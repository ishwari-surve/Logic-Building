// Q1 — Write Data to File using FileOutputStream

import java.io.*;
import java.util.*;

public class Q1_WriteFile
{
    public static void WriteToFile(String sFileName, String sData)
    {
        FileOutputStream fos = null;

        try
        {
            fos = new FileOutputStream(sFileName);   

            byte[] bData = sData.getBytes();         

            fos.write(bData);                         

            System.out.println("Data written successfully");
            System.out.println("File Name     : " + sFileName);
            System.out.println("Absolute Path : " + new File(sFileName).getAbsolutePath());
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        finally
        {
            try
            {
                if(fos != null)
                {
                    fos.close();                     
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
        String  sData     = "";

        System.out.println("Enter file name : ");
        sFileName = scanner.nextLine();

        System.out.println("Enter data : ");
        sData = scanner.nextLine();

        WriteToFile(sFileName, sData);
    }
}
