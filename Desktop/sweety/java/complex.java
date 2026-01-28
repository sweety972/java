import java.util.Scanner;

public class complex {
    public static void main(String arg[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real part of first number : ");
        int r1 = scanner.nextInt();
        System.out.println("Enter imaginary part of first number : ");
        int i1 = scanner.nextInt();
        System.out.println("Enter real part of second number  : ");
        int r2 = scanner.nextInt();
        System.out.println("Enter imaginary part of second number : ");
        int i2 = scanner.nextInt();

        int r3 = r1 + r2;
        int i3 = i1 + i2;

        System.out.println("Sum of the complex number : " + r3 + " + " + i3 + "i");
    }
}
