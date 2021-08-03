import java.util.*;
class CountIndex{
	int count;
	int index;
	public CountIndex(int index){
		this.count = 1;
		this.index = index; // Stores the index where the character was first seen.
	}
	
	public void incCount(){
		this.count++;
	}
	
	public int getIndex(){
		return this.index;
	}
}

public class FirstNonRepChar {
	public static final int NO_OF_CHARS = 256;
	public static HashMap<Character,CountIndex> hm = new HashMap<>(NO_OF_CHARS);
	
	public static void countChars(String str){
		int len = str.length();
		for(int i =0;i<len;i++){
			if(hm.containsKey(str.charAt(i))){
				hm.get(str.charAt(i)).incCount(); // Gets the value attached to the character which is a
				// CountIndex object, then increases the count by 1.
			} else{
				hm.put(str.charAt(i), new CountIndex(i)); // Create a new key, value pair.
			}
		}
	}
	
	public static int firstNonRep(String str){
		countChars(str);
		int i=-1;
		for(Map.Entry<Character,CountIndex> me: hm.entrySet()){
			if (me.getValue().count==1){
				i = me.getValue().index;
				return i;
			}
		}
		return i;
	}
	
	public static void main(String[] args){
		String str = "GeeksForGeeks";
		int index = firstNonRep(str);
		System.out.println(index == -1?"All are characters are repeating."
				: "Index : "+index+" and Character : "+str.charAt(index));
	}
	
}
