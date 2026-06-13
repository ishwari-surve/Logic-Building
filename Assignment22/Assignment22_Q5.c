// Q5 — Print First N Even Numbers (2 4 6 8 ... up to N terms)

#include<stdio.h>

void Pattern(int iNo)
{
    
    int iCnt  = 0;
    int iEven = 2;            

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("%d ", iEven);   
        iEven = iEven + 2;      
    }
}

int main()
{
    int iValue = 0;
    printf("Enter number of elements: ");
    scanf("%d", &iValue);       
    Pattern(iValue);
    return 0;
} 
