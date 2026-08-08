// Program to accept file name from user calculate checksum of that file and display on screen
import java.io.*;
import java.util.*;

class Assignment50_Q4
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
            long Checksum = 0;
            
            
            while((iRet = fiobj.read(Arr)) != -1)
            {
                for(int i = 0; i < iRet; i++)
                {
                    Checksum = Checksum + Arr[i];
                }
            }
            
            System.out.println("File name : " + Fname);
            System.out.println("File size : " + fobj.length() + " bytes");
            System.out.println("Checksum : " + Checksum);
            
            fiobj.close();
        }
        else
        {
            System.out.println("File does not exist!");
        }
    }
}
