package com.regexp.examples;

public class RegExpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp = "I am a string. Yes, I am";
		System.out.println(regExp);
		
		String newString = regExp.replaceAll("I", "You");	//Replace all I with You
		System.out.println(newString);

		String alphaNum = "abcdFF28sifafa";
		System.out.println(alphaNum.replaceAll(".", "Y"));	//replace all characters with Y. '.' is a wildcard
		System.out.println(alphaNum.replaceAll("^abcdFF", "YYY"));	//carat boundary matcher. Beginning of the string to FF
		String alphaNum2 = "abcdFF28abcdFFsifafa";
		System.out.println(alphaNum2.replaceAll("^abcdFF", "YYY"));	//carat boundary matcher. will replace only the first occurrence
		
		System.out.println(alphaNum.matches("abcdFF28"));			//The whole string has to match
		System.out.println(alphaNum.matches("abcdFF28sifafa"));		//The whole string has to match
		
		System.out.println(alphaNum.replaceAll("sifafa$", "THE END")); 		//replace only the last occurrence
		System.out.println(alphaNum.replaceAll("[28s]", "THE MIDDLE")); 	//replace every occurrence of 2 and 8 and s with "THE MIDDLE"
		System.out.println(alphaNum.replaceAll("[0-9]", "X")); 	//replace all numbers with X
		System.out.println(alphaNum.replaceAll("[^af]", "X")); 	//replace all occurrences that are not 'a' and 'f' with X. carat is inside the square brackets
		System.out.println(alphaNum.replaceAll("[a-f3-9]", "X")); 	//replace all occurrences between 'a' and 'f', and '3' and '9' with X. reg exp is case sensitive
	}
}
