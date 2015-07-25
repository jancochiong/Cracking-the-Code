/*
1.1 Implement an algorithm to determine if a string has all unique characters. 
What if you can not use additional data structures?
*/

public class UniqueChar{
	public static void main(String[] args){

		System.out.println(isUniqueChars("stringgoeshere"));
	}
	public static boolean isUniqueChars(String str){
		boolean uniqueCharCheckerTrue = true;
		boolean uniqueCharCheckerFalse = true;
		int count = 0;
		int count2 = 0;
		for(int i=0; i<str.length(); i++){
			count++;
			count2++;
			while(count<str.length()){
				//System.out.println(str.charAt(i));
				//System.out.println(str.charAt(count));
				if(str.charAt(i) != str.charAt(count)){
					uniqueCharCheckerTrue = true;
				}
				else{
					uniqueCharCheckerFalse = false;
				}
				count++;
			}
			count = count2;
		}
		return (uniqueCharCheckerTrue == uniqueCharCheckerFalse);
	}
	
}