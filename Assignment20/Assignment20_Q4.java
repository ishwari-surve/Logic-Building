class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit   = 0;
        int iLargest = 0;       // digits are 0-9

        while(num > 0)
        {
            iDigit = num % 10;             

            if(iDigit > iLargest)
            {
                iLargest = iDigit;          // update largest if bigger digit found
            }

            num = num / 10;                 // remove last digit
        }

        System.out.println("Largest digit = " + iLargest);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}
