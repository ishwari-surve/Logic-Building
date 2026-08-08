// Program to accept directory name from user and display all names of files and size of each file on screen
import java.io.*;
import java.util.*;

class Assignment50_Q5
{
    public static void main(String A[]) throws IOException
    {
        String DirName = null;
        File dobj = null;
        File ArrFiles[] = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter directory name :");
        DirName = sobj.nextLine();
        
        dobj = new File(DirName);
       
        if(dobj.isDirectory())
        {
         
            ArrFiles = dobj.listFiles();
            
            
            if(ArrFiles != null && ArrFiles.length > 0)
            {
                System.out.println("\nFiles in directory : " + DirName + "\n");
                System.out.println("File Name\t\t\tSize (bytes)");
                System.out.println("======================================");
                
           
                for(int i = 0; i < ArrFiles.length; i++)
                {
                
                    if(ArrFiles[i].isFile())
                    {
                        String FileName = ArrFiles[i].getName();
                        long FileSize = ArrFiles[i].length();
                        
                        System.out.println(FileName + "\t\t\t" + FileSize);
                    }
                }
            }
            else
            {
                System.out.println("Directory is empty!");
            }
        }
        else
        {
            System.out.println("Path is not a directory!");
        }
    }
}
