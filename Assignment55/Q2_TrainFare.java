/*
Q2 — Train Fare Calculation

Calculate the train fare based on the following conditions:

-Distance up to 100 km → ₹2 per km
-Distance from 101 km to 500 km → ₹3 per km for the additional distance
-Distance above 500 km → ₹4 per km for the additional distance
-Sleeper → No additional class charge
-3AC → ₹500 additional charge
-2AC → ₹800 additional charge
-Booking within 24 hours → 30% Tatkal charge
-Senior citizens (age 60 or above) → 40% discount
-Distance, booking hours and age cannot be negative.
-Class must be Sleeper, 3AC or 2AC.

Input:
-Distance
-Class
-Booking hours before journey
-Age

Output: Final Fare: Rs<amount>
*/


import java.util.*;

class TrainFare
{
    public static int CalculateFare(int Distance, int ClassType,
                                    int BookingHours, int Age)
    {
        int Fare = 0;

        if(Distance <= 100)
        {
            Fare = Distance * 2;
        }
        else if(Distance <= 500)
        {
            Fare = (100 * 2) + ((Distance - 100) * 3);
        }
        else
        {
            Fare = (100 * 2) + (400 * 3) + ((Distance - 500) * 4);
        }

        if(ClassType == 1)
        {
            Fare = Fare + 0;
        }
        else if(ClassType == 2)
        {
            Fare = Fare + 500;
        }
        else
        {
            Fare = Fare + 800;
        }

        if(BookingHours <= 24)
        {
            Fare = Fare + (Fare * 30 / 100);
        }

        if(Age >= 60)
        {
            Fare = Fare - (Fare * 40 / 100);
        }

        return Fare;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        int ClassType = 0;
        int BookingHours = 0;
        int Age = 0;
        int Ret = 0;

        System.out.println("Enter distance :");
        Distance = sobj.nextInt();

        System.out.println("Enter class type :");
        System.out.println("1. Sleeper");
        System.out.println("2. 3AC");
        System.out.println("3. 2AC");
        ClassType = sobj.nextInt();

        System.out.println("Enter booking hours before journey :");
        BookingHours = sobj.nextInt();

        System.out.println("Enter age :");
        Age = sobj.nextInt();

        if(Distance < 0 || BookingHours < 0 || Age < 0)
        {
            System.out.println("Invalid input");
        }
        else if(ClassType != 1 && ClassType != 2 && ClassType != 3)
        {
            System.out.println("Invalid input");
        }
        else
        {
            Ret = CalculateFare(Distance, ClassType,
                                BookingHours, Age);

            System.out.println("Final Fare: Rs" + Ret);
        }
    }
}
