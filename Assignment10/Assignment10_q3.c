/*
    Question:
    Write a program which accept distance in kilometre
    and convert it into meter.

    1 Kilometre = 1000 Meter

    Input : 5
    Output : 5000

    Input : 12
    Output : 12000
*/

#include<stdio.h>

int KMtoMeter(int iNo)
{
    int iAns = 0;

    iAns = iNo * 1000;

    return iAns;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter distance in kilometre : ");
    scanf("%d",&iValue);

    iRet = KMtoMeter(iValue);

    printf("Distance in meter is : %d",iRet);

    return 0;
}

/*
    Time Complexity : O(1)
*/
