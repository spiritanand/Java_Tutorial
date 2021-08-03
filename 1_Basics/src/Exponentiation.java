public class Exponentiation {
	public static void main(String[] args) {
		// Program to get the result of any power to a number.
		System.out.println(pow(4, 8));
	}
	
	public static int pow(int x, int n) {
		// Base condition
		if (n == 0)
			return 1;
		
		// Even n condition
		// We are checking if the power is even so that we calculate the half of that power and then
		// multiply that with the result obtained before. This way we have to call the function half the
		// times.
		if (n % 2 == 0) {
			int y = pow(x, n / 2);
			return y * y;
		}
		
		// Odd n. We return a power less than the n multiplied by the number(x).
		return x * pow(x, n - 1);
	}
	// T(n) = O(log n)
}
