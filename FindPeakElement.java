public class FindPeakElement {

    public static int findPeak(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1] && arr[i] >= arr[i - 1]) {
                return i;
            }
        }
        return -1; // -1 indicates no peak found
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 20, 15 };
        System.out.println(findPeak(arr));
    }
}
