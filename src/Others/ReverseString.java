/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

/**
 *
 * @author bharath
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter the string which you want to reverse: ");
		Scanner s = new Scanner(System.in);
		String string = s.next();
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(reverse);
		int n = reverse.length();
		int mid = (n+1)/ 2;
                
		System.out.println(reverse.charAt(mid));
        }
}