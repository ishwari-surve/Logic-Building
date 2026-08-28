//Q3 — Create File Program

import java.io.*;
import java.util.*;

public class Q3_CreateFile
{
    public static void CreateFile(String sFileName)
    {
        try
        {
            File fObj = new File(sFileName);   

            System.out.println("File Name      : " + fObj.getName());
            System.out.println("Absolute Path  : " + fObj.getAbsolutePath());

            if(fObj.exists())
            {
                System.out.println(sFileName + " already exists");
            }
            else
            {
                boolean bResult = fObj.createNewFile();

                if(bResult == true)
                {
                    System.out.println(sFileName + " created successfully");
                }
                else
                {
                    System.out.println(sFileName + " could not be created");
                }
            }
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

        CreateFile(sFileName);
    }
}
