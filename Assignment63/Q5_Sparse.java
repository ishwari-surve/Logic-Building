/*
5. Write a program which accept matrix and check whether the matrix is
Sparse matrix or not.
Sparse matrix is a matrix with the majority of its elements equal to zero.
  
Input :
1 0 3 0
0 6 0 0
0 0 1 0
9 0 0 9

Output : True
*/

import java.util.*;

class ChkSparse
{
    public static boolean ChkSparse(int Arr[][], int iRow, int iCol)
    {
        int i          = 0;
        int j          = 0;
        int iZeroCount = 0;
        int iTotal     = iRow * iCol;   

       
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iZeroCount++;       
                }
            }
        }

        if(iZeroCount > iTotal / 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String A[])
    {
        int Arr[][] = {
                        {1, 0, 3, 0},
                        {0, 6, 0, 0},
                        {0, 0, 1, 0},
                        {9, 0, 0, 9}
                      };

        int iRow    = 4;
        int iCol    = 4;
        boolean Ret = false;

        Ret = ChkSparse(Arr, iRow, iCol);

        if(Ret == true)
        {
            System.out.println("True - Sparse Matrix");
        }
        else
        {
            System.out.println("False - Not Sparse Matrix");
        }
    }
}

