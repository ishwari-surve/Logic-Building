#include<stdio.h>

int Mult(int iNo)
{
    static int iMult = 1;

    if(iNo > 0)
    {
        iMult = iMult * (iNo % 10);
        Mult(iNo / 10);
    }

    return iMult;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Mult(iValue);

    printf("Product of digits is : %d\n",iRet);

    return 0;
}
