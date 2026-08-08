// Program to accept two file names from user and open first file and create new file and copy the data
import java.io.*;
import java.util.*;

class Assignment50_Q1
{
    public static void main(String A[]) throws IOException
    {
        String SrcFileName = null;
        String DestFileName = null;
        File SrcFile = null;
        File DestFile = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter source file name :");
        SrcFileName = sobj.nextLine();
        
        System.out.println("Enter destination file name :");
        DestFileName = sobj.nextLine();
        
        SrcFile = new File(SrcFileName);
        DestFile = new File(DestFileName);
        
      
        if(SrcFile.exists())
        {
         
            fiobj = new FileInputStream(SrcFile);
            
            
            DestFile.createNewFile();
            
           
            foobj = new FileOutputStream(DestFile);
            
          
            byte Arr[] = new byte[1024];
            int iRet = 0;
            
            while((iRet = fiobj.read(Arr)) != -1)
            {
                foobj.write(Arr, 0, iRet);
            }
            
            System.out.println("File copied successfully!");
            
            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("Source file does not exist!");
        }
    }
}
