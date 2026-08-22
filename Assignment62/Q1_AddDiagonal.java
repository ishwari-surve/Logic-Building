/*
Q1 — Addition of Diagonal Elements
Write a program which accept matrix from user and return addition of diagonal elements.
Input :
3 2 5 9
4 3 2 2
8 4 1 5
3 9 7 5

Output: Addition of diagonal elements is : 12
*/

import java.util.*;

class AddDiagonal
{
    public static int AddDiagonal(int Arr[][], int iRow, int iCol)
    {
        int iSum = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }

        return iSum;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;
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

        iRet = AddDiagonal(Arr, iRow, iCol);

        System.out.println("Addition of diagonal elements is : " + iRet);
    }
}
