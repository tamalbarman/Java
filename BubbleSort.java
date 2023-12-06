/*Bubble Sort
Idea: if arr[i] > arr[i+1] swap them. To place the element in their
respective position, we have to do the following operation N-1
times.
Time Complexity: O(N^2) */

public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) { // n-1
        int arr[] = {7,9,1,0,2,45};

        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length -i-1;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
