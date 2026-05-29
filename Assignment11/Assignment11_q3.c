/*
    Question:
    Write a program which accept range from user
    and return addition of all numbers in between that range.

    Input : 23 30
    Output : 212

    Input : 10 18
    Output : 126

    Input : 90 18
    Output : Invalid range
*/

#include<stdio.h>

int RangeSum(int iStart, int iEnd)
{
    int iCnt = 0;
    int iSum = 0;

    if((iStart < 0) || (iStart > iEnd))
    {
        printf("Invalid range");
        return 0;
    }

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        iSum = iSum + iCnt;
    }

    return iSum;
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;
    int iRet = 0;

    printf("Enter starting point : ");
    scanf("%d",&iValue1);

    printf("Enter ending point : ");
    scanf("%d",&iValue2);

    iRet = RangeSum(iValue1, iValue2);

    printf("Addition is : %d",iRet);

    return 0;
}

/*
    Time Complexity : O(n)
*/
