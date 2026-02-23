public class javasumrangequeries {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefixSum = new int[arr.length];
        
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        int start = 1; 
        int end = 3;
        
        int sum;
        if (start == 0) {
            sum = prefixSum[end];
        } else {
            sum = prefixSum[end] - prefixSum[start - 1];
        }
        
        System.out.println("Sum of elements from index " + start + " to " + end + " is: " + sum);
    }
}
