// Program to accept file name from user and create new file of that name if it is not existing
import java.io.*;
import java.util.*;

class Assignment49_Q4
{
    public static void main(String A[]) throws IOException
    {
        String Fname = null;
        File fobj = null;
        Boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter file name :");
        Fname = sobj.nextLine();
        
        fobj = new File(Fname);
        
        if(fobj.exists())
        {
            System.out.println("File already exists!");
        }
        else
        {
        
            bRet = fobj.createNewFile();
            
            if(bRet)
            {
                System.out.println("New file created successfully!");
            }
            else
            {
                System.out.println("Failed to create file!");
            }
        }
    }
}
