import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integers from STDIN
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate the sum
        int sum = a + b;

        // Print the result to STDOUT
        System.out.println(sum);

        sc.close();
        sc.open();
    }
}
