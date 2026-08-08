// Program to accept file name from user and check whether that file is regular file or not
import java.io.*;
import java.util.*;

class Assignment50_Q2
{
    public static void main(String A[]) throws IOException
    {
        String Fname = null;
        File fobj = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter file name :");
        Fname = sobj.nextLine();
        
        fobj = new File(Fname);
        
        
        if(fobj.exists())
        {
           
            if(fobj.isFile())
            {
                System.out.println(Fname + " is a regular file");
            }
            else if(fobj.isDirectory())
            {
                System.out.println(Fname + " is a directory, not a regular file");
            }
            else
            {
                System.out.println(Fname + " exists but is not a regular file");
            }
        }
        else
        {
            System.out.println("File does not exist!");
        }
    }
}
