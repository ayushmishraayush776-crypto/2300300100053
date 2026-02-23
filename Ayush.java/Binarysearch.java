public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5,6};
        int target = 4;
        
        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
    public static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                s = mid + 1; 
            } else {
                e = mid - 1; 
            }
        }
        
        return -1; 
    }
}
