public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int[] prefixSum = new int[arr.length];
        
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        System.out.println("Prefix Sum Array:");
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
    }
    
}
