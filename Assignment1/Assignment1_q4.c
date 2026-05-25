//4. Accept one number and check whether is is divisible by 5 or not.

#include<stdio.h>
typedef int BOOL;
#define TRUE 1
#define FALSE 0
int Check( int iNo)
{
if(( iNo % 5) == 0)
{
 return TRUE;
 }
else
 {
 return FALSE;
 }
} 