import java.util.Scanner;

public class PalindromeChecker {

    static boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.next();

        if (isPalindrome(text))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}