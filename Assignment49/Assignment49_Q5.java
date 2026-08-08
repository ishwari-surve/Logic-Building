// Program to accept directory name from user and display all names of files from that directory
import java.io.*;
import java.util.*;

class Assignment49_Q5
{
    public static void main(String A[]) throws IOException
    {
        String DirName = null;
        File fobj = null;
        File ArrFiles[] = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter directory name :");
        DirName = sobj.nextLine();
        
        fobj = new File(DirName);
        
       
        if(fobj.isDirectory())
        {
            
            ArrFiles = fobj.listFiles();
            
         
            if(ArrFiles != null && ArrFiles.length > 0)
            {
                System.out.println("\nFiles in directory :\n");
                
              
                for(int i = 0; i < ArrFiles.length; i++)
                {
                    
                    System.out.println((i+1) + ". " + ArrFiles[i].getName());
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
