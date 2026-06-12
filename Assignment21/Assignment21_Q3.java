class Logic
{
    void displayFactors(int num)
    {
        int i = 0;

        System.out.print("Factors of " + num + " are : ");

        for(i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");  // i is a factor → print it
            }
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}
