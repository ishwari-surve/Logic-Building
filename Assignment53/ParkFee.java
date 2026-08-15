/*
Q1 — ParkFee
A shopping mall parking gate records the total parking duration in hours.

Rules:
-First 2 hours → ₹20 flat
-After 2 hours → ₹10 per extra hour
-If total hours > 10 → add ₹50 penalty
-Hours cannot be negative
Input: Total parking hours (integer)

Expected Output:
-Total Parking Duration: <hours> hours
-Total Parking Fee: ₹<amount>

For negative hours: Invalid input
*/

import java.util.*;

class ParkFee
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Hours = 0;
        int Fee = 0;

        System.out.println("Enter total parking hours :");
        Hours = sobj.nextInt();

        if(Hours < 0)
        {
            System.out.println("Invalid input");
        }
        else if(Hours <= 2)
        {
            Fee = 20;

            System.out.println("Total Parking Duration: " + Hours + " hours");
            System.out.println("Total Parking Fee: Rs" + Fee);
        }
        else
        {
            Fee = 20 + ((Hours - 2) * 10);

            if(Hours > 10)
            {
                Fee = Fee + 50;
            }

            System.out.println("Total Parking Duration: " + Hours + " hours");
            System.out.println("Total Parking Fee: Rs" + Fee);
        }
    }
}
