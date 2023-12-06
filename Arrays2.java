import java.util.*;

// Find the maximum & minimum number in an array of integers.
//[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

public class Arrays2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Minimum Number Is: " + min);
        System.out.println("Largest Number Is: " + max);
        sc.close();
    }
}