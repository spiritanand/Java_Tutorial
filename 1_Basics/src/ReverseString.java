import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
	public static void main(String[] args){
		String str = "Spirit_Monster007";
		
//		StringBuilder rev = easyReverse(str);
		
//		StringBuilder rev = reverseStr(str);
//		System.out.println("Reverse String -> " + rev);
		
		String sent = "Hey ! My name is Spirit . How are you doing ?";
		StringBuilder revSent = revByWord(sent);
		System.out.println(revSent);
	}
	
	// This is the easy and the built-in way to reverse the given string.
	public static StringBuilder easyReverse(String str){
//		StringBuilder revStr = new StringBuilder(str).reverse(); // Alternative method.
		return new StringBuilder(str).reverse();
	}
	
	// Here we use a data type which implements LIFO, stack. We do this so that we an build our string
	// reversed. This is the more hand-on approach to "building a reversed String".
	public static StringBuilder reverseStr(String str){
		StringBuilder revStr = new StringBuilder();
		str = str.replace(" ",""); // Replaces all the blank spaces with empty chars.
		Stack<Character> s = new Stack<>();
		for(int i = 0; i<str.length();i++){
			s.push(str.charAt(i));
		}
		while(!s.isEmpty()){
			revStr.append(s.pop());
		}
		return revStr;
	}
	
	public static StringBuilder revByWord(String str){
		StringBuilder revSent = new StringBuilder();
		str = str.trim();
		Stack<String> s = new Stack<>();
		String[] sArr = str.split(" "); // Splits all the strings on blank spaces.
		s.addAll(Arrays.asList(sArr)); // Uses addAll method to add all the elements of the array.
		while (!s.isEmpty()){
			revSent.append(s.pop()).append(" ");
		}
		return revSent;
	}
}
