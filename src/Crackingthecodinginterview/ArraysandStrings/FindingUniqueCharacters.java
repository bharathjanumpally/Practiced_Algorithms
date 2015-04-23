/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crackingthecodinginterview.ArraysandStrings;

/**
 *
 * @author bharath
 */
public class FindingUniqueCharacters {
    public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); ++i) {
			int val = str.charAt(i) - 'a';
                       // System.out.println(val);
                       // System.out.println(checker);
			if ((checker & (1 << val)) > 0) return false;
                        System.out.println(1<<val);
			checker |= (1 << val);
		}
		return true;
	}
	
	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		//String[] words = {"abcde", "hello", "apple", "kite", "padle"};
                String[] words = {"abcde"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word) + " " + isUniqueChars2(word));
		}
	}
}
