/*
Question 5
E-Commerce Discount Calculator

An e-commerce website provides discounts to customers based
on their purchase amount and membership type.

Rules
Purchase amount > ₹5000 → 20% discount
Purchase amount > ₹2000 → 10% discount
Otherwise → No discount
Premium members receive an additional 5% discount on the already-discounted amount
Membership type should be Premium or Regular
Invalid purchase amount or invalid membership type → Invalid input

Expected Output
For a valid transaction, display:
-Original Amount: ₹<amount>
-Total Discount: ₹<discount>
-Final Payable Amount: ₹<amount>

For invalid input: Invalid input
*/

import java.util.*;

class Q5_ECommerceDiscount
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;
        int Choice = 0;
        int Discount = 0;
        int PremiumDiscount = 0;
        int FinalAmount = 0;

        System.out.println("Enter purchase amount :");
        Amount = sobj.nextInt();

        System.out.println("Enter membership type :");
        System.out.println("1. Premium");
        System.out.println("2. Regular");

        Choice = sobj.nextInt();

        if(Amount <= 0)
        {
            System.out.println("Invalid input");
        }
        else if(Choice != 1 && Choice != 2)
        {
            System.out.println("Invalid input");
        }
        else
        {
            if(Amount > 5000)
            {
                Discount = Amount * 20 / 100;
            }
            else if(Amount > 2000)
            {
                Discount = Amount * 10 / 100;
            }
            else
            {
                Discount = 0;
            }

            FinalAmount = Amount - Discount;

            if(Choice == 1)
            {
                PremiumDiscount = FinalAmount * 5 / 100;

                Discount = Discount + PremiumDiscount;

                FinalAmount = FinalAmount - PremiumDiscount;
            }

            System.out.println("Original Amount: ₹" + Amount);
            System.out.println("Total Discount: ₹" + Discount);
            System.out.println("Final Payable Amount: ₹" + FinalAmount);
        }
    }
}
