// Q5 — List Directory Contents

import java.io.*;
import java.util.*;

public class Q5_ListDirectory
{
    public static void ListContents(String sPath)
    {
        try
        {
            File fObj = new File(sPath);    
          
            if(fObj.exists() == false)
            {
                System.out.println("Error : " + sPath + " does not exist");
                return;
            }

           
            if(fObj.isDirectory() == false)
            {
                System.out.println("Error : " + sPath + " is not a directory");
                return;
            }

           
            String sContents[] = fObj.list();

           
            if(sContents == null || sContents.length == 0)
            {
                System.out.println("Directory is empty");
                return;
            }

            System.out.println("Contents : ");
            System.out.println("-------------------------------------------");

            int i = 0;

            for(i = 0; i < sContents.length; i++)
            {
                File fItem = new File(sPath + File.separator + sContents[i]);

                if(fItem.isDirectory())
                {
                    System.out.println("[DIR]  " + sContents[i]);   
                }
                else
                {
                    System.out.println("[FILE] " + sContents[i]);   
                }
            }

            System.out.println("-------------------------------------------");
            System.out.println("Total items : " + sContents.length);
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
        String  sPath   = "";

        System.out.println("Enter directory : ");
        sPath = scanner.nextLine();

        ListContents(sPath);
    }
}
