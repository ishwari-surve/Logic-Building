class Logic
{
    void sumOfDigits(int num)
    {
    
        int iSum = 0;
        int iDigit = 0;

        while(num > 0)
        {
            iDigit = num % 10;    // extract last digit
            iSum = iSum + iDigit; // add it to sum
            num = num / 10;       // remove last digit
        }

        System.out.println("Sum of digits = " + iSum);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}
