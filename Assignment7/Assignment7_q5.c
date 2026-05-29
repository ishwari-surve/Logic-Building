/*
    Question:
    Write a program which returns difference
    between even factorial and odd factorial.

    Input : 5
    Output : -7

    Input : -5
    Output : -7

    Input : 10
    Output : 2895
*/

#include<stdio.h>

int FactorialDiff(int iNo)
{
    int iCnt = 0;
    int iEvenFact = 1;
    int iOddFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if((iCnt % 2) == 0)
        {
            iEvenFact = iEvenFact * iCnt;
        }
        else
        {
            iOddFact = iOddFact * iCnt;
        }
    }

    return (iEvenFact - iOddFact);
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);

    printf("Factorial Difference is : %d",iRet);

    return 0;
}

/*
    Time Complexity : O(n)
*/
