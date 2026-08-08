// Program to accept directory name and write names of all files into Marvellous.txt
import java.io.*;
import java.util.*;

class Assignment51_Q2
{
    public static void main(String A[]) throws IOException
    {
        String DirName = null;
        String OutputFileName = "Marvellous.txt";
        File dobj = null;
        File ArrFiles[] = null;
        FileOutputStream foobj = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter directory name :");
        DirName = sobj.nextLine();
        
        dobj = new File(DirName);
        
        // Check if it's a directory
        if(dobj.isDirectory())
        {
          
            ArrFiles = dobj.listFiles();
            
            
            if(ArrFiles != null && ArrFiles.length > 0)
            {
                
                foobj = new FileOutputStream(OutputFileName);
                
                
                for(int i = 0; i < ArrFiles.length; i++)
                {
                    if(ArrFiles[i].isFile())
                    {
                        String FileName = ArrFiles[i].getName();
                        byte Arr[] = (FileName + "\n").getBytes();
                        
                        foobj.write(Arr);
                    }
                }
                
                System.out.println("File names written to " + OutputFileName);
                
                foobj.close();
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
