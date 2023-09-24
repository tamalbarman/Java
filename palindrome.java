import java.util.Scanner;

public class palindrome {
    public static void main(String args[])
    {
        int n,c,r,s=0;
        System.out.println("Ener number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r; //condition we check this c==s
            n=n/10;
        }
        if(c==s)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}
