/*
Q2 — Frequency of a Number in Matrix
Write a program which accept matrix and one number from user and return frequency of that number.

Input
Number : 9
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5

*/


import java.util.*;

class Frequency
{
    public static int Frequency(int Arr[][], int iRow, int iCol, int iNo)
    {
        int iCount = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;
        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter number of rows :");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns :");
        iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter elements of matrix :");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Enter number to search :");
        iNo = sobj.nextInt();

        iRet = Frequency(Arr, iRow, iCol, iNo);

        System.out.println("Frequency of " + iNo + " is : " + iRet);
    }
}
