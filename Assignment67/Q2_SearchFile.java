//Q2 — Search File in Directory

import java.io.*;
import java.util.*;

public class Q2_SearchFile
{
    public static void SearchFile(String sPath, String sFileName)
    {
        try
        {
            File fDir = new File(sPath);

           
            if(fDir.exists() == false)
            {
                System.out.println("Error : " + sPath + " does not exist");
                return;
            }

          
            if(fDir.isDirectory() == false)
            {
                System.out.println("Error : " + sPath + " is not a directory");
                return;
            }

       
            String sContents[] = fDir.list();

         
            if(sContents == null || sContents.length == 0)
            {
                System.out.println("Directory is empty");
                return;
            }

            boolean bFound = false;
            int     i      = 0;

            for(i = 0; i < sContents.length; i++)
            {
               
                if(sContents[i].equals(sFileName))
                {
                    File fItem = new File(sPath + File.separator + sFileName);

                    
                    if(fItem.isFile())
                    {
                        long lSize = fItem.length();

                        System.out.println("File found");
                        System.out.println("Name : " + fItem.getName());
                        System.out.println("Size : " + lSize + " bytes");
                        System.out.println("Path : " + fItem.getAbsolutePath());

                        bFound = true;
                        break;                  
                    }
                }
            }

            if(bFound == false)
            {
                System.out.println(sFileName + " not found");
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
        String  sPath     = "";
        String  sFileName = "";

        System.out.println("Enter directory : ");
        sPath = scanner.nextLine();

        System.out.println("Enter file to search : ");
        sFileName = scanner.nextLine();

        SearchFile(sPath, sFileName);
    }
}
