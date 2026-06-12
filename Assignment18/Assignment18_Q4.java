class Logic
{
    void sumEvenOddDigits(int num)
    {
        
        int iDigit    = 0;
        int iEvenSum  = 0;
        int iOddSum   = 0;

        while(num > 0)
        {
            iDigit = num % 10;          // extract last digit

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;  // digit is even → add to even sum
            }
            else
            {
                iOddSum = iOddSum + iDigit;    // digit is odd  → add to odd sum
            }

            num = num / 10;             // remove last digit
        }

        System.out.println("Sum of Even digits = " + iEvenSum);
        System.out.println("Sum of Odd  digits = " + iOddSum);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}
