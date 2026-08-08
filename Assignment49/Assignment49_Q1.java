// Question 1: Accept File Name and Open It

import java.io.*;
import java.util.*; 

class Assignment_45_Q1
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
                System.out.println("File opened successfully!");
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
