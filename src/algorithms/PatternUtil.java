/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.*;
/**
 *
 * @author bharath
 */
public class PatternUtil {
    
    public static void main (String[] args) {
		String num = "1";
		for (int i = 1; i<=4; i++) {
			System.out.println(num);
			num = lookAndSay(num);
		}		
	}
	
	public static String lookAndSay (String num) {
		StringBuilder sb = new StringBuilder();
		char first = num.charAt(0);
		int count = 1;
		if (num.length() == 1) {
			sb.append(count);
			sb.append(first);
			return sb.toString();
		}
		for (int i = 1; i < num.length(); i++) {			
			if (first == num.charAt(i)) {
				count++;
			}
			else {
				sb.append(count);
				sb.append(first);
				first = num.charAt(i);
				count = 1;
			}
			if (i == num.length() - 1) {
				sb.append(count);
				sb.append(first);
			}
		}
		return sb.toString();
	}
}
