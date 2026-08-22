/*
Q3 — Maximum from Both Diagonals of a Matrix

Input:
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5
*/

import java.util.*;

class MaxDiagonal
{
    public static int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i    = 0;
        int iMax = Arr[0][0];    

        for(i = 0; i < iRow; i++)
        {
            if(Arr[i][i] > iMax)
            {
                iMax = Arr[i][i];
            }

            if(Arr[i][iCol - i - 1] > iMax)
            {
                iMax = Arr[i][iCol - i - 1];
            }
        }

        return iMax;
    }

    public static void main(String A[])
    {
        int Arr[][] = {
                        {3, 2, 5, 9},
                        {4, 3, 2, 2},
                        {8, 4, 1, 9},
                        {3, 9, 7, 5}
                      };

        int iRow = 4;
        int iCol = 4;
        int iRet = 0;

        iRet = MaxDiagonal(Arr, iRow, iCol);

        System.out.println("Largest number from both diagonals : " + iRet);
    }
}
