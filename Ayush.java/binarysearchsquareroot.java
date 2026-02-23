public class binarysearchsquareroot {
    public static void main(String[] args) {
        int n = 17;
        int result = squareRoot(n);
        System.out.println("Square root (floor value) of " + n + " is: " + result);
    }
    
    public static int squareRoot(int n) {
        if (n < 0) {
            return -1; // Square root not defined for negative numbers
        }
        
        int s = 0;
        int e = n;
        int ans = -1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (mid * mid == n) {
                return mid; // Exact square root found
            } else if (mid * mid < n) {
                ans = mid; // Store the last valid square root
                s = mid + 1; // Search in the right half
            } else {
                e = mid - 1; // Search in the left half
            }
        }
        
        return ans; // Return the floor of the square root
    }
}
