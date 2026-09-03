/*
Group Employees Department-Wise

Employee records:
Amit IT
Rahul HR
Pooja IT
Neha Finance
Kiran HR
Riya IT

Expected output:
IT:
Amit
Pooja
Riya

HR:
Rahul
Kiran

Finance:
Neha
*/
import java.util.*;

class programQ3
{
    public static void main(String A[])
    {
        LinkedHashMap<String, ArrayList<String>> employees =
            new LinkedHashMap<String, ArrayList<String>>();

        employees.put("IT", new ArrayList<String>());
        employees.put("HR", new ArrayList<String>());
        employees.put("Finance", new ArrayList<String>());

        employees.get("IT").add("Amit");
        employees.get("HR").add("Rahul");
        employees.get("IT").add("Pooja");
        employees.get("Finance").add("Neha");
        employees.get("HR").add("Kiran");
        employees.get("IT").add("Riya");

        for(String department : employees.keySet())
        {
            System.out.println(department + ":");

            for(String name : employees.get(department))
            {
                System.out.println(name);
            }

            System.out.println();
        }
    }
}
