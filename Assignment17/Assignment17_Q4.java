class Logic
{
    void findMin(int a, int b, int c)
    {
        // Write logic here
        int iMin = a;          // assume first number is minimum

        if(b < iMin)
        {
            iMin = b;          // if b is smaller, update minimum
        }

        if(c < iMin)
        {
            iMin = c;          // if c is smaller, update minimum
        }

        System.out.println("Minimum = " + iMin);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
} 
