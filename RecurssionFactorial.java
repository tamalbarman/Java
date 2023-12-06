public class RecurssionFactorial {
    public static void prinFactorial(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact *= n;
        prinFactorial(n-1, fact);
    }
    public static void main(String[] args) {
        prinFactorial(5, 1);
    }
}
