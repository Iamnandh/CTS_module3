import java.util.Scanner;

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        sc.close();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed) ? "Palindrome" : "Not a palindrome");
    }
}