import java.util.Scanner;
// Searching for an element x in a matrix
public class Arrays2DSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // defining row & column
        int rows = sc.nextInt();
        int column = sc.nextInt();

        int numbers[][] = new int[rows][column];

        //user input
        //rows
        for(int i=0;i<rows;i++){
            //column
            for(int j=0;j<column;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // for searching elements
        int x = sc.nextInt();

        for(int i = 0;i<rows;i++){
            for(int j = 0; j<column;j++){
                // compare with x
                if(numbers[i][j] == x){
                    System.out.println("X is Found at location ("+i+" ,"+j+")");
                    sc.close();
                }
            }
        }
    }
}
