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

int Frequency(PNODE Head, int No)
{
    int iCount = 0;

    while(Head != NULL)
    {
        if(Head->data == No)
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

    printf("Enter the element you want to search : ");
    scanf("%d",&iNo);

    iRet = Frequency(Head, iNo);

    printf("Frequency of %d is : %d\n",iNo,iRet);

    return 0;
}
