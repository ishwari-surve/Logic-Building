// Q3 — File Content Analysis

import java.io.*;
import java.util.*;

public class Q3_FileAnalysis
{
    public static void AnalyzeFile(String sFileName)
    {
        FileInputStream fis = null;

        try
        {
            File fObj = new File(sFileName);

            if(fObj.exists() == false)
            {
                System.out.println("Error : " + sFileName + " does not exist");
                return;
            }

            fis = new FileInputStream(sFileName);

            int iData       = 0;
            int iChars      = 0;
            int iWords      = 0;
            int iLines      = 0;
            int iUpper      = 0;
            int iLower      = 0;
            int iDigits     = 0;
            int iSpaces     = 0;
            boolean bInWord = false;

            while((iData = fis.read()) != -1)
            {
                char cChar = (char) iData;

                iChars++;

                if(Character.isUpperCase(cChar))    iUpper++;
                if(Character.isLowerCase(cChar))    iLower++;
                if(Character.isDigit(cChar))        iDigits++;
                if(cChar == ' ')                    iSpaces++;

                if(cChar == '\n')
                {
                    iLines++;
                    bInWord = false;
                }
                else if(cChar == ' ' || cChar == '\t')
                {
                    bInWord = false;
                }
                else if(bInWord == false)
                {
                    iWords++;
                    bInWord = true;
                }
            }

            iLines++;   

            System.out.println("File       : " + sFileName);
            System.out.println("Characters : " + iChars);
            System.out.println("Words      : " + iWords);
            System.out.println("Lines      : " + iLines);
            System.out.println("Uppercase  : " + iUpper);
            System.out.println("Lowercase  : " + iLower);
            System.out.println("Digits     : " + iDigits);
            System.out.println("Spaces     : " + iSpaces);
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        finally
        {
            try
            {
                if(fis != null) fis.close();
            }
            catch(Exception e)
            {
                System.out.println("Error closing file : " + e.getMessage());
            }
        }
    }

    public static void main(String A[])
    {
        Scanner scanner   = new Scanner(System.in);
        String  sFileName = "";

        System.out.println("Enter file name : ");
        sFileName = scanner.nextLine();

        AnalyzeFile(sFileName);
    }
}
