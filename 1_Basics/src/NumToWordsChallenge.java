import java.lang.Math;
public class NumToWordsChallenge {
    public static void main(String args[]) {
        NTW(120400); // Test case 1
    }

    public static void NTW(int num) {
        StringBuilder s = new StringBuilder(); // This makes appending to a String more efficient.
        int length1 = (int) (Math.log10(num) + 1); // This is used to find the length of the number.
        num = rev(num);
        int length2 = (int) (Math.log10(num) + 1);
        int diff = length1 - length2;
        if (num < 0) {
            System.out.println("Invalid Input!!");
        } else {
            while (num > 0) {
                int r = num % 10;
                s.append(" ").append(word(r));
                num /= 10;

            }
            while (diff > 0){ // This is done to account for any lost zeros during the reversal of the number.
                s.append(" ").append("Zero");
                diff -= 1;
            }
        }
        System.out.println("NTW = " + s);
    }

    public static int rev(int number) { // This method reverses the number it is given.
        // Here we lose zeros so we need to account for that later.
        int rev_num = 0;
        while (number > 0) {
            int r = number % 10;
            rev_num = (rev_num + r) * 10;
            number /= 10;
        }
        return rev_num/10;
    }

    public static String word(int num) { // This method take an int as a parameter and returns the spelling
        // of that number.
        switch (num) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "None";
        }
    }
}
