public class arrsumrange {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int start = 4; 
        int end = 4;
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        
        System.out.println("Sum of elements from index " + start + " to " + end + " is: " + sum);
    }
}
