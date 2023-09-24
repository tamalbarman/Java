public class Recursion1tofront {
    public static void printNumb(int n)
    {
        if(n==6) // this part improtant
        {
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }
    public static void main(String args[])
    {
        int n=1;
        printNumb(n);
    }
}
