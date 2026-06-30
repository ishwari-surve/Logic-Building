#include<stdio.h>

typedef unsigned int UINT;

UINT CountOne(UINT iNo)
{
    UINT iMask = 0x00000001;
    int iCnt = 0;

    while(iNo != 0)
    {
        if((iNo & iMask) == iMask)
        {
            iCnt++;
        }

        iNo = iNo >> 1;
    }

    return iCnt;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number : ");
    scanf("%u",&iValue);

    iRet = CountOne(iValue);

    printf("Number of ON bits is %u\n",iRet);

    return 0;
}
