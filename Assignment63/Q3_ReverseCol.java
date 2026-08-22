/*
Q3 is Reverse the Columns of a matrix.

Input:
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5

Output:
3 9 7 5
8 4 1 9
4 3 2 2
3 2 5 9
*/

import java.util.*;

class ReverseCol
{
    public static void ReverseCol(int Arr[][], int iRow, int iCol)
    {
       
        int i     = 0;
        int j     = 0;
        int iTemp = 0;
        int iTop  = 0;
        int iBot  = iRow - 1;

        
        while(iTop < iBot)
        {
            for(j = 0; j < iCol; j++)
            {
                iTemp           = Arr[iTop][j];   
                Arr[iTop][j]    = Arr[iBot][j];  
                Arr[iBot][j]    = iTemp;         
            }

            iTop++;     
            iBot--;     
        }

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
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

        System.out.println("Before ReverseCol:");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nAfter ReverseCol:");
        ReverseCol(Arr, iRow, iCol);
    }
}
