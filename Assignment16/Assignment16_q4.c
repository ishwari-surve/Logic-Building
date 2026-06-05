/*
    Accept N numbers from user and display all such numbers which contains
    3 digits in it.

    Input : N : 6
    Elements : 8225 665 3 76 953 858

    Output : 665 953 858
*/

#include<stdio.h>
#include<stdlib.h>

void Digits(int Arr[], int iLength)
{
    int iCnt = 0;
    int iNo = 0;
    int iDigitCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        iNo = Arr[iCnt];
        iDigitCnt = 0;

        while(iNo != 0)
        {
            iDigitCnt++;
            iNo = iNo / 10;
        }

        if(iDigitCnt == 3)
        {
            printf("%d\t", Arr[iCnt]);
        }
    }
}

int main()
{
    int iSize = 0, iCnt = 0;
    int *p = NULL;

    printf("Enter number of elements : ");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements : ",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("\nEnter element : %d",iCnt + 1);
        scanf("%d",&p[iCnt]);
    }

    Digits(p, iSize);

    free(p);

    return 0;
}

/*
    Time Complexity : O(n*d)
*/