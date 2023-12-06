import java.util.*;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int column = sc.nextInt();

        int[][] numbers = new int[rows][column]; //numbers variable to store the value

        //input
        for(int i = 0 ; i<rows;i++){
            for(int j = 0; j<column;j++){
                numbers[i][j] = sc.nextInt(); // assign used input to numbers variable
            }
        }

        //output
        for(int i = 0;i<rows;i++){
            for(int j = 0; j<column;j++){
                System.out.println(numbers[i][j]+ " "); // print user input through numbers variable
            }
        }
        sc.close();
    }
}
