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

/*My intension in this program is to print get all the prime numbers into a string and then place the string 

in an array and then print the size of the array which gives the number of primes. 

I have a problem appending the "space" from the string and adding it to the array list
*/
public class PrimeCounter {
	
	public static void main(String [] args)
	{
		System.out.println("Enter the number to know the number of prime numbers before it: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =0;
	       int num =0;
	       ArrayList<Integer> mylist = new ArrayList<Integer>();
	       //String  primeNumbers = "";

	       for (i = 1; i <= n; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     mylist.add(i);
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to" +n +" are :");
	      
	       
	       // reate an array list
	        // add the string to the array
	       System.out.println(mylist);  
	       System.out.println("The counter is " +mylist.size()); // print the size
	
	}
	
}
