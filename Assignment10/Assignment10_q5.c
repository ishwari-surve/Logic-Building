/*
    Question:
    Write a program which accept area in square feet
    and convert it into square meter.

    1 Square Feet = 0.0929 Square Meter

    Input : 5
    Output : 0.4645

    Input : 7
    Output : 0.6503
*/

#include<stdio.h>

double SquareMeter(int iValue)
{
    double dAns = 0.0;

    dAns = iValue * 0.0929;

    return dAns;
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in square feet : ");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf("Area in square meter is : %lf",dRet);

    return 0;
}

/*
    Time Complexity : O(1)
*/
