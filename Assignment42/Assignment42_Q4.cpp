#include<iostream>
using namespace std;

template<class T>
int SearchLast(T *arr, int iSize, T iNo)
{
    
    int i = 0;
    int iPos = -1;          

    for(i = 0; i < iSize; i++)
    {
        if(arr[i] == iNo)
        {
            iPos = i ;   
        }
    }

    return iPos;           
}

int main()
{
    int arr[] = {10, 20, 30, 10, 30, 40, 10, 40, 10};

    int iRet = SearchLast(arr, 9, 40);
    cout << "Last occurrence of 40 : " << iRet << endl;    

    return 0;
}
