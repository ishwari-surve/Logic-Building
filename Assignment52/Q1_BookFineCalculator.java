/*
Question 1 — Book Fine Calculator
The question says the first 7 days are free. Days 8–12 have a ₹5/day fine,
and days beyond 12 have ₹10/day. It also requires negative input validation.
*/

import java.util.*;

class Q1_BookFineCalculator
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int daysKept = 0;
        int fineAmount = 0;

        System.out.println("Enter number of days:");
        daysKept = sobj.nextInt();

        if(daysKept < 0)
        {
            System.out.println("Invalid input");
        }
        else if(daysKept <= 7)
        {
            System.out.println("Returned on time. No fine applicable.");
        }
        else if(daysKept <= 12)
        {
            fineAmount = (daysKept - 7) * 5;

            System.out.println("Total fine to be paid: ₹" + fineAmount);
        }
        else
        {
            fineAmount = (5 * 5) + ((daysKept - 12) * 10);

            System.out.println("Total fine to be paid: ₹" + fineAmount);
        }
    }
}
