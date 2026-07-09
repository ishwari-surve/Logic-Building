#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

void InsertFirst(PPNODE first, int No)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = No;
    newn->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        *first = newn;
    }
}

void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d |->",first->data);
        first = first->next;
    }

    printf("NULL\n");
}

int CountOdd(PNODE Head)
{
    int iCount = 0;

    while(Head != NULL)
    {
        if((Head->data % 2) != 0)
        {
            iCount++;
        }

        Head = Head->next;
    }

    return iCount;
}

int main()
{
    PNODE Head = NULL;
    int iCount = 0, i = 0, iNo = 0;
    int iRet = 0;

    printf("Enter the number of nodes : ");
    scanf("%d",&iCount);

    printf("Enter the elements : \n");
    for(i = 1; i <= iCount; i++)
    {
        scanf("%d",&iNo);
        InsertFirst(&Head, iNo);
    }

    Display(Head);

    iRet = CountOdd(Head);

    printf("Number of odd elements are : %d\n",iRet);

    return 0;
}
