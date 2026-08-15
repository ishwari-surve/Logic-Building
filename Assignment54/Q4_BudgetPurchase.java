/*
Q4 — Budget Item Purchase
A customer has a fixed budget and purchases items one by one in the given order.

Take the budget amount, number of items N, and N item prices.
Purchase items as long as the remaining balance is sufficient.
Stop when the next item's price is greater than the remaining balance.
Budget must be ≥ 0.
N must be ≥ 0.
Each item price must be > 0.

Expected Output:
-Items Purchased: <count>
-Remaining Balance: ₹<amount>
*/
import java.util.*;

class BudgetPurchase
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Budget = 0;
        int N = 0;
        int Price = 0;
        int Count = 0;

        System.out.println("Enter budget amount :");
        Budget = sobj.nextInt();

        System.out.println("Enter number of items :");
        N = sobj.nextInt();

        if(Budget < 0 || N < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            for(int i = 0; i < N; i++)
            {
                System.out.println("Enter price of item :");
                Price = sobj.nextInt();

                if(Price <= 0)
                {
                    System.out.println("Invalid input");
                    return;
                }

                if(Price <= Budget)
                {
                    Budget = Budget - Price;
                    Count++;
                }
                else
                {
                    break;
                }
            }

            System.out.println("Items Purchased: " + Count);
            System.out.println("Remaining Balance: ₹" + Budget);
        }
    }
}
