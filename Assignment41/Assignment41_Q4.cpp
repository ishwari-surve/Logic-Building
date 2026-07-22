#include<iostream>
using namespace std;

template<class T>
T Max(T *arr, int iSize)
{
    // Logic
    T iMax = arr[0];        
    int i  = 0;

    for(i = 1; i < iSize; i++)
    {
        if(arr[i] > iMax)
        {
            iMax = arr[i];  
        }
    }

    return iMax;
}

int main()
{
    int arr[]   = {10, 20, 30, 40, 50};
    float brr[] = {10.0, 3.7, 9.8, 8.7};

    int iRet = Max(arr, 5);
    cout << "Max of int array   : " << iRet << endl;

    float fRet = Max(brr, 4);
    cout << "Max of float array : " << fRet << endl;

    return 0;
}
