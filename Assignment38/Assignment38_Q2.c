#include<stdio.h>

typedef unsigned int UINT;

void CommonBits(UINT iNo1, UINT iNo2)
{
    UINT iMask = 0x00000001;
    UINT iCommon = 0;
    int iPos = 1;

    iCommon = iNo1 & iNo2;

    while(iCommon != 0)
    {
        if((iCommon & iMask) == iMask)
        {
            printf("%d\t",iPos);
        }

        iCommon = iCommon >> 1;
        iPos++;
    }
}

int main()
{
    UINT iValue1 = 0;
    UINT iValue2 = 0;

    printf("Enter first number : ");
    scanf("%u",&iValue1);

    printf("Enter second number : ");
    scanf("%u",&iValue2);

    printf("Common ON bit positions are : ");
    CommonBits(iValue1,iValue2);

    return 0;
}
