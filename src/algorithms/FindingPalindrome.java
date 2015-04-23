/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author bharath
 */
public class FindingPalindrome {
    
public static boolean isPalindrome(char[] chars) {
		int start = 0, end = chars.length - 1;
		while (start < end) {
			if (!isLetter(chars[start])) {
				start++;
			} else if (!isLetter(chars[end])) {
				end--;
			} else {
				if (chars[start] == chars[end]
						|| Math.abs(chars[start] - chars[end]) == 'a' - 'A') {
					start++;
					end--;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isLetter(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}
        
        public static void main(String args[])
        {
            char a[]={'$','a','b','$','b','a','c'};
          if(isPalindrome(a))  
              System.out.println("true");
          else
              System.out.println("false");
        }
}
