/*
    Question:
    Write a program to find odd factorial
    of given number.

    Input : 5
    Output : 15

    Input : -5
    Output : 15

    Input : 10
    Output : 945
*/

#include<stdio.h>

int OddFactorial(int iNo)
{
    int iCnt = 0;
    int iFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if((iCnt % 2) != 0)
        {
            iFact = iFact * iCnt;
        }
    }

    return iFact;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = OddFactorial(iValue);

    printf("Odd factorial is : %d",iRet);

    return 0;
}

/*
    Time Complexity : O(n)
*/
