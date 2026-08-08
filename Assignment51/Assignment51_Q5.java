// Program to accept directory name and write data of all files along with name & size into Marvellous.txt
import java.io.*;
import java.util.*;

class Assignment51_Q5
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
                      
                        String FileName = ArrFiles[i].getName();
                        long FileSize = ArrFiles[i].length();
                        String Header = "File Name : " + FileName + "\n";
                        String SizeInfo = "File Size : " + FileSize + " bytes\n";
                        String Separator = "==============================================\n";
                        
                        byte HeaderArr[] = (Header + SizeInfo + Separator).getBytes();
                        foobj.write(HeaderArr);
                        
                       
                        fiobj = new FileInputStream(ArrFiles[i]);
                        
                        byte Arr[] = new byte[1024];
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
                
                System.out.println("File names, data and sizes written to " + OutputFileName);
                
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
