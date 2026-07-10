//Write a program to return the position of the last occurrence of a given element in a Singly Linear Linked List. If the element is not found, return -1.
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

int LastOccur(PNODE Head, int No)
{
    int iPos = 1;
    int iLast = -1;

    while(Head != NULL)
    {
        if(Head->data == No)
        {
            iLast = iPos;
        }

        Head = Head->next;
        iPos++;
    }

    return iLast;
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
        InsertFirst(&Head,iNo);
    }

    Display(Head);

    printf("Enter element to search : ");
    scanf("%d",&iNo);

    iRet = LastOccur(Head,iNo);

    if(iRet == -1)
    {
        printf("Element not found\n");
    }
    else
    {
        printf("Last occurrence is at position : %d\n",iRet);
    }

    return 0;
}
