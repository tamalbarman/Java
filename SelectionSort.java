/*Selection Sort
Idea: The inner loop selects the minimum element in the
unsorted array and places the elements in increasing order.
Time complexity: O(N2) */

public class SelectionSort {
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={90,0,100,6,89,1};

        //selection sort
        for(int i = 0; i< arr.length-1;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
