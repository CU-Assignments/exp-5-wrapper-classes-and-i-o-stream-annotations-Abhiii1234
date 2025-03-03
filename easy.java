import java.util.*;

public class AutoBoxingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String[] numbers = sc.nextLine().split(" ");

        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num); // Autoboxing and parsing
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }
}
