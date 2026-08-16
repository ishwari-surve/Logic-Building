/*
Q1 — Hotel Stay Bill

A hotel charges ₹3000 per day. For long stays, the hotel provides a discount.
-₹3000 per day
-If stay is more than 7 days, give 5% discount on the total bill
-Number of days must be ≥ 0

Expected Output:
-Total Stay Duration: <days> days
-Final Bill Amount: ₹<amount>
*/

import java.util.*;

class HotelBill
{
    public static int CalculateBill(int Days)
    {
        int Bill = 0;

        Bill = Days * 3000;

        if(Days > 7)
        {
            Bill = Bill - (Bill * 5 / 100);
        }

        return Bill;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Days = 0;
        int Ret = 0;

        System.out.println("Enter number of days stayed :");
        Days = sobj.nextInt();

        if(Days < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            Ret = CalculateBill(Days);

            System.out.println("Total Stay Duration: " + Days + " days");
            System.out.println("Final Bill Amount: Rs" + Ret);
        }
    }
}
