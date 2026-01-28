import java.util.Scanner;

class product
{
    int code;
    String name;
    int cost;

    product(int c, String n, int cst)
    {
        code = c;
        name = n;
        cost = cst;
    }
}

public class lowest{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of products : ");
        int x = scanner.nextInt();

        product[] p;

        p = new product[x];

        for (int i = 0; i < x; i++)
        {
            System.out.println("Enter the details of product " + (i + 1) + " : ");
            System.out.println("Enter product code : ");
            int code = scanner.nextInt();
            System.out.println("Enter product name : ");
            String name = scanner.next();
            System.out.println("Enter product cost : ");
            int cost = scanner.nextInt();

            p[i] = new product(code, name, cost);
        }

        product low = p[0];

        for (int i = 1; i < x; i++)
        {
            if (low.cost > p[i].cost)
            {
                low = p[i];
            }
        }

        System.out.println("Lowest cost product details : \nCode : " + low.code + "\nName : " + low.name + "\nCost : " + low.cost);
    }
}
