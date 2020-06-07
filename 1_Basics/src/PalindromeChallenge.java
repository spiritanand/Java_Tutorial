import java.lang.Math; // Math Class methods helps to perform the numeric operations like square, square root,
// trigonometric operations and here absolute value of an integer.

// The aim of this challenge is to check whether the number entered is palindrome or not.
public class PalindromeChallenge {
    public static void main(String args[]) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number); // We are doing this to avoid complications in calculations of negative
        // numbers.
        int og_num = number;
        int s = 0;
        while (number > 0) {
            int lastD = number % 10;
            s = (s + lastD) * 10;
            number /= 10;
        }
        s = s / 10;
        if (og_num == s) {
            return true;
        }
        return false;
    }
}
