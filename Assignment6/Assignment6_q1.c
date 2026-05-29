/*
    Question: 1
    Write a program which accept number from user and
    if number is less than 50 then print Small,
    if it is greater than 50 and less than 100 then print Medium,
    if it is greater than 100 then print Large.

    Input : 75
    Output : Medium

*/

#include<stdio.h>

void Number(int iNo)
{
    if(iNo < 50)
    {
        printf("Small");
    }
    else if((iNo > 50) && (iNo < 100))
    {
        printf("Medium");
    }
    else
    {
        printf("Large");
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    Number(iValue);

    return 0;
}

/*
    Time Complexity : O(1)
*/
