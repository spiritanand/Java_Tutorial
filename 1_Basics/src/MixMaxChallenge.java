import java.util.Scanner;

public class MixMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, min = 0, max = 0;
        int count = 1;
        while (true) {
            System.out.println("Enter the #" + count + " :");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (count == 1) {
                    min = num;
                    max = num;
                }
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
                count++;
            } else {
                break;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
