import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        sc.close();
        long fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        System.out.println("Factorial: " + fact);
    }
}
