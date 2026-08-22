/*
Q2 — Reverse Contents of Each Row
Write a program which accept matrix and reverse the contents of each row.

Input:
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5

Output:
9 5 2 3
2 2 3 4
9 1 4 8
5 7 9 3
*/

import java.util.*;

class ReverseRow
{
    public static void ReverseRow(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iRow; i++)
        {
            int iStart = 0;
            int iEnd = iCol - 1;

            while(iStart < iEnd)
            {
                int Temp = Arr[i][iStart];

                Arr[i][iStart] = Arr[i][iEnd];
                Arr[i][iEnd] = Temp;

                iStart++;
                iEnd--;
            }
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;

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

        ReverseRow(Arr, iRow, iCol);

        System.out.println("Matrix after reversing each row :");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
