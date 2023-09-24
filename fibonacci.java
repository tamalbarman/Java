import java.util.Scanner;

public class fibonacci {
    public static void main(String args[])
    {
        int a=0,b=1,n,add;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+" "); // this is for print 0 first
            add=a+b; //fibonacci concept
            a=b;
            b=add;
        }
    }
}
