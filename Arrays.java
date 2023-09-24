import java.util.*;

public class Arrays {
    public static void main(String args[])
    {
        Scanner sb = new Scanner(System.in);
        int rows = sb.nextInt();
        int cols = sb.nextInt();

        int numbers [][] = new int[rows][cols];

        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<cols;j++)
            {
                numbers[i][j] = sb.nextInt();
            }
        }
        int x=sb.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(numbers[i][j]==x)
                {
                    System.out.println("X found at location " + i + " " + j + " ");
                }
            }
        }
    }
}
