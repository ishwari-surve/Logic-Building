//5. Accept number from user and check whether number is even or odd. 

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkEven(int iNo)
{
    if(iNo % 2 == 0)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int main()
{
    int iValue = 0;
    BOOL bRET = FALSE;
    printf("Enter Number: ");
    scanf("%d",&iValue);

    bRET = ChkEven(iValue);

    if (bRET == TRUE)
    {
        printf("Number is Even");
    }
    else
    {
        printf("Number is Odd");
    }
    return 0;
}