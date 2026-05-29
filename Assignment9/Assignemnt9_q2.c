/*
    Question:
    Write a program which accept number from user
    and return the count of odd digits.

    Input : 2395
    Output : 3

    Input : 8462
    Output : 0
*/

#include<stdio.h>

int CountOdd(int iNo)
{
    int iDigit = 0;
    int iCount = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo > 0)
    {
        iDigit = iNo % 10;

        if((iDigit % 2) != 0)
        {
            iCount++;
        }

        iNo = iNo / 10;
    }

    return iCount;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = CountOdd(iValue);

    printf("Count of odd digits is : %d",iRet);

    return 0;
}

/*
    Time Complexity : O(n)
*/
