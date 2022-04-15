// A string is said to be complete if it contains all the characters from a to z. Given a string, check if
// it complete or not.
import java.util.*;

public class CompleteString {
	private static final Set<Character> alpha = new HashSet<>(26); // Sequence of set is not fixed.
	private static final Scanner sc = new Scanner(System.in);
	
	
	public static boolean isCompStr(String str){
		str = str.replace(" ",""); // Replaces all the blank spaces with empty chars.
		str = str.toUpperCase(); // Converts all the str to upper case. By using this we have to only check
		// for 26 characters.
		
		// The minimum length of the string must be at least 26 to be COMPLETE.
		int len = str.length();
		if(len<26)
			return false;
		for (int i = 0;i<len;i++){
			if(alpha.contains(str.charAt(i))){
				alpha.remove((str.charAt(i)));
			}
			if(alpha.isEmpty()){
				return true;
			}
		}
		return false;
	}
	
	// Generates set of all the capital alphabet letters.
	public static void generateCharList(){
		for(int i=0;i<26;i++){
			alpha.add((char)(65 + i));
		}
	}
	
	
	// Driver
	public static void main(String[] args){
		generateCharList();
		System.out.println("Input the string :-\r");
		String str = sc.nextLine();
		boolean isComplete = isCompStr(str);
		System.out.println(isComplete);
	}
}
