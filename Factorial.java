import java.util.*;
class Factorial{
    public static void main(String args[])
    {
        int n,fact=1;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i; //factorial concept
        }
        System.out.println("Factorial is: "+fact);
    }
}    