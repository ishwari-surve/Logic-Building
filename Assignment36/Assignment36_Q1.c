#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo)
{
    UINT iMask = 0x00000040;

    iMask = ~iMask;

    return (iNo & iMask);
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number : ");
    scanf("%u",&iValue);

    iRet = OffBit(iValue);

    printf("Modified number is %u\n",iRet);

    return 0;
}
