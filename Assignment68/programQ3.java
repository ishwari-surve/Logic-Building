/*
An e-commerce warehouse maintains:

Product ID -> Available Quantity

Implement operations:

ADD 101 50
ADD 102 30
SELL 101 5
RESTOCK 102 20
SEARCH 101

Expected result:

Product 101 available quantity : 45

If a product doesn't exist, display an appropriate message.
*/
import java.util.*;

class programQ3
{
    public static void main(String A[])
    {
        HashMap<Integer,Integer> product = new HashMap<Integer,Integer>();

        // ADD 101 50
        product.put(101,50);

        // ADD 102 30
        product.put(102,30);

        // SELL 101 5
        if(product.containsKey(101))
        {
            product.put(101,product.get(101) - 5);
        }

        // RESTOCK 102 20
        if(product.containsKey(102))
        {
            product.put(102,product.get(102) + 20);
        }

        // SEARCH 101
        if(product.containsKey(101))
        {
            System.out.println("Product 101 available quantity : " + product.get(101));
        }
        else
        {
            System.out.println("Product 101 does not exist");
        }
    }
}
