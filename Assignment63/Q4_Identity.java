/*
Q4. Write a program which accept matrix and check whether the matrix is
identity matrix or not.
Identity matrix is a square matrix with 1’s along the diagonal from upper left to
lower right and 0’s in all other positions.
If it satisfies the structure as explained before then the matrix is called as
identity matrix.

Input:
1 0 0 0
0 1 0 0
0 0 1 0
0 0 0 1

Output : True
*/
import java.util.*;

class ChkIdentity
{
    public static boolean ChkIdentity(int Arr[][], int iRow, int iCol)
    {
        // Logic
        int i = 0;
        int j = 0;

     
        if(iRow != iCol)
        {
            return false;
        }

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)                  
                {
                    if(Arr[i][j] != 1)
                    {
                        return false;
                    }
                }
                else                        
                {
                    if(Arr[i][j] != 0)
                    {
                        return false;
                    }
                }
            }
        }

        return true;    
    }

    public static void main(String A[])
    {
        int Arr[][] = {
                        {1, 0, 0, 0},
                        {0, 1, 0, 0},
                        {0, 0, 1, 0},
                        {0, 0, 0, 1}
                      };

        int iRow    = 4;
        int iCol    = 4;
        boolean Ret = false;

        Ret = ChkIdentity(Arr, iRow, iCol);

        if(Ret == true)
        {
            System.out.println("True : Identity Matrix");
        }
        else
        {
            System.out.println("False : Not Identity Matrix");
        }
    }
}
