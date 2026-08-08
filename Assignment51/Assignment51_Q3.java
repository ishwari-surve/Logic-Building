// Program to accept directory name and write data of all files into Marvellous.txt
import java.io.*;
import java.util.*;

class Assignment51_Q3
{
    public static void main(String A[]) throws IOException
    {
        String DirName = null;
        String OutputFileName = "Marvellous.txt";
        File dobj = null;
        File ArrFiles[] = null;
        FileOutputStream foobj = null;
        FileInputStream fiobj = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter directory name :");
        DirName = sobj.nextLine();
        
        dobj = new File(DirName);
        
      
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
                        fiobj = new FileInputStream(ArrFiles[i]);
                        
                        byte Arr[] = new byte[1024];
                        int iRet = 0;
                        
                      
                        while((iRet = fiobj.read(Arr)) != -1)
                        {
                            foobj.write(Arr, 0, iRet);
                        }
                        
                        String Separator = "\n--- End of " + ArrFiles[i].getName() + " ---\n\n";
                        byte SepArr[] = Separator.getBytes();
                        foobj.write(SepArr);
                        
                        fiobj.close();
                    }
                }
                
                System.out.println("File data written to " + OutputFileName);
                
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
