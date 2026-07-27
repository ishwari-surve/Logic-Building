#include<stdio.h>

int Fact(int iNo)
{
    static int iMult = 1;

    if(iNo > 0)
    {
        iMult = iMult * iNo;
        Fact(iNo - 1);
    }

    return iMult;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Fact(iValue);

    printf("Factorial is : %d\n",iRet);

    return 0;
}

