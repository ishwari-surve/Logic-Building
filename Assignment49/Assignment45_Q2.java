// Question2 : Read File and Display Contents
import java.io.*;
import java.util.Scanner;

class Assignment_45_Q2_Buffer
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        try
        {
            System.out.println("Enter file name : ");
            String strFileName = sc.nextLine();
            
            File fobj = new File(strFileName);
            
            if(fobj.exists())
            {
                
                FileInputStream fin = new FileInputStream(strFileName);
                
                
                byte[] buffer = new byte[1024];  
                int bytesRead;
                
                
                while((bytesRead = fin.read(buffer)) != -1)
                {
                   
                    for(int i = 0; i < bytesRead; i++)
                    {
                        System.out.print((char)buffer[i]);
                    }
                }
                
                System.out.println("\n\nFile reading completed!");
                fin.close();
            }
            else
            {
                System.out.println("File does not exist!");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
