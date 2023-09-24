import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        int result=0, rem;
        while(c > 0)
        {
            result = result*10;
            rem=(c%2);
            result = result +rem;
            c=c/2;
        }
        System.out.println(result); // codiing comes in Happyest Mind Technology
    }
}