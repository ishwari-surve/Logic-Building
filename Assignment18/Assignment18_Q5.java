class Logic
{
    void checkSign(int num)
    {
        if(num > 0)
        {
            System.out.println(num + " is Positive");
        }
        else if(num < 0)
        {
            System.out.println(num + " is Negative");
        }
        else
        {
            System.out.println(num + " is Zero");
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}
