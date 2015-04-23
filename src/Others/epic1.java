/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import java.util.*;
public class epic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mp=new HashMap();
		mp.put('a', 1); mp.put('b', 2); mp.put('c', 3); mp.put('d', 4); mp.put('e', 5); mp.put('f', 6); mp.put('g', 7);
		mp.put('h', 8); mp.put('i', 9); mp.put('j', 10); mp.put('k', 11);  mp.put('l', 12); mp.put('m', 13); mp.put('n', 14);
		mp.put('o', 15); mp.put('p', 16); mp.put('q', 17); mp.put('r', 18); mp.put('s', 19); mp.put('t', 20);
		mp.put('u', 21); mp.put('v', 22); mp.put('w', 23);mp.put('x', 24); mp.put('y', 25);mp.put('z', 26);
		
		char[] alphabets={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String str="Bharath";
		str=str.toLowerCase();
		String output=null;
		int temp;
		for(int i=0;i<str.length();i++){
			temp=(Integer) mp.get(str.charAt(i)) + 4;
			if(temp>26){
				temp=temp%26;
			}
			if(output==null){
                                System.out.println(temp);
				output=Character.toString(alphabets[temp-1]);				
			}
			else
			{
                                System.out.println(temp);
				output+=Character.toString(alphabets[temp-1]);	
			}
			
		}
		System.out.println("\n"+output);

	}

}