/*
Q3 — Stock Availability
Check whether the requested product quantity is available in stock.

If requested quantity > available stock → Order Failed
Otherwise, deduct the requested quantity from stock.
If remaining stock < 5 → Low Stock Alert!
Stock cannot be negative.
Requested quantity must be greater than 0.

Input:
-Available stock
-Requested quantity

Expected Output: If quantity is available:
-Order Successful
-Remaining Stock: <stock>

If remaining stock is less than 5:
-Order Successful
-Remaining Stock: <stock>
-Low Stock Alert!

If quantity is not available: Order Failed: Insufficient Stock
*/

import java.util.*;

class StockCheck
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Stock = 0;
        int Request = 0;
        int Remaining = 0;

        System.out.println("Enter available stock :");
        Stock = sobj.nextInt();

        System.out.println("Enter requested quantity :");
        Request = sobj.nextInt();

        if(Stock < 0 || Request <= 0)
        {
            System.out.println("Invalid input");
        }
        else if(Request > Stock)
        {
            System.out.println("Order Failed: Insufficient Stock");
        }
        else
        {
            Remaining = Stock - Request;

            System.out.println("Order Successful");
            System.out.println("Remaining Stock: " + Remaining);

            if(Remaining < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }
    }
}
