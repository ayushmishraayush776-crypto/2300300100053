public class reversenumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit
        }
        
        System.out.println("Reversed Number: " + reversedNum);
    }
}

