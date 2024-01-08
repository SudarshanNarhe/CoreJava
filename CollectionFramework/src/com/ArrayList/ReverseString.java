package com.ArrayList;

/*Given a string, reverse all the words which have odd length. 
 The even length words are not changed.
Examples
reverseOdd("Bananas") ➞ "sananaB"
 
reverseOdd("One two three four") ➞ "enO owt eerht four"
 
reverseOdd("Make sure uoy only esrever sdrow of ddo length")
➞ "Make sure you only reverse words of odd length"*/

public class ReverseString {

	public static void reverseOdd(String str) {
		
		char []ss = str.toCharArray();
		System.out.println(ss.length);
		for(int i=0;i<ss.length;i++) {
			
			if(ss.length%2!=0) 
			{ 
			for (int j = ss.length - 1; j >= 0; j--) {
				System.out.print(ss[j]);
				
			}
			break;
		 }
			else
				System.out.print(ss[i]);
			}
		}
	public static void reverseOddString(String str) {
		String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() % 2 != 0) {
                result.append(new StringBuilder(word).reverse());
            } else {
                result.append(word);
            }
            result.append(" ");
        }

      System.out.println(result.toString().trim());
    }



	
	public static void main(String[] args) {
		
		//String str="Bananas";
		//reverseOdd(str);
			String str1="One Two Three Four";
			reverseOddString(str1);
	}
}
