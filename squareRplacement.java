import java.util.Scanner;

public class squareRplacement {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] input = new int[n];
        int i, middleIndex;
        System.out.print("Enter 4 numbers: ");
        for(i=0;i<n;i++)
        {
            input[i] = sc.nextInt();
        }
        middleIndex=n/2;
        input[middleIndex] = input[middleIndex]*input[middleIndex];
        System.out.println("Output: ");
        for(i=0;i<n;i++)
        {
            if(i == middleIndex)
            {
                continue;
            }
            System.out.print(input[i]+" ");
        }

    }
}