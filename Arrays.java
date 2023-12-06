import java.util.*;
// Taking an array as an input and printing its elements.
public class Arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // taken size name varriable
        int numbers[] = new int[size]; //taken user input array size

        for(int i=0; i<size ;i++){
            numbers[i] = sc.nextInt(); // if user take 3 then the array size will be 0 1 2
        }
        // prints the number in the array
        for(int i = 0 ; i< size;i++){
            System.out.println(numbers[i] + " ");
            sc.close();
        }
    }
}