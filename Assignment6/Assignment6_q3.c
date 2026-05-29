/*
    Question:
    Write a program to find factorial of given number.

    Input : 5
    Output : 120

    Input : -5
    Output : 120

    Input : 4
    Output : 24

*/

#include<stdio.h>

int Factorial(int iNo)
{
    int iCnt = 0;
    int iFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        iFact = iFact * iCnt;
    }

    return iFact;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Factorial(iValue);

    printf("Factorial is : %d",iRet);

    return 0;
}

/*
    Time Complexity : O(n)
*/
