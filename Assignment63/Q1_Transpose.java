/*
Q1 — Transpose of Matrix
Write a program which accept matrix from user and display transpose of the matrix.
The transpose of a given matrix is formed by interchanging the rows and columns of a matrix.

Input:
3 2 5 9
4 3 2 2
8 4 1 5
3 9 7 5

Output:
3 4 8 3
2 3 4 9
5 2 1 7
9 2 5 5
*/

import java.util.*;

class Transpose
{
    public static void Transpose(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iCol; i++)
        {
            for(int j = 0; j < iRow; j++)
            {
                System.out.print(Arr[j][i] + "\t");
            }

            System.out.println();
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

        System.out.println("Transpose of matrix is :");

        Transpose(Arr, iRow, iCol);
    }
}
