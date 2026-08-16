/8
Q4 — Telecom Call Charge

A telecom company charges for calls based on the duration of the call.

-First 5 minutes → Free
-Next 10 minutes (6–15) → ₹1 per minute
-Beyond 15 minutes → ₹2 per minute
-Call duration must be ≥ 0

Expected Output:
-Call Duration: <minutes> minutes
-Total Call Charge: ₹<amount>
*/
import java.util.*;

class CallCharge
{
    public static int CalculateCharge(int Minutes)
    {
        int Charge = 0;

        if(Minutes <= 5)
        {
            Charge = 0;
        }
        else if(Minutes <= 15)
        {
            Charge = (Minutes - 5) * 1;
        }
        else
        {
            Charge = (10 * 1) + ((Minutes - 15) * 2);
        }

        return Charge;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Minutes = 0;
        int Ret = 0;

        System.out.println("Enter call duration in minutes :");
        Minutes = sobj.nextInt();

        if(Minutes < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            Ret = CalculateCharge(Minutes);

            System.out.println("Call Duration: " + Minutes + " minutes");
            System.out.println("Total Call Charge: Rs" + Ret);
        }
    }
}
