//Input
//Number : 10
//Position : 2

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo, int iPos)
{
    UINT iMask = 0;

    if((iPos < 1) || (iPos > 32))
    {
        return FALSE;
    }

    iMask = 1 << (iPos - 1);

    if((iNo & iMask) == iMask)
    {
        return TRUE;
    }
     return FALSE;
    
}

int main()
{
    UINT iValue = 0;
    int iPosition = 0;
    BOOL bRet = FALSE;

    printf("Enter number : ");
    scanf("%u",&iValue);

    printf("Enter position : ");
    scanf("%d",&iPosition);

    bRet = ChkBit(iValue, iPosition);

    if(bRet == TRUE)
    {
        printf("Bit is ON\n");
    }
    else
    {
        printf("Bit is OFF\n");
    }

    return 0;
}
