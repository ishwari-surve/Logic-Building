class Logic
{
    void printReverse(int n)
  {
        int i = 0;

        for(i = n; i >= 1; i--)
        {
            System.out.print(i + " ");    // print from n down to 1
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}
