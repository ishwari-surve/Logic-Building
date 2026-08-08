// Program to accept directory name from user and create that directory
import java.io.*;
import java.util.*;

class Assignment50_Q3
{
    public static void main(String A[]) throws IOException
    {
        String DirName = null;
        File dobj = null;
        Boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter directory name :");
        DirName = sobj.nextLine();
        
        dobj = new File(DirName);
        
       
        if(dobj.exists())
        {
            System.out.println("Directory already exists!");
        }
        else
        {
           
            bRet = dobj.mkdir();
            
            if(bRet)
            {
                System.out.println("Directory created successfully!");
            }
            else
            {
                System.out.println("Failed to create directory!");
            }
        }
    }
}
