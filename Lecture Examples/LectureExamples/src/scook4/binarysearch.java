package scook4;

public class binarysearch {
    // recursive binary search function
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // target not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        
        if (result != -1) {
            System.out.println("index " + result);
        } else {
            System.out.println("target not found");
        }
    }
}