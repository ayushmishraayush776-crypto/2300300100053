import java.util.*;

public class importjava{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name");
            String name = sc.nextLine();
            System.out.println("Hello " + name);
        }
    }
}
