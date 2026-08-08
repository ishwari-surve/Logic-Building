// Program to accept directory name and write data of all files along with name into Marvellous.txt
import java.io.*;
import java.util.*;

class Assignment51_Q4
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
                       
                        String Header = "File Name : " + ArrFiles[i].getName() + "\n";
                        String Separator = "==============================================\n";
                        byte HeaderArr[] = (Header + Separator).getBytes();
                        foobj.write(HeaderArr);
                        
                       
                        fiobj = new FileInputStream(ArrFiles[i]);
                        
                        byte Arr[] = new byte[50];
                        int iRet = 0;
                        
                      
                        while((iRet = fiobj.read(Arr)) != -1)
                        {
                            foobj.write(Arr, 0, iRet);
                        }
                        
                     
                        String EndSep = "\n\n";
                        byte EndArr[] = EndSep.getBytes();
                        foobj.write(EndArr);
                        
                        fiobj.close();
                    }
                }
                
                System.out.println("File names and data written to " + OutputFileName);
                
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
