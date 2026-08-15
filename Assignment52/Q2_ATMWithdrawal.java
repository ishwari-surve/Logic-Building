/*
Question 2 — ATM Withdrawal
The ATM question has three important transaction rules:
-Withdrawal must be a multiple of ₹100.
-Maximum withdrawal is ₹25,000.
-At least ₹1,000 must remain after withdrawal.
-Negative balance or non-positive withdrawal is invalid.
*/

import java.util.*;

class Q2_ATMWithdrawal
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Balance = 0;
        int Withdraw = 0;
        int Remaining = 0;

        System.out.println("Enter current balance :");
        Balance = sobj.nextInt();

        System.out.println("Enter withdrawal amount :");
        Withdraw = sobj.nextInt();

        if(Balance < 0 || Withdraw <= 0)
        {
            System.out.println("Invalid input");
        }
        else if(Withdraw % 100 != 0)
        {
            System.out.println("Transaction Failed: Withdrawal amount must be a multiple of ₹100");
        }
        else if(Withdraw > 25000)
        {
            System.out.println("Transaction Failed: Maximum withdrawal per transaction is ₹25,000");
        }
        else
        {
            Remaining = Balance - Withdraw;

            if(Remaining < 1000)
            {
                System.out.println("Transaction Failed: Minimum balance of ₹1,000 must be maintained");
            }
            else
            {
                System.out.println("Transaction Successful.");
                System.out.println("Remaining Balance: ₹" + Remaining);
            }
        }
    }
}
