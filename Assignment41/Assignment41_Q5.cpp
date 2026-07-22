#include<iostream>
using namespace std;

template<class T>
T Min(T *arr, int iSize)
{
    // Logic
    int i = 0;

    for(i = 1; i < iSize; i++)
    {
        if(arr[i] < arr[0])
        {
            arr[0] = arr[i];    
        }
    }

    return arr[0];             
}

int main()
{
    int arr[]   = {10, 20, 30, 40, 50};
    float brr[] = {10.0, 3.7, 9.8, 8.7};

    int iRet = Min(arr, 5);
    cout << "Min of int array   : " << iRet << endl;

    float fRet = Min(brr, 4);
    cout << "Min of float array : " << fRet << endl;

    return 0;
}
