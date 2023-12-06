import java.util.Scanner;
//For a given matrix of N x M, print its transpose.
public class Arrays2DTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        for(int i = 0;i<n;i++){
            for(int j = 0; j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Transpose is : ");

        //to print transpose
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
