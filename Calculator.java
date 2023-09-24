import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the 2nd Number: ");
        double b = sc.nextDouble();

        System.out.println("Opeation in this calculator");

        System.out.println("1 : + (Addition) a + b");
        System.out.println("2 : - (Subtraction) a - b");
        System.out.println("3 : * (Multiplication) a * b");
        System.out.println("4 : / (Division) a / b");
        System.out.println("5 : % (Modulo or remainder) a % b");

        System.out.println("Eter the Choice: ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default: System.out.println("Ivaid Choice");
        }
        
        
    }
}
