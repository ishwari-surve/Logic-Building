/*
Q1 — Ride Fare Calculation

A ride-hailing app calculates trip fare based on distance and whether 
the trip happened during peak hours.

Base fare → ₹50
First 10 km → ₹12 per km
Beyond 10 km → ₹15 per km
Peak hours → 20% extra on total fare
Distance cannot be negative

Input:
-Distance in km
-Peak hour (Yes/No)

Output:
-Distance: <km> km
-Peak Hour: <Yes/No>
-Total Fare: ₹<amount>
*/
import java.util.*;

class RideFare
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        int Peak = 0;
        int Fare = 0;

        System.out.println("Enter distance in km :");
        Distance = sobj.nextInt();

        System.out.println("Is it peak hour?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Peak = sobj.nextInt();

        if(Distance < 0)
        {
            System.out.println("Invalid input");
        }
        else if(Peak != 1 && Peak != 2)
        {
            System.out.println("Invalid input");
        }
        else
        {
            Fare = 50;

            if(Distance <= 10)
            {
                Fare = Fare + (Distance * 12);
            }
            else
            {
                Fare = Fare + (10 * 12);
                Fare = Fare + ((Distance - 10) * 15);
            }

            if(Peak == 1)
            {
                Fare = Fare + (Fare * 20 / 100);
            }

            System.out.println("Distance: " + Distance + " km");

            if(Peak == 1)
            {
                System.out.println("Peak Hour: Yes");
            }
            else
            {
                System.out.println("Peak Hour: No");
            }

            System.out.println("Total Fare: Rs" + Fare);
        }
    }
}
