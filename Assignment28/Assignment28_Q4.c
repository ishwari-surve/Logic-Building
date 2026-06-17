//4. Accept number of rows and number of columns from user and display below pattern.
// Input : iRow = 6 iCol = 6
/*
Output : * * * * * *
* # # # * *
* # # * $ *
* # * $ $ *
* * $ $ $ *
* * * * * *
*/

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    
    int i = 0;
    int j = 0;

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1; j <= iCol; j++)
        {
            if(j == (iCol - i) + 1||i == 1 || i == iRow || j == 1 || j == iCol)
            {
                printf("* ");                    
            }
            else if(j > (iCol - i) + 1)
            {
                printf("$ ");                     
            }
            else
            {
                printf(" # ");                    
            }
        }
        printf("\n");
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    printf("Enter number of rows and columns: ");
    scanf("%d %d", &iValue1, &iValue2);
    Pattern(iValue1, iValue2);
    return 0;
}
