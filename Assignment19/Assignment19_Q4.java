class Logic
{
    void printDigits(int num)
    {
        int iDigit   = 0;
        int iReverse = 0;
        int iTemp    = num;

        // Step 1 : reverse the number first
        while(iTemp > 0)
        {
            iDigit   = iTemp % 10;
            iReverse = iReverse * 10 + iDigit;
            iTemp    = iTemp / 10;
        }

        // Step 2 :  extract and print digits in correct order
        System.out.println("Digits of " + num + " are : ");
        while(iReverse > 0)
        {
            iDigit   = iReverse % 10;
            System.out.println(iDigit);
            iReverse = iReverse / 10;
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
