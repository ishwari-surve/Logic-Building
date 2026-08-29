// Q4 — File Information using File Class

import java.io.*;
import java.util.*;
import java.text.*;

public class Q4_FileInfo
{
    public static void DisplayFileInfo(String sFileName)
    {
        try
        {
            File fObj = new File(sFileName);    

            // Check if file exists
            if(fObj.exists() == false)
            {
                System.out.println("Error : " + sFileName + " does not exist");
                return;
            }

            // Format last modified date
            long          lLastModified = fObj.lastModified();
            Date          dDate         = new Date(lLastModified);
            SimpleDateFormat sdf        = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String        sLastModified = sdf.format(dDate);

            // Display file information
            System.out.println("File Name      : " + fObj.getName());
            System.out.println("Absolute Path  : " + fObj.getAbsolutePath());
            System.out.println("File Size      : " + fObj.length() + " bytes");
            System.out.println("Readable       : " + fObj.canRead());
            System.out.println("Writable       : " + fObj.canWrite());
            System.out.println("Hidden         : " + fObj.isHidden());
            System.out.println("Last Modified  : " + sLastModified);
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void main(String A[])
    {
        Scanner scanner   = new Scanner(System.in);
        String  sFileName = "";

        System.out.println("Enter file name : ");
        sFileName = scanner.nextLine();

        DisplayFileInfo(sFileName);
    }
}
