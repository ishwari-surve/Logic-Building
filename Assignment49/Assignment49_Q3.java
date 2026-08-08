// Program to accept file name from user and open that file in write mode and write some data at the end of file
import java.io.*;
import java.util.*;
 
class Assignment_45_Q3
{
    public static void main(String A[]) throws IOException
    {
        String Fname = null;
        String Data = null;
        File fobj = null;
        FileOutputStream foobj = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter file name :");
        Fname = sobj.nextLine();
        
        fobj = new File(Fname);
        
        if(fobj.exists())
        {
            System.out.println("Enter data to append :");
            Data = sobj.nextLine();
            
            foobj = new FileOutputStream(fobj, true);
            
            byte Arr[] = Data.getBytes();
            
         
            foobj.write(Arr);
            
            System.out.println("Data appended successfully!");
            
            foobj.close();
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}
