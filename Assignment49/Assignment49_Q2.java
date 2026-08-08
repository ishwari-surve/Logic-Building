// Question2 : Read File and Display Contents
// Program to accept file name from user and open that file and display the contents on screen
import java.io.*;
import java.util.*;

class Assignment49_Q2
{
    public static void main(String A[]) throws IOException
    {
        String Fname = null;
        File fobj = null;
        FileInputStream fiobj = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter file name :");
        Fname = sobj.nextLine();
        
        fobj = new File(Fname);
        
        if(fobj.exists())
        {
            fiobj = new FileInputStream(fobj);
            
            byte Arr[] = new byte[1024];
            int iRet = 0;
            
            iRet = fiobj.read(Arr);
            
            System.out.println(new String(Arr));
            
            fiobj.close();
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}
