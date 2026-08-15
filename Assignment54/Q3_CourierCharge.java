/*
Q3 — Courier Charge Calculation
A courier counter calculates the delivery charge based on the parcel weight.

Up to 1 kg → ₹50
1–5 kg → ₹50 + ₹20 per kg above 1 kg
Above 5 kg → ₹150 + ₹30 per kg above 5 kg
Weight must be greater than 0

Expected Output:
-Parcel Weight: <weight> kg
-Courier Charge: ₹<amount>
*/

import java.util.*;

class CourierCharge
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Weight = 0;
        int Charge = 0;

        System.out.println("Enter parcel weight in kg :");
        Weight = sobj.nextInt();

        if(Weight <= 0)
        {
            System.out.println("Invalid input");
        }
        else if(Weight <= 1)
        {
            Charge = 50;

            System.out.println("Parcel Weight: " + Weight + " kg");
            System.out.println("Courier Charge: ₹" + Charge);
        }
        else if(Weight <= 5)
        {
            Charge = 50 + ((Weight - 1) * 20);

            System.out.println("Parcel Weight: " + Weight + " kg");
            System.out.println("Courier Charge: ₹" + Charge);
        }
        else
        {
            Charge = 150 + ((Weight - 5) * 30);

            System.out.println("Parcel Weight: " + Weight + " kg");
            System.out.println("Courier Charge: ₹" + Charge);
        }
    }
}
