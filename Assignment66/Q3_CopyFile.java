// Q3 — Copy File using FileInputStream and

import java.io.*;
import java.util.*;

public class Q3_CopyFile
{
    public static void CopyFile(String sSource, String sDestination)
    {
        FileInputStream  fis = null;
        FileOutputStream fos = null;

        try
        {
            File fSource = new File(sSource);

            if(fSource.exists() == false)
            {
                System.out.println("Error : Source file " + sSource + " does not exist");
                return;
            }

            fis = new FileInputStream(sSource);          
            fos = new FileOutputStream(sDestination);  

            int iData  = 0;
            int iCount = 0;

            while((iData = fis.read()) != -1)
            {
                fos.write(iData);                        
                iCount++;
            }

            System.out.println("File copied successfully");
            System.out.println("Source File      : " + new File(sSource).getAbsolutePath());
            System.out.println("Destination File : " + new File(sDestination).getAbsolutePath());
            System.out.println("Total bytes copied : " + iCount);
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
                    fis.close();    // close source file
                }
                if(fos != null)
                {
                    fos.close();    
                }
            }
            catch(Exception e)
            {
                System.out.println("Error closing files : " + e.getMessage());
            }
        }
    }

    public static void main(String A[])
    {
        Scanner scanner      = new Scanner(System.in);
        String  sSource      = "";
        String  sDestination = "";

        System.out.println("Enter source file : ");
        sSource = scanner.nextLine();

        System.out.println("Enter destination file : ");
        sDestination = scanner.nextLine();

        CopyFile(sSource, sDestination);
    }
}
