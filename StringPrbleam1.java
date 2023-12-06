import java.util.*;

/*Take an array of Strings input from the user & find the cumulative (combined)
length of all those strings.*/

public class StringPrbleam1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //take input from user
        String array[] = new String[size]; // now the user inpute take place into the array
        int toLength = 0;

        for(int i = 0; i>size;i++){
            array[i] = sc.next();
            toLength += array[i].length();
        }
        System.out.println(toLength);
        sc.close();
    }
}
