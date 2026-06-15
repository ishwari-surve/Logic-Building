#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    
    int iR   = 0;
    int iC   = 0;
    int iNum = 0;

    for(iR = 1; iR <= iRow; iR++)
    {
        if(iR % 2 == 0)         
        {
            iNum = 1;
        }
        else                     
        {
            iNum = 2;
        }

    for(iC = 1;iC <= iCol; iC++)
    {
        printf("%d",iNum);
        iNum = iNum + 2;

    }
    printf("\n");

    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    printf("Enter number of rows and columns");
    scanf("%d %d", &iValue1, &iValue2);
    Pattern(iValue1, iValue2);
    return 0;
} 
