#include<stdio.h>

typedef unsigned int UINT;

UINT OnBit(UINT iNo, int iPos)
{
    UINT iMask = 0;

    if((iPos < 1) || (iPos > 32))
    {
        return iNo;
    }

    iMask = 1 << (iPos - 1);

    return (iNo | iMask);
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;
    int iPosition = 0;

    printf("Enter number : ");
    scanf("%u",&iValue);

    printf("Enter position : ");
    scanf("%d",&iPosition);

    iRet = OnBit(iValue, iPosition);

    printf("Modified number is %u\n",iRet);

    return 0;
}
