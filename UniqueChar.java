/*
1.1 Implement an algorithm to determine if a string has all unique characters. 
What if you can not use additional data structures?
*/

public class UniqueChar{
	public static void main(String[] args){

		System.out.println(isUniqueChars("janc"));
	}
	public static boolean isUniqueChars(String str){
		boolean uniqueCharChecker = true;

		int count = 0;

		for(int i=0; i<str.length(); i++){
			count++;
			while(count<str.length()){
				//System.out.println(str.charAt(i));
				//System.out.println(str.charAt(count));
				if(str.charAt(i) != str.charAt(count)){
					uniqueCharChecker = true;
				}
				else{
					return false;
				}
				count++;
			}
			count = i+1;
		}
		return uniqueCharChecker;
	}
	
}