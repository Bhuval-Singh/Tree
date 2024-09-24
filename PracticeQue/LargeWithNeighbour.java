public class LargeWithNeighbour {
    public static int highest(int[] arr, int n) {
        int maxIndex = 0; 
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i; 
            }
        }
        return maxIndex; 
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 23, 34, 6}; 
        int n = arr.length;
        System.out.println("Index of the largest element: " + highest(arr, n));
    }
}
