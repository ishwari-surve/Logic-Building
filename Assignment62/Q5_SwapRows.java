/*
Q5 — Swap Contents of Consecutive Rows

Input:
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5

Output:
4 3 2 2
3 2 5 9
3 9 7 5
8 4 1 9

*/
import java.util.*;

class SwapRows
{
    public static void SwapRows(int Arr[][], int iRow, int iCol)
    {
        int i    = 0;
        int j    = 0;
        int iTemp = 0;

        for(i = 0; i < iRow - 1; i = i + 2)  
        {
            for(j = 0; j < iCol; j++)          
            {
                iTemp          = Arr[i][j];     
                Arr[i][j]      = Arr[i+1][j]; 
                Arr[i+1][j]    = iTemp;         
            }
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

        System.out.println("Before Swap:");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nAfter Swap:");
        SwapRows(Arr, iRow, iCol);
    }
}
