import java.util.Scanner;

public class ArmStrong {
    public static void main(String args[])
    {
        int n,c,rem,arm=0;
        System.out.println("Enter number to check: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not a Armstrong Number");
    }
}
