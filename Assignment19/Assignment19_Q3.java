class Logic
{
    void checkDivisible(int num)
    {
        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println(num + " is divisible by both 5 and 11");
        }
        else if(num % 5 == 0)
        {
            System.out.println(num + " is divisible by 5 only");
        }
        else if(num % 11 == 0)
        {
            System.out.println(num + " is divisible by 11 only");
        }
        else
        {
            System.out.println(num + " is NOT divisible by 5 or 11");
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}
