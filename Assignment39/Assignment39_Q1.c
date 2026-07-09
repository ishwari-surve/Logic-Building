#include<stdio.h>
#include<stdlib.h>

typedef int BOOL;

#define TRUE 1
#define FALSE 0

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

BOOL Search(PNODE Head, int No)
{
    while(Head != NULL)
    {
        if(Head->data == No)
        {
            return TRUE;
        }

        Head = Head->next;
    }

    return FALSE;
}

int main()
{
    PNODE Head = NULL;
    int iCount = 0, i = 0, iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter the number of nodes : ");
    scanf("%d",&iCount);

    printf("Enter the elements : \n");
    for(i = 1; i <= iCount; i++)
    {
        scanf("%d",&iValue);
        InsertFirst(&Head,iValue);
    }

    Display(Head);

    printf("Enter element you want to search : ");
    scanf("%d",&iValue);

    bRet = Search(Head,iValue);

    if(bRet == TRUE)
    {
        printf("Element is present\n");
    }
    else
    {
        printf("Element is not present\n");
    }

    return 0;
}
