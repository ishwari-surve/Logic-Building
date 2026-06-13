//2. Accept number of rows and number of columns from user and display below pattern.
//Input : iRow = 4 iCol = 4

/*
Output : A B C D
a b c d
A B C D
a b c d
*/ 

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    // Logic
    int  iR    = 0;
    int  iC    = 0;
    char ch = 'A';

    for(iR = 1; iR <= iRow; iR++)           
    {
        if(iR % 2 != 0)                     
        {
            ch = 'A';                    
        }
        else                                
        {
            ch = 'a';                    
        }

        for(iC = 1; iC <= iCol; iC++)       
        {
            printf("%c ", ch);
            ch++;
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
