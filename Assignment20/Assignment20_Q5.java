class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit    = 0;
        int iSmallest = 9;       // digits are 0-9

        while(num > 0)
        {
            iDigit = num % 10;             

            if(iDigit < iSmallest)
            {
                iSmallest = iDigit;         
            }

            num = num / 10;                 
        }

        System.out.println("Smallest digit = " + iSmallest);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}
