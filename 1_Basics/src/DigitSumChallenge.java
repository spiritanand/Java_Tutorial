public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(191230)); // Testing for 191230 --> Output :- 16
        System.out.println(sumDigits(-42)); // Testing for -42 --> Output :- -1 (Invalid Value)
        System.out.println(sumLastFirst(6_123452_5)); //         --> Output :- 11 (6+5)
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int s = 0; // It is good practice to not name the variable which holds sum as sum as sum is a per
        // defined keyword in Java.
        while (number > 0) {
            // Extracting the least significant digit (Digit at unit place)
            int r = number % 10;
            s += r;
            // Dropping the least significant digit
            number /= 10;
        }
        return s;
    }

    // This is another part of the challenge. Here we have to sum the first and the last digits only.
    public static int sumLastFirst(int number) {
        int lastD = number % 10;
        int firstD = 0;
        while (number > 0) {
            firstD = number % 10;
            number /= 10;
        }
        return (firstD + lastD);
    }
}
