/*
Q4 — Addition of Elements from Each Column

Input:
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5

*/
import java.util.*;

class AddColumn
{
    public static void AddColumn(int Arr[][], int iRow, int iCol)
    {
        int i    = 0;
        int j    = 0;
        int iSum = 0;

        for(j = 0; j < iCol; j++)        
        {
            iSum = 0;                     

            for(i = 0; i < iRow; i++)    
            {
                iSum = iSum + Arr[i][j]; 
            }

            System.out.print(iSum + " "); 
        }

        System.out.println();
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

        AddColumn(Arr, iRow, iCol);
    }
}
