/*
Q5 — Cinema Seat Booking

A cinema allows customers to book seats with different prices based on the row.

Take the number of seats to book.
Check whether the requested seats are available.
Seat prices depend on the row.
If 6 or more seats are booked, apply the applicable group discount.
Already booked seats cannot be booked again.
Display:
Booking result
Total cost
Remaining available seats

Input:
-Number of seats
-Seat/row details as required

Output:
-Booking Successful
-Total Cost: Rs<amount>
-Remaining Seats: <count>
*/

import java.util.*;

class CinemaBooking
{
    public static int CalculateCost(int Seats, int Price)
    {
        int Cost = 0;

        Cost = Seats * Price;

        if(Seats >= 6)
        {
            Cost = Cost - (Cost * 10 / 100);
        }

        return Cost;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int TotalSeats = 0;
        int BookedSeats = 0;
        int RequestSeats = 0;
        int Price = 0;
        int AvailableSeats = 0;
        int Ret = 0;

        System.out.println("Enter total seats :");
        TotalSeats = sobj.nextInt();

        System.out.println("Enter already booked seats :");
        BookedSeats = sobj.nextInt();

        System.out.println("Enter seats required :");
        RequestSeats = sobj.nextInt();

        System.out.println("Enter price per seat :");
        Price = sobj.nextInt();

        if(TotalSeats <= 0 || BookedSeats < 0 ||
           RequestSeats <= 0 || Price <= 0)
        {
            System.out.println("Invalid input");
        }
        else if(BookedSeats > TotalSeats)
        {
            System.out.println("Invalid input");
        }
        else
        {
            AvailableSeats = TotalSeats - BookedSeats;

            if(RequestSeats > AvailableSeats)
            {
                System.out.println("Booking Failed: Seats Not Available");
            }
            else
            {
                Ret = CalculateCost(RequestSeats, Price);

                AvailableSeats = AvailableSeats - RequestSeats;

                System.out.println("Booking Successful");
                System.out.println("Seats Booked: " + RequestSeats);
                System.out.println("Total Cost: Rs" + Ret);
                System.out.println("Remaining Seats: " + AvailableSeats);
            }
        }
    }
}
