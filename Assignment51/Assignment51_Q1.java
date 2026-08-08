// Program to accept directory name from user and display all names of files from that directory which are regular file
import java.io.*;
import java.util.*;

class Assignment51_Q1
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
                System.out.println("\nRegular files in directory :\n");
                
            
                for(int i = 0; i < ArrFiles.length; i++)
                {
                  
                    if(ArrFiles[i].isFile())
                    {
                        System.out.println((i+1) + ". " + ArrFiles[i].getName());
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
