public class SingleElementInSortedArray {

    public static int findSingleElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Ensure mid is on an even index to compare with the next element
            if (mid % 2 == 1) {
                mid--;
            }

            // If elements at mid and mid + 1 are the same, the single element is in the right half
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                // Otherwise, the single element is in the left half (including mid)
                high = mid;
            }
        }

        // When the loop finishes, low is the index of the single element
        return nums[low];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println("The single element in arr1 is: " + findSingleElement(arr1));

        int[] arr2 = {3, 3, 7, 7, 10, 11, 11};
        System.out.println("The single element in arr2 is: " + findSingleElement(arr2));

        int[] arr3 = {2, 2, 5, 5, 10};
        System.out.println("The single element in arr3 is: " + findSingleElement(arr3));
    }
}
