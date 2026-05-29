/*
    Question:
    Write a program which accept number from user
    and count frequency of 4 in it.

    Input : 2395
    Output : 0

    Input : 9440
    Output : 2
*/

#include<stdio.h>

int CountFour(int iNo)
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

        if(iDigit == 4)
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

    iRet = CountFour(iValue);

    printf("Frequency of 4 is : %d",iRet);

    return 0;
}

/*
    Time Complexity : O(n)
*/
