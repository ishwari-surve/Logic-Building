//Q1 — Directory Listing with File Sizes

import java.io.*;
import java.util.*;

public class Q1_DirectoryListing
{
    public static void ListContents(String sPath)
    {
        try
        {
            File fObj = new File(sPath);

            // Check if path exists
            if(fObj.exists() == false)
            {
                System.out.println("Error : " + sPath + " does not exist");
                return;
            }

            // Check if it is a directory
            if(fObj.isDirectory() == false)
            {
                System.out.println("Error : " + sPath + " is not a directory");
                return;
            }

            // Get all contents
            String sContents[] = fObj.list();

            // Check if empty
            if(sContents == null || sContents.length == 0)
            {
                System.out.println("Directory is empty");
                return;
            }

            System.out.println("Directory  : " + fObj.getAbsolutePath());
            System.out.println("-------------------------------------------");

            int i         = 0;
            int iFileCount = 0;
            int iDirCount  = 0;

            for(i = 0; i < sContents.length; i++)
            {
                // Create File object for each item
                File fItem = new File(sPath + File.separator + sContents[i]);

                if(fItem.isDirectory())
                {
                    // Directory — just show name with [DIR] label
                    System.out.println("[DIR]  " + sContents[i]);
                    iDirCount++;
                }
                else
                {
                    // File — show name with [FILE] label AND size
                    long lSize = fItem.length();

                    if(lSize >= 1024 * 1024)
                    {
                        // Show in MB if size >= 1MB
                        System.out.println("[FILE] " + sContents[i] +
                                           "\t" + (lSize / (1024 * 1024)) + " MB");
                    }
                    else if(lSize >= 1024)
                    {
                        // Show in KB if size >= 1KB
                        System.out.println("[FILE] " + sContents[i] +
                                           "\t" + (lSize / 1024) + " KB");
                    }
                    else
                    {
                        // Show in bytes
                        System.out.println("[FILE] " + sContents[i] +
                                           "\t" + lSize + " bytes");
                    }

                    iFileCount++;
                }
            }

            System.out.println("-------------------------------------------");
            System.out.println("Total Files       : " + iFileCount);
            System.out.println("Total Directories : " + iDirCount);
            System.out.println("Total Items       : " + sContents.length);
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

        System.out.println("Enter directory path : ");
        sPath = scanner.nextLine();

        ListContents(sPath);
    }
}
