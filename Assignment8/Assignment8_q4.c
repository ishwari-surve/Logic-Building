/*
    Question:
    Write a program which accept temperature
    in Fahrenheit and convert it into Celsius.

    Formula :
    Celsius = (Fahrenheit - 32) * (5/9)

    Input : 10
    Output : -12.2222

    Input : 34
    Output : 1.11111
*/

#include<stdio.h>

double FhtoCs(float fTemp)
{
    double dAns = 0.0;

    dAns = (fTemp - 32) * (5.0 / 9.0);

    return dAns;
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter temperature in Fahrenheit : ");
    scanf("%f",&fValue);

    dRet = FhtoCs(fValue);

    printf("Temperature in Celsius is : %lf",dRet);

    return 0;
}

/*
    Time Complexity : O(1)
*/
